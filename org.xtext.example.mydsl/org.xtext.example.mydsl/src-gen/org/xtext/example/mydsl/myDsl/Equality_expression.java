/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Equality_expression#getInstanceofexpression <em>Instanceofexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEquality_expression()
 * @model
 * @generated
 */
public interface Equality_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Instanceofexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.InstanceOf_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instanceofexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instanceofexpression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEquality_expression_Instanceofexpression()
   * @model containment="true"
   * @generated
   */
  EList<InstanceOf_expression> getInstanceofexpression();

} // Equality_expression
