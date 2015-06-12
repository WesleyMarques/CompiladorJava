/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_expression#getVariable1 <em>Variable1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_expression#getExpOp <em>Exp Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_expression#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_expression()
 * @model
 * @generated
 */
public interface For_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable1</em>' containment reference.
   * @see #setVariable1(Variable)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_expression_Variable1()
   * @model containment="true"
   * @generated
   */
  Variable getVariable1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_expression#getVariable1 <em>Variable1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable1</em>' containment reference.
   * @see #getVariable1()
   * @generated
   */
  void setVariable1(Variable value);

  /**
   * Returns the value of the '<em><b>Exp Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Op</em>' containment reference.
   * @see #setExpOp(For_expression_operator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_expression_ExpOp()
   * @model containment="true"
   * @generated
   */
  For_expression_operator getExpOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_expression#getExpOp <em>Exp Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Op</em>' containment reference.
   * @see #getExpOp()
   * @generated
   */
  void setExpOp(For_expression_operator value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Variable_value)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_expression_Limit()
   * @model containment="true"
   * @generated
   */
  Variable_value getLimit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_expression#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Variable_value value);

} // For_expression
