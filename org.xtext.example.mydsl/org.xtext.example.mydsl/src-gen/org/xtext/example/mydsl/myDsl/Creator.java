/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Creator#getClasscreatorrest <em>Classcreatorrest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreator()
 * @model
 * @generated
 */
public interface Creator extends EObject
{
  /**
   * Returns the value of the '<em><b>Classcreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classcreatorrest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classcreatorrest</em>' containment reference.
   * @see #setClasscreatorrest(Class_creator_rest)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreator_Classcreatorrest()
   * @model containment="true"
   * @generated
   */
  Class_creator_rest getClasscreatorrest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Creator#getClasscreatorrest <em>Classcreatorrest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classcreatorrest</em>' containment reference.
   * @see #getClasscreatorrest()
   * @generated
   */
  void setClasscreatorrest(Class_creator_rest value);

} // Creator
