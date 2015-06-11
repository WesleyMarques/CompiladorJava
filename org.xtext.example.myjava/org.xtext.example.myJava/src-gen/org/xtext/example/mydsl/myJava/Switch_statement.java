/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.Switch_statement#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Switch_statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Switch_statement#getSwitchStatements <em>Switch Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getSwitch_statement()
 * @model
 * @generated
 */
public interface Switch_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LParen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LParen</em>' attribute.
   * @see #setLParen(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getSwitch_statement_LParen()
   * @model
   * @generated
   */
  String getLParen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Switch_statement#getLParen <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LParen</em>' attribute.
   * @see #getLParen()
   * @generated
   */
  void setLParen(String value);

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
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getSwitch_statement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Switch_statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Switch Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myJava.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Statements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getSwitch_statement_SwitchStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getSwitchStatements();

} // Switch_statement
