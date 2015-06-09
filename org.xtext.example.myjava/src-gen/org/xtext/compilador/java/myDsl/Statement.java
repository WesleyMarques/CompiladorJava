/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getNameStatement <em>Name Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Statement</em>' attribute.
   * @see #setNameStatement(String)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement_NameStatement()
   * @model
   * @generated
   */
  String getNameStatement();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Statement#getNameStatement <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Statement</em>' attribute.
   * @see #getNameStatement()
   * @generated
   */
  void setNameStatement(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Statement</em>' containment reference.
   * @see #setTryStatement(Try_statement)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Try_statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Try_statement value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Statement
