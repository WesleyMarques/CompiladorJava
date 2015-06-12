/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Additive_expression#getMultiplicativeexpression <em>Multiplicativeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdditive_expression()
 * @model
 * @generated
 */
public interface Additive_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicativeexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Multiplicative_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicativeexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicativeexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAdditive_expression_Multiplicativeexpression()
   * @model containment="true"
   * @generated
   */
  EList<Multiplicative_expression> getMultiplicativeexpression();

} // Additive_expression
