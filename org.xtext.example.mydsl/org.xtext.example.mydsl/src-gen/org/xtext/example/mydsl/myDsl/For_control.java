/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_control#getForinit <em>Forinit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_control#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_control#getForupdate <em>Forupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_control()
 * @model
 * @generated
 */
public interface For_control extends EObject
{
  /**
   * Returns the value of the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forinit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forinit</em>' containment reference.
   * @see #setForinit(For_init)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_control_Forinit()
   * @model containment="true"
   * @generated
   */
  For_init getForinit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_control#getForinit <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinit</em>' containment reference.
   * @see #getForinit()
   * @generated
   */
  void setForinit(For_init value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(For_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_control_Expression()
   * @model containment="true"
   * @generated
   */
  For_expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_control#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(For_expression value);

  /**
   * Returns the value of the '<em><b>Forupdate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forupdate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forupdate</em>' containment reference.
   * @see #setForupdate(For_update)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_control_Forupdate()
   * @model containment="true"
   * @generated
   */
  For_update getForupdate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_control#getForupdate <em>Forupdate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forupdate</em>' containment reference.
   * @see #getForupdate()
   * @generated
   */
  void setForupdate(For_update value);

} // For_control
