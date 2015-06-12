/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_Statement#getLparent <em>Lparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_Statement#getForControl <em>For Control</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_Statement#getRParent <em>RParent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_Statement#getForStatement <em>For Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Statement()
 * @model
 * @generated
 */
public interface For_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lparent</em>' attribute.
   * @see #setLparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Statement_Lparent()
   * @model
   * @generated
   */
  String getLparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_Statement#getLparent <em>Lparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lparent</em>' attribute.
   * @see #getLparent()
   * @generated
   */
  void setLparent(String value);

  /**
   * Returns the value of the '<em><b>For Control</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Control</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Control</em>' containment reference.
   * @see #setForControl(For_control)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Statement_ForControl()
   * @model containment="true"
   * @generated
   */
  For_control getForControl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_Statement#getForControl <em>For Control</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Control</em>' containment reference.
   * @see #getForControl()
   * @generated
   */
  void setForControl(For_control value);

  /**
   * Returns the value of the '<em><b>RParent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RParent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RParent</em>' attribute.
   * @see #setRParent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Statement_RParent()
   * @model
   * @generated
   */
  String getRParent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_Statement#getRParent <em>RParent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RParent</em>' attribute.
   * @see #getRParent()
   * @generated
   */
  void setRParent(String value);

  /**
   * Returns the value of the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Statement</em>' containment reference.
   * @see #setForStatement(Statement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Statement_ForStatement()
   * @model containment="true"
   * @generated
   */
  Statement getForStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_Statement#getForStatement <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Statement</em>' containment reference.
   * @see #getForStatement()
   * @generated
   */
  void setForStatement(Statement value);

} // For_Statement
