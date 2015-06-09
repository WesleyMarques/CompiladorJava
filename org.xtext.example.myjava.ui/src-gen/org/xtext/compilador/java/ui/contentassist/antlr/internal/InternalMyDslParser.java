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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MOD", "RULE_STATIC", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "':'", "'break'", "'continue'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'", "'.'"
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_STATIC=5;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_MOD=4;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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


    // $ANTLR start "entryRuleTry_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: entryRuleTry_statement : ruleTry_statement EOF ;
    public final void entryRuleTry_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( ruleTry_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement1147);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement1154); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ruleTry_statement : ( ( rule__Try_statement__Group__0 ) ) ;
    public final void ruleTry_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: ( ( ( rule__Try_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Try_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Try_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Try_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Try_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Try_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1180);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ruleImport_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1207);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1214); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Import_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Import_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__Import_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1240);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ruleClass_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1267);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1274); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1300);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ruleInterface_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1326);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1333); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:662:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1359);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( rulePackage_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1385);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1392); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Package_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__Package_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Package_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1418);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( rulePackage_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1445);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1452); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:718:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( rule__Package_name__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__Package_name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__Package_name__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1478);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: entryRulePackage_name_line : rulePackage_name_line EOF ;
    public final void entryRulePackage_name_line() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( rulePackage_name_line EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1505);
            rulePackage_name_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line1512); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: rulePackage_name_line : ( ( rule__Package_name_line__Group__0 )* ) ;
    public final void rulePackage_name_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:746:2: ( ( ( rule__Package_name_line__Group__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( ( rule__Package_name_line__Group__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( ( rule__Package_name_line__Group__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__Package_name_line__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__Package_name_line__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:749:2: rule__Package_name_line__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1538);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getClassDecAssignment_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:768:2: rule__Type_declaration__ClassDecAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11575);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:772:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:772:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getInterfaceDecAssignment_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:774:2: rule__Type_declaration__InterfaceDecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11593);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( rule__Field_declaration__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rule__Field_declaration__Group_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:790:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1626);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:794:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:794:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getStaticinitializerAssignment_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:796:2: rule__Field_declaration__StaticinitializerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1644);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:800:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:800:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( rule__Field_declaration__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( rule__Field_declaration__Group_2__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:802:2: rule__Field_declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1662);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getVariableDeclarationAssignment_0_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:818:2: rule__Field_declaration__VariableDeclarationAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11695);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:822:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:822:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getContructorNameAssignment_0_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:824:2: rule__Field_declaration__ContructorNameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11713);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:828:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:828:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getMethodNameAssignment_0_1_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: rule__Field_declaration__MethodNameAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11731);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__Method_declaration__Alternatives_7 : ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) );
    public final void rule__Method_declaration__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getStatementMethodAssignment_7_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:846:2: rule__Method_declaration__StatementMethodAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_71764);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:850:6: ( ';' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:850:6: ( ';' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Method_declaration__Alternatives_71783); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( 'boolean' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( 'boolean' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Type_specifier__Alternatives1818); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:876:6: ( 'byte' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:876:6: ( 'byte' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: 'byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Type_specifier__Alternatives1838); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( 'char' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( 'char' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: 'char'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Type_specifier__Alternatives1858); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:892:6: ( 'short' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:892:6: ( 'short' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: 'short'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives1878); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:6: ( 'int' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:6: ( 'int' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives1898); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:6: ( 'float' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:6: ( 'float' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives1918); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:916:6: ( 'long' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:916:6: ( 'long' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives1938); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:924:6: ( 'double' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:924:6: ( 'double' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Type_specifier__Alternatives1958); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:932:6: ( ruleClass_name )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:932:6: ( ruleClass_name )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1977);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: rule__Modifier__Alternatives : ( ( RULE_MOD ) | ( RULE_STATIC ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( ( RULE_MOD ) | ( RULE_STATIC ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: ( RULE_MOD )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: ( RULE_MOD )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: RULE_MOD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }
                    match(input,RULE_MOD,FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2009); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:954:6: ( RULE_STATIC )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:954:6: ( RULE_STATIC )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: RULE_STATIC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2026); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleVariable_declaration ) | ( ( rule__Statement__TryStatementAssignment_3 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ';' ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( ( ruleStatement_block ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleVariable_declaration ) | ( ( rule__Statement__TryStatementAssignment_3 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ';' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID||LA8_2==29||LA8_2==39) ) {
                    alt8=3;
                }
                else if ( (LA8_2==30) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MOD:
            case RULE_STATIC:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            case 11:
                {
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ruleStatement_block )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ruleStatement_block )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2058);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:976:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:976:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( rule__Statement__Group_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:978:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2075);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:982:6: ( ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:982:6: ( ruleVariable_declaration )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2093);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:988:6: ( ( rule__Statement__TryStatementAssignment_3 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:988:6: ( ( rule__Statement__TryStatementAssignment_3 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( rule__Statement__TryStatementAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTryStatementAssignment_3()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__Statement__TryStatementAssignment_3 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:990:2: rule__Statement__TryStatementAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Statement__TryStatementAssignment_3_in_rule__Statement__Alternatives2110);
                    rule__Statement__TryStatementAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTryStatementAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:994:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:994:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__Statement__Group_4__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives2128);
                    rule__Statement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( ( rule__Statement__Group_5__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__Statement__Group_5__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:2: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives2146);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:6: ( ';' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:6: ( ';' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSemicolonKeyword_6()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Statement__Alternatives2165); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSemicolonKeyword_6()); 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12199);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12217);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02248);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02251);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__NameAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( ( rule__Compilation_unit__NameAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( rule__Compilation_unit__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__Compilation_unit__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:2: rule__Compilation_unit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2278);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12309);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12312);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2339);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22370);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_MOD && LA12_0<=RULE_STATIC)||LA12_0==RULE_DOC_COMMENT||LA12_0==20||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:2: rule__Compilation_unit__TypeDeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2397);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02434);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02437);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__CommentAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ( ( rule__Type_declaration__CommentAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: ( rule__Type_declaration__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: ( rule__Type_declaration__CommentAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOC_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:2: rule__Type_declaration__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2464);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12495);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12498);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( rule__Type_declaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__Type_declaration__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2525);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( rule__Type_declaration__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22555);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2583); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02620);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02623);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2650);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12681);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12684);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( ( 'interface' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( 'interface' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( 'interface' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2712); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22743);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22746);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2773);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32803);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32806);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( rule__Interface_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2833);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42864);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42867);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl2895); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52926);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl2954); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02997);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03000);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3028); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13059);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13062);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: ( ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:2: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3089);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23119);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3146);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03183);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03186);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3214); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13245);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasAssignment_3_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:2: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3272);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03306);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03309);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3336);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13367);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13370);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( 'class' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( 'class' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( 'class' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3398); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23429);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23432);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3459);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33489);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33492);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( rule__Class_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__Class_declaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3519);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43550);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43553);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__Class_declaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( rule__Class_declaration__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3580);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53611);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53614);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3642); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63673);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63676);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationAssignment_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_MOD && LA20_0<=RULE_DOC_COMMENT)||(LA20_0>=11 && LA20_0<=19)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:2: rule__Class_declaration__FieldsDeclarationAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3703);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( rule__Class_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73734);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3762); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03809);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03812);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl3840); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13871);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:2: rule__Class_declaration__ClassHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3898);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03932);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03935);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( ( 'implements' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( 'implements' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( 'implements' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl3963); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13994);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13997);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaAssignment_4_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__Class_declaration__InterfaceImplementadaAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4024);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24054);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4081);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04118);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04121);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4149); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14180);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ( ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasAssignment_4_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:2: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4207);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04241);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04244);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentAssignment_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__Field_declaration__CommentAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4271);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14302);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4329);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__Field_declaration__Group_2__0 : rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 ;
    public final void rule__Field_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:2: rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04363);
            rule__Field_declaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04366);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: rule__Field_declaration__Group_2__0__Impl : ( () ) ;
    public final void rule__Field_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getField_declarationAction_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__Field_declaration__Group_2__1 : rule__Field_declaration__Group_2__1__Impl ;
    public final void rule__Field_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( rule__Field_declaration__Group_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:2: rule__Field_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14424);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: rule__Field_declaration__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Field_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4452); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04487);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04490);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_MOD && LA23_0<=RULE_STATIC)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Method_declaration__ModifiersMethodAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4517);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14548);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14551);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:2: rule__Method_declaration__TypeMethodAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4578);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24608);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24611);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:2: rule__Method_declaration__NameMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4638);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34668);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34671);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4699); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44730);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44733);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodAssignment_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=12 && LA24_0<=19)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Method_declaration__ParameterListMethodAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl4760);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54791);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54794);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Method_declaration__Group__5__Impl4822); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64853);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64856);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( '[]' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Method_declaration__Group__6__Impl4885); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( rule__Method_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74918);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( rule__Method_declaration__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( rule__Method_declaration__Alternatives_7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4945);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04991);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04994);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__Constructor_declaration__ModifiersConstructorAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5021);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15052);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15055);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__Constructor_declaration__NameConstructorAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5082);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25112);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25115);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5143); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35174);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35177);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorAssignment_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=12 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:2: rule__Constructor_declaration__ParameterListConstructorAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5204);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45235);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45238);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5266); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55297);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorAssignment_5()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:2: rule__Constructor_declaration__StatementConstructorAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5324);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05366);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05369);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5396);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( rule__Parameter_list__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15426);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( rule__Parameter_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5453);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05488);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05491);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5519); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15550);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5577);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05611);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05614);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5641);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15671);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15674);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( rule__Parameter__ParameterNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( rule__Parameter__ParameterNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:2: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5701);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25731);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2811:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( '[]' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Parameter__Group__2__Impl5760); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05799);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05802);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ( ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_MOD && LA30_0<=RULE_STATIC)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:2: rule__Variable_declaration__ModifiersVariableAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl5829);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15860);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15863);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5890);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25920);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25923);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:2: rule__Variable_declaration__NameVariableAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl5950);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35980);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35983);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__Variable_declaration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( rule__Variable_declaration__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6010);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46041);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6069); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06110);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06113);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6141); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16172);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6199);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06233);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06236);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:2: rule__Variable_declarator__NameVariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6263);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16293);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( '[]' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6322); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06359);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06362);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__Type__Group__0__Impl : ( ( rule__Type__TypeSpecifierAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( ( rule__Type__TypeSpecifierAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( rule__Type__TypeSpecifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( rule__Type__TypeSpecifierAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:2: rule__Type__TypeSpecifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6389);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( rule__Type__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16419);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( '[]' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Type__Group__1__Impl6448); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06485);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06488);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: rule__Static_initializer__Group__0__Impl : ( ( rule__Static_initializer__StaticAssignment_0 ) ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( ( ( rule__Static_initializer__StaticAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( rule__Static_initializer__StaticAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( rule__Static_initializer__StaticAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:2: rule__Static_initializer__StaticAssignment_0
            {
            pushFollow(FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6515);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: ( rule__Static_initializer__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16545);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( rule__Static_initializer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6572);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3246:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06606);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06609);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: rule__Statement_block__Group__0__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Statement_block__Group__0__Impl6637); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16668);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16671);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: rule__Statement_block__Group__1__Impl : ( ( rule__Statement_block__StatmentsAssignment_1 )* ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( ( ( rule__Statement_block__StatmentsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_MOD && LA34_0<=RULE_ID)||(LA34_0>=11 && LA34_0<=19)||LA34_0==21||(LA34_0>=31 && LA34_0<=33)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:2: rule__Statement_block__StatmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6698);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: ( rule__Statement_block__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:2: rule__Statement_block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26729);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: rule__Statement_block__Group__2__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Statement_block__Group__2__Impl6757); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06794);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06797);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__NameStatementAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( ( ( rule__Statement__NameStatementAssignment_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Statement__NameStatementAssignment_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( rule__Statement__NameStatementAssignment_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( rule__Statement__NameStatementAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementAssignment_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__Statement__NameStatementAssignment_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__Statement__NameStatementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Statement__NameStatementAssignment_1_0_in_rule__Statement__Group_1__0__Impl6824);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16854);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16857);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: rule__Statement__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( ( ':' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( ':' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_1_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_1__1__Impl6885); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( rule__Statement__Group_1__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26916);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__StatementAssignment_1_2 ) ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: ( ( ( rule__Statement__StatementAssignment_1_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: ( ( rule__Statement__StatementAssignment_1_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: ( ( rule__Statement__StatementAssignment_1_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: ( rule__Statement__StatementAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_1_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( rule__Statement__StatementAssignment_1_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:2: rule__Statement__StatementAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_1_2_in_rule__Statement__Group_1__2__Impl6943);
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


    // $ANTLR start "rule__Statement__Group_4__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__06979);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__06982);
            rule__Statement__Group_4__1();

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
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: rule__Statement__Group_4__0__Impl : ( () ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__17040);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__17043);
            rule__Statement__Group_4__2();

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
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: rule__Statement__Group_4__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: ( ( 'break' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( 'break' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( 'break' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getBreakKeyword_4_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_4__1__Impl7071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getBreakKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__27102);
            rule__Statement__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__27105);
            rule__Statement__Group_4__3();

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
    // $ANTLR end "rule__Statement__Group_4__2"


    // $ANTLR start "rule__Statement__Group_4__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__NameAssignment_4_2 )? ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ( rule__Statement__NameAssignment_4_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Statement__NameAssignment_4_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Statement__NameAssignment_4_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ( rule__Statement__NameAssignment_4_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_4_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( rule__Statement__NameAssignment_4_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:2: rule__Statement__NameAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_4_2_in_rule__Statement__Group_4__2__Impl7132);
                    rule__Statement__NameAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_4__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( rule__Statement__Group_4__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:2: rule__Statement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__37163);
            rule__Statement__Group_4__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_4__3"


    // $ANTLR start "rule__Statement__Group_4__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: rule__Statement__Group_4__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_4__3__Impl7191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__3__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__07230);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__07233);
            rule__Statement__Group_5__1();

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
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: rule__Statement__Group_5__0__Impl : ( () ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3578:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3578:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_5_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__17291);
            rule__Statement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__17294);
            rule__Statement__Group_5__2();

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
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: rule__Statement__Group_5__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3608:1: ( ( 'continue' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: ( 'continue' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: ( 'continue' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getContinueKeyword_5_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Statement__Group_5__1__Impl7322); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getContinueKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__27353);
            rule__Statement__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__27356);
            rule__Statement__Group_5__3();

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
    // $ANTLR end "rule__Statement__Group_5__2"


    // $ANTLR start "rule__Statement__Group_5__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: rule__Statement__Group_5__2__Impl : ( ( rule__Statement__NameAssignment_5_2 )? ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: ( ( ( rule__Statement__NameAssignment_5_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: ( ( rule__Statement__NameAssignment_5_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: ( ( rule__Statement__NameAssignment_5_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: ( rule__Statement__NameAssignment_5_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_5_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:1: ( rule__Statement__NameAssignment_5_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:2: rule__Statement__NameAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_5_2_in_rule__Statement__Group_5__2__Impl7383);
                    rule__Statement__NameAssignment_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__2__Impl"


    // $ANTLR start "rule__Statement__Group_5__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( rule__Statement__Group_5__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:2: rule__Statement__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__37414);
            rule__Statement__Group_5__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_5__3"


    // $ANTLR start "rule__Statement__Group_5__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: rule__Statement__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3669:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_5__3__Impl7442); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_5__3__Impl"


    // $ANTLR start "rule__Try_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: rule__Try_statement__Group__0 : rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 ;
    public final void rule__Try_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:2: rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__07481);
            rule__Try_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__07484);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: rule__Try_statement__Group__0__Impl : ( 'try' ) ;
    public final void rule__Try_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( ( 'try' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( 'try' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( 'try' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: 'try'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Try_statement__Group__0__Impl7512); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: rule__Try_statement__Group__1 : rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 ;
    public final void rule__Try_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:2: rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__17543);
            rule__Try_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__17546);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__Try_statement__Group__1__Impl : ( ( rule__Try_statement__TryStatementAssignment_1 ) ) ;
    public final void rule__Try_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( ( ( rule__Try_statement__TryStatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( rule__Try_statement__TryStatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( rule__Try_statement__TryStatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:2: rule__Try_statement__TryStatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl7573);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__Try_statement__Group__2 : rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 ;
    public final void rule__Try_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:2: rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__27603);
            rule__Try_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__27606);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: rule__Try_statement__Group__2__Impl : ( ( rule__Try_statement__Group_2__0 )* ) ;
    public final void rule__Try_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( ( ( rule__Try_statement__Group_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( rule__Try_statement__Group_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( rule__Try_statement__Group_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( rule__Try_statement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__Try_statement__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred51_InternalMyDsl()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:2: rule__Try_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl7633);
            	    rule__Try_statement__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: rule__Try_statement__Group__3 : rule__Try_statement__Group__3__Impl ;
    public final void rule__Try_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( rule__Try_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:2: rule__Try_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__37664);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: rule__Try_statement__Group__3__Impl : ( ( rule__Try_statement__Group_3__0 )? ) ;
    public final void rule__Try_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: ( ( ( rule__Try_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( ( rule__Try_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( ( rule__Try_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: ( rule__Try_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: ( rule__Try_statement__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred52_InternalMyDsl()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:2: rule__Try_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl7691);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__Try_statement__Group_2__0 : rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 ;
    public final void rule__Try_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:2: rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__07730);
            rule__Try_statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__07733);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: rule__Try_statement__Group_2__0__Impl : ( ( 'catch' ) ) ;
    public final void rule__Try_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ( ( 'catch' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( ( 'catch' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( ( 'catch' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( 'catch' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( 'catch' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:2: 'catch'
            {
            match(input,34,FOLLOW_34_in_rule__Try_statement__Group_2__0__Impl7762); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: rule__Try_statement__Group_2__1 : rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 ;
    public final void rule__Try_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:2: rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__17794);
            rule__Try_statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__17797);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: rule__Try_statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Try_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl7825); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__Try_statement__Group_2__2 : rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 ;
    public final void rule__Try_statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__27856);
            rule__Try_statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__27859);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__Try_statement__Group_2__2__Impl : ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) ;
    public final void rule__Try_statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:2: rule__Try_statement__ParametersAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl7886);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__Try_statement__Group_2__3 : rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 ;
    public final void rule__Try_statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__37916);
            rule__Try_statement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__37919);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__Try_statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Try_statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl7947); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__Try_statement__Group_2__4 : rule__Try_statement__Group_2__4__Impl ;
    public final void rule__Try_statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( rule__Try_statement__Group_2__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:2: rule__Try_statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__47978);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: rule__Try_statement__Group_2__4__Impl : ( ( rule__Try_statement__StatementAssignment_2_4 ) ) ;
    public final void rule__Try_statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( ( ( rule__Try_statement__StatementAssignment_2_4 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( rule__Try_statement__StatementAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementAssignment_2_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( rule__Try_statement__StatementAssignment_2_4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:2: rule__Try_statement__StatementAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl8005);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: rule__Try_statement__Group_3__0 : rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 ;
    public final void rule__Try_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: ( rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:2: rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__08045);
            rule__Try_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__08048);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: rule__Try_statement__Group_3__0__Impl : ( ( 'finally' ) ) ;
    public final void rule__Try_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( ( ( 'finally' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( ( 'finally' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( ( 'finally' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( 'finally' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'finally' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:2: 'finally'
            {
            match(input,35,FOLLOW_35_in_rule__Try_statement__Group_3__0__Impl8077); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: rule__Try_statement__Group_3__1 : rule__Try_statement__Group_3__1__Impl ;
    public final void rule__Try_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: ( rule__Try_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:2: rule__Try_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__18109);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: rule__Try_statement__Group_3__1__Impl : ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) ;
    public final void rule__Try_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:2: rule__Try_statement__StatementFinallyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl8136);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4043:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__08170);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__08173);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: ( ( 'import' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( 'import' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( 'import' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Import_statement__Group__0__Impl8201); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ( rule__Import_statement__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__18232);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( rule__Import_statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: ( rule__Import_statement__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl8259);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__08293);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__08296);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4113:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: ( ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameAssignment_1_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:2: rule__Import_statement__ClassNameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl8323);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__18353);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl8381); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__08416);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__08419);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNameAssignment_1_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:2: rule__Import_statement__PacNameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8446);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18476);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ( ( '.*;' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( '.*;' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( '.*;' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: '.*;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Import_statement__Group_1_1__1__Impl8504); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__08539);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__08542);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( 'package' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( 'package' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( 'package' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Package_statement__Group__0__Impl8570); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4263:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__18601);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__18604);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__PacNameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( ( ( rule__Package_statement__PacNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( rule__Package_statement__PacNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: ( rule__Package_statement__PacNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:2: rule__Package_statement__PacNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl8631);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( rule__Package_statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__28661);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Package_statement__Group__2__Impl8689); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__08726);
            rule__Package_name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__08729);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl8756); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4352:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( rule__Package_name__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__18785);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_line ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4367:1: ( ( rulePackage_name_line ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: ( rulePackage_name_line )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: ( rulePackage_name_line )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:1: rulePackage_name_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl8812);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: rule__Package_name_line__Group__0 : rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 ;
    public final void rule__Package_name_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: ( rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:2: rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__08845);
            rule__Package_name_line__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__08848);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: rule__Package_name_line__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( ( '.' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( '.' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( '.' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Package_name_line__Group__0__Impl8876); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: rule__Package_name_line__Group__1 : rule__Package_name_line__Group__1__Impl ;
    public final void rule__Package_name_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:1: ( rule__Package_name_line__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:2: rule__Package_name_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__18907);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__Package_name_line__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl8934); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: rule__Model__GreetingsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( ruleCompilation_unit ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ruleCompilation_unit )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( ruleCompilation_unit )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment8972);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: rule__Compilation_unit__NameAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( ( rulePackage_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( rulePackage_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( rulePackage_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: rulePackage_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_09003);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ( ruleImport_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleImport_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ruleImport_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ruleImport_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_19034);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: rule__Compilation_unit__TypeDeclarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__TypeDeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( ruleType_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ruleType_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( ruleType_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ruleType_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_29065);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: rule__Type_declaration__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4512:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_09096); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:1: rule__Type_declaration__ClassDecAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__ClassDecAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: ( ( ruleClass_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: ( ruleClass_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: ( ruleClass_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:1: ruleClass_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_09127);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:1: rule__Type_declaration__InterfaceDecAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__InterfaceDecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( ( ruleInterface_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4543:1: ( ruleInterface_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4543:1: ( ruleInterface_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: ruleInterface_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_19158);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:1: rule__Interface_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_09189);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_29220); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfaceHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4589:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_19251);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_19282);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: rule__Class_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_09313);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_29344); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: rule__Class_declaration__ClassHerdadaAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ClassHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_19375);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: rule__Class_declaration__InterfaceImplementadaAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfaceImplementadaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_19406);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_19437);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: rule__Class_declaration__FieldsDeclarationAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsDeclarationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( ( ruleField_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: ( ruleField_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: ( ruleField_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: ruleField_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_69468);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: rule__Field_declaration__CommentAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4709:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_09499); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: rule__Field_declaration__VariableDeclarationAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__VariableDeclarationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( ( ruleVariable_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ruleVariable_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( ruleVariable_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: ruleVariable_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_09530);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4733:1: rule__Field_declaration__ContructorNameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__ContructorNameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( ( ruleConstructor_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ( ruleConstructor_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ( ruleConstructor_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ruleConstructor_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_19561);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: rule__Field_declaration__MethodNameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__MethodNameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( ( ruleMethod_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( ruleMethod_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( ruleMethod_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: ruleMethod_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_29592);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: rule__Field_declaration__StaticinitializerAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__StaticinitializerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: ( ( ruleStatic_initializer ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( ruleStatic_initializer )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( ruleStatic_initializer )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ruleStatic_initializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_19623);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: rule__Method_declaration__ModifiersMethodAssignment_0 : ( ruleModifier ) ;
    public final void rule__Method_declaration__ModifiersMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_09654);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: rule__Method_declaration__TypeMethodAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_19685);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4808:1: rule__Method_declaration__NameMethodAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_29716); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: rule__Method_declaration__ParameterListMethodAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterListMethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_49747);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4838:1: rule__Method_declaration__StatementMethodAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementMethodAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_09778);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:1: rule__Constructor_declaration__ModifiersConstructorAssignment_0 : ( ruleModifier ) ;
    public final void rule__Constructor_declaration__ModifiersConstructorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_09809);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4868:1: rule__Constructor_declaration__NameConstructorAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_19840); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: rule__Constructor_declaration__ParameterListConstructorAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParameterListConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_39871);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4898:1: rule__Constructor_declaration__StatementConstructorAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementConstructorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_59902);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4913:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_09933);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4928:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4932:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_19964);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_09995);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4962:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4963:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4963:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_110026); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: rule__Variable_declaration__ModifiersVariableAssignment_0 : ( ruleModifier ) ;
    public final void rule__Variable_declaration__ModifiersVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_010057);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_110088);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: rule__Variable_declaration__NameVariableAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_210119);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5022:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_110150);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: rule__Variable_declarator__NameVariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_010181); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: rule__Type__TypeSpecifierAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__TypeSpecifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5052:1: ( ( ruleType_specifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( ruleType_specifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( ruleType_specifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:1: ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_010212);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: rule__Static_initializer__StaticAssignment_0 : ( RULE_STATIC ) ;
    public final void rule__Static_initializer__StaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( ( RULE_STATIC ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( RULE_STATIC )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( RULE_STATIC )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: RULE_STATIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_010243); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_110274);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: rule__Statement_block__StatmentsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_110305);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: rule__Statement__NameStatementAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameStatementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5112:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_1_010336); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: rule__Statement__StatementAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_1_210367);
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


    // $ANTLR start "rule__Statement__TryStatementAssignment_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: rule__Statement__TryStatementAssignment_3 : ( ruleTry_statement ) ;
    public final void rule__Statement__TryStatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:1: ( ( ruleTry_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ruleTry_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ruleTry_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ruleTry_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_310398);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TryStatementAssignment_3"


    // $ANTLR start "rule__Statement__NameAssignment_4_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: rule__Statement__NameAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5157:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_4_210429); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_4_2"


    // $ANTLR start "rule__Statement__NameAssignment_5_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: rule__Statement__NameAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_5_210460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_5_2"


    // $ANTLR start "rule__Try_statement__TryStatementAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: rule__Try_statement__TryStatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__TryStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_110491);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: rule__Try_statement__ParametersAssignment_2_2 : ( ruleParameter ) ;
    public final void rule__Try_statement__ParametersAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_210522);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: rule__Try_statement__StatementAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_410553);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5228:1: rule__Try_statement__StatementFinallyAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementFinallyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_110584);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: rule__Import_statement__ClassNameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassNameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5248:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_010615);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: rule__Import_statement__PacNameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PacNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_010646);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5273:1: rule__Package_statement__PacNameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__PacNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_110677);
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

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:2: ( rule__Try_statement__Group_2__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:2: rule__Try_statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_synpred51_InternalMyDsl7633);
        rule__Try_statement__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:2: ( rule__Try_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:2: rule__Try_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_synpred52_InternalMyDsl7691);
        rule__Try_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // Delegated rules

    public final boolean synpred52_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalMyDsl_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
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
            return "761:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\3\4\12\6\1\13\1\uffff\1\6\2\uffff\1\6";
    static final String DFA4_maxS =
        "\3\23\10\35\1\47\2\35\1\uffff\1\6\2\uffff\1\47";
    static final String DFA4_acceptS =
        "\16\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
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
            "\1\15\24\uffff\1\16\1\uffff\1\14\11\uffff\1\17",
            "\1\15\26\uffff\1\14",
            "\1\20\14\uffff\1\20\2\uffff\1\21\1\uffff\1\20",
            "",
            "\1\22",
            "",
            "",
            "\1\15\26\uffff\1\14\11\uffff\1\17"
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
            return "811:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\6\1\13\1\6\2\uffff\1\13";
    static final String DFA9_maxS =
        "\1\6\1\47\1\6\2\uffff\1\47";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\3\31\uffff\1\4\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\31\uffff\1\4\1\uffff\1\2"
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
            return "1019:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1538 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_71764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Method_declaration__Alternatives_71783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type_specifier__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type_specifier__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type_specifier__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_specifier__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TryStatementAssignment_3_in_rule__Statement__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02248 = new BitSet(new long[]{0x00000010021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12309 = new BitSet(new long[]{0x00000010021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2339 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2397 = new BitSet(new long[]{0x00000000021000B2L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02434 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12495 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02620 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2650 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22743 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32803 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3146 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03183 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03306 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3336 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23429 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33489 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43550 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53611 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63673 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3703 = new BitSet(new long[]{0x00000000000FF8F2L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03809 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13994 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4081 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04118 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04241 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04363 = new BitSet(new long[]{0x00000000000FF8F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04487 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4517 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14548 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24608 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34668 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44730 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54791 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method_declaration__Group__5__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64853 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method_declaration__Group__6__Impl4885 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04991 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5021 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15052 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25112 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35174 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05366 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5453 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05488 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15671 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Parameter__Group__2__Impl5760 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05799 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl5829 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15860 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25920 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35980 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6010 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06233 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6322 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06359 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group__1__Impl6448 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06485 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06606 = new BitSet(new long[]{0x00000003806FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement_block__Group__0__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16668 = new BitSet(new long[]{0x00000003806FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6698 = new BitSet(new long[]{0x00000003802FF872L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement_block__Group__2__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06794 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameStatementAssignment_1_0_in_rule__Statement__Group_1__0__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16854 = new BitSet(new long[]{0x00000003802FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_1__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_1_2_in_rule__Statement__Group_1__2__Impl6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__06979 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__06982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__17040 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__17043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_4__1__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__27102 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__27105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_4_2_in_rule__Statement__Group_4__2__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__37163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_4__3__Impl7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__07230 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__07233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__17291 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_5__1__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__27353 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__27356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_5_2_in_rule__Statement__Group_5__2__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__37414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_5__3__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__07481 = new BitSet(new long[]{0x00000003802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__07484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Try_statement__Group__0__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__17543 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__17546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__27603 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__27606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl7633 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__37664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__07730 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__07733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Try_statement__Group_2__0__Impl7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__17794 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__17797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__27856 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__27859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__37916 = new BitSet(new long[]{0x00000003802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__37919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__47978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__08045 = new BitSet(new long[]{0x00000003802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__08048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Try_statement__Group_3__0__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__18109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__08170 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__08173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Import_statement__Group__0__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__18232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__08293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__08296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__18353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__08416 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__08419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Import_statement__Group_1_1__1__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__08539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__08542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Package_statement__Group__0__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__18601 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__18604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__28661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package_statement__Group__2__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__08726 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__08729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__18785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__08845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__08848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Package_name_line__Group__0__Impl8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__18907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_09003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_19034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_29065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_09096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_09127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_19158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_09189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_29220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_19282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_09313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_29344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_19375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_19437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_69468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_09499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_09530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_19561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_29592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_19623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_09654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_19685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_29716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_49747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_09778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_09809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_19840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_39871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_59902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_09933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_19964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_09995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_110026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_010057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_110088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_210119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_110150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_010181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_010212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_110274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_110305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_1_010336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_1_210367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_310398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_4_210429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_5_210460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_110491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_210522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_410553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_110584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_010615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_010646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_110677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_synpred51_InternalMyDsl7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_synpred52_InternalMyDsl7691 = new BitSet(new long[]{0x0000000000000002L});

}