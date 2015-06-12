/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Statement_block#getStatments <em>Statments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block()
 * @model
 * @generated
 */
public interface Statement_block extends Statement
{
  /**
   * Returns the value of the '<em><b>Statments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statments</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStatement_block_Statments()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatments();

} // Statement_block
