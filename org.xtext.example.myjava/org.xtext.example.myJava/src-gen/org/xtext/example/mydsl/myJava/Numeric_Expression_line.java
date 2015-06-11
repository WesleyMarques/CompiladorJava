/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getExpressionLine <em>Expression Line</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_line()
 * @model
 * @generated
 */
public interface Numeric_Expression_line extends EObject
{
  /**
   * Returns the value of the '<em><b>Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Increment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Increment</em>' attribute.
   * @see #setIncrement(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_line_Increment()
   * @model
   * @generated
   */
  String getIncrement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getIncrement <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increment</em>' attribute.
   * @see #getIncrement()
   * @generated
   */
  void setIncrement(String value);

  /**
   * Returns the value of the '<em><b>Expression Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Line</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Line</em>' containment reference.
   * @see #setExpressionLine(Expression_line)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_line_ExpressionLine()
   * @model containment="true"
   * @generated
   */
  Expression_line getExpressionLine();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getExpressionLine <em>Expression Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Line</em>' containment reference.
   * @see #getExpressionLine()
   * @generated
   */
  void setExpressionLine(Expression_line value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_line_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(EObject)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_line_Expression()
   * @model containment="true"
   * @generated
   */
  EObject getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression_line#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(EObject value);

} // Numeric_Expression_line
