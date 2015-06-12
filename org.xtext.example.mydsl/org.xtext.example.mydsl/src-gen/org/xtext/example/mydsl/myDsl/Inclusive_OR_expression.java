/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusive OR expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inclusive_OR_expression#getExclusiveorexpression <em>Exclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInclusive_OR_expression()
 * @model
 * @generated
 */
public interface Inclusive_OR_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclusiveorexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Exclusive_OR_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclusiveorexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclusiveorexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInclusive_OR_expression_Exclusiveorexpression()
   * @model containment="true"
   * @generated
   */
  EList<Exclusive_OR_expression> getExclusiveorexpression();

} // Inclusive_OR_expression
