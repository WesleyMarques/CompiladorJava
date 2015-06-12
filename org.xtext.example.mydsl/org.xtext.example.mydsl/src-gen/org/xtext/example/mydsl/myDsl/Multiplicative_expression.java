/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Multiplicative_expression#getUnaryexpression <em>Unaryexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMultiplicative_expression()
 * @model
 * @generated
 */
public interface Multiplicative_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Unaryexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Unary_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMultiplicative_expression_Unaryexpression()
   * @model containment="true"
   * @generated
   */
  EList<Unary_expression> getUnaryexpression();

} // Multiplicative_expression
