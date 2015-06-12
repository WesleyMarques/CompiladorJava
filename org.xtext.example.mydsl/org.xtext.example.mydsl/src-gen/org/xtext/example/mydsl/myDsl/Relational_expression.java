/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Relational_expression#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Relational_expression#getShiftexpression <em>Shiftexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Relational_expression#getRelationalop <em>Relationalop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRelational_expression()
 * @model
 * @generated
 */
public interface Relational_expression extends InstanceOf_expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRelational_expression_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Relational_expression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Shiftexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Shift_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shiftexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shiftexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRelational_expression_Shiftexpression()
   * @model containment="true"
   * @generated
   */
  EList<Shift_expression> getShiftexpression();

  /**
   * Returns the value of the '<em><b>Relationalop</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationalop</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationalop</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRelational_expression_Relationalop()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelationalop();

} // Relational_expression
