/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Selector#getSupersuffix <em>Supersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Selector#getInnercreator <em>Innercreator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Selector#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelector()
 * @model
 * @generated
 */
public interface Selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Supersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supersuffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supersuffix</em>' containment reference.
   * @see #setSupersuffix(Super_suffix)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelector_Supersuffix()
   * @model containment="true"
   * @generated
   */
  Super_suffix getSupersuffix();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Selector#getSupersuffix <em>Supersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supersuffix</em>' containment reference.
   * @see #getSupersuffix()
   * @generated
   */
  void setSupersuffix(Super_suffix value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelector_Innercreator()
   * @model containment="true"
   * @generated
   */
  Inner_creator getInnercreator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Selector#getInnercreator <em>Innercreator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Innercreator</em>' containment reference.
   * @see #getInnercreator()
   * @generated
   */
  void setInnercreator(Inner_creator value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelector_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Selector#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Selector
