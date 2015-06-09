/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.compilador.java.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/compilador/java/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.ModelImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Compilation_unitImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__TYPE_DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>Compilation unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Type_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getType_declaration()
   * @generated
   */
  int TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Class Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__CLASS_DEC = 1;

  /**
   * The feature id for the '<em><b>Interface Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__INTERFACE_DEC = 2;

  /**
   * The number of structural features of the '<em>Type declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Interface_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACE_NAME = 1;

  /**
   * The feature id for the '<em><b>Interface Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACE_HERDADA = 2;

  /**
   * The feature id for the '<em><b>Interfaces Herdadas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACES_HERDADAS = 3;

  /**
   * The number of structural features of the '<em>Interface declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Class_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getClass_declaration()
   * @generated
   */
  int CLASS_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Class Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_HERDADA = 2;

  /**
   * The feature id for the '<em><b>Interface Implementada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__INTERFACE_IMPLEMENTADA = 3;

  /**
   * The feature id for the '<em><b>Interfaces Implementadas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS = 4;

  /**
   * The feature id for the '<em><b>Fields Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__FIELDS_DECLARATION = 5;

  /**
   * The number of structural features of the '<em>Class declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Field_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getField_declaration()
   * @generated
   */
  int FIELD_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__VARIABLE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Contructor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__CONTRUCTOR_NAME = 2;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__METHOD_NAME = 3;

  /**
   * The feature id for the '<em><b>Staticinitializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__STATICINITIALIZER = 4;

  /**
   * The number of structural features of the '<em>Field declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Method_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
   * @generated
   */
  int METHOD_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Modifiers Method</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__MODIFIERS_METHOD = 0;

  /**
   * The feature id for the '<em><b>Type Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__TYPE_METHOD = 1;

  /**
   * The feature id for the '<em><b>Name Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__NAME_METHOD = 2;

  /**
   * The feature id for the '<em><b>Parameter List Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMETER_LIST_METHOD = 3;

  /**
   * The feature id for the '<em><b>Statement Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__STATEMENT_METHOD = 4;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__DEBUG = 5;

  /**
   * The number of structural features of the '<em>Method declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
   * @generated
   */
  int CONSTRUCTOR_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Modifiers Constructor</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR = 0;

  /**
   * The feature id for the '<em><b>Name Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR = 1;

  /**
   * The feature id for the '<em><b>Parameter List Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = 2;

  /**
   * The feature id for the '<em><b>Statement Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = 3;

  /**
   * The number of structural features of the '<em>Constructor declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Parameter_listImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getParameter_list()
   * @generated
   */
  int PARAMETER_LIST = 8;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.ParameterImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.For_StatementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getFor_Statement()
   * @generated
   */
  int FOR_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Statement In For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT_IN_FOR = 0;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Variable_declarationImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Statement In For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__STATEMENT_IN_FOR = FOR_STATEMENT__STATEMENT_IN_FOR;

  /**
   * The feature id for the '<em><b>Modifiers Variable</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__MODIFIERS_VARIABLE = FOR_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = FOR_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME_VARIABLE = FOR_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAMES = FOR_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = FOR_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Variable_declaratorImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 11;

  /**
   * The feature id for the '<em><b>Name Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__NAME_VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Variable declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.TypeImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 12;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE_SPECIFIER = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Static_initializerImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
   * @generated
   */
  int STATIC_INITIALIZER = 13;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__NAME = 1;

  /**
   * The number of structural features of the '<em>Static initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.If_statementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getIf_statement()
   * @generated
   */
  int IF_STATEMENT = 19;

  /**
   * The number of structural features of the '<em>If statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.StatementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLE_DECLARATION = IF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IF_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DO_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TRY_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = IF_STATEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SYNC_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = IF_STATEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ELSE_STATEMENT = IF_STATEMENT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = IF_STATEMENT_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Statement_blockImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatement_block()
   * @generated
   */
  int STATEMENT_BLOCK = 14;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__VARIABLE_DECLARATION = STATEMENT__VARIABLE_DECLARATION;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__IF_STATEMENT = STATEMENT__IF_STATEMENT;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__DO_STATEMENT = STATEMENT__DO_STATEMENT;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__WHILE_STATEMENT = STATEMENT__WHILE_STATEMENT;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__FOR_STATEMENT = STATEMENT__FOR_STATEMENT;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__TRY_STATEMENT = STATEMENT__TRY_STATEMENT;

  /**
   * The feature id for the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__NAME_STATEMENT = STATEMENT__NAME_STATEMENT;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATEMENT = STATEMENT__STATEMENT;

  /**
   * The feature id for the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__SYNC_STATEMENT = STATEMENT__SYNC_STATEMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__ELSE_STATEMENT = STATEMENT__ELSE_STATEMENT;

  /**
   * The feature id for the '<em><b>Statments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.While_StatementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
   * @generated
   */
  int WHILE_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Do_StatementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getDo_Statement()
   * @generated
   */
  int DO_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Try_statementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getTry_statement()
   * @generated
   */
  int TRY_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__TRY_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Statement Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__STATEMENT_FINALLY = 3;

  /**
   * The number of structural features of the '<em>Try statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Import_statementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getImport_statement()
   * @generated
   */
  int IMPORT_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Pac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__PAC_NAME = 1;

  /**
   * The number of structural features of the '<em>Import statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.compilador.java.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilador.java.myDsl.impl.Package_statementImpl
   * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getPackage_statement()
   * @generated
   */
  int PACKAGE_STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Pac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT__PAC_NAME = 0;

  /**
   * The number of structural features of the '<em>Package statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.compilador.java.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.compilador.java.myDsl.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Compilation_unit <em>Compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation unit</em>'.
   * @see org.xtext.compilador.java.myDsl.Compilation_unit
   * @generated
   */
  EClass getCompilation_unit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Compilation_unit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Compilation_unit#getName()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Compilation_unit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.compilador.java.myDsl.Compilation_unit#getImports()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Compilation_unit#getTypeDeclarations <em>Type Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
   * @see org.xtext.compilador.java.myDsl.Compilation_unit#getTypeDeclarations()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_TypeDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Type_declaration
   * @generated
   */
  EClass getType_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Type_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.compilador.java.myDsl.Type_declaration#getComment()
   * @see #getType_declaration()
   * @generated
   */
  EAttribute getType_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Type_declaration#getClassDec <em>Class Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Dec</em>'.
   * @see org.xtext.compilador.java.myDsl.Type_declaration#getClassDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_ClassDec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Type_declaration#getInterfaceDec <em>Interface Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Dec</em>'.
   * @see org.xtext.compilador.java.myDsl.Type_declaration#getInterfaceDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_InterfaceDec();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Interface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Interface_declaration
   * @generated
   */
  EClass getInterface_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Interface_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.compilador.java.myDsl.Interface_declaration#getModifiers()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Interface_declaration#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Interface_declaration#getInterfaceName()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Interface_declaration#getInterfaceHerdada <em>Interface Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Herdada</em>'.
   * @see org.xtext.compilador.java.myDsl.Interface_declaration#getInterfaceHerdada()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceHerdada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Interface_declaration#getInterfacesHerdadas <em>Interfaces Herdadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Herdadas</em>'.
   * @see org.xtext.compilador.java.myDsl.Interface_declaration#getInterfacesHerdadas()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfacesHerdadas();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Class_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration
   * @generated
   */
  EClass getClass_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Class_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getModifiers()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Class_declaration#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getClassName()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Class_declaration#getClassHerdada <em>Class Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Herdada</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getClassHerdada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassHerdada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Class_declaration#getInterfaceImplementada <em>Interface Implementada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Implementada</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getInterfaceImplementada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfaceImplementada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Class_declaration#getInterfacesImplementadas <em>Interfaces Implementadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Implementadas</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getInterfacesImplementadas()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfacesImplementadas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Class_declaration#getFieldsDeclaration <em>Fields Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields Declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Class_declaration#getFieldsDeclaration()
   * @see #getClass_declaration()
   * @generated
   */
  EReference getClass_declaration_FieldsDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Field_declaration <em>Field declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration
   * @generated
   */
  EClass getField_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Field_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration#getComment()
   * @see #getField_declaration()
   * @generated
   */
  EAttribute getField_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Field_declaration#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration#getVariableDeclaration()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Field_declaration#getContructorName <em>Contructor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contructor Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration#getContructorName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_ContructorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Field_declaration#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration#getMethodName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Field_declaration#getStaticinitializer <em>Staticinitializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Staticinitializer</em>'.
   * @see org.xtext.compilador.java.myDsl.Field_declaration#getStaticinitializer()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_Staticinitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Method_declaration <em>Method declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration
   * @generated
   */
  EClass getMethod_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Method_declaration#getModifiersMethod <em>Modifiers Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Method</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getModifiersMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_ModifiersMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Method_declaration#getTypeMethod <em>Type Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Method</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getTypeMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_TypeMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Method_declaration#getNameMethod <em>Name Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Method</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getNameMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_NameMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Method_declaration#getParameterListMethod <em>Parameter List Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Method</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getParameterListMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_ParameterListMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Method_declaration#getStatementMethod <em>Statement Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Method</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getStatementMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_StatementMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Method_declaration#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.xtext.compilador.java.myDsl.Method_declaration#getDebug()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_Debug();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Constructor_declaration <em>Constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Constructor_declaration
   * @generated
   */
  EClass getConstructor_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Constructor_declaration#getModifiersConstructor <em>Modifiers Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Constructor</em>'.
   * @see org.xtext.compilador.java.myDsl.Constructor_declaration#getModifiersConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_ModifiersConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Constructor_declaration#getNameConstructor <em>Name Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Constructor</em>'.
   * @see org.xtext.compilador.java.myDsl.Constructor_declaration#getNameConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_NameConstructor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Constructor_declaration#getParameterListConstructor <em>Parameter List Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Constructor</em>'.
   * @see org.xtext.compilador.java.myDsl.Constructor_declaration#getParameterListConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_ParameterListConstructor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Constructor_declaration#getStatementConstructor <em>Statement Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Constructor</em>'.
   * @see org.xtext.compilador.java.myDsl.Constructor_declaration#getStatementConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_StatementConstructor();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Parameter_list <em>Parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter list</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter_list
   * @generated
   */
  EClass getParameter_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Parameter_list#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter_list#getParameter()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter_list#getParameters()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Parameter#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Parameter#getParameterName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterName();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Variable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declaration
   * @generated
   */
  EClass getVariable_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilador.java.myDsl.Variable_declaration#getModifiersVariable <em>Modifiers Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Variable</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declaration#getModifiersVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EAttribute getVariable_declaration_ModifiersVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Variable_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declaration#getType()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Variable_declaration#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Variable</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declaration#getNameVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_NameVariable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Variable_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declaration#getNames()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Names();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Variable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declarator</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declarator
   * @generated
   */
  EClass getVariable_declarator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Variable</em>'.
   * @see org.xtext.compilador.java.myDsl.Variable_declarator#getNameVariable()
   * @see #getVariable_declarator()
   * @generated
   */
  EAttribute getVariable_declarator_NameVariable();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.compilador.java.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Type#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Specifier</em>'.
   * @see org.xtext.compilador.java.myDsl.Type#getTypeSpecifier()
   * @see #getType()
   * @generated
   */
  EAttribute getType_TypeSpecifier();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Static_initializer <em>Static initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static initializer</em>'.
   * @see org.xtext.compilador.java.myDsl.Static_initializer
   * @generated
   */
  EClass getStatic_initializer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Static_initializer#getStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.xtext.compilador.java.myDsl.Static_initializer#getStatic()
   * @see #getStatic_initializer()
   * @generated
   */
  EAttribute getStatic_initializer_Static();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Static_initializer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Static_initializer#getName()
   * @see #getStatic_initializer()
   * @generated
   */
  EReference getStatic_initializer_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Statement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement block</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement_block
   * @generated
   */
  EClass getStatement_block();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Statement_block#getStatments <em>Statments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statments</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement_block#getStatments()
   * @see #getStatement_block()
   * @generated
   */
  EReference getStatement_block_Statments();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getVariableDeclaration()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getIfStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getDoStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_DoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getWhileStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_WhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getForStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getTryStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_TryStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Statement#getNameStatement <em>Name Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getNameStatement()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_NameStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getSyncStatement <em>Sync Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sync Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getSyncStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_SyncStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Statement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Statement#getElseStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.For_Statement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.For_Statement
   * @generated
   */
  EClass getFor_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.For_Statement#getStatementInFor <em>Statement In For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement In For</em>'.
   * @see org.xtext.compilador.java.myDsl.For_Statement#getStatementInFor()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_StatementInFor();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.While_Statement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.While_Statement
   * @generated
   */
  EClass getWhile_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.While_Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.While_Statement#getStatement()
   * @see #getWhile_Statement()
   * @generated
   */
  EReference getWhile_Statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Do_Statement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Do_Statement
   * @generated
   */
  EClass getDo_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Do_Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Do_Statement#getStatement()
   * @see #getDo_Statement()
   * @generated
   */
  EReference getDo_Statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.If_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If statement</em>'.
   * @see org.xtext.compilador.java.myDsl.If_statement
   * @generated
   */
  EClass getIf_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Try_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Try_statement
   * @generated
   */
  EClass getTry_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Try_statement#getTryStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_TryStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Try_statement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.compilador.java.myDsl.Try_statement#getParameters()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilador.java.myDsl.Try_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Try_statement#getStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.compilador.java.myDsl.Try_statement#getStatementFinally <em>Statement Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Finally</em>'.
   * @see org.xtext.compilador.java.myDsl.Try_statement#getStatementFinally()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_StatementFinally();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Import_statement <em>Import statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Import_statement
   * @generated
   */
  EClass getImport_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Import_statement#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Import_statement#getClassName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Import_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Import_statement#getPacName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_PacName();

  /**
   * Returns the meta object for class '{@link org.xtext.compilador.java.myDsl.Package_statement <em>Package statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package statement</em>'.
   * @see org.xtext.compilador.java.myDsl.Package_statement
   * @generated
   */
  EClass getPackage_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilador.java.myDsl.Package_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.compilador.java.myDsl.Package_statement#getPacName()
   * @see #getPackage_statement()
   * @generated
   */
  EAttribute getPackage_statement_PacName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.ModelImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Compilation_unitImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilation_unit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__NAME = eINSTANCE.getCompilation_unit_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilation_unit_Imports();

    /**
     * The meta object literal for the '<em><b>Type Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__TYPE_DECLARATIONS = eINSTANCE.getCompilation_unit_TypeDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Type_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getType_declaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getType_declaration();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__COMMENT = eINSTANCE.getType_declaration_Comment();

    /**
     * The meta object literal for the '<em><b>Class Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__CLASS_DEC = eINSTANCE.getType_declaration_ClassDec();

    /**
     * The meta object literal for the '<em><b>Interface Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__INTERFACE_DEC = eINSTANCE.getType_declaration_InterfaceDec();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Interface_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterface_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__MODIFIERS = eINSTANCE.getInterface_declaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACE_NAME = eINSTANCE.getInterface_declaration_InterfaceName();

    /**
     * The meta object literal for the '<em><b>Interface Herdada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACE_HERDADA = eINSTANCE.getInterface_declaration_InterfaceHerdada();

    /**
     * The meta object literal for the '<em><b>Interfaces Herdadas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACES_HERDADAS = eINSTANCE.getInterface_declaration_InterfacesHerdadas();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Class_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getClass_declaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClass_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__MODIFIERS = eINSTANCE.getClass_declaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__CLASS_NAME = eINSTANCE.getClass_declaration_ClassName();

    /**
     * The meta object literal for the '<em><b>Class Herdada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__CLASS_HERDADA = eINSTANCE.getClass_declaration_ClassHerdada();

    /**
     * The meta object literal for the '<em><b>Interface Implementada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__INTERFACE_IMPLEMENTADA = eINSTANCE.getClass_declaration_InterfaceImplementada();

    /**
     * The meta object literal for the '<em><b>Interfaces Implementadas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS = eINSTANCE.getClass_declaration_InterfacesImplementadas();

    /**
     * The meta object literal for the '<em><b>Fields Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__FIELDS_DECLARATION = eINSTANCE.getClass_declaration_FieldsDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Field_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getField_declaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getField_declaration();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECLARATION__COMMENT = eINSTANCE.getField_declaration_Comment();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__VARIABLE_DECLARATION = eINSTANCE.getField_declaration_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Contructor Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__CONTRUCTOR_NAME = eINSTANCE.getField_declaration_ContructorName();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__METHOD_NAME = eINSTANCE.getField_declaration_MethodName();

    /**
     * The meta object literal for the '<em><b>Staticinitializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__STATICINITIALIZER = eINSTANCE.getField_declaration_Staticinitializer();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Method_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getMethod_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Method</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__MODIFIERS_METHOD = eINSTANCE.getMethod_declaration_ModifiersMethod();

    /**
     * The meta object literal for the '<em><b>Type Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__TYPE_METHOD = eINSTANCE.getMethod_declaration_TypeMethod();

    /**
     * The meta object literal for the '<em><b>Name Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__NAME_METHOD = eINSTANCE.getMethod_declaration_NameMethod();

    /**
     * The meta object literal for the '<em><b>Parameter List Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMETER_LIST_METHOD = eINSTANCE.getMethod_declaration_ParameterListMethod();

    /**
     * The meta object literal for the '<em><b>Statement Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__STATEMENT_METHOD = eINSTANCE.getMethod_declaration_StatementMethod();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__DEBUG = eINSTANCE.getMethod_declaration_Debug();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructor_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Constructor</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_ModifiersConstructor();

    /**
     * The meta object literal for the '<em><b>Name Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_NameConstructor();

    /**
     * The meta object literal for the '<em><b>Parameter List Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_ParameterListConstructor();

    /**
     * The meta object literal for the '<em><b>Statement Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_StatementConstructor();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Parameter_listImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getParameter_list()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameter_list();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETER = eINSTANCE.getParameter_list_Parameter();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameter_list_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.ParameterImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Variable_declarationImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariable_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Variable</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__MODIFIERS_VARIABLE = eINSTANCE.getVariable_declaration_ModifiersVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariable_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Name Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__NAME_VARIABLE = eINSTANCE.getVariable_declaration_NameVariable();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__NAMES = eINSTANCE.getVariable_declaration_Names();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Variable_declaratorImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getVariable_declarator();

    /**
     * The meta object literal for the '<em><b>Name Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATOR__NAME_VARIABLE = eINSTANCE.getVariable_declarator_NameVariable();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.TypeImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type Specifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE_SPECIFIER = eINSTANCE.getType_TypeSpecifier();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Static_initializerImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
     * @generated
     */
    EClass STATIC_INITIALIZER = eINSTANCE.getStatic_initializer();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_INITIALIZER__STATIC = eINSTANCE.getStatic_initializer_Static();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_INITIALIZER__NAME = eINSTANCE.getStatic_initializer_Name();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Statement_blockImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatement_block()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatement_block();

    /**
     * The meta object literal for the '<em><b>Statments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STATMENTS = eINSTANCE.getStatement_block_Statments();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.StatementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VARIABLE_DECLARATION = eINSTANCE.getStatement_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IF_STATEMENT = eINSTANCE.getStatement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Do Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DO_STATEMENT = eINSTANCE.getStatement_DoStatement();

    /**
     * The meta object literal for the '<em><b>While Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__WHILE_STATEMENT = eINSTANCE.getStatement_WhileStatement();

    /**
     * The meta object literal for the '<em><b>For Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FOR_STATEMENT = eINSTANCE.getStatement_ForStatement();

    /**
     * The meta object literal for the '<em><b>Try Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__TRY_STATEMENT = eINSTANCE.getStatement_TryStatement();

    /**
     * The meta object literal for the '<em><b>Name Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME_STATEMENT = eINSTANCE.getStatement_NameStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT = eINSTANCE.getStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Sync Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SYNC_STATEMENT = eINSTANCE.getStatement_SyncStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ELSE_STATEMENT = eINSTANCE.getStatement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.For_StatementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getFor_Statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getFor_Statement();

    /**
     * The meta object literal for the '<em><b>Statement In For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT_IN_FOR = eINSTANCE.getFor_Statement_StatementInFor();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.While_StatementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhile_Statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getWhile_Statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Do_StatementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getDo_Statement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDo_Statement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__STATEMENT = eINSTANCE.getDo_Statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.If_statementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getIf_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIf_statement();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Try_statementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getTry_statement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.getTry_statement();

    /**
     * The meta object literal for the '<em><b>Try Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__TRY_STATEMENT = eINSTANCE.getTry_statement_TryStatement();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMETERS = eINSTANCE.getTry_statement_Parameters();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__STATEMENT = eINSTANCE.getTry_statement_Statement();

    /**
     * The meta object literal for the '<em><b>Statement Finally</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__STATEMENT_FINALLY = eINSTANCE.getTry_statement_StatementFinally();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Import_statementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getImport_statement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImport_statement();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__CLASS_NAME = eINSTANCE.getImport_statement_ClassName();

    /**
     * The meta object literal for the '<em><b>Pac Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__PAC_NAME = eINSTANCE.getImport_statement_PacName();

    /**
     * The meta object literal for the '{@link org.xtext.compilador.java.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilador.java.myDsl.impl.Package_statementImpl
     * @see org.xtext.compilador.java.myDsl.impl.MyDslPackageImpl#getPackage_statement()
     * @generated
     */
    EClass PACKAGE_STATEMENT = eINSTANCE.getPackage_statement();

    /**
     * The meta object literal for the '<em><b>Pac Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_STATEMENT__PAC_NAME = eINSTANCE.getPackage_statement_PacName();

  }

} //MyDslPackage
