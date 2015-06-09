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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MOD", "RULE_STATIC", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'default:'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "'synchronized('", "'return'", "'throw'", "':'", "'break'", "'continue'", "'switch('", "'){'", "'case'", "'while('", "'do'", "');'", "'if('", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'", "'.'"
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


    // $ANTLR start "entryRuleSwitch_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: entryRuleSwitch_statement : ruleSwitch_statement EOF ;
    public final void entryRuleSwitch_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( ruleSwitch_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ruleSwitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement1147);
            ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_statement1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitch_statement"


    // $ANTLR start "ruleSwitch_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ruleSwitch_statement : ( ( rule__Switch_statement__Group__0 ) ) ;
    public final void ruleSwitch_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: ( ( ( rule__Switch_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Switch_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Switch_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Switch_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Switch_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Switch_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group__0_in_ruleSwitch_statement1180);
            rule__Switch_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitch_statement"


    // $ANTLR start "entryRuleWhile_Statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: entryRuleWhile_Statement : ruleWhile_Statement EOF ;
    public final void entryRuleWhile_Statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ruleWhile_Statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement1207);
            ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement1214); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ruleWhile_Statement : ( ( rule__While_Statement__Group__0 ) ) ;
    public final void ruleWhile_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: ( ( ( rule__While_Statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__While_Statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__While_Statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__While_Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__While_Statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__While_Statement__Group__0
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__0_in_ruleWhile_Statement1240);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: entryRuleDo_Statement : ruleDo_Statement EOF ;
    public final void entryRuleDo_Statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ruleDo_Statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement1267);
            ruleDo_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement1274); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleDo_Statement : ( ( rule__Do_Statement__Group__0 ) ) ;
    public final void ruleDo_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: ( ( ( rule__Do_Statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__Do_Statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__Do_Statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__Do_Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__Do_Statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:637:2: rule__Do_Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__0_in_ruleDo_Statement1300);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: entryRuleIf_statement : ruleIf_statement EOF ;
    public final void entryRuleIf_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ruleIf_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_entryRuleIf_statement1327);
            ruleIf_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_statement1334); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ruleIf_statement : ( ( rule__If_statement__Group__0 ) ) ;
    public final void ruleIf_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:662:2: ( ( ( rule__If_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( rule__If_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( rule__If_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__If_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__If_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:665:2: rule__If_statement__Group__0
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0_in_ruleIf_statement1360);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: entryRuleTry_statement : ruleTry_statement EOF ;
    public final void entryRuleTry_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ruleTry_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement1387);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement1394); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ruleTry_statement : ( ( rule__Try_statement__Group__0 ) ) ;
    public final void ruleTry_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: ( ( ( rule__Try_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Try_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Try_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__Try_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Try_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:2: rule__Try_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1420);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ruleImport_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1447);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1454); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:718:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( rule__Import_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__Import_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__Import_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1480);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ruleClass_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1507);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1514); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:746:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1540);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( ruleInterface_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1566);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1573); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:774:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1599);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rulePackage_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1625);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1632); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:802:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__Package_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__Package_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__Package_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:805:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1658);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rulePackage_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1685);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1692); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Package_name__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Package_name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Package_name__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1718);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: entryRulePackage_name_line : rulePackage_name_line EOF ;
    public final void entryRulePackage_name_line() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rulePackage_name_line EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1745);
            rulePackage_name_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line1752); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rulePackage_name_line : ( ( rule__Package_name_line__Group__0 )* ) ;
    public final void rulePackage_name_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: ( ( ( rule__Package_name_line__Group__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( rule__Package_name_line__Group__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( rule__Package_name_line__Group__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__Package_name_line__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__Package_name_line__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:861:2: rule__Package_name_line__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1778);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getClassDecAssignment_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:880:2: rule__Type_declaration__ClassDecAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11815);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getInterfaceDecAssignment_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:886:2: rule__Type_declaration__InterfaceDecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11833);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) )
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
                else if ( (LA3_2==22) ) {
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( rule__Field_declaration__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( rule__Field_declaration__Group_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:902:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1866);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:906:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:906:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getStaticinitializerAssignment_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:2: rule__Field_declaration__StaticinitializerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1884);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:912:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:912:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( rule__Field_declaration__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__Field_declaration__Group_2__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:914:2: rule__Field_declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1902);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getVariableDeclarationAssignment_0_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:930:2: rule__Field_declaration__VariableDeclarationAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11935);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:934:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:934:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getContructorNameAssignment_0_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:936:2: rule__Field_declaration__ContructorNameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11953);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:940:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:940:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getMethodNameAssignment_0_1_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:942:2: rule__Field_declaration__MethodNameAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11971);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: rule__Method_declaration__Alternatives_7 : ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) );
    public final void rule__Method_declaration__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getStatementMethodAssignment_7_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:958:2: rule__Method_declaration__StatementMethodAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_72004);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:962:6: ( ';' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:962:6: ( ';' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Method_declaration__Alternatives_72023); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( 'boolean' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( 'boolean' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Type_specifier__Alternatives2058); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:988:6: ( 'byte' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:988:6: ( 'byte' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: 'byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Type_specifier__Alternatives2078); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:996:6: ( 'char' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:996:6: ( 'char' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: 'char'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Type_specifier__Alternatives2098); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:6: ( 'short' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:6: ( 'short' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: 'short'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives2118); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:6: ( 'int' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:6: ( 'int' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives2138); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:6: ( 'float' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:6: ( 'float' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives2158); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:6: ( 'long' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:6: ( 'long' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives2178); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:6: ( 'double' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:6: ( 'double' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Type_specifier__Alternatives2198); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:6: ( ruleClass_name )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:6: ( ruleClass_name )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives2217);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: rule__Modifier__Alternatives : ( ( RULE_MOD ) | ( RULE_STATIC ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( RULE_MOD ) | ( RULE_STATIC ) )
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( RULE_MOD )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( RULE_MOD )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: RULE_MOD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }
                    match(input,RULE_MOD,FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2249); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( RULE_STATIC )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( RULE_STATIC )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: RULE_STATIC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2266); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__SwitchStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) | ( ( rule__Statement__Group_13__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__SwitchStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) | ( ( rule__Statement__Group_13__0 ) ) )
            int alt8=14;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ruleStatement_block )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ruleStatement_block )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2298);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:6: ( ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:6: ( ruleVariable_declaration )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2315);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:6: ( ( rule__Statement__IfStatementAssignment_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:6: ( ( rule__Statement__IfStatementAssignment_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( rule__Statement__IfStatementAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementAssignment_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( rule__Statement__IfStatementAssignment_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:2: rule__Statement__IfStatementAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Statement__IfStatementAssignment_2_in_rule__Statement__Alternatives2332);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:6: ( ( rule__Statement__DoStatementAssignment_3 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:6: ( ( rule__Statement__DoStatementAssignment_3 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( rule__Statement__DoStatementAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDoStatementAssignment_3()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( rule__Statement__DoStatementAssignment_3 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:2: rule__Statement__DoStatementAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Statement__DoStatementAssignment_3_in_rule__Statement__Alternatives2350);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:6: ( ( rule__Statement__WhileStatementAssignment_4 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:6: ( ( rule__Statement__WhileStatementAssignment_4 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( rule__Statement__WhileStatementAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementAssignment_4()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( rule__Statement__WhileStatementAssignment_4 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:2: rule__Statement__WhileStatementAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__WhileStatementAssignment_4_in_rule__Statement__Alternatives2368);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:6: ( ( rule__Statement__TryStatementAssignment_5 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:6: ( ( rule__Statement__TryStatementAssignment_5 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( rule__Statement__TryStatementAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTryStatementAssignment_5()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( rule__Statement__TryStatementAssignment_5 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:2: rule__Statement__TryStatementAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Statement__TryStatementAssignment_5_in_rule__Statement__Alternatives2386);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:6: ( ( rule__Statement__SwitchStatementAssignment_6 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:6: ( ( rule__Statement__SwitchStatementAssignment_6 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( rule__Statement__SwitchStatementAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSwitchStatementAssignment_6()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__Statement__SwitchStatementAssignment_6 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:2: rule__Statement__SwitchStatementAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Statement__SwitchStatementAssignment_6_in_rule__Statement__Alternatives2404);
                    rule__Statement__SwitchStatementAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSwitchStatementAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:6: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:6: ( ( rule__Statement__Group_7__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( rule__Statement__Group_7__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives2422);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:6: ( ( rule__Statement__Group_8__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:6: ( ( rule__Statement__Group_8__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Statement__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_8()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rule__Statement__Group_8__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:2: rule__Statement__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives2440);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:6: ( ( rule__Statement__Group_9__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:6: ( ( rule__Statement__Group_9__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( rule__Statement__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_9()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( rule__Statement__Group_9__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:2: rule__Statement__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_9__0_in_rule__Statement__Alternatives2458);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:6: ( ( rule__Statement__Group_10__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:6: ( ( rule__Statement__Group_10__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__Statement__Group_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_10()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( rule__Statement__Group_10__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: rule__Statement__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_10__0_in_rule__Statement__Alternatives2476);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:6: ( ( rule__Statement__Group_11__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:6: ( ( rule__Statement__Group_11__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( rule__Statement__Group_11__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_11()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( rule__Statement__Group_11__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:2: rule__Statement__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_11__0_in_rule__Statement__Alternatives2494);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:6: ( ( rule__Statement__Group_12__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:6: ( ( rule__Statement__Group_12__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( rule__Statement__Group_12__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_12()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( rule__Statement__Group_12__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:2: rule__Statement__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_12__0_in_rule__Statement__Alternatives2512);
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
                case 14 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:6: ( ( rule__Statement__Group_13__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:6: ( ( rule__Statement__Group_13__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rule__Statement__Group_13__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_13()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Statement__Group_13__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:2: rule__Statement__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_13__0_in_rule__Statement__Alternatives2530);
                    rule__Statement__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_13()); 
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


    // $ANTLR start "rule__Switch_statement__Alternatives_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: rule__Switch_statement__Alternatives_2 : ( ( ( rule__Switch_statement__Group_2_0__0 ) ) | ( 'default:' ) | ( ( rule__Switch_statement__StatementAssignment_2_2 ) ) );
    public final void rule__Switch_statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( ( rule__Switch_statement__Group_2_0__0 ) ) | ( 'default:' ) | ( ( rule__Switch_statement__StatementAssignment_2_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case RULE_MOD:
            case RULE_STATIC:
            case RULE_ID:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 40:
            case 41:
            case 43:
            case 45:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( ( rule__Switch_statement__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( ( rule__Switch_statement__Group_2_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( rule__Switch_statement__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitch_statementAccess().getGroup_2_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( rule__Switch_statement__Group_2_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:2: rule__Switch_statement__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Switch_statement__Group_2_0__0_in_rule__Switch_statement__Alternatives_22563);
                    rule__Switch_statement__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitch_statementAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:6: ( 'default:' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:6: ( 'default:' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: 'default:'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitch_statementAccess().getDefaultKeyword_2_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Switch_statement__Alternatives_22582); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitch_statementAccess().getDefaultKeyword_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:6: ( ( rule__Switch_statement__StatementAssignment_2_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:6: ( ( rule__Switch_statement__StatementAssignment_2_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Switch_statement__StatementAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSwitch_statementAccess().getStatementAssignment_2_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ( rule__Switch_statement__StatementAssignment_2_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__Switch_statement__StatementAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Switch_statement__StatementAssignment_2_2_in_rule__Switch_statement__Alternatives_22601);
                    rule__Switch_statement__StatementAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSwitch_statementAccess().getStatementAssignment_2_2()); 
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
    // $ANTLR end "rule__Switch_statement__Alternatives_2"


    // $ANTLR start "rule__Import_statement__Alternatives_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12634);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12652);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02683);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02686);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__NameAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ( ( rule__Compilation_unit__NameAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: ( rule__Compilation_unit__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__Compilation_unit__NameAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:2: rule__Compilation_unit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2713);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12744);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12747);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2774);
            	    rule__Compilation_unit__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22805);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_MOD && LA13_0<=RULE_STATIC)||LA13_0==RULE_DOC_COMMENT||LA13_0==21||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:2: rule__Compilation_unit__TypeDeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2832);
            	    rule__Compilation_unit__TypeDeclarationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02869);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02872);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__CommentAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( ( ( rule__Type_declaration__CommentAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__Type_declaration__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( rule__Type_declaration__CommentAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOC_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__Type_declaration__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2899);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12930);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12933);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__Type_declaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__Type_declaration__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2960);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__Type_declaration__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22990);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Type_declaration__Group__2__Impl3018); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__03055);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__03058);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_MOD && LA15_0<=RULE_STATIC)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl3085);
            	    rule__Interface_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__13116);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__13119);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( 'interface' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( 'interface' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( 'interface' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Interface_declaration__Group__1__Impl3147); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__23178);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__23181);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3208);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33238);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33241);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__Interface_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3268);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43299);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43302);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__4__Impl3330); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53361);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group__5__Impl3389); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03432);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03435);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group_3__0__Impl3463); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13494);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13497);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3524);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23554);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3581);
            	    rule__Interface_declaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03618);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03621);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Interface_declaration__Group_3_2__0__Impl3649); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13680);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasAssignment_3_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:2: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3707);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03741);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03744);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_MOD && LA18_0<=RULE_STATIC)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3771);
            	    rule__Class_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13802);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13805);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( ( 'class' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( 'class' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( 'class' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group__1__Impl3833); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23864);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23867);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3894);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33924);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33927);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( rule__Class_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Class_declaration__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3954);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43985);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43988);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( rule__Class_declaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( rule__Class_declaration__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl4015);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__54046);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__54049);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Class_declaration__Group__5__Impl4077); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__64108);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__64111);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationAssignment_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_MOD && LA21_0<=RULE_DOC_COMMENT)||(LA21_0>=11 && LA21_0<=19)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:2: rule__Class_declaration__FieldsDeclarationAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl4138);
            	    rule__Class_declaration__FieldsDeclarationAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: ( rule__Class_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__74169);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group__7__Impl4197); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04244);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04247);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group_3__0__Impl4275); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14306);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:2: rule__Class_declaration__ClassHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4333);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04367);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04370);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( ( 'implements' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( 'implements' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( 'implements' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Class_declaration__Group_4__0__Impl4398); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14429);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14432);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaAssignment_4_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:2: rule__Class_declaration__InterfaceImplementadaAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4459);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24489);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4516);
            	    rule__Class_declaration__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04553);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04556);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group_4_2__0__Impl4584); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14615);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasAssignment_4_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:2: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4642);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04676);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04679);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentAssignment_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOC_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:2: rule__Field_declaration__CommentAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4706);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14737);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4764);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: rule__Field_declaration__Group_2__0 : rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 ;
    public final void rule__Field_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:2: rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04798);
            rule__Field_declaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04801);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: rule__Field_declaration__Group_2__0__Impl : ( () ) ;
    public final void rule__Field_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getField_declarationAction_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: rule__Field_declaration__Group_2__1 : rule__Field_declaration__Group_2__1__Impl ;
    public final void rule__Field_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ( rule__Field_declaration__Group_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:2: rule__Field_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14859);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: rule__Field_declaration__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Field_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4887); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04922);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04925);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: ( ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_MOD && LA24_0<=RULE_STATIC)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:2: rule__Method_declaration__ModifiersMethodAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4952);
            	    rule__Method_declaration__ModifiersMethodAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14983);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14986);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:2: rule__Method_declaration__TypeMethodAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl5013);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__25043);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__25046);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:2: rule__Method_declaration__NameMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl5073);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__35103);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__35106);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Method_declaration__Group__3__Impl5134); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__45165);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__45168);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:1: ( ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodAssignment_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=12 && LA25_0<=19)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:2: rule__Method_declaration__ParameterListMethodAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl5195);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55226);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55229);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__Method_declaration__Group__5__Impl5257); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65288);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65291);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( '[]' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:2: '[]'
            	    {
            	    match(input,30,FOLLOW_30_in_rule__Method_declaration__Group__6__Impl5320); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__Method_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75353);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( rule__Method_declaration__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( rule__Method_declaration__Alternatives_7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5380);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05426);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05429);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_MOD && LA27_0<=RULE_STATIC)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:2: rule__Constructor_declaration__ModifiersConstructorAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5456);
            	    rule__Constructor_declaration__ModifiersConstructorAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15487);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15490);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:2: rule__Constructor_declaration__NameConstructorAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5517);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25547);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25550);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constructor_declaration__Group__2__Impl5578); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35609);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35612);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorAssignment_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=12 && LA28_0<=19)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:2: rule__Constructor_declaration__ParameterListConstructorAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5639);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45670);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45673);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Constructor_declaration__Group__4__Impl5701); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55732);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorAssignment_5()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:2: rule__Constructor_declaration__StatementConstructorAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5759);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05801);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05804);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5831);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( rule__Parameter_list__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15861);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( rule__Parameter_list__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5888);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05923);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05926);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Parameter_list__Group_1__0__Impl5954); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15985);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl6012);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06046);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06049);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6076);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16106);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16109);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( rule__Parameter__ParameterNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__Parameter__ParameterNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:2: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl6136);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26166);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( '[]' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:2: '[]'
            	    {
            	    match(input,30,FOLLOW_30_in_rule__Parameter__Group__2__Impl6195); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06234);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06237);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_MOD && LA31_0<=RULE_STATIC)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:2: rule__Variable_declaration__ModifiersVariableAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6264);
            	    rule__Variable_declaration__ModifiersVariableAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16295);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16298);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6325);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26355);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26358);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: ( ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:2: rule__Variable_declaration__NameVariableAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6385);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36415);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36418);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: ( rule__Variable_declaration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( rule__Variable_declaration__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6445);
            	    rule__Variable_declaration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46476);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6504); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06545);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06548);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Variable_declaration__Group_3__0__Impl6576); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16607);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6634);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06668);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06671);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: ( ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:2: rule__Variable_declarator__NameVariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6698);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16728);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:1: ( '[]' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==30) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:2: '[]'
            	    {
            	    match(input,30,FOLLOW_30_in_rule__Variable_declarator__Group__1__Impl6757); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06794);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06797);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: rule__Type__Group__0__Impl : ( ( rule__Type__TypeSpecifierAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( ( ( rule__Type__TypeSpecifierAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( rule__Type__TypeSpecifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: ( rule__Type__TypeSpecifierAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:2: rule__Type__TypeSpecifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6824);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( rule__Type__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16854);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( '[]' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3348:2: '[]'
            	    {
            	    match(input,30,FOLLOW_30_in_rule__Type__Group__1__Impl6883); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06920);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06923);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: rule__Static_initializer__Group__0__Impl : ( ( rule__Static_initializer__StaticAssignment_0 ) ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: ( ( ( rule__Static_initializer__StaticAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: ( rule__Static_initializer__StaticAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: ( rule__Static_initializer__StaticAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:2: rule__Static_initializer__StaticAssignment_0
            {
            pushFollow(FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6950);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: ( rule__Static_initializer__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16980);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( rule__Static_initializer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl7007);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__07041);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__07044);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: rule__Statement_block__Group__0__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3442:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Statement_block__Group__0__Impl7072); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__17103);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__17106);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: rule__Statement_block__Group__1__Impl : ( ( rule__Statement_block__StatmentsAssignment_1 )* ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: ( ( ( rule__Statement_block__StatmentsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_MOD && LA35_0<=RULE_ID)||(LA35_0>=11 && LA35_0<=19)||LA35_0==22||(LA35_0>=31 && LA35_0<=33)||(LA35_0>=35 && LA35_0<=37)||(LA35_0>=40 && LA35_0<=41)||LA35_0==43||LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:2: rule__Statement_block__StatmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl7133);
            	    rule__Statement_block__StatmentsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: ( rule__Statement_block__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:2: rule__Statement_block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__27164);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: rule__Statement_block__Group__2__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Statement_block__Group__2__Impl7192); if (state.failed) return ;
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


    // $ANTLR start "rule__Statement__Group_7__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07229);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07232);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: rule__Statement__Group_7__0__Impl : ( () ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_7_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:2: rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17290);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17293);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: rule__Statement__Group_7__1__Impl : ( 'synchronized(' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( 'synchronized(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( 'synchronized(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( 'synchronized(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: 'synchronized('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSynchronizedKeyword_7_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_7__1__Impl7321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSynchronizedKeyword_7_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: rule__Statement__Group_7__2 : rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 ;
    public final void rule__Statement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:2: rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27352);
            rule__Statement__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__27355);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: rule__Statement__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Statement__Group_7__2__Impl7383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_7_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__Statement__Group_7__3 : rule__Statement__Group_7__3__Impl ;
    public final void rule__Statement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( rule__Statement__Group_7__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:2: rule__Statement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__37414);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: rule__Statement__Group_7__3__Impl : ( ( rule__Statement__SyncStatementAssignment_7_3 ) ) ;
    public final void rule__Statement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( ( ( rule__Statement__SyncStatementAssignment_7_3 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Statement__SyncStatementAssignment_7_3 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Statement__SyncStatementAssignment_7_3 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( rule__Statement__SyncStatementAssignment_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSyncStatementAssignment_7_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( rule__Statement__SyncStatementAssignment_7_3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:2: rule__Statement__SyncStatementAssignment_7_3
            {
            pushFollow(FOLLOW_rule__Statement__SyncStatementAssignment_7_3_in_rule__Statement__Group_7__3__Impl7441);
            rule__Statement__SyncStatementAssignment_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSyncStatementAssignment_7_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: rule__Statement__Group_8__0 : rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 ;
    public final void rule__Statement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:2: rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07479);
            rule__Statement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07482);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: rule__Statement__Group_8__0__Impl : ( () ) ;
    public final void rule__Statement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_8_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: rule__Statement__Group_8__1 : rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 ;
    public final void rule__Statement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: ( rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3685:2: rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17540);
            rule__Statement__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17543);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: rule__Statement__Group_8__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: ( ( 'return' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:1: ( 'return' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:1: ( 'return' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3698:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_8_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Statement__Group_8__1__Impl7571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnKeyword_8_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: rule__Statement__Group_8__2 : rule__Statement__Group_8__2__Impl ;
    public final void rule__Statement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( rule__Statement__Group_8__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:2: rule__Statement__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27602);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: rule__Statement__Group_8__2__Impl : ( ';' ) ;
    public final void rule__Statement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_8_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_8__2__Impl7630); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: rule__Statement__Group_9__0 : rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 ;
    public final void rule__Statement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: ( rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:2: rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07667);
            rule__Statement__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07670);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: rule__Statement__Group_9__0__Impl : ( () ) ;
    public final void rule__Statement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3765:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_9_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__Statement__Group_9__1 : rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2 ;
    public final void rule__Statement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:2: rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17728);
            rule__Statement__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_9__2_in_rule__Statement__Group_9__17731);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: rule__Statement__Group_9__1__Impl : ( 'throw' ) ;
    public final void rule__Statement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: ( ( 'throw' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( 'throw' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( 'throw' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: 'throw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getThrowKeyword_9_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Statement__Group_9__1__Impl7759); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getThrowKeyword_9_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: rule__Statement__Group_9__2 : rule__Statement__Group_9__2__Impl ;
    public final void rule__Statement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: ( rule__Statement__Group_9__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:2: rule__Statement__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__2__Impl_in_rule__Statement__Group_9__27790);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: rule__Statement__Group_9__2__Impl : ( ';' ) ;
    public final void rule__Statement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_9_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_9__2__Impl7818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_9_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: rule__Statement__Group_10__0 : rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1 ;
    public final void rule__Statement__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__0__Impl_in_rule__Statement__Group_10__07855);
            rule__Statement__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_10__1_in_rule__Statement__Group_10__07858);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: rule__Statement__Group_10__0__Impl : ( ( rule__Statement__NameStatementAssignment_10_0 ) ) ;
    public final void rule__Statement__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( ( rule__Statement__NameStatementAssignment_10_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( rule__Statement__NameStatementAssignment_10_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( rule__Statement__NameStatementAssignment_10_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( rule__Statement__NameStatementAssignment_10_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementAssignment_10_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( rule__Statement__NameStatementAssignment_10_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:2: rule__Statement__NameStatementAssignment_10_0
            {
            pushFollow(FOLLOW_rule__Statement__NameStatementAssignment_10_0_in_rule__Statement__Group_10__0__Impl7885);
            rule__Statement__NameStatementAssignment_10_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementAssignment_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_10__0__Impl"


    // $ANTLR start "rule__Statement__Group_10__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: rule__Statement__Group_10__1 : rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2 ;
    public final void rule__Statement__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:2: rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__1__Impl_in_rule__Statement__Group_10__17915);
            rule__Statement__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_10__2_in_rule__Statement__Group_10__17918);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: rule__Statement__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( ( ':' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ':' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_10_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Statement__Group_10__1__Impl7946); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_10_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: rule__Statement__Group_10__2 : rule__Statement__Group_10__2__Impl ;
    public final void rule__Statement__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( rule__Statement__Group_10__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:2: rule__Statement__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__2__Impl_in_rule__Statement__Group_10__27977);
            rule__Statement__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: rule__Statement__Group_10__2__Impl : ( ( rule__Statement__StatementAssignment_10_2 ) ) ;
    public final void rule__Statement__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( ( ( rule__Statement__StatementAssignment_10_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( rule__Statement__StatementAssignment_10_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( rule__Statement__StatementAssignment_10_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( rule__Statement__StatementAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_10_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( rule__Statement__StatementAssignment_10_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:2: rule__Statement__StatementAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_10_2_in_rule__Statement__Group_10__2__Impl8004);
            rule__Statement__StatementAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAssignment_10_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Statement__Group_11__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: rule__Statement__Group_11__0 : rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1 ;
    public final void rule__Statement__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:2: rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__0__Impl_in_rule__Statement__Group_11__08040);
            rule__Statement__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__1_in_rule__Statement__Group_11__08043);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: rule__Statement__Group_11__0__Impl : ( () ) ;
    public final void rule__Statement__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_11_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: rule__Statement__Group_11__1 : rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2 ;
    public final void rule__Statement__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:2: rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__1__Impl_in_rule__Statement__Group_11__18101);
            rule__Statement__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__2_in_rule__Statement__Group_11__18104);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: rule__Statement__Group_11__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( ( 'break' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( 'break' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( 'break' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getBreakKeyword_11_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Statement__Group_11__1__Impl8132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getBreakKeyword_11_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__Statement__Group_11__2 : rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3 ;
    public final void rule__Statement__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:2: rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__2__Impl_in_rule__Statement__Group_11__28163);
            rule__Statement__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__3_in_rule__Statement__Group_11__28166);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: rule__Statement__Group_11__2__Impl : ( ( rule__Statement__NameAssignment_11_2 )? ) ;
    public final void rule__Statement__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: ( ( ( rule__Statement__NameAssignment_11_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( ( rule__Statement__NameAssignment_11_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( ( rule__Statement__NameAssignment_11_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( rule__Statement__NameAssignment_11_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_11_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( rule__Statement__NameAssignment_11_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:2: rule__Statement__NameAssignment_11_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_11_2_in_rule__Statement__Group_11__2__Impl8193);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: rule__Statement__Group_11__3 : rule__Statement__Group_11__3__Impl ;
    public final void rule__Statement__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: ( rule__Statement__Group_11__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:2: rule__Statement__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__3__Impl_in_rule__Statement__Group_11__38224);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: rule__Statement__Group_11__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_11__3__Impl8252); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: rule__Statement__Group_12__0 : rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1 ;
    public final void rule__Statement__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ( rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:2: rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__0__Impl_in_rule__Statement__Group_12__08291);
            rule__Statement__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_12__1_in_rule__Statement__Group_12__08294);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: rule__Statement__Group_12__0__Impl : ( () ) ;
    public final void rule__Statement__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_12_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: rule__Statement__Group_12__1 : rule__Statement__Group_12__1__Impl rule__Statement__Group_12__2 ;
    public final void rule__Statement__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: ( rule__Statement__Group_12__1__Impl rule__Statement__Group_12__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:2: rule__Statement__Group_12__1__Impl rule__Statement__Group_12__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__1__Impl_in_rule__Statement__Group_12__18352);
            rule__Statement__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_12__2_in_rule__Statement__Group_12__18355);
            rule__Statement__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: rule__Statement__Group_12__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( ( 'continue' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( 'continue' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( 'continue' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getContinueKeyword_12_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_12__1__Impl8383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getContinueKeyword_12_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Statement__Group_12__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: rule__Statement__Group_12__2 : rule__Statement__Group_12__2__Impl rule__Statement__Group_12__3 ;
    public final void rule__Statement__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( rule__Statement__Group_12__2__Impl rule__Statement__Group_12__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:2: rule__Statement__Group_12__2__Impl rule__Statement__Group_12__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__2__Impl_in_rule__Statement__Group_12__28414);
            rule__Statement__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_12__3_in_rule__Statement__Group_12__28417);
            rule__Statement__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_12__2"


    // $ANTLR start "rule__Statement__Group_12__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: rule__Statement__Group_12__2__Impl : ( ( rule__Statement__NameAssignment_12_2 )? ) ;
    public final void rule__Statement__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( ( ( rule__Statement__NameAssignment_12_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ( ( rule__Statement__NameAssignment_12_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ( ( rule__Statement__NameAssignment_12_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:1: ( rule__Statement__NameAssignment_12_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_12_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( rule__Statement__NameAssignment_12_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:2: rule__Statement__NameAssignment_12_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_12_2_in_rule__Statement__Group_12__2__Impl8444);
                    rule__Statement__NameAssignment_12_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_12__2__Impl"


    // $ANTLR start "rule__Statement__Group_12__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: rule__Statement__Group_12__3 : rule__Statement__Group_12__3__Impl ;
    public final void rule__Statement__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: ( rule__Statement__Group_12__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:2: rule__Statement__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__3__Impl_in_rule__Statement__Group_12__38475);
            rule__Statement__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_12__3"


    // $ANTLR start "rule__Statement__Group_12__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: rule__Statement__Group_12__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_12__3__Impl8503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_12_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_12__3__Impl"


    // $ANTLR start "rule__Statement__Group_13__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: rule__Statement__Group_13__0 : rule__Statement__Group_13__0__Impl rule__Statement__Group_13__1 ;
    public final void rule__Statement__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: ( rule__Statement__Group_13__0__Impl rule__Statement__Group_13__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:2: rule__Statement__Group_13__0__Impl rule__Statement__Group_13__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_13__0__Impl_in_rule__Statement__Group_13__08542);
            rule__Statement__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_13__1_in_rule__Statement__Group_13__08545);
            rule__Statement__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_13__0"


    // $ANTLR start "rule__Statement__Group_13__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__Statement__Group_13__0__Impl : ( () ) ;
    public final void rule__Statement__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_13_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_13_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_13__0__Impl"


    // $ANTLR start "rule__Statement__Group_13__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: rule__Statement__Group_13__1 : rule__Statement__Group_13__1__Impl ;
    public final void rule__Statement__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ( rule__Statement__Group_13__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:2: rule__Statement__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_13__1__Impl_in_rule__Statement__Group_13__18603);
            rule__Statement__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_13__1"


    // $ANTLR start "rule__Statement__Group_13__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: rule__Statement__Group_13__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_13_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_13__1__Impl8631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_13_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_13__1__Impl"


    // $ANTLR start "rule__Switch_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: rule__Switch_statement__Group__0 : rule__Switch_statement__Group__0__Impl rule__Switch_statement__Group__1 ;
    public final void rule__Switch_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( rule__Switch_statement__Group__0__Impl rule__Switch_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:2: rule__Switch_statement__Group__0__Impl rule__Switch_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group__0__Impl_in_rule__Switch_statement__Group__08666);
            rule__Switch_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch_statement__Group__1_in_rule__Switch_statement__Group__08669);
            rule__Switch_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__0"


    // $ANTLR start "rule__Switch_statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: rule__Switch_statement__Group__0__Impl : ( 'switch(' ) ;
    public final void rule__Switch_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:1: ( ( 'switch(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: ( 'switch(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: ( 'switch(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: 'switch('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Switch_statement__Group__0__Impl8697); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__0__Impl"


    // $ANTLR start "rule__Switch_statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: rule__Switch_statement__Group__1 : rule__Switch_statement__Group__1__Impl rule__Switch_statement__Group__2 ;
    public final void rule__Switch_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( rule__Switch_statement__Group__1__Impl rule__Switch_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:2: rule__Switch_statement__Group__1__Impl rule__Switch_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group__1__Impl_in_rule__Switch_statement__Group__18728);
            rule__Switch_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch_statement__Group__2_in_rule__Switch_statement__Group__18731);
            rule__Switch_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__1"


    // $ANTLR start "rule__Switch_statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: rule__Switch_statement__Group__1__Impl : ( '){' ) ;
    public final void rule__Switch_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: ( ( '){' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: ( '){' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: ( '){' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: '){'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getRightParenthesisLeftCurlyBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Switch_statement__Group__1__Impl8759); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getRightParenthesisLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__1__Impl"


    // $ANTLR start "rule__Switch_statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: rule__Switch_statement__Group__2 : rule__Switch_statement__Group__2__Impl rule__Switch_statement__Group__3 ;
    public final void rule__Switch_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ( rule__Switch_statement__Group__2__Impl rule__Switch_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:2: rule__Switch_statement__Group__2__Impl rule__Switch_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group__2__Impl_in_rule__Switch_statement__Group__28790);
            rule__Switch_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch_statement__Group__3_in_rule__Switch_statement__Group__28793);
            rule__Switch_statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__2"


    // $ANTLR start "rule__Switch_statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: rule__Switch_statement__Group__2__Impl : ( ( rule__Switch_statement__Alternatives_2 )* ) ;
    public final void rule__Switch_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( ( ( rule__Switch_statement__Alternatives_2 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( ( rule__Switch_statement__Alternatives_2 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( ( rule__Switch_statement__Alternatives_2 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( rule__Switch_statement__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getAlternatives_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__Switch_statement__Alternatives_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_MOD && LA38_0<=RULE_ID)||(LA38_0>=11 && LA38_0<=20)||LA38_0==22||(LA38_0>=31 && LA38_0<=33)||(LA38_0>=35 && LA38_0<=37)||(LA38_0>=39 && LA38_0<=41)||LA38_0==43||LA38_0==45) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:2: rule__Switch_statement__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Switch_statement__Alternatives_2_in_rule__Switch_statement__Group__2__Impl8820);
            	    rule__Switch_statement__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__2__Impl"


    // $ANTLR start "rule__Switch_statement__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:1: rule__Switch_statement__Group__3 : rule__Switch_statement__Group__3__Impl ;
    public final void rule__Switch_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( rule__Switch_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:2: rule__Switch_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group__3__Impl_in_rule__Switch_statement__Group__38851);
            rule__Switch_statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__3"


    // $ANTLR start "rule__Switch_statement__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:1: rule__Switch_statement__Group__3__Impl : ( '}' ) ;
    public final void rule__Switch_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Switch_statement__Group__3__Impl8879); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group__3__Impl"


    // $ANTLR start "rule__Switch_statement__Group_2_0__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4391:1: rule__Switch_statement__Group_2_0__0 : rule__Switch_statement__Group_2_0__0__Impl rule__Switch_statement__Group_2_0__1 ;
    public final void rule__Switch_statement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4395:1: ( rule__Switch_statement__Group_2_0__0__Impl rule__Switch_statement__Group_2_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:2: rule__Switch_statement__Group_2_0__0__Impl rule__Switch_statement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group_2_0__0__Impl_in_rule__Switch_statement__Group_2_0__08918);
            rule__Switch_statement__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch_statement__Group_2_0__1_in_rule__Switch_statement__Group_2_0__08921);
            rule__Switch_statement__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group_2_0__0"


    // $ANTLR start "rule__Switch_statement__Group_2_0__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: rule__Switch_statement__Group_2_0__0__Impl : ( 'case' ) ;
    public final void rule__Switch_statement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:1: ( ( 'case' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( 'case' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( 'case' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getCaseKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Switch_statement__Group_2_0__0__Impl8949); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getCaseKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group_2_0__0__Impl"


    // $ANTLR start "rule__Switch_statement__Group_2_0__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: rule__Switch_statement__Group_2_0__1 : rule__Switch_statement__Group_2_0__1__Impl ;
    public final void rule__Switch_statement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: ( rule__Switch_statement__Group_2_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4427:2: rule__Switch_statement__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch_statement__Group_2_0__1__Impl_in_rule__Switch_statement__Group_2_0__18980);
            rule__Switch_statement__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group_2_0__1"


    // $ANTLR start "rule__Switch_statement__Group_2_0__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: rule__Switch_statement__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__Switch_statement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ( ':' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( ':' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getColonKeyword_2_0_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Switch_statement__Group_2_0__1__Impl9008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getColonKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__Group_2_0__1__Impl"


    // $ANTLR start "rule__While_Statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: rule__While_Statement__Group__0 : rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 ;
    public final void rule__While_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:2: rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__09043);
            rule__While_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__09046);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: rule__While_Statement__Group__0__Impl : ( 'while(' ) ;
    public final void rule__While_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getWhileKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__While_Statement__Group__0__Impl9074); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4487:1: rule__While_Statement__Group__1 : rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 ;
    public final void rule__While_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: ( rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:2: rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__19105);
            rule__While_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__19108);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: rule__While_Statement__Group__1__Impl : ( ')' ) ;
    public final void rule__While_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__While_Statement__Group__1__Impl9136); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: rule__While_Statement__Group__2 : rule__While_Statement__Group__2__Impl ;
    public final void rule__While_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ( rule__While_Statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:2: rule__While_Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__29167);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:1: rule__While_Statement__Group__2__Impl : ( ( rule__While_Statement__StatementAssignment_2 ) ) ;
    public final void rule__While_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: ( ( ( rule__While_Statement__StatementAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( rule__While_Statement__StatementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( rule__While_Statement__StatementAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:2: rule__While_Statement__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl9194);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: rule__Do_Statement__Group__0 : rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 ;
    public final void rule__Do_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:1: ( rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:2: rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__09230);
            rule__Do_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__09233);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: rule__Do_Statement__Group__0__Impl : ( 'do' ) ;
    public final void rule__Do_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( ( 'do' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ( 'do' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ( 'do' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4570:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getDoKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Do_Statement__Group__0__Impl9261); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: rule__Do_Statement__Group__1 : rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 ;
    public final void rule__Do_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: ( rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:2: rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__19292);
            rule__Do_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__19295);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: rule__Do_Statement__Group__1__Impl : ( ( rule__Do_Statement__StatementAssignment_1 ) ) ;
    public final void rule__Do_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( ( ( rule__Do_Statement__StatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( rule__Do_Statement__StatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( rule__Do_Statement__StatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:2: rule__Do_Statement__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl9322);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: rule__Do_Statement__Group__2 : rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 ;
    public final void rule__Do_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: ( rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:2: rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__29352);
            rule__Do_Statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__29355);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: rule__Do_Statement__Group__2__Impl : ( 'while(' ) ;
    public final void rule__Do_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getWhileKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__Do_Statement__Group__2__Impl9383); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: rule__Do_Statement__Group__3 : rule__Do_Statement__Group__3__Impl ;
    public final void rule__Do_Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: ( rule__Do_Statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:2: rule__Do_Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__39414);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: rule__Do_Statement__Group__3__Impl : ( ');' ) ;
    public final void rule__Do_Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: ( ( ');' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( ');' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( ');' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getRightParenthesisSemicolonKeyword_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__Do_Statement__Group__3__Impl9442); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: rule__If_statement__Group__0 : rule__If_statement__Group__0__Impl rule__If_statement__Group__1 ;
    public final void rule__If_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: ( rule__If_statement__Group__0__Impl rule__If_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:2: rule__If_statement__Group__0__Impl rule__If_statement__Group__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__09481);
            rule__If_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__09484);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: rule__If_statement__Group__0__Impl : ( 'if(' ) ;
    public final void rule__If_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4697:1: ( ( 'if(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: ( 'if(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: ( 'if(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: 'if('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__If_statement__Group__0__Impl9512); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4712:1: rule__If_statement__Group__1 : rule__If_statement__Group__1__Impl rule__If_statement__Group__2 ;
    public final void rule__If_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: ( rule__If_statement__Group__1__Impl rule__If_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:2: rule__If_statement__Group__1__Impl rule__If_statement__Group__2
            {
            pushFollow(FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__19543);
            rule__If_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__19546);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: rule__If_statement__Group__1__Impl : ( ')' ) ;
    public final void rule__If_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4729:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__If_statement__Group__1__Impl9574); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: rule__If_statement__Group__2 : rule__If_statement__Group__2__Impl rule__If_statement__Group__3 ;
    public final void rule__If_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: ( rule__If_statement__Group__2__Impl rule__If_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:2: rule__If_statement__Group__2__Impl rule__If_statement__Group__3
            {
            pushFollow(FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__29605);
            rule__If_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__29608);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: rule__If_statement__Group__2__Impl : ( ruleStatement ) ;
    public final void rule__If_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl9635);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: rule__If_statement__Group__3 : rule__If_statement__Group__3__Impl ;
    public final void rule__If_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4776:1: ( rule__If_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:2: rule__If_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__39664);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: rule__If_statement__Group__3__Impl : ( ( rule__If_statement__Group_3__0 )? ) ;
    public final void rule__If_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( ( ( rule__If_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( ( rule__If_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( ( rule__If_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: ( rule__If_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: ( rule__If_statement__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred61_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:2: rule__If_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl9691);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4808:1: rule__If_statement__Group_3__0 : rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 ;
    public final void rule__If_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:2: rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__09730);
            rule__If_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__09733);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: rule__If_statement__Group_3__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( ( ( 'else' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( 'else' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( 'else' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( 'else' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:2: 'else'
            {
            match(input,44,FOLLOW_44_in_rule__If_statement__Group_3__0__Impl9762); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:1: rule__If_statement__Group_3__1 : rule__If_statement__Group_3__1__Impl ;
    public final void rule__If_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: ( rule__If_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:2: rule__If_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__19794);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: rule__If_statement__Group_3__1__Impl : ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) ;
    public final void rule__If_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:2: rule__If_statement__ElseStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl9821);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: rule__Try_statement__Group__0 : rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 ;
    public final void rule__Try_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:2: rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__09855);
            rule__Try_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__09858);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: rule__Try_statement__Group__0__Impl : ( 'try' ) ;
    public final void rule__Try_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: ( ( 'try' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ( 'try' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: ( 'try' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: 'try'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Try_statement__Group__0__Impl9886); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: rule__Try_statement__Group__1 : rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 ;
    public final void rule__Try_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ( rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:2: rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__19917);
            rule__Try_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__19920);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: rule__Try_statement__Group__1__Impl : ( ( rule__Try_statement__TryStatementAssignment_1 ) ) ;
    public final void rule__Try_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( ( ( rule__Try_statement__TryStatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( rule__Try_statement__TryStatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( rule__Try_statement__TryStatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:2: rule__Try_statement__TryStatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl9947);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4931:1: rule__Try_statement__Group__2 : rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 ;
    public final void rule__Try_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:2: rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__29977);
            rule__Try_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__29980);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: rule__Try_statement__Group__2__Impl : ( ( rule__Try_statement__Group_2__0 )* ) ;
    public final void rule__Try_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( ( ( rule__Try_statement__Group_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ( rule__Try_statement__Group_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( ( rule__Try_statement__Group_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: ( rule__Try_statement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: ( rule__Try_statement__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==46) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred62_InternalMyDsl()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:2: rule__Try_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl10007);
            	    rule__Try_statement__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: rule__Try_statement__Group__3 : rule__Try_statement__Group__3__Impl ;
    public final void rule__Try_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( rule__Try_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:2: rule__Try_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__310038);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: rule__Try_statement__Group__3__Impl : ( ( rule__Try_statement__Group_3__0 )? ) ;
    public final void rule__Try_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: ( ( ( rule__Try_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( ( rule__Try_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( ( rule__Try_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ( rule__Try_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( rule__Try_statement__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred63_InternalMyDsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:2: rule__Try_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl10065);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4996:1: rule__Try_statement__Group_2__0 : rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 ;
    public final void rule__Try_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: ( rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:2: rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__010104);
            rule__Try_statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__010107);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: rule__Try_statement__Group_2__0__Impl : ( ( 'catch' ) ) ;
    public final void rule__Try_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( ( ( 'catch' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( ( 'catch' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( ( 'catch' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: ( 'catch' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5015:1: ( 'catch' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:2: 'catch'
            {
            match(input,46,FOLLOW_46_in_rule__Try_statement__Group_2__0__Impl10136); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: rule__Try_statement__Group_2__1 : rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 ;
    public final void rule__Try_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:2: rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__110168);
            rule__Try_statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__110171);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: rule__Try_statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Try_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Try_statement__Group_2__1__Impl10199); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: rule__Try_statement__Group_2__2 : rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 ;
    public final void rule__Try_statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:2: rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__210230);
            rule__Try_statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__210233);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5070:1: rule__Try_statement__Group_2__2__Impl : ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) ;
    public final void rule__Try_statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:1: ( ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:2: rule__Try_statement__ParametersAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl10260);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5087:1: rule__Try_statement__Group_2__3 : rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 ;
    public final void rule__Try_statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: ( rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:2: rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__310290);
            rule__Try_statement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__310293);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: rule__Try_statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Try_statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__Try_statement__Group_2__3__Impl10321); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: rule__Try_statement__Group_2__4 : rule__Try_statement__Group_2__4__Impl ;
    public final void rule__Try_statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: ( rule__Try_statement__Group_2__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:2: rule__Try_statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__410352);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: rule__Try_statement__Group_2__4__Impl : ( ( rule__Try_statement__StatementAssignment_2_4 ) ) ;
    public final void rule__Try_statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: ( ( ( rule__Try_statement__StatementAssignment_2_4 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5135:1: ( rule__Try_statement__StatementAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementAssignment_2_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5136:1: ( rule__Try_statement__StatementAssignment_2_4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5136:2: rule__Try_statement__StatementAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl10379);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5156:1: rule__Try_statement__Group_3__0 : rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 ;
    public final void rule__Try_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:2: rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__010419);
            rule__Try_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__010422);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: rule__Try_statement__Group_3__0__Impl : ( ( 'finally' ) ) ;
    public final void rule__Try_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( ( 'finally' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( ( 'finally' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( ( 'finally' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( 'finally' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( 'finally' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:2: 'finally'
            {
            match(input,47,FOLLOW_47_in_rule__Try_statement__Group_3__0__Impl10451); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: rule__Try_statement__Group_3__1 : rule__Try_statement__Group_3__1__Impl ;
    public final void rule__Try_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: ( rule__Try_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:2: rule__Try_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__110483);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: rule__Try_statement__Group_3__1__Impl : ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) ;
    public final void rule__Try_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: ( ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:2: rule__Try_statement__StatementFinallyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl10510);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__010544);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__010547);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5231:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ( 'import' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( 'import' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( 'import' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Import_statement__Group__0__Impl10575); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:1: ( rule__Import_statement__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__110606);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( rule__Import_statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( rule__Import_statement__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl10633);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5286:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__010667);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__010670);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: ( ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameAssignment_1_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5301:2: rule__Import_statement__ClassNameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl10697);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5316:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__110727);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl10755); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__010790);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__010793);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5361:1: ( ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNameAssignment_1_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:2: rule__Import_statement__PacNameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl10820);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__110850);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( ( '.*;' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( '.*;' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( '.*;' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: '.*;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__Import_statement__Group_1_1__1__Impl10878); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5413:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__010913);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__010916);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: ( ( 'package' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: ( 'package' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: ( 'package' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Package_statement__Group__0__Impl10944); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__110975);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__110978);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__PacNameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: ( ( ( rule__Package_statement__PacNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( rule__Package_statement__PacNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( rule__Package_statement__PacNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:2: rule__Package_statement__PacNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl11005);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( rule__Package_statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__211035);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5485:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Package_statement__Group__2__Impl11063); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5504:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__011100);
            rule__Package_name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__011103);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl11130); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( rule__Package_name__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__111159);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5544:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_line ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ( ( rulePackage_name_line ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( rulePackage_name_line )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( rulePackage_name_line )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: rulePackage_name_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl11186);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5565:1: rule__Package_name_line__Group__0 : rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 ;
    public final void rule__Package_name_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:1: ( rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:2: rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__011219);
            rule__Package_name_line__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__011222);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: rule__Package_name_line__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ( '.' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( '.' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( '.' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Package_name_line__Group__0__Impl11250); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: rule__Package_name_line__Group__1 : rule__Package_name_line__Group__1__Impl ;
    public final void rule__Package_name_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: ( rule__Package_name_line__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:2: rule__Package_name_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__111281);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: rule__Package_name_line__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl11308); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: rule__Model__GreetingsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: ( ( ruleCompilation_unit ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: ( ruleCompilation_unit )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: ( ruleCompilation_unit )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5635:1: ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment11346);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: rule__Compilation_unit__NameAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5648:1: ( ( rulePackage_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: ( rulePackage_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: ( rulePackage_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5650:1: rulePackage_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_011377);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5663:1: ( ( ruleImport_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: ( ruleImport_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: ( ruleImport_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5665:1: ruleImport_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_111408);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5674:1: rule__Compilation_unit__TypeDeclarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__TypeDeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ( ( ruleType_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: ( ruleType_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: ( ruleType_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5680:1: ruleType_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_211439);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5689:1: rule__Type_declaration__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5695:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_011470); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: rule__Type_declaration__ClassDecAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__ClassDecAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ( ( ruleClass_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ( ruleClass_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ( ruleClass_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5710:1: ruleClass_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_011501);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5719:1: rule__Type_declaration__InterfaceDecAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__InterfaceDecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ( ruleInterface_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ( ruleInterface_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ( ruleInterface_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5725:1: ruleInterface_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_111532);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5734:1: rule__Interface_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5740:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_011563);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5749:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5754:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5754:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5755:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_211594); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfaceHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_111625);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:1: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5784:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5784:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5785:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_111656);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5794:1: rule__Class_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5799:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5799:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5800:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_011687);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5809:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5814:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5814:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5815:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_211718); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5824:1: rule__Class_declaration__ClassHerdadaAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ClassHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5828:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5829:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5829:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5830:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_111749);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5839:1: rule__Class_declaration__InterfaceImplementadaAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfaceImplementadaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5843:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5844:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5844:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5845:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_111780);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5854:1: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5858:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5859:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5859:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5860:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_111811);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5869:1: rule__Class_declaration__FieldsDeclarationAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsDeclarationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5873:1: ( ( ruleField_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5874:1: ( ruleField_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5874:1: ( ruleField_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5875:1: ruleField_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_611842);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5884:1: rule__Field_declaration__CommentAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5890:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_011873); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5899:1: rule__Field_declaration__VariableDeclarationAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__VariableDeclarationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:1: ( ( ruleVariable_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5904:1: ( ruleVariable_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5904:1: ( ruleVariable_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5905:1: ruleVariable_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_011904);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5914:1: rule__Field_declaration__ContructorNameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__ContructorNameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ( ( ruleConstructor_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5919:1: ( ruleConstructor_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5919:1: ( ruleConstructor_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5920:1: ruleConstructor_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_111935);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: rule__Field_declaration__MethodNameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__MethodNameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ( ( ruleMethod_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5934:1: ( ruleMethod_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5934:1: ( ruleMethod_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5935:1: ruleMethod_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_211966);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5944:1: rule__Field_declaration__StaticinitializerAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__StaticinitializerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( ( ruleStatic_initializer ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: ( ruleStatic_initializer )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: ( ruleStatic_initializer )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5950:1: ruleStatic_initializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_111997);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5959:1: rule__Method_declaration__ModifiersMethodAssignment_0 : ( ruleModifier ) ;
    public final void rule__Method_declaration__ModifiersMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5965:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_012028);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5974:1: rule__Method_declaration__TypeMethodAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5979:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5979:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5980:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_112059);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5989:1: rule__Method_declaration__NameMethodAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5994:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5994:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5995:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_212090); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: rule__Method_declaration__ParameterListMethodAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterListMethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6009:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6009:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6010:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_412121);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: rule__Method_declaration__StatementMethodAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementMethodAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6023:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6024:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6024:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6025:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_012152);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: rule__Constructor_declaration__ModifiersConstructorAssignment_0 : ( ruleModifier ) ;
    public final void rule__Constructor_declaration__ModifiersConstructorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6040:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_012183);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6049:1: rule__Constructor_declaration__NameConstructorAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6053:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6054:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6054:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6055:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_112214); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: rule__Constructor_declaration__ParameterListConstructorAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParameterListConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6070:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_312245);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: rule__Constructor_declaration__StatementConstructorAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementConstructorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6083:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6084:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6084:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6085:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_512276);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6100:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_012307);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6109:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6113:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6114:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6114:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6115:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_112338);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6124:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6129:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6129:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6130:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_012369);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6143:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6144:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6144:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6145:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_112400); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6154:1: rule__Variable_declaration__ModifiersVariableAssignment_0 : ( ruleModifier ) ;
    public final void rule__Variable_declaration__ModifiersVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6158:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6159:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6159:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6160:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_012431);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6169:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6173:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6174:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6174:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6175:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_112462);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6184:1: rule__Variable_declaration__NameVariableAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6188:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6189:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6189:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6190:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_212493);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6199:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6203:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6204:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6204:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6205:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_112524);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6214:1: rule__Variable_declarator__NameVariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6218:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6219:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6219:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6220:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_012555); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6229:1: rule__Type__TypeSpecifierAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__TypeSpecifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6233:1: ( ( ruleType_specifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6234:1: ( ruleType_specifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6234:1: ( ruleType_specifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6235:1: ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_012586);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6244:1: rule__Static_initializer__StaticAssignment_0 : ( RULE_STATIC ) ;
    public final void rule__Static_initializer__StaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6248:1: ( ( RULE_STATIC ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6249:1: ( RULE_STATIC )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6249:1: ( RULE_STATIC )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6250:1: RULE_STATIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_012617); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6259:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6263:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6264:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6264:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6265:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_112648);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6274:1: rule__Statement_block__StatmentsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6278:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6279:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6279:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6280:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_112679);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6289:1: rule__Statement__IfStatementAssignment_2 : ( ruleIf_statement ) ;
    public final void rule__Statement__IfStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6293:1: ( ( ruleIf_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6294:1: ( ruleIf_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6294:1: ( ruleIf_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6295:1: ruleIf_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_212710);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6304:1: rule__Statement__DoStatementAssignment_3 : ( ruleDo_Statement ) ;
    public final void rule__Statement__DoStatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6308:1: ( ( ruleDo_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6309:1: ( ruleDo_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6309:1: ( ruleDo_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6310:1: ruleDo_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_312741);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6319:1: rule__Statement__WhileStatementAssignment_4 : ( ruleWhile_Statement ) ;
    public final void rule__Statement__WhileStatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6323:1: ( ( ruleWhile_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6324:1: ( ruleWhile_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6324:1: ( ruleWhile_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:1: ruleWhile_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_412772);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6334:1: rule__Statement__TryStatementAssignment_5 : ( ruleTry_statement ) ;
    public final void rule__Statement__TryStatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6338:1: ( ( ruleTry_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:1: ( ruleTry_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:1: ( ruleTry_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6340:1: ruleTry_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_512803);
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


    // $ANTLR start "rule__Statement__SwitchStatementAssignment_6"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6349:1: rule__Statement__SwitchStatementAssignment_6 : ( ruleSwitch_statement ) ;
    public final void rule__Statement__SwitchStatementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6353:1: ( ( ruleSwitch_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6354:1: ( ruleSwitch_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6354:1: ( ruleSwitch_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6355:1: ruleSwitch_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleSwitch_statement_in_rule__Statement__SwitchStatementAssignment_612834);
            ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__SwitchStatementAssignment_6"


    // $ANTLR start "rule__Statement__SyncStatementAssignment_7_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: rule__Statement__SyncStatementAssignment_7_3 : ( ruleStatement ) ;
    public final void rule__Statement__SyncStatementAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6368:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6369:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6369:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6370:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__SyncStatementAssignment_7_312865);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__SyncStatementAssignment_7_3"


    // $ANTLR start "rule__Statement__NameStatementAssignment_10_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: rule__Statement__NameStatementAssignment_10_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameStatementAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6383:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6384:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6384:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6385:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_10_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_10_012896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_10_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameStatementAssignment_10_0"


    // $ANTLR start "rule__Statement__StatementAssignment_10_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6394:1: rule__Statement__StatementAssignment_10_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6398:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6399:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6399:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_10_212927);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_10_2"


    // $ANTLR start "rule__Statement__NameAssignment_11_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6409:1: rule__Statement__NameAssignment_11_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6415:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_11_212958); if (state.failed) return ;
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


    // $ANTLR start "rule__Statement__NameAssignment_12_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:1: rule__Statement__NameAssignment_12_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6429:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6429:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6430:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_12_212989); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_12_2"


    // $ANTLR start "rule__Switch_statement__StatementAssignment_2_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6439:1: rule__Switch_statement__StatementAssignment_2_2 : ( ruleStatement ) ;
    public final void rule__Switch_statement__StatementAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6443:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6444:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6444:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6445:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitch_statementAccess().getStatementStatementParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Switch_statement__StatementAssignment_2_213020);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitch_statementAccess().getStatementStatementParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch_statement__StatementAssignment_2_2"


    // $ANTLR start "rule__While_Statement__StatementAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:1: rule__While_Statement__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__While_Statement__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6458:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6459:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6459:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6460:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_213051);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6469:1: rule__Do_Statement__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Do_Statement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6473:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6474:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6474:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6475:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_113082);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6484:1: rule__If_statement__ElseStatementAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__If_statement__ElseStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6488:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6490:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_113113);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6499:1: rule__Try_statement__TryStatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__TryStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6503:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6504:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6504:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6505:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_113144);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6514:1: rule__Try_statement__ParametersAssignment_2_2 : ( ruleParameter ) ;
    public final void rule__Try_statement__ParametersAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6518:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6519:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6519:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6520:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_213175);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6529:1: rule__Try_statement__StatementAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6533:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6534:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6534:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6535:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_413206);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6544:1: rule__Try_statement__StatementFinallyAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementFinallyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6548:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6549:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6549:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6550:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_113237);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6559:1: rule__Import_statement__ClassNameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassNameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6563:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6564:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6564:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6565:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_013268);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6574:1: rule__Import_statement__PacNameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PacNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6578:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6579:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6579:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6580:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_013299);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6589:1: rule__Package_statement__PacNameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__PacNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6593:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6594:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6594:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6595:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_113330);
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

    // $ANTLR start synpred61_InternalMyDsl
    public final void synpred61_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:2: ( rule__If_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:2: rule__If_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_synpred61_InternalMyDsl9691);
        rule__If_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:2: ( rule__Try_statement__Group_2__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:2: rule__Try_statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_synpred62_InternalMyDsl10007);
        rule__Try_statement__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMyDsl

    // $ANTLR start synpred63_InternalMyDsl
    public final void synpred63_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:2: ( rule__Try_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:2: rule__Try_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_synpred63_InternalMyDsl10065);
        rule__Try_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalMyDsl

    // Delegated rules

    public final boolean synpred62_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\3\4\2\uffff";
    static final String DFA2_maxS =
        "\3\32\2\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\17\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\17\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\17\uffff\1\4\4\uffff\1\3",
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
            return "873:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\3\4\12\6\1\13\1\uffff\1\6\2\uffff\1\6";
    static final String DFA4_maxS =
        "\3\23\10\36\1\63\2\36\1\uffff\1\6\2\uffff\1\63";
    static final String DFA4_acceptS =
        "\16\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\27\uffff\1\14",
            "\1\15\25\uffff\1\16\1\uffff\1\14\24\uffff\1\17",
            "\1\15\27\uffff\1\14",
            "\1\20\15\uffff\1\20\2\uffff\1\21\1\uffff\1\20",
            "",
            "\1\22",
            "",
            "",
            "\1\15\27\uffff\1\14\24\uffff\1\17"
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
            return "923:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\20\uffff";
    static final String DFA8_eofS =
        "\20\uffff";
    static final String DFA8_minS =
        "\1\4\2\uffff\1\6\14\uffff";
    static final String DFA8_maxS =
        "\1\55\2\uffff\1\63\14\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\14"+
        "\1\15\1\16\1\13";
    static final String DFA8_specialS =
        "\20\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\2\1\3\4\uffff\1\16\10\2\2\uffff\1\1\10\uffff\1\11\1\12\1"+
            "\13\1\uffff\1\14\1\15\1\10\2\uffff\1\6\1\5\1\uffff\1\4\1\uffff"+
            "\1\7",
            "",
            "",
            "\1\2\27\uffff\1\2\3\uffff\1\17\20\uffff\1\2",
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
            return "1077:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__SwitchStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) | ( ( rule__Statement__Group_13__0 ) ) );";
        }
    }
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\1\6\1\13\1\6\2\uffff\1\13";
    static final String DFA10_maxS =
        "\1\6\1\63\1\6\2\uffff\1\63";
    static final String DFA10_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\3\45\uffff\1\4\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\45\uffff\1\4\1\uffff\1\2"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1201:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__0_in_ruleSwitch_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__0_in_ruleWhile_Statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__0_in_ruleDo_Statement1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_entryRuleIf_statement1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_statement1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0_in_ruleIf_statement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1778 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_72004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Method_declaration__Alternatives_72023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type_specifier__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type_specifier__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type_specifier__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_specifier__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IfStatementAssignment_2_in_rule__Statement__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoStatementAssignment_3_in_rule__Statement__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileStatementAssignment_4_in_rule__Statement__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TryStatementAssignment_5_in_rule__Statement__Alternatives2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__SwitchStatementAssignment_6_in_rule__Statement__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0_in_rule__Statement__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__0_in_rule__Statement__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__0_in_rule__Statement__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__0_in_rule__Statement__Alternatives2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_13__0_in_rule__Statement__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group_2_0__0_in_rule__Switch_statement__Alternatives_22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Switch_statement__Alternatives_22582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__StatementAssignment_2_2_in_rule__Switch_statement__Alternatives_22601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02683 = new BitSet(new long[]{0x00010000042000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12744 = new BitSet(new long[]{0x00010000042000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2774 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2832 = new BitSet(new long[]{0x00000000042000B2L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02869 = new BitSet(new long[]{0x00000000042000B0L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12930 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type_declaration__Group__2__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__03055 = new BitSet(new long[]{0x00000000042000B0L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__03058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl3085 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__13116 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface_declaration__Group__1__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__23178 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33238 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43299 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__4__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group__5__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group_3__0__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13494 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3581 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Interface_declaration__Group_3_2__0__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03741 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3771 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13802 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group__1__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23864 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33924 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43985 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__54046 = new BitSet(new long[]{0x00000000008FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__54049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class_declaration__Group__5__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__64108 = new BitSet(new long[]{0x00000000008FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__64111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl4138 = new BitSet(new long[]{0x00000000000FF8F2L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__74169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group__7__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04244 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group_3__0__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class_declaration__Group_4__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14429 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4516 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group_4_2__0__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04676 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04798 = new BitSet(new long[]{0x00000000000FF8F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04922 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4952 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14983 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__25043 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__25046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__35103 = new BitSet(new long[]{0x00000000200FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__35106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method_declaration__Group__3__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__45165 = new BitSet(new long[]{0x00000000200FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__45168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55226 = new BitSet(new long[]{0x0000000040400800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method_declaration__Group__5__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65288 = new BitSet(new long[]{0x0000000040400800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Method_declaration__Group__6__Impl5320 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05426 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5456 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15487 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25547 = new BitSet(new long[]{0x00000000200FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constructor_declaration__Group__2__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35609 = new BitSet(new long[]{0x00000000200FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constructor_declaration__Group__4__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05801 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5888 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05923 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Parameter_list__Group_1__0__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16106 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Parameter__Group__2__Impl6195 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06234 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6264 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26355 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36415 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6445 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06545 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Variable_declaration__Group_3__0__Impl6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06668 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Variable_declarator__Group__1__Impl6757 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06794 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Type__Group__1__Impl6883 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06920 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__07041 = new BitSet(new long[]{0x00002B3B80CFF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__07044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement_block__Group__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__17103 = new BitSet(new long[]{0x00002B3B80CFF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__17106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl7133 = new BitSet(new long[]{0x00002B3B804FF872L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__27164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement_block__Group__2__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07229 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17290 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_7__1__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27352 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__27355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_7__2__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__37414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__SyncStatementAssignment_7_3_in_rule__Statement__Group_7__3__Impl7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07479 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17540 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_8__1__Impl7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_8__2__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07667 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17728 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__2_in_rule__Statement__Group_9__17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_9__1__Impl7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__2__Impl_in_rule__Statement__Group_9__27790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_9__2__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__0__Impl_in_rule__Statement__Group_10__07855 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__1_in_rule__Statement__Group_10__07858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameStatementAssignment_10_0_in_rule__Statement__Group_10__0__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__1__Impl_in_rule__Statement__Group_10__17915 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__2_in_rule__Statement__Group_10__17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_10__1__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__2__Impl_in_rule__Statement__Group_10__27977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_10_2_in_rule__Statement__Group_10__2__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__0__Impl_in_rule__Statement__Group_11__08040 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__1_in_rule__Statement__Group_11__08043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__1__Impl_in_rule__Statement__Group_11__18101 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__2_in_rule__Statement__Group_11__18104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_11__1__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__2__Impl_in_rule__Statement__Group_11__28163 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__3_in_rule__Statement__Group_11__28166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_11_2_in_rule__Statement__Group_11__2__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__3__Impl_in_rule__Statement__Group_11__38224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_11__3__Impl8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__0__Impl_in_rule__Statement__Group_12__08291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__1_in_rule__Statement__Group_12__08294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__1__Impl_in_rule__Statement__Group_12__18352 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__2_in_rule__Statement__Group_12__18355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_12__1__Impl8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__2__Impl_in_rule__Statement__Group_12__28414 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__3_in_rule__Statement__Group_12__28417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_12_2_in_rule__Statement__Group_12__2__Impl8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__3__Impl_in_rule__Statement__Group_12__38475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_12__3__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_13__0__Impl_in_rule__Statement__Group_13__08542 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_13__1_in_rule__Statement__Group_13__08545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_13__1__Impl_in_rule__Statement__Group_13__18603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_13__1__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__0__Impl_in_rule__Switch_statement__Group__08666 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__1_in_rule__Switch_statement__Group__08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Switch_statement__Group__0__Impl8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__1__Impl_in_rule__Switch_statement__Group__18728 = new BitSet(new long[]{0x00002BBB80DFF870L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__2_in_rule__Switch_statement__Group__18731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Switch_statement__Group__1__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__2__Impl_in_rule__Switch_statement__Group__28790 = new BitSet(new long[]{0x00002BBB80DFF870L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__3_in_rule__Switch_statement__Group__28793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Alternatives_2_in_rule__Switch_statement__Group__2__Impl8820 = new BitSet(new long[]{0x00002BBB805FF872L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group__3__Impl_in_rule__Switch_statement__Group__38851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Switch_statement__Group__3__Impl8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group_2_0__0__Impl_in_rule__Switch_statement__Group_2_0__08918 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group_2_0__1_in_rule__Switch_statement__Group_2_0__08921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Switch_statement__Group_2_0__0__Impl8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch_statement__Group_2_0__1__Impl_in_rule__Switch_statement__Group_2_0__18980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Switch_statement__Group_2_0__1__Impl9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__09043 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__09046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__While_Statement__Group__0__Impl9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__19105 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__19108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While_Statement__Group__1__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__29167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__09230 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__09233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Do_Statement__Group__0__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__19292 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__19295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__29352 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__29355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Do_Statement__Group__2__Impl9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__39414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Do_Statement__Group__3__Impl9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__09481 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__09484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__If_statement__Group__0__Impl9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__19543 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__19546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__If_statement__Group__1__Impl9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__29605 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__29608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__39664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__09730 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__09733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__If_statement__Group_3__0__Impl9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__19794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__09855 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__09858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Try_statement__Group__0__Impl9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__19917 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__19920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__29977 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__29980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl10007 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__310038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__010104 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__010107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Try_statement__Group_2__0__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__110168 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__110171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Try_statement__Group_2__1__Impl10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__210230 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__210233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__310290 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__310293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Try_statement__Group_2__3__Impl10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__410352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__010419 = new BitSet(new long[]{0x00002B3B804FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__010422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Try_statement__Group_3__0__Impl10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__110483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__010544 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__010547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Import_statement__Group__0__Impl10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__110606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__010667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__010670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__110727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl10755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__010790 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__010793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__110850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Import_statement__Group_1_1__1__Impl10878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__010913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__010916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Package_statement__Group__0__Impl10944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__110975 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__110978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__211035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package_statement__Group__2__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__011100 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__011103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__111159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__011219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__011222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Package_name_line__Group__0__Impl11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl11308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_011377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_111408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_211439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_011470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_011501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_111532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_011563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_211594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_111625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_111656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_011687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_211718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_111749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_111780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_111811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_611842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_011873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_011904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_111935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_211966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_111997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_012028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_112059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_212090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_412121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_012152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_012183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_112214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_312245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_512276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_012307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_112338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_012369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_112400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_012431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_112462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_212493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_112524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_012555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_012586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_012617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_112648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_112679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_212710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_312741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_412772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_512803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_rule__Statement__SwitchStatementAssignment_612834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__SyncStatementAssignment_7_312865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_10_012896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_10_212927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_11_212958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_12_212989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Switch_statement__StatementAssignment_2_213020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_213051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_113082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_113113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_113144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_213175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_413206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_113237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_013268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_013299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_113330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_synpred61_InternalMyDsl9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_synpred62_InternalMyDsl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_synpred63_InternalMyDsl10065 = new BitSet(new long[]{0x0000000000000002L});

}