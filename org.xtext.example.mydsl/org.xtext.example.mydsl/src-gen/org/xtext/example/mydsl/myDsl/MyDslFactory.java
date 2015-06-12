/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Compilation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation unit</em>'.
   * @generated
   */
  Compilation_unit createCompilation_unit();

  /**
   * Returns a new object of class '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type declaration</em>'.
   * @generated
   */
  Type_declaration createType_declaration();

  /**
   * Returns a new object of class '<em>Interface declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface declaration</em>'.
   * @generated
   */
  Interface_declaration createInterface_declaration();

  /**
   * Returns a new object of class '<em>Class declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class declaration</em>'.
   * @generated
   */
  Class_declaration createClass_declaration();

  /**
   * Returns a new object of class '<em>Field declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field declaration</em>'.
   * @generated
   */
  Field_declaration createField_declaration();

  /**
   * Returns a new object of class '<em>Method declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method declaration</em>'.
   * @generated
   */
  Method_declaration createMethod_declaration();

  /**
   * Returns a new object of class '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor declaration</em>'.
   * @generated
   */
  Constructor_declaration createConstructor_declaration();

  /**
   * Returns a new object of class '<em>Parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter list</em>'.
   * @generated
   */
  Parameter_list createParameter_list();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Variable declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declaration</em>'.
   * @generated
   */
  Variable_declaration createVariable_declaration();

  /**
   * Returns a new object of class '<em>Variable declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declarator</em>'.
   * @generated
   */
  Variable_declarator createVariable_declarator();

  /**
   * Returns a new object of class '<em>Variable initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable initializer</em>'.
   * @generated
   */
  Variable_initializer createVariable_initializer();

  /**
   * Returns a new object of class '<em>Array initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array initializer</em>'.
   * @generated
   */
  Array_initializer createArray_initializer();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Static initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static initializer</em>'.
   * @generated
   */
  Static_initializer createStatic_initializer();

  /**
   * Returns a new object of class '<em>Statement block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement block</em>'.
   * @generated
   */
  Statement_block createStatement_block();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  For_Statement createFor_Statement();

  /**
   * Returns a new object of class '<em>For control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For control</em>'.
   * @generated
   */
  For_control createFor_control();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Variable value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable value</em>'.
   * @generated
   */
  Variable_value createVariable_value();

  /**
   * Returns a new object of class '<em>Primitive type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive type</em>'.
   * @generated
   */
  Primitive_type createPrimitive_type();

  /**
   * Returns a new object of class '<em>For init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For init</em>'.
   * @generated
   */
  For_init createFor_init();

  /**
   * Returns a new object of class '<em>For expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For expression</em>'.
   * @generated
   */
  For_expression createFor_expression();

  /**
   * Returns a new object of class '<em>For update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For update</em>'.
   * @generated
   */
  For_update createFor_update();

  /**
   * Returns a new object of class '<em>For update operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For update operator</em>'.
   * @generated
   */
  For_update_operator createFor_update_operator();

  /**
   * Returns a new object of class '<em>For expression operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For expression operator</em>'.
   * @generated
   */
  For_expression_operator createFor_expression_operator();

  /**
   * Returns a new object of class '<em>Parens expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parens expression</em>'.
   * @generated
   */
  Parens_expression createParens_expression();

  /**
   * Returns a new object of class '<em>Expression list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression list</em>'.
   * @generated
   */
  Expression_list createExpression_list();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Conditional expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional expression</em>'.
   * @generated
   */
  Conditional_expression createConditional_expression();

  /**
   * Returns a new object of class '<em>Conditional OR expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional OR expression</em>'.
   * @generated
   */
  Conditional_OR_expression createConditional_OR_expression();

  /**
   * Returns a new object of class '<em>Conditional AND expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional AND expression</em>'.
   * @generated
   */
  Conditional_AND_expression createConditional_AND_expression();

  /**
   * Returns a new object of class '<em>Inclusive OR expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inclusive OR expression</em>'.
   * @generated
   */
  Inclusive_OR_expression createInclusive_OR_expression();

  /**
   * Returns a new object of class '<em>Exclusive OR expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclusive OR expression</em>'.
   * @generated
   */
  Exclusive_OR_expression createExclusive_OR_expression();

  /**
   * Returns a new object of class '<em>AND expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AND expression</em>'.
   * @generated
   */
  AND_expression createAND_expression();

  /**
   * Returns a new object of class '<em>Equality expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality expression</em>'.
   * @generated
   */
  Equality_expression createEquality_expression();

  /**
   * Returns a new object of class '<em>Instance Of expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Of expression</em>'.
   * @generated
   */
  InstanceOf_expression createInstanceOf_expression();

  /**
   * Returns a new object of class '<em>Relational expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational expression</em>'.
   * @generated
   */
  Relational_expression createRelational_expression();

  /**
   * Returns a new object of class '<em>Shift expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift expression</em>'.
   * @generated
   */
  Shift_expression createShift_expression();

  /**
   * Returns a new object of class '<em>Additive expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive expression</em>'.
   * @generated
   */
  Additive_expression createAdditive_expression();

  /**
   * Returns a new object of class '<em>Multiplicative expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative expression</em>'.
   * @generated
   */
  Multiplicative_expression createMultiplicative_expression();

  /**
   * Returns a new object of class '<em>Unary expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary expression</em>'.
   * @generated
   */
  Unary_expression createUnary_expression();

  /**
   * Returns a new object of class '<em>Unary expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary expression Not Plus Minus</em>'.
   * @generated
   */
  Unary_expression_Not_Plus_Minus createUnary_expression_Not_Plus_Minus();

  /**
   * Returns a new object of class '<em>Cast expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast expression</em>'.
   * @generated
   */
  Cast_expression createCast_expression();

  /**
   * Returns a new object of class '<em>Primary expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary expression</em>'.
   * @generated
   */
  Primary_expression createPrimary_expression();

  /**
   * Returns a new object of class '<em>Identifier suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier suffix</em>'.
   * @generated
   */
  Identifier_suffix createIdentifier_suffix();

  /**
   * Returns a new object of class '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creator</em>'.
   * @generated
   */
  Creator createCreator();

  /**
   * Returns a new object of class '<em>Created name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Created name</em>'.
   * @generated
   */
  Created_name createCreated_name();

  /**
   * Returns a new object of class '<em>Inner creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inner creator</em>'.
   * @generated
   */
  Inner_creator createInner_creator();

  /**
   * Returns a new object of class '<em>Array creator rest</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array creator rest</em>'.
   * @generated
   */
  Array_creator_rest createArray_creator_rest();

  /**
   * Returns a new object of class '<em>Class creator rest</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class creator rest</em>'.
   * @generated
   */
  Class_creator_rest createClass_creator_rest();

  /**
   * Returns a new object of class '<em>Explicit generic invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit generic invocation</em>'.
   * @generated
   */
  Explicit_generic_invocation createExplicit_generic_invocation();

  /**
   * Returns a new object of class '<em>Non wildcard type arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non wildcard type arguments</em>'.
   * @generated
   */
  Non_wildcard_type_arguments createNon_wildcard_type_arguments();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>Super suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super suffix</em>'.
   * @generated
   */
  Super_suffix createSuper_suffix();

  /**
   * Returns a new object of class '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arguments</em>'.
   * @generated
   */
  Arguments createArguments();

  /**
   * Returns a new object of class '<em>Switch statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch statement</em>'.
   * @generated
   */
  Switch_statement createSwitch_statement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  While_Statement createWhile_Statement();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  Do_Statement createDo_Statement();

  /**
   * Returns a new object of class '<em>If statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If statement</em>'.
   * @generated
   */
  If_statement createIf_statement();

  /**
   * Returns a new object of class '<em>Try statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try statement</em>'.
   * @generated
   */
  Try_statement createTry_statement();

  /**
   * Returns a new object of class '<em>Import statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import statement</em>'.
   * @generated
   */
  Import_statement createImport_statement();

  /**
   * Returns a new object of class '<em>Package statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package statement</em>'.
   * @generated
   */
  Package_statement createPackage_statement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
