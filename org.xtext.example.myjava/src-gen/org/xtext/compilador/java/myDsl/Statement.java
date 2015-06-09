/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getStatments <em>Statments</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Statement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends Statement_block
{
  /**
   * Returns the value of the '<em><b>Statments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilador.java.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statments</em>' containment reference list.
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getStatement_Statments()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatments();

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
