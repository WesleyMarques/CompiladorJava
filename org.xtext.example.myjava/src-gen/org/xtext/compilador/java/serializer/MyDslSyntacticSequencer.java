/*
 * generated by Xtext
 */
package org.xtext.compilador.java.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.compilador.java.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Method_declaration_LeftSquareBracketRightSquareBracketKeyword_6_a;
	protected AbstractElementAlias match_Parameter_LeftSquareBracketRightSquareBracketKeyword_2_a;
	protected AbstractElementAlias match_Statement_SemicolonKeyword_9_1_or___BreakKeyword_7_1_SemicolonKeyword_7_3___or___ContinueKeyword_8_1_SemicolonKeyword_8_3__;
	protected AbstractElementAlias match_Type_LeftSquareBracketRightSquareBracketKeyword_1_a;
	protected AbstractElementAlias match_Variable_declarator_LeftSquareBracketRightSquareBracketKeyword_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Method_declaration_LeftSquareBracketRightSquareBracketKeyword_6_a = new TokenAlias(true, true, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6());
		match_Parameter_LeftSquareBracketRightSquareBracketKeyword_2_a = new TokenAlias(true, true, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
		match_Statement_SemicolonKeyword_9_1_or___BreakKeyword_7_1_SemicolonKeyword_7_3___or___ContinueKeyword_8_1_SemicolonKeyword_8_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getBreakKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_7_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getContinueKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_8_3())), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_9_1()));
		match_Type_LeftSquareBracketRightSquareBracketKeyword_1_a = new TokenAlias(true, true, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
		match_Variable_declarator_LeftSquareBracketRightSquareBracketKeyword_1_a = new TokenAlias(true, true, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Method_declaration_LeftSquareBracketRightSquareBracketKeyword_6_a.equals(syntax))
				emit_Method_declaration_LeftSquareBracketRightSquareBracketKeyword_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_LeftSquareBracketRightSquareBracketKeyword_2_a.equals(syntax))
				emit_Parameter_LeftSquareBracketRightSquareBracketKeyword_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Statement_SemicolonKeyword_9_1_or___BreakKeyword_7_1_SemicolonKeyword_7_3___or___ContinueKeyword_8_1_SemicolonKeyword_8_3__.equals(syntax))
				emit_Statement_SemicolonKeyword_9_1_or___BreakKeyword_7_1_SemicolonKeyword_7_3___or___ContinueKeyword_8_1_SemicolonKeyword_8_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Type_LeftSquareBracketRightSquareBracketKeyword_1_a.equals(syntax))
				emit_Type_LeftSquareBracketRightSquareBracketKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Variable_declarator_LeftSquareBracketRightSquareBracketKeyword_1_a.equals(syntax))
				emit_Variable_declarator_LeftSquareBracketRightSquareBracketKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '[]'*
	 *
	 * This ambiguous syntax occurs at:
	 *     nameMethod=ID '(' ')' (ambiguity) ';' (rule end)
	 *     nameMethod=ID '(' ')' (ambiguity) statementMethod=Statement_block
	 *     parameterListMethod=Parameter_list ')' (ambiguity) ';' (rule end)
	 *     parameterListMethod=Parameter_list ')' (ambiguity) statementMethod=Statement_block
	 */
	protected void emit_Method_declaration_LeftSquareBracketRightSquareBracketKeyword_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '[]'*
	 *
	 * This ambiguous syntax occurs at:
	 *     parameterName=ID (ambiguity) (rule end)
	 */
	protected void emit_Parameter_LeftSquareBracketRightSquareBracketKeyword_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('break' ';') | ('continue' ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'if(' ')' (ambiguity) 'else' elseStatement=Statement
	 *     (rule start) 'if(' ')' (ambiguity) (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Statement_SemicolonKeyword_9_1_or___BreakKeyword_7_1_SemicolonKeyword_7_3___or___ContinueKeyword_8_1_SemicolonKeyword_8_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '[]'*
	 *
	 * This ambiguous syntax occurs at:
	 *     typeSpecifier=Type_specifier (ambiguity) (rule end)
	 */
	protected void emit_Type_LeftSquareBracketRightSquareBracketKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '[]'*
	 *
	 * This ambiguous syntax occurs at:
	 *     nameVariable=ID (ambiguity) (rule end)
	 */
	protected void emit_Variable_declarator_LeftSquareBracketRightSquareBracketKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
