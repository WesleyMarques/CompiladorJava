/**
 */
package org.xtext.example.mydsl.myDsl;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
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
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

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
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_declaration()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
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
   * The feature id for the '<em><b>Fields Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__FIELDS_DECLARATION = 4;

  /**
   * The number of structural features of the '<em>Interface declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_declaration()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField_declaration()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
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
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__LPAREN = 3;

  /**
   * The feature id for the '<em><b>Parameter List Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMETER_LIST_METHOD = 4;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__RPARENT = 5;

  /**
   * The feature id for the '<em><b>Statement Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__STATEMENT_METHOD = 6;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__DEBUG = 7;

  /**
   * The number of structural features of the '<em>Method declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
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
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__LPAREN = 2;

  /**
   * The feature id for the '<em><b>Parameter List Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = 3;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__RPARENT = 4;

  /**
   * The feature id for the '<em><b>Statement Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = 5;

  /**
   * The number of structural features of the '<em>Constructor declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter_list()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Modifiers Variable</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__MODIFIERS_VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME_VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAMES = 3;

  /**
   * The number of structural features of the '<em>Variable declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
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
   * The feature id for the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__VARI = 1;

  /**
   * The number of structural features of the '<em>Variable declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl <em>Variable initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_initializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 12;

  /**
   * The number of structural features of the '<em>Variable initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl <em>Array initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_initializer()
   * @generated
   */
  int ARRAY_INITIALIZER = 13;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__EXPRESSION = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variableinitializer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__VARIABLEINITIALIZER = VARIABLE_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 14;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
   * @generated
   */
  int STATIC_INITIALIZER = 15;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Expression Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__G = 2;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IF_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DO_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SWITCH_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RPARENT = 9;

  /**
   * The feature id for the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SYNC_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TRY_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 14;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement_block()
   * @generated
   */
  int STATEMENT_BLOCK = 16;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__VARIABLE_DECLARATION = STATEMENT__VARIABLE_DECLARATION;

  /**
   * The feature id for the '<em><b>Expression Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__EXPRESSION_STATEMENT = STATEMENT__EXPRESSION_STATEMENT;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__G = STATEMENT__G;

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
   * The feature id for the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__SWITCH_STATEMENT = STATEMENT__SWITCH_STATEMENT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__EXPRESSION = STATEMENT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__RPARENT = STATEMENT__RPARENT;

  /**
   * The feature id for the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__SYNC_STATEMENT = STATEMENT__SYNC_STATEMENT;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__NAME = STATEMENT__NAME;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_Statement()
   * @generated
   */
  int FOR_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__LPARENT = 0;

  /**
   * The feature id for the '<em><b>For Control</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_CONTROL = 1;

  /**
   * The feature id for the '<em><b>RParent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__RPARENT = 2;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_controlImpl <em>For control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_controlImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_control()
   * @generated
   */
  int FOR_CONTROL = 19;

  /**
   * The feature id for the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__FORINIT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Forupdate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__FORUPDATE = 2;

  /**
   * The number of structural features of the '<em>For control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_valueImpl <em>Variable value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_valueImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_value()
   * @generated
   */
  int VARIABLE_VALUE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Primitive_typeImpl <em>Primitive type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Primitive_typeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitive_type()
   * @generated
   */
  int PRIMITIVE_TYPE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Primitive type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_initImpl <em>For init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_initImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_init()
   * @generated
   */
  int FOR_INIT = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT__VAR = 1;

  /**
   * The feature id for the '<em><b>Var init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT__VAR_INIT = 2;

  /**
   * The number of structural features of the '<em>For init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_expressionImpl <em>For expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_expression()
   * @generated
   */
  int FOR_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Variable1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__VARIABLE1 = 0;

  /**
   * The feature id for the '<em><b>Exp Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__EXP_OP = 1;

  /**
   * The feature id for the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION__LIMIT = 2;

  /**
   * The number of structural features of the '<em>For expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_updateImpl <em>For update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_updateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_update()
   * @generated
   */
  int FOR_UPDATE = 25;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Update Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE__UPDATE_OP = 1;

  /**
   * The number of structural features of the '<em>For update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_update_operatorImpl <em>For update operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_update_operatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_update_operator()
   * @generated
   */
  int FOR_UPDATE_OPERATOR = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE_OPERATOR__NAME = 0;

  /**
   * The number of structural features of the '<em>For update operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_expression_operatorImpl <em>For expression operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_expression_operatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_expression_operator()
   * @generated
   */
  int FOR_EXPRESSION_OPERATOR = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION_OPERATOR__NAME = 0;

  /**
   * The number of structural features of the '<em>For expression operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPRESSION_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Parens_expressionImpl <em>Parens expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Parens_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParens_expression()
   * @generated
   */
  int PARENS_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENS_EXPRESSION__LPARENT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENS_EXPRESSION__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENS_EXPRESSION__RPARENT = 2;

  /**
   * The number of structural features of the '<em>Parens expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENS_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Expression_listImpl <em>Expression list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Expression_listImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression_list()
   * @generated
   */
  int EXPRESSION_LIST = 29;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSION1 = 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSION2 = 1;

  /**
   * The number of structural features of the '<em>Expression list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 30;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl <em>Conditional expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_expression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Assignmentoperator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Conditionalorexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION1 = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION2 = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Conditional expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_OR_expressionImpl <em>Conditional OR expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Conditional_OR_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_OR_expression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Conditionalandexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Conditional OR expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_AND_expressionImpl <em>Conditional AND expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Conditional_AND_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_AND_expression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Inclusiveorexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Conditional AND expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Inclusive_OR_expressionImpl <em>Inclusive OR expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Inclusive_OR_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInclusive_OR_expression()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Exclusiveorexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Inclusive OR expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Exclusive_OR_expressionImpl <em>Exclusive OR expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Exclusive_OR_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExclusive_OR_expression()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Andexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Exclusive OR expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AND_expressionImpl <em>AND expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AND_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAND_expression()
   * @generated
   */
  int AND_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Equalityexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__EQUALITYEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>AND expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Equality_expressionImpl <em>Equality expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Equality_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEquality_expression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Instanceofexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Equality expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InstanceOf_expressionImpl <em>Instance Of expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InstanceOf_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInstanceOf_expression()
   * @generated
   */
  int INSTANCE_OF_EXPRESSION = 38;

  /**
   * The number of structural features of the '<em>Instance Of expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl <em>Relational expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRelational_expression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__TYPE = INSTANCE_OF_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shiftexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__SHIFTEXPRESSION = INSTANCE_OF_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Relationalop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RELATIONALOP = INSTANCE_OF_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relational expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = INSTANCE_OF_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl <em>Shift expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getShift_expression()
   * @generated
   */
  int SHIFT_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Additiveexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__ADDITIVEEXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Shiftop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__SHIFTOP = 1;

  /**
   * The number of structural features of the '<em>Shift expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Additive_expressionImpl <em>Additive expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Additive_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdditive_expression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Multiplicativeexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Additive expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Multiplicative_expressionImpl <em>Multiplicative expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Multiplicative_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMultiplicative_expression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Unaryexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Multiplicative expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Unary_expressionImpl <em>Unary expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Unary_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnary_expression()
   * @generated
   */
  int UNARY_EXPRESSION = 43;

  /**
   * The number of structural features of the '<em>Unary expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl <em>Unary expression Not Plus Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnary_expression_Not_Plus_Minus()
   * @generated
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS = 44;

  /**
   * The feature id for the '<em><b>Unaryexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Castexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY = UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR = UNARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Unary expression Not Plus Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl <em>Cast expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCast_expression()
   * @generated
   */
  int CAST_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__LPARENT = 0;

  /**
   * The feature id for the '<em><b>Primitivetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__PRIMITIVETYPE = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__RPARENT = 2;

  /**
   * The feature id for the '<em><b>Unaryexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__UNARYEXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Unaryexpressionnotplusminus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS = 6;

  /**
   * The number of structural features of the '<em>Cast expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl <em>Primary expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimary_expression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PAREXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Identifiersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__IDENTIFIERSUFFIX = 2;

  /**
   * The feature id for the '<em><b>Supersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__SUPERSUFFIX = 3;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__LITERAL = 4;

  /**
   * The feature id for the '<em><b>Creator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__CREATOR = 5;

  /**
   * The feature id for the '<em><b>Primitivetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PRIMITIVETYPE = 6;

  /**
   * The number of structural features of the '<em>Primary expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl <em>Identifier suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIdentifier_suffix()
   * @generated
   */
  int IDENTIFIER_SUFFIX = 47;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX__ARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Explicitgenericinvocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION = 1;

  /**
   * The feature id for the '<em><b>Innercreator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX__INNERCREATOR = 2;

  /**
   * The number of structural features of the '<em>Identifier suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CreatorImpl <em>Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CreatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreator()
   * @generated
   */
  int CREATOR = 48;

  /**
   * The feature id for the '<em><b>Classcreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__CLASSCREATORREST = 0;

  /**
   * The number of structural features of the '<em>Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Created_nameImpl <em>Created name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Created_nameImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreated_name()
   * @generated
   */
  int CREATED_NAME = 49;

  /**
   * The feature id for the '<em><b>Classcreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATED_NAME__CLASSCREATORREST = CREATOR__CLASSCREATORREST;

  /**
   * The feature id for the '<em><b>Arraycreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATED_NAME__ARRAYCREATORREST = CREATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classorinterfacetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATED_NAME__CLASSORINTERFACETYPE = CREATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Primitivetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATED_NAME__PRIMITIVETYPE = CREATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Created name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATED_NAME_FEATURE_COUNT = CREATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl <em>Inner creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInner_creator()
   * @generated
   */
  int INNER_CREATOR = 50;

  /**
   * The feature id for the '<em><b>Nonwildcardtypearguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR__NONWILDCARDTYPEARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR__IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Classcreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR__CLASSCREATORREST = 2;

  /**
   * The number of structural features of the '<em>Inner creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_CREATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_creator_restImpl <em>Array creator rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Array_creator_restImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_creator_rest()
   * @generated
   */
  int ARRAY_CREATOR_REST = 51;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR_REST__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Array creator rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CREATOR_REST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl <em>Class creator rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_creator_rest()
   * @generated
   */
  int CLASS_CREATOR_REST = 52;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR_REST__ARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Classbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR_REST__CLASSBODY = 1;

  /**
   * The number of structural features of the '<em>Class creator rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_CREATOR_REST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl <em>Explicit generic invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExplicit_generic_invocation()
   * @generated
   */
  int EXPLICIT_GENERIC_INVOCATION = 53;

  /**
   * The feature id for the '<em><b>Nonwildcardtypearguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_GENERIC_INVOCATION__IDENTIFIER = 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_GENERIC_INVOCATION__ARGUMENTS = 2;

  /**
   * The number of structural features of the '<em>Explicit generic invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_GENERIC_INVOCATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl <em>Non wildcard type arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNon_wildcard_type_arguments()
   * @generated
   */
  int NON_WILDCARD_TYPE_ARGUMENTS = 54;

  /**
   * The feature id for the '<em><b>Classcreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_WILDCARD_TYPE_ARGUMENTS__CLASSCREATORREST = CREATOR__CLASSCREATORREST;

  /**
   * The feature id for the '<em><b>Createdname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME = CREATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_WILDCARD_TYPE_ARGUMENTS__TYPE = CREATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Non wildcard type arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_WILDCARD_TYPE_ARGUMENTS_FEATURE_COUNT = CREATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SelectorImpl <em>Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SelectorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSelector()
   * @generated
   */
  int SELECTOR = 55;

  /**
   * The feature id for the '<em><b>Supersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SUPERSUFFIX = 0;

  /**
   * The feature id for the '<em><b>Innercreator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__INNERCREATOR = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Super_suffixImpl <em>Super suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Super_suffixImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSuper_suffix()
   * @generated
   */
  int SUPER_SUFFIX = 56;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_SUFFIX__ARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_SUFFIX__IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>Super suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_SUFFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ArgumentsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 57;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__LPARENT = 0;

  /**
   * The feature id for the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPRESSIONLIST = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__RPARENT = 2;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl <em>Switch statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSwitch_statement()
   * @generated
   */
  int SWITCH_STATEMENT = 58;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__LPAREN = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__RPARENT = 2;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION2 = 3;

  /**
   * The feature id for the '<em><b>Switch Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_STATEMENTS = 4;

  /**
   * The number of structural features of the '<em>Switch statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.While_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
   * @generated
   */
  int WHILE_STATEMENT = 59;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__RPARENT = 1;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__WHILE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDo_Statement()
   * @generated
   */
  int DO_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__DO_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__LPARENT = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__RPARENT = 2;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.If_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf_statement()
   * @generated
   */
  int IF_STATEMENT = 61;

  /**
   * The feature id for the '<em><b>Lparen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__LPAREN = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__RPARENT = 2;

  /**
   * The feature id for the '<em><b>Id Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ID_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>If statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Try_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTry_statement()
   * @generated
   */
  int TRY_STATEMENT = 62;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__TRY_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__LPAREN = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__RPARENT = 3;

  /**
   * The feature id for the '<em><b>Catch Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__CATCH_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Finally Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Try statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Import_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport_statement()
   * @generated
   */
  int IMPORT_STATEMENT = 63;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Package_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage_statement()
   * @generated
   */
  int PACKAGE_STATEMENT = 64;

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Compilation_unit <em>Compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation unit</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit
   * @generated
   */
  EClass getCompilation_unit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getName()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getImports()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getTypeDeclarations <em>Type Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getTypeDeclarations()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_TypeDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration
   * @generated
   */
  EClass getType_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getComment()
   * @see #getType_declaration()
   * @generated
   */
  EAttribute getType_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec <em>Class Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Dec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_ClassDec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec <em>Interface Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Dec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_InterfaceDec();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Interface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration
   * @generated
   */
  EClass getInterface_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getModifiers()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceName()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceHerdada <em>Interface Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Herdada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceHerdada()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceHerdada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfacesHerdadas <em>Interfaces Herdadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Herdadas</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfacesHerdadas()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfacesHerdadas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getFieldsDeclaration <em>Fields Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getFieldsDeclaration()
   * @see #getInterface_declaration()
   * @generated
   */
  EReference getInterface_declaration_FieldsDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Class_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration
   * @generated
   */
  EClass getClass_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getModifiers()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getClassName()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada <em>Class Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Herdada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassHerdada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada <em>Interface Implementada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Implementada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfaceImplementada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfacesImplementadas <em>Interfaces Implementadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Implementadas</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getInterfacesImplementadas()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfacesImplementadas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getFieldsDeclaration <em>Fields Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getFieldsDeclaration()
   * @see #getClass_declaration()
   * @generated
   */
  EReference getClass_declaration_FieldsDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Field_declaration <em>Field declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration
   * @generated
   */
  EClass getField_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getComment()
   * @see #getField_declaration()
   * @generated
   */
  EAttribute getField_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName <em>Contructor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contructor Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_ContructorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer <em>Staticinitializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Staticinitializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_Staticinitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Method_declaration <em>Method declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration
   * @generated
   */
  EClass getMethod_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getModifiersMethod <em>Modifiers Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getModifiersMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_ModifiersMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod <em>Type Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_TypeMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod <em>Name Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_NameMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getLParen()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod <em>Parameter List Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_ParameterListMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getRparent()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod <em>Statement Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_StatementMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getDebug()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_Debug();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration <em>Constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration
   * @generated
   */
  EClass getConstructor_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getModifiersConstructor <em>Modifiers Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getModifiersConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_ModifiersConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor <em>Name Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_NameConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor <em>Parameter List Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_ParameterListConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor <em>Statement Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_StatementConstructor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter_list <em>Parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter list</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list
   * @generated
   */
  EClass getParameter_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter_list#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list#getParameter()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list#getParameters()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parameter#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getParameterName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration
   * @generated
   */
  EClass getVariable_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getModifiersVariable <em>Modifiers Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getModifiersVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EAttribute getVariable_declaration_ModifiersVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getType()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_NameVariable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getNames()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Names();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declarator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator
   * @generated
   */
  EClass getVariable_declarator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable()
   * @see #getVariable_declarator()
   * @generated
   */
  EAttribute getVariable_declarator_NameVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vari</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator#getVari()
   * @see #getVariable_declarator()
   * @generated
   */
  EReference getVariable_declarator_Vari();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_initializer
   * @generated
   */
  EClass getVariable_initializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Array_initializer <em>Array initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_initializer
   * @generated
   */
  EClass getArray_initializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Array_initializer#getVariableinitializer <em>Variableinitializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variableinitializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_initializer#getVariableinitializer()
   * @see #getArray_initializer()
   * @generated
   */
  EReference getArray_initializer_Variableinitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier()
   * @see #getType()
   * @generated
   */
  EAttribute getType_TypeSpecifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Static_initializer <em>Static initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer
   * @generated
   */
  EClass getStatic_initializer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Static_initializer#getStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer#getStatic()
   * @see #getStatic_initializer()
   * @generated
   */
  EAttribute getStatic_initializer_Static();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Static_initializer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer#getName()
   * @see #getStatic_initializer()
   * @generated
   */
  EReference getStatic_initializer_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Statement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement block</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block
   * @generated
   */
  EClass getStatement_block();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Statement_block#getStatments <em>Statments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block#getStatments()
   * @see #getStatement_block()
   * @generated
   */
  EReference getStatement_block_Statments();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Statement#getExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getExpressionStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ExpressionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getG()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_G();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getIfStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getDoStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_DoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getWhileStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_WhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getForStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_SwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getRparent()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getSyncStatement <em>Sync Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sync Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getSyncStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_SyncStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getTryStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_TryStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getNameStatement <em>Name Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getNameStatement()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_NameStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_Statement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement
   * @generated
   */
  EClass getFor_Statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.For_Statement#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getLparent()
   * @see #getFor_Statement()
   * @generated
   */
  EAttribute getFor_Statement_Lparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Control</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getForControl()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_ForControl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.For_Statement#getRParent <em>RParent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>RParent</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getRParent()
   * @see #getFor_Statement()
   * @generated
   */
  EAttribute getFor_Statement_RParent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getForStatement()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_ForStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_control <em>For control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For control</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_control
   * @generated
   */
  EClass getFor_control();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_control#getForinit <em>Forinit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinit</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_control#getForinit()
   * @see #getFor_control()
   * @generated
   */
  EReference getFor_control_Forinit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_control#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_control#getExpression()
   * @see #getFor_control()
   * @generated
   */
  EReference getFor_control_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_control#getForupdate <em>Forupdate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forupdate</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_control#getForupdate()
   * @see #getFor_control()
   * @generated
   */
  EReference getFor_control_Forupdate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_value <em>Variable value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable value</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_value
   * @generated
   */
  EClass getVariable_value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable_value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_value#getName()
   * @see #getVariable_value()
   * @generated
   */
  EAttribute getVariable_value_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Primitive_type <em>Primitive type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primitive_type
   * @generated
   */
  EClass getPrimitive_type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Primitive_type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primitive_type#getName()
   * @see #getPrimitive_type()
   * @generated
   */
  EAttribute getPrimitive_type_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_init <em>For init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For init</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_init
   * @generated
   */
  EClass getFor_init();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_init#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_init#getType()
   * @see #getFor_init()
   * @generated
   */
  EReference getFor_init_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_init#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_init#getVar()
   * @see #getFor_init()
   * @generated
   */
  EReference getFor_init_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_init#getVar_init <em>Var init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var init</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_init#getVar_init()
   * @see #getFor_init()
   * @generated
   */
  EReference getFor_init_Var_init();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_expression <em>For expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression
   * @generated
   */
  EClass getFor_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_expression#getVariable1 <em>Variable1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable1</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression#getVariable1()
   * @see #getFor_expression()
   * @generated
   */
  EReference getFor_expression_Variable1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_expression#getExpOp <em>Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression#getExpOp()
   * @see #getFor_expression()
   * @generated
   */
  EReference getFor_expression_ExpOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_expression#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression#getLimit()
   * @see #getFor_expression()
   * @generated
   */
  EReference getFor_expression_Limit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_update <em>For update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For update</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_update
   * @generated
   */
  EClass getFor_update();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_update#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_update#getVariable()
   * @see #getFor_update()
   * @generated
   */
  EReference getFor_update_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_update#getUpdateOp <em>Update Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_update#getUpdateOp()
   * @see #getFor_update()
   * @generated
   */
  EReference getFor_update_UpdateOp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_update_operator <em>For update operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For update operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_update_operator
   * @generated
   */
  EClass getFor_update_operator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.For_update_operator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_update_operator#getName()
   * @see #getFor_update_operator()
   * @generated
   */
  EAttribute getFor_update_operator_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_expression_operator <em>For expression operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For expression operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression_operator
   * @generated
   */
  EClass getFor_expression_operator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.For_expression_operator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_expression_operator#getName()
   * @see #getFor_expression_operator()
   * @generated
   */
  EAttribute getFor_expression_operator_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parens_expression <em>Parens expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parens expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parens_expression
   * @generated
   */
  EClass getParens_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parens_expression#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parens_expression#getLparent()
   * @see #getParens_expression()
   * @generated
   */
  EAttribute getParens_expression_Lparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parens_expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parens_expression#getExpression()
   * @see #getParens_expression()
   * @generated
   */
  EReference getParens_expression_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parens_expression#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parens_expression#getRparent()
   * @see #getParens_expression()
   * @generated
   */
  EAttribute getParens_expression_Rparent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression_list <em>Expression list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression list</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_list
   * @generated
   */
  EClass getExpression_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_list#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_list#getExpression1()
   * @see #getExpression_list()
   * @generated
   */
  EReference getExpression_list_Expression1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Expression_list#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_list#getExpression2()
   * @see #getExpression_list()
   * @generated
   */
  EReference getExpression_list_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Conditional_expression <em>Conditional expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression
   * @generated
   */
  EClass getConditional_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getAssignmentoperator <em>Assignmentoperator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignmentoperator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression#getAssignmentoperator()
   * @see #getConditional_expression()
   * @generated
   */
  EAttribute getConditional_expression_Assignmentoperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression()
   * @see #getConditional_expression()
   * @generated
   */
  EReference getConditional_expression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getConditionalorexpression <em>Conditionalorexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditionalorexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression#getConditionalorexpression()
   * @see #getConditional_expression()
   * @generated
   */
  EReference getConditional_expression_Conditionalorexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression1()
   * @see #getConditional_expression()
   * @generated
   */
  EReference getConditional_expression_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression2()
   * @see #getConditional_expression()
   * @generated
   */
  EReference getConditional_expression_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Conditional_OR_expression <em>Conditional OR expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional OR expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_OR_expression
   * @generated
   */
  EClass getConditional_OR_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Conditional_OR_expression#getConditionalandexpression <em>Conditionalandexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditionalandexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_OR_expression#getConditionalandexpression()
   * @see #getConditional_OR_expression()
   * @generated
   */
  EReference getConditional_OR_expression_Conditionalandexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Conditional_AND_expression <em>Conditional AND expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional AND expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_AND_expression
   * @generated
   */
  EClass getConditional_AND_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Conditional_AND_expression#getInclusiveorexpression <em>Inclusiveorexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inclusiveorexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Conditional_AND_expression#getInclusiveorexpression()
   * @see #getConditional_AND_expression()
   * @generated
   */
  EReference getConditional_AND_expression_Inclusiveorexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Inclusive_OR_expression <em>Inclusive OR expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive OR expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inclusive_OR_expression
   * @generated
   */
  EClass getInclusive_OR_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Inclusive_OR_expression#getExclusiveorexpression <em>Exclusiveorexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exclusiveorexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inclusive_OR_expression#getExclusiveorexpression()
   * @see #getInclusive_OR_expression()
   * @generated
   */
  EReference getInclusive_OR_expression_Exclusiveorexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Exclusive_OR_expression <em>Exclusive OR expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive OR expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exclusive_OR_expression
   * @generated
   */
  EClass getExclusive_OR_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Exclusive_OR_expression#getAndexpression <em>Andexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Andexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exclusive_OR_expression#getAndexpression()
   * @see #getExclusive_OR_expression()
   * @generated
   */
  EReference getExclusive_OR_expression_Andexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AND_expression <em>AND expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AND expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.AND_expression
   * @generated
   */
  EClass getAND_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.AND_expression#getEqualityexpression <em>Equalityexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equalityexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.AND_expression#getEqualityexpression()
   * @see #getAND_expression()
   * @generated
   */
  EReference getAND_expression_Equalityexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Equality_expression <em>Equality expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Equality_expression
   * @generated
   */
  EClass getEquality_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Equality_expression#getInstanceofexpression <em>Instanceofexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instanceofexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Equality_expression#getInstanceofexpression()
   * @see #getEquality_expression()
   * @generated
   */
  EReference getEquality_expression_Instanceofexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.InstanceOf_expression <em>Instance Of expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.InstanceOf_expression
   * @generated
   */
  EClass getInstanceOf_expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Relational_expression <em>Relational expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Relational_expression
   * @generated
   */
  EClass getRelational_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Relational_expression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Relational_expression#getType()
   * @see #getRelational_expression()
   * @generated
   */
  EReference getRelational_expression_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Relational_expression#getShiftexpression <em>Shiftexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shiftexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Relational_expression#getShiftexpression()
   * @see #getRelational_expression()
   * @generated
   */
  EReference getRelational_expression_Shiftexpression();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Relational_expression#getRelationalop <em>Relationalop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Relationalop</em>'.
   * @see org.xtext.example.mydsl.myDsl.Relational_expression#getRelationalop()
   * @see #getRelational_expression()
   * @generated
   */
  EAttribute getRelational_expression_Relationalop();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Shift_expression <em>Shift expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Shift_expression
   * @generated
   */
  EClass getShift_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Shift_expression#getAdditiveexpression <em>Additiveexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additiveexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Shift_expression#getAdditiveexpression()
   * @see #getShift_expression()
   * @generated
   */
  EReference getShift_expression_Additiveexpression();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Shift_expression#getShiftop <em>Shiftop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Shiftop</em>'.
   * @see org.xtext.example.mydsl.myDsl.Shift_expression#getShiftop()
   * @see #getShift_expression()
   * @generated
   */
  EAttribute getShift_expression_Shiftop();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Additive_expression <em>Additive expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Additive_expression
   * @generated
   */
  EClass getAdditive_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Additive_expression#getMultiplicativeexpression <em>Multiplicativeexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiplicativeexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Additive_expression#getMultiplicativeexpression()
   * @see #getAdditive_expression()
   * @generated
   */
  EReference getAdditive_expression_Multiplicativeexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Multiplicative_expression <em>Multiplicative expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Multiplicative_expression
   * @generated
   */
  EClass getMultiplicative_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Multiplicative_expression#getUnaryexpression <em>Unaryexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unaryexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Multiplicative_expression#getUnaryexpression()
   * @see #getMultiplicative_expression()
   * @generated
   */
  EReference getMultiplicative_expression_Unaryexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Unary_expression <em>Unary expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression
   * @generated
   */
  EClass getUnary_expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus <em>Unary expression Not Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary expression Not Plus Minus</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus
   * @generated
   */
  EClass getUnary_expression_Not_Plus_Minus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getUnaryexpression <em>Unaryexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unaryexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getUnaryexpression()
   * @see #getUnary_expression_Not_Plus_Minus()
   * @generated
   */
  EReference getUnary_expression_Not_Plus_Minus_Unaryexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getCastexpression <em>Castexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Castexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getCastexpression()
   * @see #getUnary_expression_Not_Plus_Minus()
   * @generated
   */
  EReference getUnary_expression_Not_Plus_Minus_Castexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getPrimary()
   * @see #getUnary_expression_Not_Plus_Minus()
   * @generated
   */
  EReference getUnary_expression_Not_Plus_Minus_Primary();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selector</em>'.
   * @see org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getSelector()
   * @see #getUnary_expression_Not_Plus_Minus()
   * @generated
   */
  EReference getUnary_expression_Not_Plus_Minus_Selector();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Cast_expression <em>Cast expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression
   * @generated
   */
  EClass getCast_expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getLparent()
   * @see #getCast_expression()
   * @generated
   */
  EAttribute getCast_expression_Lparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getPrimitivetype <em>Primitivetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitivetype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getPrimitivetype()
   * @see #getCast_expression()
   * @generated
   */
  EReference getCast_expression_Primitivetype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getRparent()
   * @see #getCast_expression()
   * @generated
   */
  EAttribute getCast_expression_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpression <em>Unaryexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unaryexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpression()
   * @see #getCast_expression()
   * @generated
   */
  EReference getCast_expression_Unaryexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getType()
   * @see #getCast_expression()
   * @generated
   */
  EReference getCast_expression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getExpression()
   * @see #getCast_expression()
   * @generated
   */
  EReference getCast_expression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpressionnotplusminus <em>Unaryexpressionnotplusminus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unaryexpressionnotplusminus</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpressionnotplusminus()
   * @see #getCast_expression()
   * @generated
   */
  EReference getCast_expression_Unaryexpressionnotplusminus();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Primary_expression <em>Primary expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression
   * @generated
   */
  EClass getPrimary_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getParexpression <em>Parexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parexpression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getParexpression()
   * @see #getPrimary_expression()
   * @generated
   */
  EReference getPrimary_expression_Parexpression();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Identifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifier()
   * @see #getPrimary_expression()
   * @generated
   */
  EAttribute getPrimary_expression_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifiersuffix <em>Identifiersuffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiersuffix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifiersuffix()
   * @see #getPrimary_expression()
   * @generated
   */
  EReference getPrimary_expression_Identifiersuffix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getSupersuffix <em>Supersuffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supersuffix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getSupersuffix()
   * @see #getPrimary_expression()
   * @generated
   */
  EReference getPrimary_expression_Supersuffix();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getLiteral()
   * @see #getPrimary_expression()
   * @generated
   */
  EAttribute getPrimary_expression_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getCreator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Creator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getCreator()
   * @see #getPrimary_expression()
   * @generated
   */
  EReference getPrimary_expression_Creator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getPrimitivetype <em>Primitivetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitivetype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Primary_expression#getPrimitivetype()
   * @see #getPrimary_expression()
   * @generated
   */
  EReference getPrimary_expression_Primitivetype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix <em>Identifier suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier suffix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Identifier_suffix
   * @generated
   */
  EClass getIdentifier_suffix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Identifier_suffix#getArguments()
   * @see #getIdentifier_suffix()
   * @generated
   */
  EReference getIdentifier_suffix_Arguments();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getExplicitgenericinvocation <em>Explicitgenericinvocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Explicitgenericinvocation</em>'.
   * @see org.xtext.example.mydsl.myDsl.Identifier_suffix#getExplicitgenericinvocation()
   * @see #getIdentifier_suffix()
   * @generated
   */
  EReference getIdentifier_suffix_Explicitgenericinvocation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getInnercreator <em>Innercreator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Innercreator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Identifier_suffix#getInnercreator()
   * @see #getIdentifier_suffix()
   * @generated
   */
  EReference getIdentifier_suffix_Innercreator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creator
   * @generated
   */
  EClass getCreator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Creator#getClasscreatorrest <em>Classcreatorrest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classcreatorrest</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creator#getClasscreatorrest()
   * @see #getCreator()
   * @generated
   */
  EReference getCreator_Classcreatorrest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Created_name <em>Created name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Created name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Created_name
   * @generated
   */
  EClass getCreated_name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Created_name#getArraycreatorrest <em>Arraycreatorrest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arraycreatorrest</em>'.
   * @see org.xtext.example.mydsl.myDsl.Created_name#getArraycreatorrest()
   * @see #getCreated_name()
   * @generated
   */
  EReference getCreated_name_Arraycreatorrest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Created_name#getClassorinterfacetype <em>Classorinterfacetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classorinterfacetype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Created_name#getClassorinterfacetype()
   * @see #getCreated_name()
   * @generated
   */
  EReference getCreated_name_Classorinterfacetype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Created_name#getPrimitivetype <em>Primitivetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitivetype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Created_name#getPrimitivetype()
   * @see #getCreated_name()
   * @generated
   */
  EReference getCreated_name_Primitivetype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Inner_creator <em>Inner creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner creator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inner_creator
   * @generated
   */
  EClass getInner_creator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nonwildcardtypearguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inner_creator#getNonwildcardtypearguments()
   * @see #getInner_creator()
   * @generated
   */
  EReference getInner_creator_Nonwildcardtypearguments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inner_creator#getIdentifier()
   * @see #getInner_creator()
   * @generated
   */
  EAttribute getInner_creator_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getClasscreatorrest <em>Classcreatorrest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classcreatorrest</em>'.
   * @see org.xtext.example.mydsl.myDsl.Inner_creator#getClasscreatorrest()
   * @see #getInner_creator()
   * @generated
   */
  EReference getInner_creator_Classcreatorrest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Array_creator_rest <em>Array creator rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array creator rest</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_creator_rest
   * @generated
   */
  EClass getArray_creator_rest();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Array_creator_rest#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_creator_rest#getExpression()
   * @see #getArray_creator_rest()
   * @generated
   */
  EReference getArray_creator_rest_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Class_creator_rest <em>Class creator rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class creator rest</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_creator_rest
   * @generated
   */
  EClass getClass_creator_rest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_creator_rest#getArguments()
   * @see #getClass_creator_rest()
   * @generated
   */
  EReference getClass_creator_rest_Arguments();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getClassbody <em>Classbody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classbody</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_creator_rest#getClassbody()
   * @see #getClass_creator_rest()
   * @generated
   */
  EReference getClass_creator_rest_Classbody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Explicit_generic_invocation <em>Explicit generic invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit generic invocation</em>'.
   * @see org.xtext.example.mydsl.myDsl.Explicit_generic_invocation
   * @generated
   */
  EClass getExplicit_generic_invocation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nonwildcardtypearguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getNonwildcardtypearguments()
   * @see #getExplicit_generic_invocation()
   * @generated
   */
  EReference getExplicit_generic_invocation_Nonwildcardtypearguments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getIdentifier()
   * @see #getExplicit_generic_invocation()
   * @generated
   */
  EAttribute getExplicit_generic_invocation_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Explicit_generic_invocation#getArguments()
   * @see #getExplicit_generic_invocation()
   * @generated
   */
  EReference getExplicit_generic_invocation_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments <em>Non wildcard type arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non wildcard type arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments
   * @generated
   */
  EClass getNon_wildcard_type_arguments();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getCreatedname <em>Createdname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createdname</em>'.
   * @see org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getCreatedname()
   * @see #getNon_wildcard_type_arguments()
   * @generated
   */
  EReference getNon_wildcard_type_arguments_Createdname();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getType()
   * @see #getNon_wildcard_type_arguments()
   * @generated
   */
  EReference getNon_wildcard_type_arguments_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selector</em>'.
   * @see org.xtext.example.mydsl.myDsl.Selector
   * @generated
   */
  EClass getSelector();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Selector#getSupersuffix <em>Supersuffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supersuffix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Selector#getSupersuffix()
   * @see #getSelector()
   * @generated
   */
  EReference getSelector_Supersuffix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Selector#getInnercreator <em>Innercreator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Innercreator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Selector#getInnercreator()
   * @see #getSelector()
   * @generated
   */
  EReference getSelector_Innercreator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Selector#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Selector#getExpression()
   * @see #getSelector()
   * @generated
   */
  EReference getSelector_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Super_suffix <em>Super suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super suffix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Super_suffix
   * @generated
   */
  EClass getSuper_suffix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Super_suffix#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Super_suffix#getArguments()
   * @see #getSuper_suffix()
   * @generated
   */
  EReference getSuper_suffix_Arguments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Super_suffix#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Super_suffix#getIdentifier()
   * @see #getSuper_suffix()
   * @generated
   */
  EAttribute getSuper_suffix_Identifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Arguments#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arguments#getLparent()
   * @see #getArguments()
   * @generated
   */
  EAttribute getArguments_Lparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Arguments#getExpressionlist <em>Expressionlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressionlist</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arguments#getExpressionlist()
   * @see #getArguments()
   * @generated
   */
  EReference getArguments_Expressionlist();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Arguments#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arguments#getRparent()
   * @see #getArguments()
   * @generated
   */
  EAttribute getArguments_Rparent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Switch_statement <em>Switch statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement
   * @generated
   */
  EClass getSwitch_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getLParen()
   * @see #getSwitch_statement()
   * @generated
   */
  EAttribute getSwitch_statement_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getExpression()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getRparent()
   * @see #getSwitch_statement()
   * @generated
   */
  EAttribute getSwitch_statement_Rparent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getExpression2()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_Expression2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getSwitchStatements <em>Switch Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Statements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getSwitchStatements()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_SwitchStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.While_Statement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement
   * @generated
   */
  EClass getWhile_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While_Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getExpression()
   * @see #getWhile_Statement()
   * @generated
   */
  EReference getWhile_Statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.While_Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getRparent()
   * @see #getWhile_Statement()
   * @generated
   */
  EAttribute getWhile_Statement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While_Statement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getWhileStatement()
   * @see #getWhile_Statement()
   * @generated
   */
  EReference getWhile_Statement_WhileStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Do_Statement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement
   * @generated
   */
  EClass getDo_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement()
   * @see #getDo_Statement()
   * @generated
   */
  EReference getDo_Statement_DoStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getLparent()
   * @see #getDo_Statement()
   * @generated
   */
  EAttribute getDo_Statement_Lparent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getRparent()
   * @see #getDo_Statement()
   * @generated
   */
  EAttribute getDo_Statement_Rparent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.If_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement
   * @generated
   */
  EClass getIf_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.If_statement#getLparen <em>Lparen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparen</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getLparen()
   * @see #getIf_statement()
   * @generated
   */
  EAttribute getIf_statement_Lparen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getExpression()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.If_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getRparent()
   * @see #getIf_statement()
   * @generated
   */
  EAttribute getIf_statement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getIdStatement <em>Id Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getIdStatement()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_IdStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getElseStatement()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Try_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement
   * @generated
   */
  EClass getTry_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_TryStatement();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getLParen()
   * @see #getTry_statement()
   * @generated
   */
  EAttribute getTry_statement_LParen();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getParameters()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_Parameters();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getRparent()
   * @see #getTry_statement()
   * @generated
   */
  EAttribute getTry_statement_Rparent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getCatchStatement <em>Catch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getCatchStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_CatchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement <em>Finally Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_FinallyStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Import_statement <em>Import statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement
   * @generated
   */
  EClass getImport_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Import_statement#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement#getClassName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Import_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement#getPacName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_PacName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Package_statement <em>Package statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Package_statement
   * @generated
   */
  EClass getPackage_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Package_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Package_statement#getPacName()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_declaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
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
     * The meta object literal for the '<em><b>Fields Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__FIELDS_DECLARATION = eINSTANCE.getInterface_declaration_FieldsDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_declaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField_declaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
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
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__LPAREN = eINSTANCE.getMethod_declaration_LParen();

    /**
     * The meta object literal for the '<em><b>Parameter List Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMETER_LIST_METHOD = eINSTANCE.getMethod_declaration_ParameterListMethod();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__RPARENT = eINSTANCE.getMethod_declaration_Rparent();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
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
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__LPAREN = eINSTANCE.getConstructor_declaration_LParen();

    /**
     * The meta object literal for the '<em><b>Parameter List Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_ParameterListConstructor();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__RPARENT = eINSTANCE.getConstructor_declaration_Rparent();

    /**
     * The meta object literal for the '<em><b>Statement Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_StatementConstructor();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter_list()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
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
     * The meta object literal for the '<em><b>Vari</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__VARI = eINSTANCE.getVariable_declarator_Vari();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl <em>Variable initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_initializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getVariable_initializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl <em>Array initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_initializer()
     * @generated
     */
    EClass ARRAY_INITIALIZER = eINSTANCE.getArray_initializer();

    /**
     * The meta object literal for the '<em><b>Variableinitializer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__VARIABLEINITIALIZER = eINSTANCE.getArray_initializer_Variableinitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement_block()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
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
     * The meta object literal for the '<em><b>Expression Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION_STATEMENT = eINSTANCE.getStatement_ExpressionStatement();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__G = eINSTANCE.getStatement_G();

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
     * The meta object literal for the '<em><b>Switch Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SWITCH_STATEMENT = eINSTANCE.getStatement_SwitchStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION = eINSTANCE.getStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__RPARENT = eINSTANCE.getStatement_Rparent();

    /**
     * The meta object literal for the '<em><b>Sync Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SYNC_STATEMENT = eINSTANCE.getStatement_SyncStatement();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_Statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getFor_Statement();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__LPARENT = eINSTANCE.getFor_Statement_Lparent();

    /**
     * The meta object literal for the '<em><b>For Control</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_CONTROL = eINSTANCE.getFor_Statement_ForControl();

    /**
     * The meta object literal for the '<em><b>RParent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__RPARENT = eINSTANCE.getFor_Statement_RParent();

    /**
     * The meta object literal for the '<em><b>For Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_STATEMENT = eINSTANCE.getFor_Statement_ForStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_controlImpl <em>For control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_controlImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_control()
     * @generated
     */
    EClass FOR_CONTROL = eINSTANCE.getFor_control();

    /**
     * The meta object literal for the '<em><b>Forinit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__FORINIT = eINSTANCE.getFor_control_Forinit();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__EXPRESSION = eINSTANCE.getFor_control_Expression();

    /**
     * The meta object literal for the '<em><b>Forupdate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__FORUPDATE = eINSTANCE.getFor_control_Forupdate();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_valueImpl <em>Variable value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_valueImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_value()
     * @generated
     */
    EClass VARIABLE_VALUE = eINSTANCE.getVariable_value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_VALUE__NAME = eINSTANCE.getVariable_value_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Primitive_typeImpl <em>Primitive type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Primitive_typeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimitive_type()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitive_type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitive_type_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_initImpl <em>For init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_initImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_init()
     * @generated
     */
    EClass FOR_INIT = eINSTANCE.getFor_init();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT__TYPE = eINSTANCE.getFor_init_Type();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT__VAR = eINSTANCE.getFor_init_Var();

    /**
     * The meta object literal for the '<em><b>Var init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_INIT__VAR_INIT = eINSTANCE.getFor_init_Var_init();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_expressionImpl <em>For expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_expression()
     * @generated
     */
    EClass FOR_EXPRESSION = eINSTANCE.getFor_expression();

    /**
     * The meta object literal for the '<em><b>Variable1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__VARIABLE1 = eINSTANCE.getFor_expression_Variable1();

    /**
     * The meta object literal for the '<em><b>Exp Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__EXP_OP = eINSTANCE.getFor_expression_ExpOp();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPRESSION__LIMIT = eINSTANCE.getFor_expression_Limit();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_updateImpl <em>For update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_updateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_update()
     * @generated
     */
    EClass FOR_UPDATE = eINSTANCE.getFor_update();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_UPDATE__VARIABLE = eINSTANCE.getFor_update_Variable();

    /**
     * The meta object literal for the '<em><b>Update Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_UPDATE__UPDATE_OP = eINSTANCE.getFor_update_UpdateOp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_update_operatorImpl <em>For update operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_update_operatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_update_operator()
     * @generated
     */
    EClass FOR_UPDATE_OPERATOR = eINSTANCE.getFor_update_operator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_UPDATE_OPERATOR__NAME = eINSTANCE.getFor_update_operator_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_expression_operatorImpl <em>For expression operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_expression_operatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_expression_operator()
     * @generated
     */
    EClass FOR_EXPRESSION_OPERATOR = eINSTANCE.getFor_expression_operator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_EXPRESSION_OPERATOR__NAME = eINSTANCE.getFor_expression_operator_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Parens_expressionImpl <em>Parens expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Parens_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParens_expression()
     * @generated
     */
    EClass PARENS_EXPRESSION = eINSTANCE.getParens_expression();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARENS_EXPRESSION__LPARENT = eINSTANCE.getParens_expression_Lparent();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENS_EXPRESSION__EXPRESSION = eINSTANCE.getParens_expression_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARENS_EXPRESSION__RPARENT = eINSTANCE.getParens_expression_Rparent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Expression_listImpl <em>Expression list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Expression_listImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression_list()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpression_list();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSION1 = eINSTANCE.getExpression_list_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSION2 = eINSTANCE.getExpression_list_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl <em>Conditional expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_expression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditional_expression();

    /**
     * The meta object literal for the '<em><b>Assignmentoperator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR = eINSTANCE.getConditional_expression_Assignmentoperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION = eINSTANCE.getConditional_expression_Expression();

    /**
     * The meta object literal for the '<em><b>Conditionalorexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION = eINSTANCE.getConditional_expression_Conditionalorexpression();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION1 = eINSTANCE.getConditional_expression_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION2 = eINSTANCE.getConditional_expression_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_OR_expressionImpl <em>Conditional OR expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Conditional_OR_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_OR_expression()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditional_OR_expression();

    /**
     * The meta object literal for the '<em><b>Conditionalandexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION = eINSTANCE.getConditional_OR_expression_Conditionalandexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Conditional_AND_expressionImpl <em>Conditional AND expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Conditional_AND_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConditional_AND_expression()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditional_AND_expression();

    /**
     * The meta object literal for the '<em><b>Inclusiveorexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION = eINSTANCE.getConditional_AND_expression_Inclusiveorexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Inclusive_OR_expressionImpl <em>Inclusive OR expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Inclusive_OR_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInclusive_OR_expression()
     * @generated
     */
    EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusive_OR_expression();

    /**
     * The meta object literal for the '<em><b>Exclusiveorexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION = eINSTANCE.getInclusive_OR_expression_Exclusiveorexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Exclusive_OR_expressionImpl <em>Exclusive OR expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Exclusive_OR_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExclusive_OR_expression()
     * @generated
     */
    EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusive_OR_expression();

    /**
     * The meta object literal for the '<em><b>Andexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION = eINSTANCE.getExclusive_OR_expression_Andexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AND_expressionImpl <em>AND expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AND_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAND_expression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAND_expression();

    /**
     * The meta object literal for the '<em><b>Equalityexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__EQUALITYEXPRESSION = eINSTANCE.getAND_expression_Equalityexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Equality_expressionImpl <em>Equality expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Equality_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEquality_expression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEquality_expression();

    /**
     * The meta object literal for the '<em><b>Instanceofexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION = eINSTANCE.getEquality_expression_Instanceofexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InstanceOf_expressionImpl <em>Instance Of expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InstanceOf_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInstanceOf_expression()
     * @generated
     */
    EClass INSTANCE_OF_EXPRESSION = eINSTANCE.getInstanceOf_expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl <em>Relational expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRelational_expression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelational_expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__TYPE = eINSTANCE.getRelational_expression_Type();

    /**
     * The meta object literal for the '<em><b>Shiftexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__SHIFTEXPRESSION = eINSTANCE.getRelational_expression_Shiftexpression();

    /**
     * The meta object literal for the '<em><b>Relationalop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__RELATIONALOP = eINSTANCE.getRelational_expression_Relationalop();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl <em>Shift expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getShift_expression()
     * @generated
     */
    EClass SHIFT_EXPRESSION = eINSTANCE.getShift_expression();

    /**
     * The meta object literal for the '<em><b>Additiveexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__ADDITIVEEXPRESSION = eINSTANCE.getShift_expression_Additiveexpression();

    /**
     * The meta object literal for the '<em><b>Shiftop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_EXPRESSION__SHIFTOP = eINSTANCE.getShift_expression_Shiftop();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Additive_expressionImpl <em>Additive expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Additive_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAdditive_expression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditive_expression();

    /**
     * The meta object literal for the '<em><b>Multiplicativeexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION = eINSTANCE.getAdditive_expression_Multiplicativeexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Multiplicative_expressionImpl <em>Multiplicative expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Multiplicative_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMultiplicative_expression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicative_expression();

    /**
     * The meta object literal for the '<em><b>Unaryexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION = eINSTANCE.getMultiplicative_expression_Unaryexpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Unary_expressionImpl <em>Unary expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Unary_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnary_expression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnary_expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl <em>Unary expression Not Plus Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnary_expression_Not_Plus_Minus()
     * @generated
     */
    EClass UNARY_EXPRESSION_NOT_PLUS_MINUS = eINSTANCE.getUnary_expression_Not_Plus_Minus();

    /**
     * The meta object literal for the '<em><b>Unaryexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION = eINSTANCE.getUnary_expression_Not_Plus_Minus_Unaryexpression();

    /**
     * The meta object literal for the '<em><b>Castexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION = eINSTANCE.getUnary_expression_Not_Plus_Minus_Castexpression();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY = eINSTANCE.getUnary_expression_Not_Plus_Minus_Primary();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR = eINSTANCE.getUnary_expression_Not_Plus_Minus_Selector();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl <em>Cast expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCast_expression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCast_expression();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST_EXPRESSION__LPARENT = eINSTANCE.getCast_expression_Lparent();

    /**
     * The meta object literal for the '<em><b>Primitivetype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__PRIMITIVETYPE = eINSTANCE.getCast_expression_Primitivetype();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST_EXPRESSION__RPARENT = eINSTANCE.getCast_expression_Rparent();

    /**
     * The meta object literal for the '<em><b>Unaryexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__UNARYEXPRESSION = eINSTANCE.getCast_expression_Unaryexpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCast_expression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCast_expression_Expression();

    /**
     * The meta object literal for the '<em><b>Unaryexpressionnotplusminus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS = eINSTANCE.getCast_expression_Unaryexpressionnotplusminus();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl <em>Primary expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrimary_expression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimary_expression();

    /**
     * The meta object literal for the '<em><b>Parexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__PAREXPRESSION = eINSTANCE.getPrimary_expression_Parexpression();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__IDENTIFIER = eINSTANCE.getPrimary_expression_Identifier();

    /**
     * The meta object literal for the '<em><b>Identifiersuffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__IDENTIFIERSUFFIX = eINSTANCE.getPrimary_expression_Identifiersuffix();

    /**
     * The meta object literal for the '<em><b>Supersuffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__SUPERSUFFIX = eINSTANCE.getPrimary_expression_Supersuffix();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__LITERAL = eINSTANCE.getPrimary_expression_Literal();

    /**
     * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__CREATOR = eINSTANCE.getPrimary_expression_Creator();

    /**
     * The meta object literal for the '<em><b>Primitivetype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__PRIMITIVETYPE = eINSTANCE.getPrimary_expression_Primitivetype();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl <em>Identifier suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIdentifier_suffix()
     * @generated
     */
    EClass IDENTIFIER_SUFFIX = eINSTANCE.getIdentifier_suffix();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_SUFFIX__ARGUMENTS = eINSTANCE.getIdentifier_suffix_Arguments();

    /**
     * The meta object literal for the '<em><b>Explicitgenericinvocation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION = eINSTANCE.getIdentifier_suffix_Explicitgenericinvocation();

    /**
     * The meta object literal for the '<em><b>Innercreator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_SUFFIX__INNERCREATOR = eINSTANCE.getIdentifier_suffix_Innercreator();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CreatorImpl <em>Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CreatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreator()
     * @generated
     */
    EClass CREATOR = eINSTANCE.getCreator();

    /**
     * The meta object literal for the '<em><b>Classcreatorrest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATOR__CLASSCREATORREST = eINSTANCE.getCreator_Classcreatorrest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Created_nameImpl <em>Created name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Created_nameImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreated_name()
     * @generated
     */
    EClass CREATED_NAME = eINSTANCE.getCreated_name();

    /**
     * The meta object literal for the '<em><b>Arraycreatorrest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATED_NAME__ARRAYCREATORREST = eINSTANCE.getCreated_name_Arraycreatorrest();

    /**
     * The meta object literal for the '<em><b>Classorinterfacetype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATED_NAME__CLASSORINTERFACETYPE = eINSTANCE.getCreated_name_Classorinterfacetype();

    /**
     * The meta object literal for the '<em><b>Primitivetype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATED_NAME__PRIMITIVETYPE = eINSTANCE.getCreated_name_Primitivetype();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl <em>Inner creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInner_creator()
     * @generated
     */
    EClass INNER_CREATOR = eINSTANCE.getInner_creator();

    /**
     * The meta object literal for the '<em><b>Nonwildcardtypearguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_CREATOR__NONWILDCARDTYPEARGUMENTS = eINSTANCE.getInner_creator_Nonwildcardtypearguments();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_CREATOR__IDENTIFIER = eINSTANCE.getInner_creator_Identifier();

    /**
     * The meta object literal for the '<em><b>Classcreatorrest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_CREATOR__CLASSCREATORREST = eINSTANCE.getInner_creator_Classcreatorrest();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_creator_restImpl <em>Array creator rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Array_creator_restImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_creator_rest()
     * @generated
     */
    EClass ARRAY_CREATOR_REST = eINSTANCE.getArray_creator_rest();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CREATOR_REST__EXPRESSION = eINSTANCE.getArray_creator_rest_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl <em>Class creator rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_creator_rest()
     * @generated
     */
    EClass CLASS_CREATOR_REST = eINSTANCE.getClass_creator_rest();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CREATOR_REST__ARGUMENTS = eINSTANCE.getClass_creator_rest_Arguments();

    /**
     * The meta object literal for the '<em><b>Classbody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_CREATOR_REST__CLASSBODY = eINSTANCE.getClass_creator_rest_Classbody();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl <em>Explicit generic invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExplicit_generic_invocation()
     * @generated
     */
    EClass EXPLICIT_GENERIC_INVOCATION = eINSTANCE.getExplicit_generic_invocation();

    /**
     * The meta object literal for the '<em><b>Nonwildcardtypearguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS = eINSTANCE.getExplicit_generic_invocation_Nonwildcardtypearguments();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPLICIT_GENERIC_INVOCATION__IDENTIFIER = eINSTANCE.getExplicit_generic_invocation_Identifier();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_GENERIC_INVOCATION__ARGUMENTS = eINSTANCE.getExplicit_generic_invocation_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl <em>Non wildcard type arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNon_wildcard_type_arguments()
     * @generated
     */
    EClass NON_WILDCARD_TYPE_ARGUMENTS = eINSTANCE.getNon_wildcard_type_arguments();

    /**
     * The meta object literal for the '<em><b>Createdname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME = eINSTANCE.getNon_wildcard_type_arguments_Createdname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_WILDCARD_TYPE_ARGUMENTS__TYPE = eINSTANCE.getNon_wildcard_type_arguments_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SelectorImpl <em>Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SelectorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSelector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getSelector();

    /**
     * The meta object literal for the '<em><b>Supersuffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SUPERSUFFIX = eINSTANCE.getSelector_Supersuffix();

    /**
     * The meta object literal for the '<em><b>Innercreator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__INNERCREATOR = eINSTANCE.getSelector_Innercreator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__EXPRESSION = eINSTANCE.getSelector_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Super_suffixImpl <em>Super suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Super_suffixImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSuper_suffix()
     * @generated
     */
    EClass SUPER_SUFFIX = eINSTANCE.getSuper_suffix();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_SUFFIX__ARGUMENTS = eINSTANCE.getSuper_suffix_Arguments();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPER_SUFFIX__IDENTIFIER = eINSTANCE.getSuper_suffix_Identifier();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ArgumentsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENTS__LPARENT = eINSTANCE.getArguments_Lparent();

    /**
     * The meta object literal for the '<em><b>Expressionlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__EXPRESSIONLIST = eINSTANCE.getArguments_Expressionlist();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENTS__RPARENT = eINSTANCE.getArguments_Rparent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl <em>Switch statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSwitch_statement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitch_statement();

    /**
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_STATEMENT__LPAREN = eINSTANCE.getSwitch_statement_LParen();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitch_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_STATEMENT__RPARENT = eINSTANCE.getSwitch_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION2 = eINSTANCE.getSwitch_statement_Expression2();

    /**
     * The meta object literal for the '<em><b>Switch Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_STATEMENTS = eINSTANCE.getSwitch_statement_SwitchStatements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.While_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhile_Statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getWhile_Statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE_STATEMENT__RPARENT = eINSTANCE.getWhile_Statement_Rparent();

    /**
     * The meta object literal for the '<em><b>While Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__WHILE_STATEMENT = eINSTANCE.getWhile_Statement_WhileStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDo_Statement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDo_Statement();

    /**
     * The meta object literal for the '<em><b>Do Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__DO_STATEMENT = eINSTANCE.getDo_Statement_DoStatement();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_STATEMENT__LPARENT = eINSTANCE.getDo_Statement_Lparent();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_STATEMENT__RPARENT = eINSTANCE.getDo_Statement_Rparent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.If_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIf_statement();

    /**
     * The meta object literal for the '<em><b>Lparen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__LPAREN = eINSTANCE.getIf_statement_Lparen();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIf_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__RPARENT = eINSTANCE.getIf_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Id Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ID_STATEMENT = eINSTANCE.getIf_statement_IdStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIf_statement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Try_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTry_statement()
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
     * The meta object literal for the '<em><b>LParen</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRY_STATEMENT__LPAREN = eINSTANCE.getTry_statement_LParen();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMETERS = eINSTANCE.getTry_statement_Parameters();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRY_STATEMENT__RPARENT = eINSTANCE.getTry_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Catch Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__CATCH_STATEMENT = eINSTANCE.getTry_statement_CatchStatement();

    /**
     * The meta object literal for the '<em><b>Finally Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY_STATEMENT = eINSTANCE.getTry_statement_FinallyStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Import_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport_statement()
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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Package_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage_statement()
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
