/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.For_Statement#getStatementInFor <em>Statement In For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getFor_Statement()
 * @model
 * @generated
 */
public interface For_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement In For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement In For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement In For</em>' containment reference.
   * @see #setStatementInFor(Statement)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getFor_Statement_StatementInFor()
   * @model containment="true"
   * @generated
   */
  Statement getStatementInFor();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.For_Statement#getStatementInFor <em>Statement In For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement In For</em>' containment reference.
   * @see #getStatementInFor()
   * @generated
   */
  void setStatementInFor(Statement value);

} // For_Statement
