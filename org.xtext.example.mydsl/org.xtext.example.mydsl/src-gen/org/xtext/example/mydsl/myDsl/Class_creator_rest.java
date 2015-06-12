/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class creator rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getClassbody <em>Classbody</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_creator_rest()
 * @model
 * @generated
 */
public interface Class_creator_rest extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(Arguments)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_creator_rest_Arguments()
   * @model containment="true"
   * @generated
   */
  Arguments getArguments();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(Arguments value);

  /**
   * Returns the value of the '<em><b>Classbody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classbody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classbody</em>' containment reference.
   * @see #setClassbody(Class_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClass_creator_rest_Classbody()
   * @model containment="true"
   * @generated
   */
  Class_declaration getClassbody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Class_creator_rest#getClassbody <em>Classbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classbody</em>' containment reference.
   * @see #getClassbody()
   * @generated
   */
  void setClassbody(Class_declaration value);

} // Class_creator_rest
