/**
 */
package org.xtext.compilador.java.myDsl;

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
 *   <li>{@link org.xtext.compilador.java.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Try_statement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Try_statement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Try_statement#getStatementFinally <em>Statement Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getTry_statement()
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
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getTry_statement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilador.java.myDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getTry_statement_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilador.java.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getTry_statement_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

  /**
   * Returns the value of the '<em><b>Statement Finally</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Finally</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Finally</em>' containment reference.
   * @see #setStatementFinally(Statement)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getTry_statement_StatementFinally()
   * @model containment="true"
   * @generated
   */
  Statement getStatementFinally();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Try_statement#getStatementFinally <em>Statement Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Finally</em>' containment reference.
   * @see #getStatementFinally()
   * @generated
   */
  void setStatementFinally(Statement value);

} // Try_statement
