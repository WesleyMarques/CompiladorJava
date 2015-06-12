/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive OR expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Exclusive_OR_expression#getAndexpression <em>Andexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExclusive_OR_expression()
 * @model
 * @generated
 */
public interface Exclusive_OR_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Andexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.AND_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Andexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Andexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExclusive_OR_expression_Andexpression()
   * @model containment="true"
   * @generated
   */
  EList<AND_expression> getAndexpression();

} // Exclusive_OR_expression
