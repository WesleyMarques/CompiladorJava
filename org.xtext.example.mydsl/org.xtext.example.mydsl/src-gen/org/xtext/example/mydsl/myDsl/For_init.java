/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_init#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_init#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For_init#getVar_init <em>Var init</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_init()
 * @model
 * @generated
 */
public interface For_init extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Primitive_type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_init_Type()
   * @model containment="true"
   * @generated
   */
  Primitive_type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_init#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Primitive_type value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_init_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_init#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Var init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var init</em>' containment reference.
   * @see #setVar_init(Variable_value)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_init_Var_init()
   * @model containment="true"
   * @generated
   */
  Variable_value getVar_init();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For_init#getVar_init <em>Var init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var init</em>' containment reference.
   * @see #getVar_init()
   * @generated
   */
  void setVar_init(Variable_value value);

} // For_init
