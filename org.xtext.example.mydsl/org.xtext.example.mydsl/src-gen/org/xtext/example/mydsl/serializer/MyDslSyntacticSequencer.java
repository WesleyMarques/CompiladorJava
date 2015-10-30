/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Additive_expression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0;
	protected AbstractElementAlias match_Array_creator_rest___LeftSquareBracketKeyword_1_0_1_0_RightSquareBracketKeyword_1_0_1_1__a;
	protected AbstractElementAlias match_Array_creator_rest___LeftSquareBracketKeyword_1_1_3_0_RightSquareBracketKeyword_1_1_3_1__a;
	protected AbstractElementAlias match_Array_initializer_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_Equality_expression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1;
	protected AbstractElementAlias match_Identifier_suffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_4_0_ThisKeyword_1_4_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__;
	protected AbstractElementAlias match_Method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a;
	protected AbstractElementAlias match_Multiplicative_expression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1;
	protected AbstractElementAlias match_Parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a;
	protected AbstractElementAlias match_Primary_expression_ThisKeyword_1_1_0_or___VoidKeyword_1_7_0_FullStopKeyword_1_7_1_ClassKeyword_1_7_2__;
	protected AbstractElementAlias match_Primary_expression___LeftSquareBracketKeyword_1_6_1_0_RightSquareBracketKeyword_1_6_1_1__a;
	protected AbstractElementAlias match_Statement_SemicolonKeyword_15_1_or___BreakKeyword_13_1_SemicolonKeyword_13_3___or___ContinueKeyword_14_1_SemicolonKeyword_14_3___or___ReturnKeyword_8_1_SemicolonKeyword_8_3___or___ThrowKeyword_9_1_SemicolonKeyword_9_3__;
	protected AbstractElementAlias match_Switch_statement___DefaultKeyword_6_1_0_ColonKeyword_6_1_1__a;
	protected AbstractElementAlias match_Unary_expression_Not_Plus_Minus___HyphenMinusHyphenMinusKeyword_1_3_2_1_or_PlusSignPlusSignKeyword_1_3_2_0__q;
	protected AbstractElementAlias match_Unary_expression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a;
	protected AbstractElementAlias match_Variable_declarator___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Additive_expression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAdditive_expressionAccess().getHyphenMinusKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getAdditive_expressionAccess().getPlusSignKeyword_1_0_0()));
		match_Array_creator_rest___LeftSquareBracketKeyword_1_0_1_0_RightSquareBracketKeyword_1_0_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getArray_creator_restAccess().getLeftSquareBracketKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getArray_creator_restAccess().getRightSquareBracketKeyword_1_0_1_1()));
		match_Array_creator_rest___LeftSquareBracketKeyword_1_1_3_0_RightSquareBracketKeyword_1_1_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getArray_creator_restAccess().getLeftSquareBracketKeyword_1_1_3_0()), new TokenAlias(false, false, grammarAccess.getArray_creator_restAccess().getRightSquareBracketKeyword_1_1_3_1()));
		match_Array_initializer_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getArray_initializerAccess().getCommaKeyword_2_2());
		match_Equality_expression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEquality_expressionAccess().getEqualsSignEqualsSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getEquality_expressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1()));
		match_Identifier_suffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_4_0_ThisKeyword_1_4_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getFullStopKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getClassKeyword_1_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getFullStopKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getThisKeyword_1_4_1()))), new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getLeftSquareBracketKeyword_1_0_0_0()), new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getRightSquareBracketKeyword_1_0_0_1())), new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getFullStopKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getIdentifier_suffixAccess().getClassKeyword_1_0_2())));
		match_Method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1()));
		match_Multiplicative_expression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicative_expressionAccess().getAsteriskKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMultiplicative_expressionAccess().getPercentSignKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getMultiplicative_expressionAccess().getSolidusKeyword_1_0_1()));
		match_Parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1()));
		match_Primary_expression_ThisKeyword_1_1_0_or___VoidKeyword_1_7_0_FullStopKeyword_1_7_1_ClassKeyword_1_7_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getVoidKeyword_1_7_0()), new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getFullStopKeyword_1_7_1()), new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getClassKeyword_1_7_2())), new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getThisKeyword_1_1_0()));
		match_Primary_expression___LeftSquareBracketKeyword_1_6_1_0_RightSquareBracketKeyword_1_6_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getLeftSquareBracketKeyword_1_6_1_0()), new TokenAlias(false, false, grammarAccess.getPrimary_expressionAccess().getRightSquareBracketKeyword_1_6_1_1()));
		match_Statement_SemicolonKeyword_15_1_or___BreakKeyword_13_1_SemicolonKeyword_13_3___or___ContinueKeyword_14_1_SemicolonKeyword_14_3___or___ReturnKeyword_8_1_SemicolonKeyword_8_3___or___ThrowKeyword_9_1_SemicolonKeyword_9_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getBreakKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getContinueKeyword_14_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_14_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getReturnKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_8_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getThrowKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_9_3())), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1()));
		match_Switch_statement___DefaultKeyword_6_1_0_ColonKeyword_6_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_6_1_0()), new TokenAlias(false, false, grammarAccess.getSwitch_statementAccess().getColonKeyword_6_1_1()));
		match_Unary_expression_Not_Plus_Minus___HyphenMinusHyphenMinusKeyword_1_3_2_1_or_PlusSignPlusSignKeyword_1_3_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getUnary_expression_Not_Plus_MinusAccess().getHyphenMinusHyphenMinusKeyword_1_3_2_1()), new TokenAlias(false, false, grammarAccess.getUnary_expression_Not_Plus_MinusAccess().getPlusSignPlusSignKeyword_1_3_2_0()));
		match_Unary_expression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getUnary_expressionAccess().getHyphenMinusHyphenMinusKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUnary_expressionAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUnary_expressionAccess().getPlusSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getUnary_expressionAccess().getPlusSignPlusSignKeyword_2_0()));
		match_Variable_declarator___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEXTENDSRule())
			return getEXTENDSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTERFACERule())
			return getINTERFACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getL_CURLY_BRACERule())
			return getL_CURLY_BRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getR_CURLY_BRACERule())
			return getR_CURLY_BRACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal EXTENDS:
	 * 	"extends"
	 * ;
	 */
	protected String getEXTENDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "extends";
	}
	
	/**
	 * terminal INTERFACE:
	 * 	"interface"
	 * ;
	 */
	protected String getINTERFACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "interface";
	}
	
	/**
	 * terminal L_CURLY_BRACE:
	 * 	"}"
	 * ;
	 */
	protected String getL_CURLY_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal R_CURLY_BRACE:
	 * 	"{"
	 * ;
	 */
	protected String getR_CURLY_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Additive_expression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0.equals(syntax))
				emit_Additive_expression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_creator_rest___LeftSquareBracketKeyword_1_0_1_0_RightSquareBracketKeyword_1_0_1_1__a.equals(syntax))
				emit_Array_creator_rest___LeftSquareBracketKeyword_1_0_1_0_RightSquareBracketKeyword_1_0_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_creator_rest___LeftSquareBracketKeyword_1_1_3_0_RightSquareBracketKeyword_1_1_3_1__a.equals(syntax))
				emit_Array_creator_rest___LeftSquareBracketKeyword_1_1_3_0_RightSquareBracketKeyword_1_1_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_initializer_CommaKeyword_2_2_q.equals(syntax))
				emit_Array_initializer_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Equality_expression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1.equals(syntax))
				emit_Equality_expression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Identifier_suffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_4_0_ThisKeyword_1_4_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__.equals(syntax))
				emit_Identifier_suffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_4_0_ThisKeyword_1_4_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a.equals(syntax))
				emit_Method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Multiplicative_expression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1.equals(syntax))
				emit_Multiplicative_expression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a.equals(syntax))
				emit_Parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_expression_ThisKeyword_1_1_0_or___VoidKeyword_1_7_0_FullStopKeyword_1_7_1_ClassKeyword_1_7_2__.equals(syntax))
				emit_Primary_expression_ThisKeyword_1_1_0_or___VoidKeyword_1_7_0_FullStopKeyword_1_7_1_ClassKeyword_1_7_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_expression___LeftSquareBracketKeyword_1_6_1_0_RightSquareBracketKeyword_1_6_1_1__a.equals(syntax))
				emit_Primary_expression___LeftSquareBracketKeyword_1_6_1_0_RightSquareBracketKeyword_1_6_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Statement_SemicolonKeyword_15_1_or___BreakKeyword_13_1_SemicolonKeyword_13_3___or___ContinueKeyword_14_1_SemicolonKeyword_14_3___or___ReturnKeyword_8_1_SemicolonKeyword_8_3___or___ThrowKeyword_9_1_SemicolonKeyword_9_3__.equals(syntax))
				emit_Statement_SemicolonKeyword_15_1_or___BreakKeyword_13_1_SemicolonKeyword_13_3___or___ContinueKeyword_14_1_SemicolonKeyword_14_3___or___ReturnKeyword_8_1_SemicolonKeyword_8_3___or___ThrowKeyword_9_1_SemicolonKeyword_9_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Switch_statement___DefaultKeyword_6_1_0_ColonKeyword_6_1_1__a.equals(syntax))
				emit_Switch_statement___DefaultKeyword_6_1_0_ColonKeyword_6_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Unary_expression_Not_Plus_Minus___HyphenMinusHyphenMinusKeyword_1_3_2_1_or_PlusSignPlusSignKeyword_1_3_2_0__q.equals(syntax))
				emit_Unary_expression_Not_Plus_Minus___HyphenMinusHyphenMinusKeyword_1_3_2_1_or_PlusSignPlusSignKeyword_1_3_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Unary_expression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a.equals(syntax))
				emit_Unary_expression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Variable_declarator___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a.equals(syntax))
				emit_Variable_declarator___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '+' | '-'
	 *
	 * This ambiguous syntax occurs at:
	 *     multiplicativeexpression+=Multiplicative_expression (ambiguity) multiplicativeexpression+=Multiplicative_expression
	 */
	protected void emit_Additive_expression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '[' ']' (ambiguity) R_CURLY_BRACE L_CURLY_BRACE (rule start)
	 *     (rule start) '[' ']' (ambiguity) R_CURLY_BRACE variableinitializer+=Variable_initializer
	 */
	protected void emit_Array_creator_rest___LeftSquareBracketKeyword_1_0_1_0_RightSquareBracketKeyword_1_0_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression+=Expression ']' (ambiguity) (rule end)
	 */
	protected void emit_Array_creator_rest___LeftSquareBracketKeyword_1_1_3_0_RightSquareBracketKeyword_1_1_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     variableinitializer+=Variable_initializer (ambiguity) L_CURLY_BRACE (rule end)
	 */
	protected void emit_Array_initializer_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '==' | '!='
	 *
	 * This ambiguous syntax occurs at:
	 *     instanceofexpression+=InstanceOf_expression (ambiguity) instanceofexpression+=InstanceOf_expression
	 */
	protected void emit_Equality_expression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('[' ']')+ '.' 'class') | (('.' 'class') | ('.' 'this'))
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Identifier_suffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_4_0_ThisKeyword_1_4_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     rparent=RPAREN (ambiguity) debug=';'
	 *     rparent=RPAREN (ambiguity) statementMethod=Statement_block
	 */
	protected void emit_Method_declaration___LeftSquareBracketKeyword_6_0_RightSquareBracketKeyword_6_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '*' | '/' | '%'
	 *
	 * This ambiguous syntax occurs at:
	 *     unaryexpression+=Unary_expression (ambiguity) unaryexpression+=Unary_expression
	 */
	protected void emit_Multiplicative_expression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     parameterName=ID (ambiguity) (rule end)
	 */
	protected void emit_Parameter___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'this' | ('void' '.' 'class')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Primary_expression_ThisKeyword_1_1_0_or___VoidKeyword_1_7_0_FullStopKeyword_1_7_1_ClassKeyword_1_7_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     primitivetype=Primitive_type (ambiguity) '.' 'class' (rule end)
	 */
	protected void emit_Primary_expression___LeftSquareBracketKeyword_1_6_1_0_RightSquareBracketKeyword_1_6_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';' | ('return' ';') | ('throw' ';') | ('break' ';') | ('continue' ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Statement_SemicolonKeyword_15_1_or___BreakKeyword_13_1_SemicolonKeyword_13_3___or___ContinueKeyword_14_1_SemicolonKeyword_14_3___or___ReturnKeyword_8_1_SemicolonKeyword_8_3___or___ThrowKeyword_9_1_SemicolonKeyword_9_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('default' ':')*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression2+=Expression ':' (ambiguity) 'case' expression2+=Expression
	 *     expression2+=Expression ':' (ambiguity) L_CURLY_BRACE (rule end)
	 *     expression2+=Expression ':' (ambiguity) switchStatements+=Statement
	 *     rparent=RPAREN R_CURLY_BRACE (ambiguity) 'case' expression2+=Expression
	 *     rparent=RPAREN R_CURLY_BRACE (ambiguity) L_CURLY_BRACE (rule end)
	 *     rparent=RPAREN R_CURLY_BRACE (ambiguity) switchStatements+=Statement
	 *     switchStatements+=Statement (ambiguity) 'case' expression2+=Expression
	 *     switchStatements+=Statement (ambiguity) L_CURLY_BRACE (rule end)
	 *     switchStatements+=Statement (ambiguity) switchStatements+=Statement
	 */
	protected void emit_Switch_statement___DefaultKeyword_6_1_0_ColonKeyword_6_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('++' | '--')?
	 *
	 * This ambiguous syntax occurs at:
	 *     primary=Primary_expression (ambiguity) (rule end)
	 *     selector+=Selector (ambiguity) (rule end)
	 */
	protected void emit_Unary_expression_Not_Plus_Minus___HyphenMinusHyphenMinusKeyword_1_3_2_1_or_PlusSignPlusSignKeyword_1_3_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('+' | '-' | '++' | '--')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' unaryexpression=Unary_expression
	 *     (rule start) (ambiguity) '~' unaryexpression=Unary_expression
	 *     (rule start) (ambiguity) castexpression=Cast_expression
	 *     (rule start) (ambiguity) primary=Primary_expression
	 */
	protected void emit_Unary_expression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')*
	 *
	 * This ambiguous syntax occurs at:
	 *     nameVariable=ID (ambiguity) '=' vari=Variable_initializer
	 *     nameVariable=ID (ambiguity) (rule end)
	 */
	protected void emit_Variable_declarator___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
