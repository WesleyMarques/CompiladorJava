/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getUnaryOp <em>Unary Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getNumericExpressionLine <em>Numeric Expression Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression()
 * @model
 * @generated
 */
public interface Numeric_Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Unary Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Op</em>' attribute.
   * @see #setUnaryOp(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_UnaryOp()
   * @model
   * @generated
   */
  String getUnaryOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getUnaryOp <em>Unary Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Op</em>' attribute.
   * @see #getUnaryOp()
   * @generated
   */
  void setUnaryOp(String value);

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
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Numeric Expression Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Expression Line</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Expression Line</em>' containment reference.
   * @see #setNumericExpressionLine(Numeric_Expression_line)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getNumeric_Expression_NumericExpressionLine()
   * @model containment="true"
   * @generated
   */
  Numeric_Expression_line getNumericExpressionLine();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Numeric_Expression#getNumericExpressionLine <em>Numeric Expression Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric Expression Line</em>' containment reference.
   * @see #getNumericExpressionLine()
   * @generated
   */
  void setNumericExpressionLine(Numeric_Expression_line value);

} // Numeric_Expression
