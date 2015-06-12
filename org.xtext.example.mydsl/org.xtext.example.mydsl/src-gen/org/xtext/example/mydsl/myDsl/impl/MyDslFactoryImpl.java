/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.COMPILATION_UNIT: return createCompilation_unit();
      case MyDslPackage.TYPE_DECLARATION: return createType_declaration();
      case MyDslPackage.INTERFACE_DECLARATION: return createInterface_declaration();
      case MyDslPackage.CLASS_DECLARATION: return createClass_declaration();
      case MyDslPackage.FIELD_DECLARATION: return createField_declaration();
      case MyDslPackage.METHOD_DECLARATION: return createMethod_declaration();
      case MyDslPackage.CONSTRUCTOR_DECLARATION: return createConstructor_declaration();
      case MyDslPackage.PARAMETER_LIST: return createParameter_list();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.VARIABLE_DECLARATION: return createVariable_declaration();
      case MyDslPackage.VARIABLE_DECLARATOR: return createVariable_declarator();
      case MyDslPackage.VARIABLE_INITIALIZER: return createVariable_initializer();
      case MyDslPackage.ARRAY_INITIALIZER: return createArray_initializer();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.STATIC_INITIALIZER: return createStatic_initializer();
      case MyDslPackage.STATEMENT_BLOCK: return createStatement_block();
      case MyDslPackage.STATEMENT: return createStatement();
      case MyDslPackage.FOR_STATEMENT: return createFor_Statement();
      case MyDslPackage.FOR_CONTROL: return createFor_control();
      case MyDslPackage.VARIABLE: return createVariable();
      case MyDslPackage.VARIABLE_VALUE: return createVariable_value();
      case MyDslPackage.PRIMITIVE_TYPE: return createPrimitive_type();
      case MyDslPackage.FOR_INIT: return createFor_init();
      case MyDslPackage.FOR_EXPRESSION: return createFor_expression();
      case MyDslPackage.FOR_UPDATE: return createFor_update();
      case MyDslPackage.FOR_UPDATE_OPERATOR: return createFor_update_operator();
      case MyDslPackage.FOR_EXPRESSION_OPERATOR: return createFor_expression_operator();
      case MyDslPackage.PARENS_EXPRESSION: return createParens_expression();
      case MyDslPackage.EXPRESSION_LIST: return createExpression_list();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.CONDITIONAL_EXPRESSION: return createConditional_expression();
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION: return createConditional_OR_expression();
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION: return createConditional_AND_expression();
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION: return createInclusive_OR_expression();
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION: return createExclusive_OR_expression();
      case MyDslPackage.AND_EXPRESSION: return createAND_expression();
      case MyDslPackage.EQUALITY_EXPRESSION: return createEquality_expression();
      case MyDslPackage.INSTANCE_OF_EXPRESSION: return createInstanceOf_expression();
      case MyDslPackage.RELATIONAL_EXPRESSION: return createRelational_expression();
      case MyDslPackage.SHIFT_EXPRESSION: return createShift_expression();
      case MyDslPackage.ADDITIVE_EXPRESSION: return createAdditive_expression();
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicative_expression();
      case MyDslPackage.UNARY_EXPRESSION: return createUnary_expression();
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS: return createUnary_expression_Not_Plus_Minus();
      case MyDslPackage.CAST_EXPRESSION: return createCast_expression();
      case MyDslPackage.PRIMARY_EXPRESSION: return createPrimary_expression();
      case MyDslPackage.IDENTIFIER_SUFFIX: return createIdentifier_suffix();
      case MyDslPackage.CREATOR: return createCreator();
      case MyDslPackage.CREATED_NAME: return createCreated_name();
      case MyDslPackage.INNER_CREATOR: return createInner_creator();
      case MyDslPackage.ARRAY_CREATOR_REST: return createArray_creator_rest();
      case MyDslPackage.CLASS_CREATOR_REST: return createClass_creator_rest();
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION: return createExplicit_generic_invocation();
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS: return createNon_wildcard_type_arguments();
      case MyDslPackage.SELECTOR: return createSelector();
      case MyDslPackage.SUPER_SUFFIX: return createSuper_suffix();
      case MyDslPackage.ARGUMENTS: return createArguments();
      case MyDslPackage.SWITCH_STATEMENT: return createSwitch_statement();
      case MyDslPackage.WHILE_STATEMENT: return createWhile_Statement();
      case MyDslPackage.DO_STATEMENT: return createDo_Statement();
      case MyDslPackage.IF_STATEMENT: return createIf_statement();
      case MyDslPackage.TRY_STATEMENT: return createTry_statement();
      case MyDslPackage.IMPORT_STATEMENT: return createImport_statement();
      case MyDslPackage.PACKAGE_STATEMENT: return createPackage_statement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compilation_unit createCompilation_unit()
  {
    Compilation_unitImpl compilation_unit = new Compilation_unitImpl();
    return compilation_unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_declaration createType_declaration()
  {
    Type_declarationImpl type_declaration = new Type_declarationImpl();
    return type_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_declaration createInterface_declaration()
  {
    Interface_declarationImpl interface_declaration = new Interface_declarationImpl();
    return interface_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_declaration createClass_declaration()
  {
    Class_declarationImpl class_declaration = new Class_declarationImpl();
    return class_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_declaration createField_declaration()
  {
    Field_declarationImpl field_declaration = new Field_declarationImpl();
    return field_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method_declaration createMethod_declaration()
  {
    Method_declarationImpl method_declaration = new Method_declarationImpl();
    return method_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor_declaration createConstructor_declaration()
  {
    Constructor_declarationImpl constructor_declaration = new Constructor_declarationImpl();
    return constructor_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list createParameter_list()
  {
    Parameter_listImpl parameter_list = new Parameter_listImpl();
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration createVariable_declaration()
  {
    Variable_declarationImpl variable_declaration = new Variable_declarationImpl();
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declarator createVariable_declarator()
  {
    Variable_declaratorImpl variable_declarator = new Variable_declaratorImpl();
    return variable_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_initializer createVariable_initializer()
  {
    Variable_initializerImpl variable_initializer = new Variable_initializerImpl();
    return variable_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_initializer createArray_initializer()
  {
    Array_initializerImpl array_initializer = new Array_initializerImpl();
    return array_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static_initializer createStatic_initializer()
  {
    Static_initializerImpl static_initializer = new Static_initializerImpl();
    return static_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block createStatement_block()
  {
    Statement_blockImpl statement_block = new Statement_blockImpl();
    return statement_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Statement createFor_Statement()
  {
    For_StatementImpl for_Statement = new For_StatementImpl();
    return for_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_control createFor_control()
  {
    For_controlImpl for_control = new For_controlImpl();
    return for_control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_value createVariable_value()
  {
    Variable_valueImpl variable_value = new Variable_valueImpl();
    return variable_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive_type createPrimitive_type()
  {
    Primitive_typeImpl primitive_type = new Primitive_typeImpl();
    return primitive_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_init createFor_init()
  {
    For_initImpl for_init = new For_initImpl();
    return for_init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_expression createFor_expression()
  {
    For_expressionImpl for_expression = new For_expressionImpl();
    return for_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_update createFor_update()
  {
    For_updateImpl for_update = new For_updateImpl();
    return for_update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_update_operator createFor_update_operator()
  {
    For_update_operatorImpl for_update_operator = new For_update_operatorImpl();
    return for_update_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_expression_operator createFor_expression_operator()
  {
    For_expression_operatorImpl for_expression_operator = new For_expression_operatorImpl();
    return for_expression_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parens_expression createParens_expression()
  {
    Parens_expressionImpl parens_expression = new Parens_expressionImpl();
    return parens_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_list createExpression_list()
  {
    Expression_listImpl expression_list = new Expression_listImpl();
    return expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional_expression createConditional_expression()
  {
    Conditional_expressionImpl conditional_expression = new Conditional_expressionImpl();
    return conditional_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional_OR_expression createConditional_OR_expression()
  {
    Conditional_OR_expressionImpl conditional_OR_expression = new Conditional_OR_expressionImpl();
    return conditional_OR_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional_AND_expression createConditional_AND_expression()
  {
    Conditional_AND_expressionImpl conditional_AND_expression = new Conditional_AND_expressionImpl();
    return conditional_AND_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inclusive_OR_expression createInclusive_OR_expression()
  {
    Inclusive_OR_expressionImpl inclusive_OR_expression = new Inclusive_OR_expressionImpl();
    return inclusive_OR_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exclusive_OR_expression createExclusive_OR_expression()
  {
    Exclusive_OR_expressionImpl exclusive_OR_expression = new Exclusive_OR_expressionImpl();
    return exclusive_OR_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AND_expression createAND_expression()
  {
    AND_expressionImpl anD_expression = new AND_expressionImpl();
    return anD_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality_expression createEquality_expression()
  {
    Equality_expressionImpl equality_expression = new Equality_expressionImpl();
    return equality_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOf_expression createInstanceOf_expression()
  {
    InstanceOf_expressionImpl instanceOf_expression = new InstanceOf_expressionImpl();
    return instanceOf_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relational_expression createRelational_expression()
  {
    Relational_expressionImpl relational_expression = new Relational_expressionImpl();
    return relational_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift_expression createShift_expression()
  {
    Shift_expressionImpl shift_expression = new Shift_expressionImpl();
    return shift_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Additive_expression createAdditive_expression()
  {
    Additive_expressionImpl additive_expression = new Additive_expressionImpl();
    return additive_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicative_expression createMultiplicative_expression()
  {
    Multiplicative_expressionImpl multiplicative_expression = new Multiplicative_expressionImpl();
    return multiplicative_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expression createUnary_expression()
  {
    Unary_expressionImpl unary_expression = new Unary_expressionImpl();
    return unary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expression_Not_Plus_Minus createUnary_expression_Not_Plus_Minus()
  {
    Unary_expression_Not_Plus_MinusImpl unary_expression_Not_Plus_Minus = new Unary_expression_Not_Plus_MinusImpl();
    return unary_expression_Not_Plus_Minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast_expression createCast_expression()
  {
    Cast_expressionImpl cast_expression = new Cast_expressionImpl();
    return cast_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary_expression createPrimary_expression()
  {
    Primary_expressionImpl primary_expression = new Primary_expressionImpl();
    return primary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier_suffix createIdentifier_suffix()
  {
    Identifier_suffixImpl identifier_suffix = new Identifier_suffixImpl();
    return identifier_suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creator createCreator()
  {
    CreatorImpl creator = new CreatorImpl();
    return creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Created_name createCreated_name()
  {
    Created_nameImpl created_name = new Created_nameImpl();
    return created_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inner_creator createInner_creator()
  {
    Inner_creatorImpl inner_creator = new Inner_creatorImpl();
    return inner_creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_creator_rest createArray_creator_rest()
  {
    Array_creator_restImpl array_creator_rest = new Array_creator_restImpl();
    return array_creator_rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_creator_rest createClass_creator_rest()
  {
    Class_creator_restImpl class_creator_rest = new Class_creator_restImpl();
    return class_creator_rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Explicit_generic_invocation createExplicit_generic_invocation()
  {
    Explicit_generic_invocationImpl explicit_generic_invocation = new Explicit_generic_invocationImpl();
    return explicit_generic_invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Non_wildcard_type_arguments createNon_wildcard_type_arguments()
  {
    Non_wildcard_type_argumentsImpl non_wildcard_type_arguments = new Non_wildcard_type_argumentsImpl();
    return non_wildcard_type_arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Super_suffix createSuper_suffix()
  {
    Super_suffixImpl super_suffix = new Super_suffixImpl();
    return super_suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch_statement createSwitch_statement()
  {
    Switch_statementImpl switch_statement = new Switch_statementImpl();
    return switch_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Statement createWhile_Statement()
  {
    While_StatementImpl while_Statement = new While_StatementImpl();
    return while_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do_Statement createDo_Statement()
  {
    Do_StatementImpl do_Statement = new Do_StatementImpl();
    return do_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_statement createIf_statement()
  {
    If_statementImpl if_statement = new If_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement createTry_statement()
  {
    Try_statementImpl try_statement = new Try_statementImpl();
    return try_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import_statement createImport_statement()
  {
    Import_statementImpl import_statement = new Import_statementImpl();
    return import_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Package_statement createPackage_statement()
  {
    Package_statementImpl package_statement = new Package_statementImpl();
    return package_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
