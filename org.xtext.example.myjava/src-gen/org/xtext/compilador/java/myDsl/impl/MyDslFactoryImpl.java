/**
 */
package org.xtext.compilador.java.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.compilador.java.myDsl.*;

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
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.STATIC_INITIALIZER: return createStatic_initializer();
      case MyDslPackage.STATEMENT_BLOCK: return createStatement_block();
      case MyDslPackage.STATEMENT: return createStatement();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.EXPRESSION_LINE: return createExpression_line();
      case MyDslPackage.ARGLIST: return createArglist();
      case MyDslPackage.FOR_STATEMENT: return createFor_Statement();
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
  public Expression_line createExpression_line()
  {
    Expression_lineImpl expression_line = new Expression_lineImpl();
    return expression_line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arglist createArglist()
  {
    ArglistImpl arglist = new ArglistImpl();
    return arglist;
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
