/*
 * generated by Xtext
 */
package org.xtext.compilador.java.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.compilador.java.myDsl.Class_declaration;
import org.xtext.compilador.java.myDsl.Compilation_unit;
import org.xtext.compilador.java.myDsl.Constructor_declaration;
import org.xtext.compilador.java.myDsl.Do_Statement;
import org.xtext.compilador.java.myDsl.Field_declaration;
import org.xtext.compilador.java.myDsl.For_Statement;
import org.xtext.compilador.java.myDsl.Import_statement;
import org.xtext.compilador.java.myDsl.Interface_declaration;
import org.xtext.compilador.java.myDsl.Method_declaration;
import org.xtext.compilador.java.myDsl.Model;
import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Package_statement;
import org.xtext.compilador.java.myDsl.Parameter;
import org.xtext.compilador.java.myDsl.Parameter_list;
import org.xtext.compilador.java.myDsl.Statement;
import org.xtext.compilador.java.myDsl.Statement_block;
import org.xtext.compilador.java.myDsl.Static_initializer;
import org.xtext.compilador.java.myDsl.Try_statement;
import org.xtext.compilador.java.myDsl.Type;
import org.xtext.compilador.java.myDsl.Type_declaration;
import org.xtext.compilador.java.myDsl.Variable_declaration;
import org.xtext.compilador.java.myDsl.Variable_declarator;
import org.xtext.compilador.java.myDsl.While_Statement;
import org.xtext.compilador.java.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CLASS_DECLARATION:
				sequence_Class_declaration(context, (Class_declaration) semanticObject); 
				return; 
			case MyDslPackage.COMPILATION_UNIT:
				sequence_Compilation_unit(context, (Compilation_unit) semanticObject); 
				return; 
			case MyDslPackage.CONSTRUCTOR_DECLARATION:
				sequence_Constructor_declaration(context, (Constructor_declaration) semanticObject); 
				return; 
			case MyDslPackage.DO_STATEMENT:
				sequence_Do_Statement(context, (Do_Statement) semanticObject); 
				return; 
			case MyDslPackage.FIELD_DECLARATION:
				sequence_Field_declaration(context, (Field_declaration) semanticObject); 
				return; 
			case MyDslPackage.FOR_STATEMENT:
				sequence_For_Statement(context, (For_Statement) semanticObject); 
				return; 
			case MyDslPackage.IMPORT_STATEMENT:
				sequence_Import_statement(context, (Import_statement) semanticObject); 
				return; 
			case MyDslPackage.INTERFACE_DECLARATION:
				sequence_Interface_declaration(context, (Interface_declaration) semanticObject); 
				return; 
			case MyDslPackage.METHOD_DECLARATION:
				sequence_Method_declaration(context, (Method_declaration) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PACKAGE_STATEMENT:
				sequence_Package_statement(context, (Package_statement) semanticObject); 
				return; 
			case MyDslPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case MyDslPackage.PARAMETER_LIST:
				sequence_Parameter_list(context, (Parameter_list) semanticObject); 
				return; 
			case MyDslPackage.STATEMENT:
				if(context == grammarAccess.getIf_statementRule()) {
					sequence_If_statement_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STATEMENT_BLOCK:
				if(context == grammarAccess.getIf_statementRule()) {
					sequence_If_statement_Statement_block(context, (Statement_block) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_blockRule()) {
					sequence_Statement_block(context, (Statement_block) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STATIC_INITIALIZER:
				sequence_Static_initializer(context, (Static_initializer) semanticObject); 
				return; 
			case MyDslPackage.TRY_STATEMENT:
				sequence_Try_statement(context, (Try_statement) semanticObject); 
				return; 
			case MyDslPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case MyDslPackage.TYPE_DECLARATION:
				sequence_Type_declaration(context, (Type_declaration) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getFor_StatementRule()) {
					sequence_For_Statement_Variable_declaration(context, (Variable_declaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVariable_declarationRule()) {
					sequence_Variable_declaration(context, (Variable_declaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.VARIABLE_DECLARATOR:
				sequence_Variable_declarator(context, (Variable_declarator) semanticObject); 
				return; 
			case MyDslPackage.WHILE_STATEMENT:
				sequence_While_Statement(context, (While_Statement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         modifiers+=Modifier* 
	 *         className=ID 
	 *         classHerdada=Class_name? 
	 *         (interfaceImplementada=Interface_name interfacesImplementadas+=Interface_name*)? 
	 *         fieldsDeclaration+=Field_declaration*
	 *     )
	 */
	protected void sequence_Class_declaration(EObject context, Class_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Package_statement? imports+=Import_statement* typeDeclarations+=Type_declaration*)
	 */
	protected void sequence_Compilation_unit(EObject context, Compilation_unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiersConstructor+=Modifier* nameConstructor=ID parameterListConstructor=Parameter_list? statementConstructor=Statement_block)
	 */
	protected void sequence_Constructor_declaration(EObject context, Constructor_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_Do_Statement(EObject context, Do_Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DO_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DO_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (comment=DOC_COMMENT? (variableDeclaration=Variable_declaration | contructorName=Constructor_declaration | methodName=Method_declaration)) | 
	 *         staticinitializer=Static_initializer
	 *     )?
	 */
	protected void sequence_Field_declaration(EObject context, Field_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statementInFor=Statement
	 */
	protected void sequence_For_Statement(EObject context, For_Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_STATEMENT__STATEMENT_IN_FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_STATEMENT__STATEMENT_IN_FOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFor_StatementAccess().getStatementInForStatementParserRuleCall_4_0(), semanticObject.getStatementInFor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifiersVariable+=Modifier* type=Type nameVariable=Variable_declarator names+=Variable_declarator* statementInFor=Statement)
	 */
	protected void sequence_For_Statement_Variable_declaration(EObject context, Variable_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((syncStatement=Statement | (name=ID?) | (name=ID?)) elseStatement=Statement?)
	 */
	protected void sequence_If_statement_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statments+=Statement* elseStatement=Statement?)
	 */
	protected void sequence_If_statement_Statement_block(EObject context, Statement_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (className=Class_name | pacName=Package_name)
	 */
	protected void sequence_Import_statement(EObject context, Import_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* interfaceName=ID (interfaceHerdada=Interface_name interfacesHerdadas+=Interface_name*)?)
	 */
	protected void sequence_Interface_declaration(EObject context, Interface_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiersMethod+=Modifier* typeMethod=Type nameMethod=ID parameterListMethod=Parameter_list? (statementMethod=Statement_block | debug=';'))
	 */
	protected void sequence_Method_declaration(EObject context, Method_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Compilation_unit
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pacName=Package_name
	 */
	protected void sequence_Package_statement(EObject context, Package_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PACKAGE_STATEMENT__PAC_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PACKAGE_STATEMENT__PAC_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0(), semanticObject.getPacName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type parameterName=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARAMETER__PARAMETER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARAMETER__PARAMETER_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0(), semanticObject.getParameterName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=Parameter parameters+=Parameter*)
	 */
	protected void sequence_Parameter_list(EObject context, Parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (syncStatement=Statement | (name=ID?) | (name=ID?))
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statments+=Statement*)
	 */
	protected void sequence_Statement_block(EObject context, Statement_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static=STATIC name=Statement_block)
	 */
	protected void sequence_Static_initializer(EObject context, Static_initializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATIC_INITIALIZER__STATIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATIC_INITIALIZER__STATIC));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATIC_INITIALIZER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATIC_INITIALIZER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0(), semanticObject.getStatic());
		feeder.accept(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tryStatement=Statement (parameters+=Parameter statement+=Statement)* statementFinally=Statement?)
	 */
	protected void sequence_Try_statement(EObject context, Try_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeSpecifier=Type_specifier
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TYPE__TYPE_SPECIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TYPE__TYPE_SPECIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0(), semanticObject.getTypeSpecifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment=DOC_COMMENT? (classDec=Class_declaration | interfaceDec=Interface_declaration))
	 */
	protected void sequence_Type_declaration(EObject context, Type_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiersVariable+=Modifier* type=Type nameVariable=Variable_declarator names+=Variable_declarator*)
	 */
	protected void sequence_Variable_declaration(EObject context, Variable_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     nameVariable=ID
	 */
	protected void sequence_Variable_declarator(EObject context, Variable_declarator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATOR__NAME_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATOR__NAME_VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0(), semanticObject.getNameVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_While_Statement(EObject context, While_Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WHILE_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WHILE_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
