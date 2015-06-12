/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Shift_expression#getAdditiveexpression <em>Additiveexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Shift_expression#getShiftop <em>Shiftop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getShift_expression()
 * @model
 * @generated
 */
public interface Shift_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Additiveexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Additive_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additiveexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additiveexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getShift_expression_Additiveexpression()
   * @model containment="true"
   * @generated
   */
  EList<Additive_expression> getAdditiveexpression();

  /**
   * Returns the value of the '<em><b>Shiftop</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shiftop</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shiftop</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getShift_expression_Shiftop()
   * @model unique="false"
   * @generated
   */
  EList<String> getShiftop();

} // Shift_expression
