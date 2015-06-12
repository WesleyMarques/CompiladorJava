/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inner_creator#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inner_creator#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inner_creator#getClasscreatorrest <em>Classcreatorrest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInner_creator()
 * @model
 * @generated
 */
public interface Inner_creator extends EObject
{
  /**
   * Returns the value of the '<em><b>Nonwildcardtypearguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nonwildcardtypearguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nonwildcardtypearguments</em>' containment reference.
   * @see #setNonwildcardtypearguments(Non_wildcard_type_arguments)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInner_creator_Nonwildcardtypearguments()
   * @model containment="true"
   * @generated
   */
  Non_wildcard_type_arguments getNonwildcardtypearguments();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nonwildcardtypearguments</em>' containment reference.
   * @see #getNonwildcardtypearguments()
   * @generated
   */
  void setNonwildcardtypearguments(Non_wildcard_type_arguments value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInner_creator_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInner_creator_Classcreatorrest()
   * @model containment="true"
   * @generated
   */
  Class_creator_rest getClasscreatorrest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Inner_creator#getClasscreatorrest <em>Classcreatorrest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classcreatorrest</em>' containment reference.
   * @see #getClasscreatorrest()
   * @generated
   */
  void setClasscreatorrest(Class_creator_rest value);

} // Inner_creator
