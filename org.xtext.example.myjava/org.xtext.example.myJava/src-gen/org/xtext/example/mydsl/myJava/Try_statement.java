/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getCatchStatement <em>Catch Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Try_statement#getFinallyStatement <em>Finally Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement()
 * @model
 * @generated
 */
public interface Try_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Statement</em>' containment reference.
   * @see #setTryStatement(Statement)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Try_statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Statement value);

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
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_LParen()
   * @model
   * @generated
   */
  String getLParen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Try_statement#getLParen <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LParen</em>' attribute.
   * @see #getLParen()
   * @generated
   */
  void setLParen(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myJava.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

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
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Try_statement#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Catch Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myJava.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Statement</em>' containment reference list.
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_CatchStatement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getCatchStatement();

  /**
   * Returns the value of the '<em><b>Finally Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally Statement</em>' containment reference.
   * @see #setFinallyStatement(Statement)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getTry_statement_FinallyStatement()
   * @model containment="true"
   * @generated
   */
  Statement getFinallyStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Try_statement#getFinallyStatement <em>Finally Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally Statement</em>' containment reference.
   * @see #getFinallyStatement()
   * @generated
   */
  void setFinallyStatement(Statement value);

} // Try_statement
