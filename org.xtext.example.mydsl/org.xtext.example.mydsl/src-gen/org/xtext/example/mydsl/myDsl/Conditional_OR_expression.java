/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional OR expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_OR_expression#getConditionalandexpression <em>Conditionalandexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_OR_expression()
 * @model
 * @generated
 */
public interface Conditional_OR_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditionalandexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Conditional_AND_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditionalandexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionalandexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_OR_expression_Conditionalandexpression()
   * @model containment="true"
   * @generated
   */
  EList<Conditional_AND_expression> getConditionalandexpression();

} // Conditional_OR_expression
