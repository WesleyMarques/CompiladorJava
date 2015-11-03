/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPILATION_UNIT:
      {
        Compilation_unit compilation_unit = (Compilation_unit)theEObject;
        T result = caseCompilation_unit(compilation_unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_DECLARATION:
      {
        Type_declaration type_declaration = (Type_declaration)theEObject;
        T result = caseType_declaration(type_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERFACE_DECLARATION:
      {
        Interface_declaration interface_declaration = (Interface_declaration)theEObject;
        T result = caseInterface_declaration(interface_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLASS_DECLARATION:
      {
        Class_declaration class_declaration = (Class_declaration)theEObject;
        T result = caseClass_declaration(class_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FIELD_DECLARATION:
      {
        Field_declaration field_declaration = (Field_declaration)theEObject;
        T result = caseField_declaration(field_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.METHOD_DECLARATION:
      {
        Method_declaration method_declaration = (Method_declaration)theEObject;
        T result = caseMethod_declaration(method_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTRUCTOR_DECLARATION:
      {
        Constructor_declaration constructor_declaration = (Constructor_declaration)theEObject;
        T result = caseConstructor_declaration(constructor_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER_LIST:
      {
        Parameter_list parameter_list = (Parameter_list)theEObject;
        T result = caseParameter_list(parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_DECLARATION:
      {
        Variable_declaration variable_declaration = (Variable_declaration)theEObject;
        T result = caseVariable_declaration(variable_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_DECLARATOR:
      {
        Variable_declarator variable_declarator = (Variable_declarator)theEObject;
        T result = caseVariable_declarator(variable_declarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_INITIALIZER:
      {
        Variable_initializer variable_initializer = (Variable_initializer)theEObject;
        T result = caseVariable_initializer(variable_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARRAY_INITIALIZER:
      {
        Array_initializer array_initializer = (Array_initializer)theEObject;
        T result = caseArray_initializer(array_initializer);
        if (result == null) result = caseArray_creator_rest(array_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATIC_INITIALIZER:
      {
        Static_initializer static_initializer = (Static_initializer)theEObject;
        T result = caseStatic_initializer(static_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT_BLOCK:
      {
        Statement_block statement_block = (Statement_block)theEObject;
        T result = caseStatement_block(statement_block);
        if (result == null) result = caseStatement(statement_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_STATEMENT:
      {
        For_Statement for_Statement = (For_Statement)theEObject;
        T result = caseFor_Statement(for_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_CONTROL:
      {
        For_control for_control = (For_control)theEObject;
        T result = caseFor_control(for_control);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_VALUE:
      {
        Variable_value variable_value = (Variable_value)theEObject;
        T result = caseVariable_value(variable_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRIMITIVE_TYPE:
      {
        Primitive_type primitive_type = (Primitive_type)theEObject;
        T result = casePrimitive_type(primitive_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_INIT:
      {
        For_init for_init = (For_init)theEObject;
        T result = caseFor_init(for_init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_EXPRESSION:
      {
        For_expression for_expression = (For_expression)theEObject;
        T result = caseFor_expression(for_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_UPDATE:
      {
        For_update for_update = (For_update)theEObject;
        T result = caseFor_update(for_update);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_UPDATE_OPERATOR:
      {
        For_update_operator for_update_operator = (For_update_operator)theEObject;
        T result = caseFor_update_operator(for_update_operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_EXPRESSION_OPERATOR:
      {
        For_expression_operator for_expression_operator = (For_expression_operator)theEObject;
        T result = caseFor_expression_operator(for_expression_operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARENS_EXPRESSION:
      {
        Parens_expression parens_expression = (Parens_expression)theEObject;
        T result = caseParens_expression(parens_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION_LIST:
      {
        Expression_list expression_list = (Expression_list)theEObject;
        T result = caseExpression_list(expression_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONDITIONAL_EXPRESSION:
      {
        Conditional_expression conditional_expression = (Conditional_expression)theEObject;
        T result = caseConditional_expression(conditional_expression);
        if (result == null) result = caseExpression(conditional_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION:
      {
        Conditional_OR_expression conditional_OR_expression = (Conditional_OR_expression)theEObject;
        T result = caseConditional_OR_expression(conditional_OR_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION:
      {
        Conditional_AND_expression conditional_AND_expression = (Conditional_AND_expression)theEObject;
        T result = caseConditional_AND_expression(conditional_AND_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION:
      {
        Inclusive_OR_expression inclusive_OR_expression = (Inclusive_OR_expression)theEObject;
        T result = caseInclusive_OR_expression(inclusive_OR_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION:
      {
        Exclusive_OR_expression exclusive_OR_expression = (Exclusive_OR_expression)theEObject;
        T result = caseExclusive_OR_expression(exclusive_OR_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AND_EXPRESSION:
      {
        AND_expression anD_expression = (AND_expression)theEObject;
        T result = caseAND_expression(anD_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EQUALITY_EXPRESSION:
      {
        Equality_expression equality_expression = (Equality_expression)theEObject;
        T result = caseEquality_expression(equality_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INSTANCE_OF_EXPRESSION:
      {
        InstanceOf_expression instanceOf_expression = (InstanceOf_expression)theEObject;
        T result = caseInstanceOf_expression(instanceOf_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATIONAL_EXPRESSION:
      {
        Relational_expression relational_expression = (Relational_expression)theEObject;
        T result = caseRelational_expression(relational_expression);
        if (result == null) result = caseInstanceOf_expression(relational_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SHIFT_EXPRESSION:
      {
        Shift_expression shift_expression = (Shift_expression)theEObject;
        T result = caseShift_expression(shift_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ADDITIVE_EXPRESSION:
      {
        Additive_expression additive_expression = (Additive_expression)theEObject;
        T result = caseAdditive_expression(additive_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION:
      {
        Multiplicative_expression multiplicative_expression = (Multiplicative_expression)theEObject;
        T result = caseMultiplicative_expression(multiplicative_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNARY_EXPRESSION:
      {
        Unary_expression unary_expression = (Unary_expression)theEObject;
        T result = caseUnary_expression(unary_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS:
      {
        Unary_expression_Not_Plus_Minus unary_expression_Not_Plus_Minus = (Unary_expression_Not_Plus_Minus)theEObject;
        T result = caseUnary_expression_Not_Plus_Minus(unary_expression_Not_Plus_Minus);
        if (result == null) result = caseUnary_expression(unary_expression_Not_Plus_Minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CAST_EXPRESSION:
      {
        Cast_expression cast_expression = (Cast_expression)theEObject;
        T result = caseCast_expression(cast_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRIMARY_EXPRESSION:
      {
        Primary_expression primary_expression = (Primary_expression)theEObject;
        T result = casePrimary_expression(primary_expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IDENTIFIER_SUFFIX:
      {
        Identifier_suffix identifier_suffix = (Identifier_suffix)theEObject;
        T result = caseIdentifier_suffix(identifier_suffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CREATOR:
      {
        Creator creator = (Creator)theEObject;
        T result = caseCreator(creator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CREATED_NAME:
      {
        Created_name created_name = (Created_name)theEObject;
        T result = caseCreated_name(created_name);
        if (result == null) result = caseCreator(created_name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INNER_CREATOR:
      {
        Inner_creator inner_creator = (Inner_creator)theEObject;
        T result = caseInner_creator(inner_creator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARRAY_CREATOR_REST:
      {
        Array_creator_rest array_creator_rest = (Array_creator_rest)theEObject;
        T result = caseArray_creator_rest(array_creator_rest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLASS_CREATOR_REST:
      {
        Class_creator_rest class_creator_rest = (Class_creator_rest)theEObject;
        T result = caseClass_creator_rest(class_creator_rest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION:
      {
        Explicit_generic_invocation explicit_generic_invocation = (Explicit_generic_invocation)theEObject;
        T result = caseExplicit_generic_invocation(explicit_generic_invocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS:
      {
        Non_wildcard_type_arguments non_wildcard_type_arguments = (Non_wildcard_type_arguments)theEObject;
        T result = caseNon_wildcard_type_arguments(non_wildcard_type_arguments);
        if (result == null) result = caseCreator(non_wildcard_type_arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SELECTOR:
      {
        Selector selector = (Selector)theEObject;
        T result = caseSelector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SUPER_SUFFIX:
      {
        Super_suffix super_suffix = (Super_suffix)theEObject;
        T result = caseSuper_suffix(super_suffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARGUMENTS:
      {
        Arguments arguments = (Arguments)theEObject;
        T result = caseArguments(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SWITCH_STATEMENT:
      {
        Switch_statement switch_statement = (Switch_statement)theEObject;
        T result = caseSwitch_statement(switch_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.WHILE_STATEMENT:
      {
        While_Statement while_Statement = (While_Statement)theEObject;
        T result = caseWhile_Statement(while_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DO_STATEMENT:
      {
        Do_Statement do_Statement = (Do_Statement)theEObject;
        T result = caseDo_Statement(do_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IF_STATEMENT:
      {
        If_statement if_statement = (If_statement)theEObject;
        T result = caseIf_statement(if_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TRY_STATEMENT:
      {
        Try_statement try_statement = (Try_statement)theEObject;
        T result = caseTry_statement(try_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT_STATEMENT:
      {
        Import_statement import_statement = (Import_statement)theEObject;
        T result = caseImport_statement(import_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PACKAGE_STATEMENT:
      {
        Package_statement package_statement = (Package_statement)theEObject;
        T result = casePackage_statement(package_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilation_unit(Compilation_unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_declaration(Type_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_declaration(Interface_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_declaration(Class_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField_declaration(Field_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod_declaration(Method_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor_declaration(Constructor_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter_list(Parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_declaration(Variable_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_declarator(Variable_declarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_initializer(Variable_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_initializer(Array_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatic_initializer(Static_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement_block(Statement_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_Statement(For_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_control(For_control object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_value(Variable_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitive_type(Primitive_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_init(For_init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_expression(For_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_update(For_update object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For update operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For update operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_update_operator(For_update_operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For expression operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For expression operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_expression_operator(For_expression_operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parens expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parens expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParens_expression(Parens_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression_list(Expression_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditional_expression(Conditional_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional OR expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional OR expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditional_OR_expression(Conditional_OR_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional AND expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional AND expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditional_AND_expression(Conditional_AND_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inclusive OR expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inclusive OR expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclusive_OR_expression(Inclusive_OR_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclusive OR expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclusive OR expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExclusive_OR_expression(Exclusive_OR_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AND expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AND expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAND_expression(AND_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality_expression(Equality_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Of expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Of expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOf_expression(InstanceOf_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelational_expression(Relational_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shift expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shift expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShift_expression(Shift_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditive_expression(Additive_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicative_expression(Multiplicative_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnary_expression(Unary_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary expression Not Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnary_expression_Not_Plus_Minus(Unary_expression_Not_Plus_Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCast_expression(Cast_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary_expression(Primary_expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifier_suffix(Identifier_suffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Creator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreator(Creator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Created name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Created name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreated_name(Created_name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inner creator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inner creator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInner_creator(Inner_creator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array creator rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array creator rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_creator_rest(Array_creator_rest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class creator rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class creator rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_creator_rest(Class_creator_rest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit generic invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit generic invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicit_generic_invocation(Explicit_generic_invocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non wildcard type arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non wildcard type arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNon_wildcard_type_arguments(Non_wildcard_type_arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelector(Selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuper_suffix(Super_suffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArguments(Arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch_statement(Switch_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile_Statement(While_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDo_Statement(Do_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf_statement(If_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTry_statement(Try_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport_statement(Import_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage_statement(Package_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
