/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getLparent <em>Lparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getPrimitivetype <em>Primitivetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpressionnotplusminus <em>Unaryexpressionnotplusminus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression()
 * @model
 * @generated
 */
public interface Cast_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lparent</em>' attribute.
   * @see #setLparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Lparent()
   * @model
   * @generated
   */
  String getLparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getLparent <em>Lparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lparent</em>' attribute.
   * @see #getLparent()
   * @generated
   */
  void setLparent(String value);

  /**
   * Returns the value of the '<em><b>Primitivetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitivetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitivetype</em>' containment reference.
   * @see #setPrimitivetype(Primitive_type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Primitivetype()
   * @model containment="true"
   * @generated
   */
  Primitive_type getPrimitivetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getPrimitivetype <em>Primitivetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitivetype</em>' containment reference.
   * @see #getPrimitivetype()
   * @generated
   */
  void setPrimitivetype(Primitive_type value);

  /**
   * Returns the value of the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rparent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rparent</em>' attribute.
   * @see #setRparent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Rparent()
   * @model
   * @generated
   */
  String getRparent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getRparent <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rparent</em>' attribute.
   * @see #getRparent()
   * @generated
   */
  void setRparent(String value);

  /**
   * Returns the value of the '<em><b>Unaryexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryexpression</em>' containment reference.
   * @see #setUnaryexpression(Unary_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Unaryexpression()
   * @model containment="true"
   * @generated
   */
  Unary_expression getUnaryexpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpression <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unaryexpression</em>' containment reference.
   * @see #getUnaryexpression()
   * @generated
   */
  void setUnaryexpression(Unary_expression value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Unaryexpressionnotplusminus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryexpressionnotplusminus</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryexpressionnotplusminus</em>' containment reference.
   * @see #setUnaryexpressionnotplusminus(Unary_expression_Not_Plus_Minus)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCast_expression_Unaryexpressionnotplusminus()
   * @model containment="true"
   * @generated
   */
  Unary_expression_Not_Plus_Minus getUnaryexpressionnotplusminus();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cast_expression#getUnaryexpressionnotplusminus <em>Unaryexpressionnotplusminus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unaryexpressionnotplusminus</em>' containment reference.
   * @see #getUnaryexpressionnotplusminus()
   * @generated
   */
  void setUnaryexpressionnotplusminus(Unary_expression_Not_Plus_Minus value);

} // Cast_expression
