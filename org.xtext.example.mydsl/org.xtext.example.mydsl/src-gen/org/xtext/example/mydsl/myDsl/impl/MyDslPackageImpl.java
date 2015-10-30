/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.AND_expression;
import org.xtext.example.mydsl.myDsl.Additive_expression;
import org.xtext.example.mydsl.myDsl.Arguments;
import org.xtext.example.mydsl.myDsl.Array_creator_rest;
import org.xtext.example.mydsl.myDsl.Array_initializer;
import org.xtext.example.mydsl.myDsl.Cast_expression;
import org.xtext.example.mydsl.myDsl.Class_creator_rest;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Compilation_unit;
import org.xtext.example.mydsl.myDsl.Conditional_AND_expression;
import org.xtext.example.mydsl.myDsl.Conditional_OR_expression;
import org.xtext.example.mydsl.myDsl.Conditional_expression;
import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.Created_name;
import org.xtext.example.mydsl.myDsl.Creator;
import org.xtext.example.mydsl.myDsl.Do_Statement;
import org.xtext.example.mydsl.myDsl.Equality_expression;
import org.xtext.example.mydsl.myDsl.Exclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.Explicit_generic_invocation;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Expression_list;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.For_Statement;
import org.xtext.example.mydsl.myDsl.For_control;
import org.xtext.example.mydsl.myDsl.For_expression;
import org.xtext.example.mydsl.myDsl.For_expression_operator;
import org.xtext.example.mydsl.myDsl.For_init;
import org.xtext.example.mydsl.myDsl.For_update;
import org.xtext.example.mydsl.myDsl.For_update_operator;
import org.xtext.example.mydsl.myDsl.Identifier_suffix;
import org.xtext.example.mydsl.myDsl.If_statement;
import org.xtext.example.mydsl.myDsl.Import_statement;
import org.xtext.example.mydsl.myDsl.Inclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.Inner_creator;
import org.xtext.example.mydsl.myDsl.InstanceOf_expression;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Multiplicative_expression;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments;
import org.xtext.example.mydsl.myDsl.Package_statement;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Parameter_list;
import org.xtext.example.mydsl.myDsl.Parens_expression;
import org.xtext.example.mydsl.myDsl.Primary_expression;
import org.xtext.example.mydsl.myDsl.Primitive_type;
import org.xtext.example.mydsl.myDsl.Relational_expression;
import org.xtext.example.mydsl.myDsl.Selector;
import org.xtext.example.mydsl.myDsl.Shift_expression;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Statement_block;
import org.xtext.example.mydsl.myDsl.Static_initializer;
import org.xtext.example.mydsl.myDsl.Super_suffix;
import org.xtext.example.mydsl.myDsl.Switch_statement;
import org.xtext.example.mydsl.myDsl.Try_statement;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Type_declaration;
import org.xtext.example.mydsl.myDsl.Unary_expression;
import org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.Variable_declarator;
import org.xtext.example.mydsl.myDsl.Variable_initializer;
import org.xtext.example.mydsl.myDsl.Variable_value;
import org.xtext.example.mydsl.myDsl.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilation_unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass method_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructor_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass static_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_controlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitive_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_initEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_updateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_update_operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_expression_operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parens_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_OR_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditional_AND_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inclusive_OR_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusive_OR_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anD_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equality_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOf_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relational_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shift_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additive_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicative_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unary_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unary_expression_Not_Plus_MinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cast_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primary_expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifier_suffixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass created_nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inner_creatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_creator_restEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_creator_restEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explicit_generic_invocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass non_wildcard_type_argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass super_suffixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switch_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass do_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass try_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass import_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass package_statementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilation_unit()
  {
    return compilation_unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_Name()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_Imports()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_TypeDeclarations()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_declaration()
  {
    return type_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_declaration_Comment()
  {
    return (EAttribute)type_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_declaration_ClassDec()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_declaration_InterfaceDec()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_declaration()
  {
    return interface_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_Modifiers()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfaceName()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfaceHerdada()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfacesHerdadas()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_declaration_FieldsDeclaration()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_declaration()
  {
    return class_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_Modifiers()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_ClassName()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_ClassHerdada()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_InterfaceImplementada()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_InterfacesImplementadas()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_declaration_FieldsDeclaration()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_declaration()
  {
    return field_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_declaration_Comment()
  {
    return (EAttribute)field_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_VariableDeclaration()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_ContructorName()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_MethodName()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_Staticinitializer()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod_declaration()
  {
    return method_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_ModifiersMethod()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_TypeMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_NameMethod()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_LParen()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_ParameterListMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_Rparent()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_StatementMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_Debug()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor_declaration()
  {
    return constructor_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_ModifiersConstructor()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_NameConstructor()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_LParen()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_declaration_ParameterListConstructor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_Rparent()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_declaration_StatementConstructor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter_list()
  {
    return parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_list_Parameter()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_list_Parameters()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_ParameterName()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_declaration()
  {
    return variable_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_declaration_ModifiersVariable()
  {
    return (EAttribute)variable_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_Type()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_NameVariable()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_Names()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_declarator()
  {
    return variable_declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_declarator_NameVariable()
  {
    return (EAttribute)variable_declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declarator_Vari()
  {
    return (EReference)variable_declaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_initializer()
  {
    return variable_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_initializer()
  {
    return array_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_initializer_Variableinitializer()
  {
    return (EReference)array_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_TypeSpecifier()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_TypeVector()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatic_initializer()
  {
    return static_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatic_initializer_Static()
  {
    return (EAttribute)static_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatic_initializer_Name()
  {
    return (EReference)static_initializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_block()
  {
    return statement_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_block_RCurly()
  {
    return (EAttribute)statement_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_block_Statments()
  {
    return (EReference)statement_blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_block_LCurly()
  {
    return (EAttribute)statement_blockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_VariableDeclaration()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_ExpressionStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_G()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_IfStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_DoStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_WhileStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_ForStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_SwitchStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Rparent()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_SyncStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_TryStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_NameStatement()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Name()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_Statement()
  {
    return for_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_Statement_Lparent()
  {
    return (EAttribute)for_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_ForControl()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_Statement_RParent()
  {
    return (EAttribute)for_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_ForStatement()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_control()
  {
    return for_controlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_control_Forinit()
  {
    return (EReference)for_controlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_control_Expression()
  {
    return (EReference)for_controlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_control_Forupdate()
  {
    return (EReference)for_controlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_value()
  {
    return variable_valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_value_Name()
  {
    return (EAttribute)variable_valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitive_type()
  {
    return primitive_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitive_type_Name()
  {
    return (EAttribute)primitive_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_init()
  {
    return for_initEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_init_Type()
  {
    return (EReference)for_initEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_init_Var()
  {
    return (EReference)for_initEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_init_Var_init()
  {
    return (EReference)for_initEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_expression()
  {
    return for_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_expression_Variable1()
  {
    return (EReference)for_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_expression_ExpOp()
  {
    return (EReference)for_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_expression_Limit()
  {
    return (EReference)for_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_update()
  {
    return for_updateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_update_Variable()
  {
    return (EReference)for_updateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_update_UpdateOp()
  {
    return (EReference)for_updateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_update_operator()
  {
    return for_update_operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_update_operator_Name()
  {
    return (EAttribute)for_update_operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_expression_operator()
  {
    return for_expression_operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_expression_operator_Name()
  {
    return (EAttribute)for_expression_operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParens_expression()
  {
    return parens_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParens_expression_Lparent()
  {
    return (EAttribute)parens_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParens_expression_Expression()
  {
    return (EReference)parens_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParens_expression_Rparent()
  {
    return (EAttribute)parens_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_list()
  {
    return expression_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_list_Expression1()
  {
    return (EReference)expression_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_list_Expression2()
  {
    return (EReference)expression_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional_expression()
  {
    return conditional_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditional_expression_Assignmentoperator()
  {
    return (EAttribute)conditional_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_expression_Expression()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_expression_Conditionalorexpression()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_expression_Expression1()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_expression_Expression2()
  {
    return (EReference)conditional_expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional_OR_expression()
  {
    return conditional_OR_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_OR_expression_Conditionalandexpression()
  {
    return (EReference)conditional_OR_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional_AND_expression()
  {
    return conditional_AND_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditional_AND_expression_Inclusiveorexpression()
  {
    return (EReference)conditional_AND_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInclusive_OR_expression()
  {
    return inclusive_OR_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInclusive_OR_expression_Exclusiveorexpression()
  {
    return (EReference)inclusive_OR_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExclusive_OR_expression()
  {
    return exclusive_OR_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExclusive_OR_expression_Andexpression()
  {
    return (EReference)exclusive_OR_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAND_expression()
  {
    return anD_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAND_expression_Equalityexpression()
  {
    return (EReference)anD_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquality_expression()
  {
    return equality_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_expression_Instanceofexpression()
  {
    return (EReference)equality_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOf_expression()
  {
    return instanceOf_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelational_expression()
  {
    return relational_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelational_expression_Type()
  {
    return (EReference)relational_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelational_expression_Shiftexpression()
  {
    return (EReference)relational_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelational_expression_Relationalop()
  {
    return (EAttribute)relational_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShift_expression()
  {
    return shift_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShift_expression_Additiveexpression()
  {
    return (EReference)shift_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShift_expression_Shiftop()
  {
    return (EAttribute)shift_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditive_expression()
  {
    return additive_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditive_expression_Multiplicativeexpression()
  {
    return (EReference)additive_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicative_expression()
  {
    return multiplicative_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicative_expression_Unaryexpression()
  {
    return (EReference)multiplicative_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnary_expression()
  {
    return unary_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnary_expression_Not_Plus_Minus()
  {
    return unary_expression_Not_Plus_MinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnary_expression_Not_Plus_Minus_Unaryexpression()
  {
    return (EReference)unary_expression_Not_Plus_MinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnary_expression_Not_Plus_Minus_Castexpression()
  {
    return (EReference)unary_expression_Not_Plus_MinusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnary_expression_Not_Plus_Minus_Primary()
  {
    return (EReference)unary_expression_Not_Plus_MinusEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnary_expression_Not_Plus_Minus_Selector()
  {
    return (EReference)unary_expression_Not_Plus_MinusEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCast_expression()
  {
    return cast_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_expression_Lparent()
  {
    return (EAttribute)cast_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_expression_Primitivetype()
  {
    return (EReference)cast_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_expression_Rparent()
  {
    return (EAttribute)cast_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_expression_Unaryexpression()
  {
    return (EReference)cast_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_expression_Type()
  {
    return (EReference)cast_expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_expression_Expression()
  {
    return (EReference)cast_expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_expression_Unaryexpressionnotplusminus()
  {
    return (EReference)cast_expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimary_expression()
  {
    return primary_expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_expression_Parexpression()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimary_expression_Identifier()
  {
    return (EAttribute)primary_expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_expression_Identifiersuffix()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_expression_Supersuffix()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimary_expression_Literal()
  {
    return (EAttribute)primary_expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_expression_Creator()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_expression_Primitivetype()
  {
    return (EReference)primary_expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier_suffix()
  {
    return identifier_suffixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifier_suffix_Arguments()
  {
    return (EReference)identifier_suffixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifier_suffix_Explicitgenericinvocation()
  {
    return (EReference)identifier_suffixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifier_suffix_Innercreator()
  {
    return (EReference)identifier_suffixEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreator()
  {
    return creatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreator_Classcreatorrest()
  {
    return (EReference)creatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreated_name()
  {
    return created_nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreated_name_Arraycreatorrest()
  {
    return (EReference)created_nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreated_name_Classorinterfacetype()
  {
    return (EReference)created_nameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreated_name_Primitivetype()
  {
    return (EReference)created_nameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInner_creator()
  {
    return inner_creatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInner_creator_Nonwildcardtypearguments()
  {
    return (EReference)inner_creatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInner_creator_Identifier()
  {
    return (EAttribute)inner_creatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInner_creator_Classcreatorrest()
  {
    return (EReference)inner_creatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_creator_rest()
  {
    return array_creator_restEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_creator_rest_Expression()
  {
    return (EReference)array_creator_restEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_creator_rest()
  {
    return class_creator_restEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_creator_rest_Arguments()
  {
    return (EReference)class_creator_restEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_creator_rest_Classbody()
  {
    return (EReference)class_creator_restEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplicit_generic_invocation()
  {
    return explicit_generic_invocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicit_generic_invocation_Nonwildcardtypearguments()
  {
    return (EReference)explicit_generic_invocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExplicit_generic_invocation_Identifier()
  {
    return (EAttribute)explicit_generic_invocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplicit_generic_invocation_Arguments()
  {
    return (EReference)explicit_generic_invocationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNon_wildcard_type_arguments()
  {
    return non_wildcard_type_argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNon_wildcard_type_arguments_Createdname()
  {
    return (EReference)non_wildcard_type_argumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNon_wildcard_type_arguments_Type()
  {
    return (EReference)non_wildcard_type_argumentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelector_Supersuffix()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelector_Innercreator()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelector_Expression()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuper_suffix()
  {
    return super_suffixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuper_suffix_Arguments()
  {
    return (EReference)super_suffixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuper_suffix_Identifier()
  {
    return (EAttribute)super_suffixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArguments()
  {
    return argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArguments_Lparent()
  {
    return (EAttribute)argumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArguments_Expressionlist()
  {
    return (EReference)argumentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArguments_Rparent()
  {
    return (EAttribute)argumentsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch_statement()
  {
    return switch_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_statement_LParen()
  {
    return (EAttribute)switch_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_Expression()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_statement_Rparent()
  {
    return (EAttribute)switch_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_Expression2()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_SwitchStatements()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile_Statement()
  {
    return while_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Statement_Expression()
  {
    return (EReference)while_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhile_Statement_Rparent()
  {
    return (EAttribute)while_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Statement_WhileStatement()
  {
    return (EReference)while_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDo_Statement()
  {
    return do_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_Statement_DoStatement()
  {
    return (EReference)do_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDo_Statement_Lparent()
  {
    return (EAttribute)do_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDo_Statement_Rparent()
  {
    return (EAttribute)do_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf_statement()
  {
    return if_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_statement_Lparen()
  {
    return (EAttribute)if_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_Expression()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_statement_Rparent()
  {
    return (EAttribute)if_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_IdStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_ElseStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTry_statement()
  {
    return try_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_TryStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTry_statement_LParen()
  {
    return (EAttribute)try_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_Parameters()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTry_statement_Rparent()
  {
    return (EAttribute)try_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_CatchStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_FinallyStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport_statement()
  {
    return import_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_statement_ClassName()
  {
    return (EAttribute)import_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_statement_PacName()
  {
    return (EAttribute)import_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage_statement()
  {
    return package_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_statement_PacName()
  {
    return (EAttribute)package_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GREETINGS);

    compilation_unitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__NAME);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__IMPORTS);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__TYPE_DECLARATIONS);

    type_declarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(type_declarationEClass, TYPE_DECLARATION__COMMENT);
    createEReference(type_declarationEClass, TYPE_DECLARATION__CLASS_DEC);
    createEReference(type_declarationEClass, TYPE_DECLARATION__INTERFACE_DEC);

    interface_declarationEClass = createEClass(INTERFACE_DECLARATION);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__MODIFIERS);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACE_NAME);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACE_HERDADA);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACES_HERDADAS);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__FIELDS_DECLARATION);

    class_declarationEClass = createEClass(CLASS_DECLARATION);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__MODIFIERS);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__CLASS_NAME);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__CLASS_HERDADA);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__INTERFACE_IMPLEMENTADA);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS);
    createEReference(class_declarationEClass, CLASS_DECLARATION__FIELDS_DECLARATION);

    field_declarationEClass = createEClass(FIELD_DECLARATION);
    createEAttribute(field_declarationEClass, FIELD_DECLARATION__COMMENT);
    createEReference(field_declarationEClass, FIELD_DECLARATION__VARIABLE_DECLARATION);
    createEReference(field_declarationEClass, FIELD_DECLARATION__CONTRUCTOR_NAME);
    createEReference(field_declarationEClass, FIELD_DECLARATION__METHOD_NAME);
    createEReference(field_declarationEClass, FIELD_DECLARATION__STATICINITIALIZER);

    method_declarationEClass = createEClass(METHOD_DECLARATION);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__MODIFIERS_METHOD);
    createEReference(method_declarationEClass, METHOD_DECLARATION__TYPE_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__NAME_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__LPAREN);
    createEReference(method_declarationEClass, METHOD_DECLARATION__PARAMETER_LIST_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__RPARENT);
    createEReference(method_declarationEClass, METHOD_DECLARATION__STATEMENT_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__DEBUG);

    constructor_declarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__LPAREN);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__RPARENT);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR);

    parameter_listEClass = createEClass(PARAMETER_LIST);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETER);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);

    variable_declarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variable_declarationEClass, VARIABLE_DECLARATION__MODIFIERS_VARIABLE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__TYPE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__NAME_VARIABLE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__NAMES);

    variable_declaratorEClass = createEClass(VARIABLE_DECLARATOR);
    createEAttribute(variable_declaratorEClass, VARIABLE_DECLARATOR__NAME_VARIABLE);
    createEReference(variable_declaratorEClass, VARIABLE_DECLARATOR__VARI);

    variable_initializerEClass = createEClass(VARIABLE_INITIALIZER);

    array_initializerEClass = createEClass(ARRAY_INITIALIZER);
    createEReference(array_initializerEClass, ARRAY_INITIALIZER__VARIABLEINITIALIZER);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__TYPE_SPECIFIER);
    createEAttribute(typeEClass, TYPE__TYPE_VECTOR);

    static_initializerEClass = createEClass(STATIC_INITIALIZER);
    createEAttribute(static_initializerEClass, STATIC_INITIALIZER__STATIC);
    createEReference(static_initializerEClass, STATIC_INITIALIZER__NAME);

    statement_blockEClass = createEClass(STATEMENT_BLOCK);
    createEAttribute(statement_blockEClass, STATEMENT_BLOCK__RCURLY);
    createEReference(statement_blockEClass, STATEMENT_BLOCK__STATMENTS);
    createEAttribute(statement_blockEClass, STATEMENT_BLOCK__LCURLY);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__VARIABLE_DECLARATION);
    createEReference(statementEClass, STATEMENT__EXPRESSION_STATEMENT);
    createEAttribute(statementEClass, STATEMENT__G);
    createEReference(statementEClass, STATEMENT__IF_STATEMENT);
    createEReference(statementEClass, STATEMENT__DO_STATEMENT);
    createEReference(statementEClass, STATEMENT__WHILE_STATEMENT);
    createEReference(statementEClass, STATEMENT__FOR_STATEMENT);
    createEReference(statementEClass, STATEMENT__SWITCH_STATEMENT);
    createEReference(statementEClass, STATEMENT__EXPRESSION);
    createEAttribute(statementEClass, STATEMENT__RPARENT);
    createEReference(statementEClass, STATEMENT__SYNC_STATEMENT);
    createEReference(statementEClass, STATEMENT__TRY_STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME_STATEMENT);
    createEReference(statementEClass, STATEMENT__STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME);

    for_StatementEClass = createEClass(FOR_STATEMENT);
    createEAttribute(for_StatementEClass, FOR_STATEMENT__LPARENT);
    createEReference(for_StatementEClass, FOR_STATEMENT__FOR_CONTROL);
    createEAttribute(for_StatementEClass, FOR_STATEMENT__RPARENT);
    createEReference(for_StatementEClass, FOR_STATEMENT__FOR_STATEMENT);

    for_controlEClass = createEClass(FOR_CONTROL);
    createEReference(for_controlEClass, FOR_CONTROL__FORINIT);
    createEReference(for_controlEClass, FOR_CONTROL__EXPRESSION);
    createEReference(for_controlEClass, FOR_CONTROL__FORUPDATE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    variable_valueEClass = createEClass(VARIABLE_VALUE);
    createEAttribute(variable_valueEClass, VARIABLE_VALUE__NAME);

    primitive_typeEClass = createEClass(PRIMITIVE_TYPE);
    createEAttribute(primitive_typeEClass, PRIMITIVE_TYPE__NAME);

    for_initEClass = createEClass(FOR_INIT);
    createEReference(for_initEClass, FOR_INIT__TYPE);
    createEReference(for_initEClass, FOR_INIT__VAR);
    createEReference(for_initEClass, FOR_INIT__VAR_INIT);

    for_expressionEClass = createEClass(FOR_EXPRESSION);
    createEReference(for_expressionEClass, FOR_EXPRESSION__VARIABLE1);
    createEReference(for_expressionEClass, FOR_EXPRESSION__EXP_OP);
    createEReference(for_expressionEClass, FOR_EXPRESSION__LIMIT);

    for_updateEClass = createEClass(FOR_UPDATE);
    createEReference(for_updateEClass, FOR_UPDATE__VARIABLE);
    createEReference(for_updateEClass, FOR_UPDATE__UPDATE_OP);

    for_update_operatorEClass = createEClass(FOR_UPDATE_OPERATOR);
    createEAttribute(for_update_operatorEClass, FOR_UPDATE_OPERATOR__NAME);

    for_expression_operatorEClass = createEClass(FOR_EXPRESSION_OPERATOR);
    createEAttribute(for_expression_operatorEClass, FOR_EXPRESSION_OPERATOR__NAME);

    parens_expressionEClass = createEClass(PARENS_EXPRESSION);
    createEAttribute(parens_expressionEClass, PARENS_EXPRESSION__LPARENT);
    createEReference(parens_expressionEClass, PARENS_EXPRESSION__EXPRESSION);
    createEAttribute(parens_expressionEClass, PARENS_EXPRESSION__RPARENT);

    expression_listEClass = createEClass(EXPRESSION_LIST);
    createEReference(expression_listEClass, EXPRESSION_LIST__EXPRESSION1);
    createEReference(expression_listEClass, EXPRESSION_LIST__EXPRESSION2);

    expressionEClass = createEClass(EXPRESSION);

    conditional_expressionEClass = createEClass(CONDITIONAL_EXPRESSION);
    createEAttribute(conditional_expressionEClass, CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION1);
    createEReference(conditional_expressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION2);

    conditional_OR_expressionEClass = createEClass(CONDITIONAL_OR_EXPRESSION);
    createEReference(conditional_OR_expressionEClass, CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION);

    conditional_AND_expressionEClass = createEClass(CONDITIONAL_AND_EXPRESSION);
    createEReference(conditional_AND_expressionEClass, CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION);

    inclusive_OR_expressionEClass = createEClass(INCLUSIVE_OR_EXPRESSION);
    createEReference(inclusive_OR_expressionEClass, INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION);

    exclusive_OR_expressionEClass = createEClass(EXCLUSIVE_OR_EXPRESSION);
    createEReference(exclusive_OR_expressionEClass, EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION);

    anD_expressionEClass = createEClass(AND_EXPRESSION);
    createEReference(anD_expressionEClass, AND_EXPRESSION__EQUALITYEXPRESSION);

    equality_expressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equality_expressionEClass, EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION);

    instanceOf_expressionEClass = createEClass(INSTANCE_OF_EXPRESSION);

    relational_expressionEClass = createEClass(RELATIONAL_EXPRESSION);
    createEReference(relational_expressionEClass, RELATIONAL_EXPRESSION__TYPE);
    createEReference(relational_expressionEClass, RELATIONAL_EXPRESSION__SHIFTEXPRESSION);
    createEAttribute(relational_expressionEClass, RELATIONAL_EXPRESSION__RELATIONALOP);

    shift_expressionEClass = createEClass(SHIFT_EXPRESSION);
    createEReference(shift_expressionEClass, SHIFT_EXPRESSION__ADDITIVEEXPRESSION);
    createEAttribute(shift_expressionEClass, SHIFT_EXPRESSION__SHIFTOP);

    additive_expressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additive_expressionEClass, ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION);

    multiplicative_expressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicative_expressionEClass, MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION);

    unary_expressionEClass = createEClass(UNARY_EXPRESSION);

    unary_expression_Not_Plus_MinusEClass = createEClass(UNARY_EXPRESSION_NOT_PLUS_MINUS);
    createEReference(unary_expression_Not_Plus_MinusEClass, UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION);
    createEReference(unary_expression_Not_Plus_MinusEClass, UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION);
    createEReference(unary_expression_Not_Plus_MinusEClass, UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY);
    createEReference(unary_expression_Not_Plus_MinusEClass, UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR);

    cast_expressionEClass = createEClass(CAST_EXPRESSION);
    createEAttribute(cast_expressionEClass, CAST_EXPRESSION__LPARENT);
    createEReference(cast_expressionEClass, CAST_EXPRESSION__PRIMITIVETYPE);
    createEAttribute(cast_expressionEClass, CAST_EXPRESSION__RPARENT);
    createEReference(cast_expressionEClass, CAST_EXPRESSION__UNARYEXPRESSION);
    createEReference(cast_expressionEClass, CAST_EXPRESSION__TYPE);
    createEReference(cast_expressionEClass, CAST_EXPRESSION__EXPRESSION);
    createEReference(cast_expressionEClass, CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS);

    primary_expressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__PAREXPRESSION);
    createEAttribute(primary_expressionEClass, PRIMARY_EXPRESSION__IDENTIFIER);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__IDENTIFIERSUFFIX);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__SUPERSUFFIX);
    createEAttribute(primary_expressionEClass, PRIMARY_EXPRESSION__LITERAL);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__CREATOR);
    createEReference(primary_expressionEClass, PRIMARY_EXPRESSION__PRIMITIVETYPE);

    identifier_suffixEClass = createEClass(IDENTIFIER_SUFFIX);
    createEReference(identifier_suffixEClass, IDENTIFIER_SUFFIX__ARGUMENTS);
    createEReference(identifier_suffixEClass, IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION);
    createEReference(identifier_suffixEClass, IDENTIFIER_SUFFIX__INNERCREATOR);

    creatorEClass = createEClass(CREATOR);
    createEReference(creatorEClass, CREATOR__CLASSCREATORREST);

    created_nameEClass = createEClass(CREATED_NAME);
    createEReference(created_nameEClass, CREATED_NAME__ARRAYCREATORREST);
    createEReference(created_nameEClass, CREATED_NAME__CLASSORINTERFACETYPE);
    createEReference(created_nameEClass, CREATED_NAME__PRIMITIVETYPE);

    inner_creatorEClass = createEClass(INNER_CREATOR);
    createEReference(inner_creatorEClass, INNER_CREATOR__NONWILDCARDTYPEARGUMENTS);
    createEAttribute(inner_creatorEClass, INNER_CREATOR__IDENTIFIER);
    createEReference(inner_creatorEClass, INNER_CREATOR__CLASSCREATORREST);

    array_creator_restEClass = createEClass(ARRAY_CREATOR_REST);
    createEReference(array_creator_restEClass, ARRAY_CREATOR_REST__EXPRESSION);

    class_creator_restEClass = createEClass(CLASS_CREATOR_REST);
    createEReference(class_creator_restEClass, CLASS_CREATOR_REST__ARGUMENTS);
    createEReference(class_creator_restEClass, CLASS_CREATOR_REST__CLASSBODY);

    explicit_generic_invocationEClass = createEClass(EXPLICIT_GENERIC_INVOCATION);
    createEReference(explicit_generic_invocationEClass, EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS);
    createEAttribute(explicit_generic_invocationEClass, EXPLICIT_GENERIC_INVOCATION__IDENTIFIER);
    createEReference(explicit_generic_invocationEClass, EXPLICIT_GENERIC_INVOCATION__ARGUMENTS);

    non_wildcard_type_argumentsEClass = createEClass(NON_WILDCARD_TYPE_ARGUMENTS);
    createEReference(non_wildcard_type_argumentsEClass, NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME);
    createEReference(non_wildcard_type_argumentsEClass, NON_WILDCARD_TYPE_ARGUMENTS__TYPE);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__SUPERSUFFIX);
    createEReference(selectorEClass, SELECTOR__INNERCREATOR);
    createEReference(selectorEClass, SELECTOR__EXPRESSION);

    super_suffixEClass = createEClass(SUPER_SUFFIX);
    createEReference(super_suffixEClass, SUPER_SUFFIX__ARGUMENTS);
    createEAttribute(super_suffixEClass, SUPER_SUFFIX__IDENTIFIER);

    argumentsEClass = createEClass(ARGUMENTS);
    createEAttribute(argumentsEClass, ARGUMENTS__LPARENT);
    createEReference(argumentsEClass, ARGUMENTS__EXPRESSIONLIST);
    createEAttribute(argumentsEClass, ARGUMENTS__RPARENT);

    switch_statementEClass = createEClass(SWITCH_STATEMENT);
    createEAttribute(switch_statementEClass, SWITCH_STATEMENT__LPAREN);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSION);
    createEAttribute(switch_statementEClass, SWITCH_STATEMENT__RPARENT);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSION2);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__SWITCH_STATEMENTS);

    while_StatementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_StatementEClass, WHILE_STATEMENT__EXPRESSION);
    createEAttribute(while_StatementEClass, WHILE_STATEMENT__RPARENT);
    createEReference(while_StatementEClass, WHILE_STATEMENT__WHILE_STATEMENT);

    do_StatementEClass = createEClass(DO_STATEMENT);
    createEReference(do_StatementEClass, DO_STATEMENT__DO_STATEMENT);
    createEAttribute(do_StatementEClass, DO_STATEMENT__LPARENT);
    createEAttribute(do_StatementEClass, DO_STATEMENT__RPARENT);

    if_statementEClass = createEClass(IF_STATEMENT);
    createEAttribute(if_statementEClass, IF_STATEMENT__LPAREN);
    createEReference(if_statementEClass, IF_STATEMENT__EXPRESSION);
    createEAttribute(if_statementEClass, IF_STATEMENT__RPARENT);
    createEReference(if_statementEClass, IF_STATEMENT__ID_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__ELSE_STATEMENT);

    try_statementEClass = createEClass(TRY_STATEMENT);
    createEReference(try_statementEClass, TRY_STATEMENT__TRY_STATEMENT);
    createEAttribute(try_statementEClass, TRY_STATEMENT__LPAREN);
    createEReference(try_statementEClass, TRY_STATEMENT__PARAMETERS);
    createEAttribute(try_statementEClass, TRY_STATEMENT__RPARENT);
    createEReference(try_statementEClass, TRY_STATEMENT__CATCH_STATEMENT);
    createEReference(try_statementEClass, TRY_STATEMENT__FINALLY_STATEMENT);

    import_statementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(import_statementEClass, IMPORT_STATEMENT__CLASS_NAME);
    createEAttribute(import_statementEClass, IMPORT_STATEMENT__PAC_NAME);

    package_statementEClass = createEClass(PACKAGE_STATEMENT);
    createEAttribute(package_statementEClass, PACKAGE_STATEMENT__PAC_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    array_initializerEClass.getESuperTypes().add(this.getVariable_initializer());
    array_initializerEClass.getESuperTypes().add(this.getArray_creator_rest());
    statement_blockEClass.getESuperTypes().add(this.getStatement());
    expressionEClass.getESuperTypes().add(this.getVariable_initializer());
    conditional_expressionEClass.getESuperTypes().add(this.getExpression());
    relational_expressionEClass.getESuperTypes().add(this.getInstanceOf_expression());
    unary_expression_Not_Plus_MinusEClass.getESuperTypes().add(this.getUnary_expression());
    created_nameEClass.getESuperTypes().add(this.getCreator());
    non_wildcard_type_argumentsEClass.getESuperTypes().add(this.getCreator());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Greetings(), this.getCompilation_unit(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compilation_unitEClass, Compilation_unit.class, "Compilation_unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompilation_unit_Name(), this.getPackage_statement(), null, "name", null, 0, 1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_unit_Imports(), this.getImport_statement(), null, "imports", null, 0, -1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_unit_TypeDeclarations(), this.getType_declaration(), null, "typeDeclarations", null, 0, -1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_declarationEClass, Type_declaration.class, "Type_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_declaration_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_declaration_ClassDec(), this.getClass_declaration(), null, "classDec", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_declaration_InterfaceDec(), this.getInterface_declaration(), null, "interfaceDec", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_declarationEClass, Interface_declaration.class, "Interface_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_declaration_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfaceHerdada(), ecorePackage.getEString(), "interfaceHerdada", null, 0, 1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfacesHerdadas(), ecorePackage.getEString(), "interfacesHerdadas", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_declaration_FieldsDeclaration(), this.getField_declaration(), null, "fieldsDeclaration", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_declarationEClass, Class_declaration.class, "Class_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_declaration_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_ClassHerdada(), ecorePackage.getEString(), "classHerdada", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_InterfaceImplementada(), ecorePackage.getEString(), "interfaceImplementada", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_InterfacesImplementadas(), ecorePackage.getEString(), "interfacesImplementadas", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_declaration_FieldsDeclaration(), this.getField_declaration(), null, "fieldsDeclaration", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_declarationEClass, Field_declaration.class, "Field_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_declaration_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_VariableDeclaration(), this.getVariable_declaration(), null, "variableDeclaration", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_ContructorName(), this.getConstructor_declaration(), null, "contructorName", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_MethodName(), this.getMethod_declaration(), null, "methodName", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_Staticinitializer(), this.getStatic_initializer(), null, "staticinitializer", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(method_declarationEClass, Method_declaration.class, "Method_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_declaration_ModifiersMethod(), ecorePackage.getEString(), "modifiersMethod", null, 0, -1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_TypeMethod(), this.getType(), null, "typeMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_NameMethod(), ecorePackage.getEString(), "nameMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_ParameterListMethod(), this.getParameter_list(), null, "parameterListMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_StatementMethod(), this.getStatement_block(), null, "statementMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_Debug(), ecorePackage.getEString(), "debug", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructor_declarationEClass, Constructor_declaration.class, "Constructor_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructor_declaration_ModifiersConstructor(), ecorePackage.getEString(), "modifiersConstructor", null, 0, -1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_NameConstructor(), ecorePackage.getEString(), "nameConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_declaration_ParameterListConstructor(), this.getParameter_list(), null, "parameterListConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_declaration_StatementConstructor(), this.getStatement_block(), null, "statementConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_listEClass, Parameter_list.class, "Parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_list_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, Parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_list_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declarationEClass, Variable_declaration.class, "Variable_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_declaration_ModifiersVariable(), ecorePackage.getEString(), "modifiersVariable", null, 0, -1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_Type(), this.getType(), null, "type", null, 0, 1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_NameVariable(), this.getVariable_declarator(), null, "nameVariable", null, 0, 1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_Names(), this.getVariable_declarator(), null, "names", null, 0, -1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declaratorEClass, Variable_declarator.class, "Variable_declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_declarator_NameVariable(), ecorePackage.getEString(), "nameVariable", null, 0, 1, Variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declarator_Vari(), this.getVariable_initializer(), null, "vari", null, 0, 1, Variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_initializerEClass, Variable_initializer.class, "Variable_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(array_initializerEClass, Array_initializer.class, "Array_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_initializer_Variableinitializer(), this.getVariable_initializer(), null, "variableinitializer", null, 0, -1, Array_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_TypeSpecifier(), ecorePackage.getEString(), "typeSpecifier", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_TypeVector(), ecorePackage.getEString(), "typeVector", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(static_initializerEClass, Static_initializer.class, "Static_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatic_initializer_Static(), ecorePackage.getEString(), "static", null, 0, 1, Static_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatic_initializer_Name(), this.getStatement_block(), null, "name", null, 0, 1, Static_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_blockEClass, Statement_block.class, "Statement_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_block_RCurly(), ecorePackage.getEString(), "rCurly", null, 0, 1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_block_Statments(), this.getStatement(), null, "statments", null, 0, -1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_block_LCurly(), ecorePackage.getEString(), "lCurly", null, 0, 1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_VariableDeclaration(), this.getVariable_declaration(), null, "variableDeclaration", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_ExpressionStatement(), this.getExpression(), null, "expressionStatement", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_G(), ecorePackage.getEString(), "g", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_IfStatement(), this.getIf_statement(), null, "ifStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_DoStatement(), this.getDo_Statement(), null, "doStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_WhileStatement(), this.getWhile_Statement(), null, "whileStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_ForStatement(), this.getFor_Statement(), null, "forStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_SwitchStatement(), this.getSwitch_statement(), null, "switchStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_SyncStatement(), this.getStatement(), null, "syncStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_TryStatement(), this.getTry_statement(), null, "tryStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_NameStatement(), ecorePackage.getEString(), "nameStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_StatementEClass, For_Statement.class, "For_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_Statement_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_ForControl(), this.getFor_control(), null, "forControl", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_Statement_RParent(), ecorePackage.getEString(), "rParent", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_ForStatement(), this.getStatement(), null, "forStatement", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_controlEClass, For_control.class, "For_control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_control_Forinit(), this.getFor_init(), null, "forinit", null, 0, 1, For_control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_control_Expression(), this.getFor_expression(), null, "expression", null, 0, 1, For_control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_control_Forupdate(), this.getFor_update(), null, "forupdate", null, 0, 1, For_control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_valueEClass, Variable_value.class, "Variable_value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_value_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable_value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitive_typeEClass, Primitive_type.class, "Primitive_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitive_type_Name(), ecorePackage.getEString(), "name", null, 0, 1, Primitive_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_initEClass, For_init.class, "For_init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_init_Type(), this.getPrimitive_type(), null, "type", null, 0, 1, For_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_init_Var(), this.getVariable(), null, "var", null, 0, 1, For_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_init_Var_init(), this.getVariable_value(), null, "var_init", null, 0, 1, For_init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_expressionEClass, For_expression.class, "For_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_expression_Variable1(), this.getVariable(), null, "variable1", null, 0, 1, For_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_expression_ExpOp(), this.getFor_expression_operator(), null, "ExpOp", null, 0, 1, For_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_expression_Limit(), this.getVariable_value(), null, "limit", null, 0, 1, For_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_updateEClass, For_update.class, "For_update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_update_Variable(), this.getVariable(), null, "variable", null, 0, 1, For_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_update_UpdateOp(), this.getFor_update_operator(), null, "updateOp", null, 0, 1, For_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_update_operatorEClass, For_update_operator.class, "For_update_operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_update_operator_Name(), ecorePackage.getEString(), "name", null, 0, 1, For_update_operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_expression_operatorEClass, For_expression_operator.class, "For_expression_operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_expression_operator_Name(), ecorePackage.getEString(), "name", null, 0, 1, For_expression_operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parens_expressionEClass, Parens_expression.class, "Parens_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParens_expression_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, Parens_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParens_expression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Parens_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParens_expression_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Parens_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_listEClass, Expression_list.class, "Expression_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_list_Expression1(), this.getExpression(), null, "expression1", null, 0, 1, Expression_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_list_Expression2(), this.getExpression(), null, "expression2", null, 0, -1, Expression_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditional_expressionEClass, Conditional_expression.class, "Conditional_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditional_expression_Assignmentoperator(), ecorePackage.getEString(), "assignmentoperator", null, 0, 1, Conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_expression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_expression_Conditionalorexpression(), this.getConditional_OR_expression(), null, "conditionalorexpression", null, 0, 1, Conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_expression_Expression1(), this.getExpression(), null, "expression1", null, 0, 1, Conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditional_expression_Expression2(), this.getExpression(), null, "expression2", null, 0, 1, Conditional_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditional_OR_expressionEClass, Conditional_OR_expression.class, "Conditional_OR_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditional_OR_expression_Conditionalandexpression(), this.getConditional_AND_expression(), null, "conditionalandexpression", null, 0, -1, Conditional_OR_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditional_AND_expressionEClass, Conditional_AND_expression.class, "Conditional_AND_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditional_AND_expression_Inclusiveorexpression(), this.getInclusive_OR_expression(), null, "inclusiveorexpression", null, 0, -1, Conditional_AND_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inclusive_OR_expressionEClass, Inclusive_OR_expression.class, "Inclusive_OR_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInclusive_OR_expression_Exclusiveorexpression(), this.getExclusive_OR_expression(), null, "exclusiveorexpression", null, 0, -1, Inclusive_OR_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exclusive_OR_expressionEClass, Exclusive_OR_expression.class, "Exclusive_OR_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExclusive_OR_expression_Andexpression(), this.getAND_expression(), null, "andexpression", null, 0, -1, Exclusive_OR_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anD_expressionEClass, AND_expression.class, "AND_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAND_expression_Equalityexpression(), this.getEquality_expression(), null, "equalityexpression", null, 0, -1, AND_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equality_expressionEClass, Equality_expression.class, "Equality_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquality_expression_Instanceofexpression(), this.getInstanceOf_expression(), null, "instanceofexpression", null, 0, -1, Equality_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceOf_expressionEClass, InstanceOf_expression.class, "InstanceOf_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relational_expressionEClass, Relational_expression.class, "Relational_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelational_expression_Type(), this.getType(), null, "type", null, 0, 1, Relational_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelational_expression_Shiftexpression(), this.getShift_expression(), null, "shiftexpression", null, 0, -1, Relational_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelational_expression_Relationalop(), ecorePackage.getEString(), "relationalop", null, 0, -1, Relational_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shift_expressionEClass, Shift_expression.class, "Shift_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShift_expression_Additiveexpression(), this.getAdditive_expression(), null, "additiveexpression", null, 0, -1, Shift_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShift_expression_Shiftop(), ecorePackage.getEString(), "shiftop", null, 0, -1, Shift_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additive_expressionEClass, Additive_expression.class, "Additive_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditive_expression_Multiplicativeexpression(), this.getMultiplicative_expression(), null, "multiplicativeexpression", null, 0, -1, Additive_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicative_expressionEClass, Multiplicative_expression.class, "Multiplicative_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicative_expression_Unaryexpression(), this.getUnary_expression(), null, "unaryexpression", null, 0, -1, Multiplicative_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unary_expressionEClass, Unary_expression.class, "Unary_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unary_expression_Not_Plus_MinusEClass, Unary_expression_Not_Plus_Minus.class, "Unary_expression_Not_Plus_Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnary_expression_Not_Plus_Minus_Unaryexpression(), this.getUnary_expression(), null, "unaryexpression", null, 0, 1, Unary_expression_Not_Plus_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnary_expression_Not_Plus_Minus_Castexpression(), this.getCast_expression(), null, "castexpression", null, 0, 1, Unary_expression_Not_Plus_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnary_expression_Not_Plus_Minus_Primary(), this.getPrimary_expression(), null, "primary", null, 0, 1, Unary_expression_Not_Plus_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnary_expression_Not_Plus_Minus_Selector(), this.getSelector(), null, "selector", null, 0, -1, Unary_expression_Not_Plus_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cast_expressionEClass, Cast_expression.class, "Cast_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCast_expression_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_expression_Primitivetype(), this.getPrimitive_type(), null, "primitivetype", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCast_expression_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_expression_Unaryexpression(), this.getUnary_expression(), null, "unaryexpression", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_expression_Type(), this.getType(), null, "type", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_expression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_expression_Unaryexpressionnotplusminus(), this.getUnary_expression_Not_Plus_Minus(), null, "unaryexpressionnotplusminus", null, 0, 1, Cast_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primary_expressionEClass, Primary_expression.class, "Primary_expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimary_expression_Parexpression(), this.getParens_expression(), null, "parexpression", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimary_expression_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimary_expression_Identifiersuffix(), this.getIdentifier_suffix(), null, "identifiersuffix", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimary_expression_Supersuffix(), this.getSuper_suffix(), null, "supersuffix", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimary_expression_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimary_expression_Creator(), this.getCreator(), null, "creator", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimary_expression_Primitivetype(), this.getPrimitive_type(), null, "primitivetype", null, 0, 1, Primary_expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifier_suffixEClass, Identifier_suffix.class, "Identifier_suffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdentifier_suffix_Arguments(), this.getArguments(), null, "arguments", null, 0, 1, Identifier_suffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdentifier_suffix_Explicitgenericinvocation(), this.getExplicit_generic_invocation(), null, "explicitgenericinvocation", null, 0, 1, Identifier_suffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdentifier_suffix_Innercreator(), this.getInner_creator(), null, "innercreator", null, 0, 1, Identifier_suffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreator_Classcreatorrest(), this.getClass_creator_rest(), null, "classcreatorrest", null, 0, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(created_nameEClass, Created_name.class, "Created_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreated_name_Arraycreatorrest(), this.getArray_creator_rest(), null, "arraycreatorrest", null, 0, 1, Created_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreated_name_Classorinterfacetype(), this.getClass_declaration(), null, "classorinterfacetype", null, 0, 1, Created_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreated_name_Primitivetype(), this.getPrimitive_type(), null, "primitivetype", null, 0, 1, Created_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inner_creatorEClass, Inner_creator.class, "Inner_creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInner_creator_Nonwildcardtypearguments(), this.getNon_wildcard_type_arguments(), null, "nonwildcardtypearguments", null, 0, 1, Inner_creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInner_creator_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Inner_creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInner_creator_Classcreatorrest(), this.getClass_creator_rest(), null, "classcreatorrest", null, 0, 1, Inner_creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_creator_restEClass, Array_creator_rest.class, "Array_creator_rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_creator_rest_Expression(), this.getExpression(), null, "expression", null, 0, -1, Array_creator_rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_creator_restEClass, Class_creator_rest.class, "Class_creator_rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_creator_rest_Arguments(), this.getArguments(), null, "arguments", null, 0, 1, Class_creator_rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_creator_rest_Classbody(), this.getClass_declaration(), null, "classbody", null, 0, 1, Class_creator_rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(explicit_generic_invocationEClass, Explicit_generic_invocation.class, "Explicit_generic_invocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExplicit_generic_invocation_Nonwildcardtypearguments(), this.getNon_wildcard_type_arguments(), null, "nonwildcardtypearguments", null, 0, 1, Explicit_generic_invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExplicit_generic_invocation_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Explicit_generic_invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExplicit_generic_invocation_Arguments(), this.getArguments(), null, "arguments", null, 0, 1, Explicit_generic_invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(non_wildcard_type_argumentsEClass, Non_wildcard_type_arguments.class, "Non_wildcard_type_arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNon_wildcard_type_arguments_Createdname(), this.getCreated_name(), null, "createdname", null, 0, 1, Non_wildcard_type_arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNon_wildcard_type_arguments_Type(), this.getType(), null, "type", null, 0, 1, Non_wildcard_type_arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelector_Supersuffix(), this.getSuper_suffix(), null, "supersuffix", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelector_Innercreator(), this.getInner_creator(), null, "innercreator", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelector_Expression(), this.getExpression(), null, "expression", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(super_suffixEClass, Super_suffix.class, "Super_suffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuper_suffix_Arguments(), this.getArguments(), null, "arguments", null, 0, 1, Super_suffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSuper_suffix_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Super_suffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArguments_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArguments_Expressionlist(), this.getExpression_list(), null, "expressionlist", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArguments_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switch_statementEClass, Switch_statement.class, "Switch_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitch_statement_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_Expression2(), this.getExpression(), null, "expression2", null, 0, -1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_SwitchStatements(), this.getStatement(), null, "switchStatements", null, 0, -1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_StatementEClass, While_Statement.class, "While_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhile_Statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Statement_WhileStatement(), this.getStatement(), null, "whileStatement", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(do_StatementEClass, Do_Statement.class, "Do_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDo_Statement_DoStatement(), this.getStatement(), null, "doStatement", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDo_Statement_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDo_Statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(if_statementEClass, If_statement.class, "If_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIf_statement_Lparen(), ecorePackage.getEString(), "lparen", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIf_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_IdStatement(), this.getStatement(), null, "idStatement", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(try_statementEClass, Try_statement.class, "Try_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTry_statement_TryStatement(), this.getStatement(), null, "tryStatement", null, 0, 1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTry_statement_LParen(), ecorePackage.getEString(), "lParen", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTry_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_CatchStatement(), this.getStatement(), null, "catchStatement", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_FinallyStatement(), this.getStatement(), null, "finallyStatement", null, 0, 1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(import_statementEClass, Import_statement.class, "Import_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_statement_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Import_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImport_statement_PacName(), ecorePackage.getEString(), "pacName", null, 0, 1, Import_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(package_statementEClass, Package_statement.class, "Package_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_statement_PacName(), ecorePackage.getEString(), "pacName", null, 0, 1, Package_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
