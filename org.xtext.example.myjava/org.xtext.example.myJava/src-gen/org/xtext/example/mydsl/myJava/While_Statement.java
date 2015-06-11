/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.While_Statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.While_Statement#getWhileStatement <em>While Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getWhile_Statement()
 * @model
 * @generated
 */
public interface While_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rparent</em>' attribute.
   * @see #setRparent(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getWhile_Statement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.While_Statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Statement</em>' containment reference.
   * @see #setWhileStatement(Statement)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getWhile_Statement_WhileStatement()
   * @model containment="true"
   * @generated
   */
  Statement getWhileStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.While_Statement#getWhileStatement <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Statement</em>' containment reference.
   * @see #getWhileStatement()
   * @generated
   */
  void setWhileStatement(Statement value);

} // While_Statement
