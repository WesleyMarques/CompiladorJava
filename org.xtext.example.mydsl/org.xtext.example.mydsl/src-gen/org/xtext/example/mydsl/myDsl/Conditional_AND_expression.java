/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional AND expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_AND_expression#getInclusiveorexpression <em>Inclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_AND_expression()
 * @model
 * @generated
 */
public interface Conditional_AND_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Inclusiveorexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Inclusive_OR_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inclusiveorexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inclusiveorexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_AND_expression_Inclusiveorexpression()
   * @model containment="true"
   * @generated
   */
  EList<Inclusive_OR_expression> getInclusiveorexpression();

} // Conditional_AND_expression
