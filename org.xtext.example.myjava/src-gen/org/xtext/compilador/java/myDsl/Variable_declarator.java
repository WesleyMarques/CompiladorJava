/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getVariable_declarator()
 * @model
 * @generated
 */
public interface Variable_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Variable</em>' attribute.
   * @see #setNameVariable(String)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getVariable_declarator_NameVariable()
   * @model
   * @generated
   */
  String getNameVariable();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Variable</em>' attribute.
   * @see #getNameVariable()
   * @generated
   */
  void setNameVariable(String value);

} // Variable_declarator
