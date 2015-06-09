/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.Expression_line#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Expression_line#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getExpression_line()
 * @model
 * @generated
 */
public interface Expression_line extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(Arglist)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getExpression_line_Args()
   * @model containment="true"
   * @generated
   */
  Arglist getArgs();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Expression_line#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(Arglist value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression_line)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getExpression_line_Expression()
   * @model containment="true"
   * @generated
   */
  Expression_line getExpression();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Expression_line#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression_line value);

} // Expression_line
