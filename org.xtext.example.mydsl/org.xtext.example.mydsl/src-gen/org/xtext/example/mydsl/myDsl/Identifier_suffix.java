/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier suffix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getExplicitgenericinvocation <em>Explicitgenericinvocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getInnercreator <em>Innercreator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIdentifier_suffix()
 * @model
 * @generated
 */
public interface Identifier_suffix extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIdentifier_suffix_Arguments()
   * @model containment="true"
   * @generated
   */
  Arguments getArguments();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(Arguments value);

  /**
   * Returns the value of the '<em><b>Explicitgenericinvocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicitgenericinvocation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicitgenericinvocation</em>' containment reference.
   * @see #setExplicitgenericinvocation(Explicit_generic_invocation)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIdentifier_suffix_Explicitgenericinvocation()
   * @model containment="true"
   * @generated
   */
  Explicit_generic_invocation getExplicitgenericinvocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getExplicitgenericinvocation <em>Explicitgenericinvocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicitgenericinvocation</em>' containment reference.
   * @see #getExplicitgenericinvocation()
   * @generated
   */
  void setExplicitgenericinvocation(Explicit_generic_invocation value);

  /**
   * Returns the value of the '<em><b>Innercreator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Innercreator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Innercreator</em>' containment reference.
   * @see #setInnercreator(Inner_creator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIdentifier_suffix_Innercreator()
   * @model containment="true"
   * @generated
   */
  Inner_creator getInnercreator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Identifier_suffix#getInnercreator <em>Innercreator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Innercreator</em>' containment reference.
   * @see #getInnercreator()
   * @generated
   */
  void setInnercreator(Inner_creator value);

} // Identifier_suffix
