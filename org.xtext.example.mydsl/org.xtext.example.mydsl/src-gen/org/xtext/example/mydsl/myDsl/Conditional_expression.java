/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getAssignmentoperator <em>Assignmentoperator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getConditionalorexpression <em>Conditionalorexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression()
 * @model
 * @generated
 */
public interface Conditional_expression extends Expression
{
  /**
   * Returns the value of the '<em><b>Assignmentoperator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignmentoperator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignmentoperator</em>' attribute.
   * @see #setAssignmentoperator(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression_Assignmentoperator()
   * @model
   * @generated
   */
  String getAssignmentoperator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getAssignmentoperator <em>Assignmentoperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignmentoperator</em>' attribute.
   * @see #getAssignmentoperator()
   * @generated
   */
  void setAssignmentoperator(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Conditionalorexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditionalorexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionalorexpression</em>' containment reference.
   * @see #setConditionalorexpression(Conditional_OR_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression_Conditionalorexpression()
   * @model containment="true"
   * @generated
   */
  Conditional_OR_expression getConditionalorexpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getConditionalorexpression <em>Conditionalorexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditionalorexpression</em>' containment reference.
   * @see #getConditionalorexpression()
   * @generated
   */
  void setConditionalorexpression(Conditional_OR_expression value);

  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference.
   * @see #setExpression1(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression_Expression1()
   * @model containment="true"
   * @generated
   */
  Expression getExpression1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression1 <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression1</em>' containment reference.
   * @see #getExpression1()
   * @generated
   */
  void setExpression1(Expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConditional_expression_Expression2()
   * @model containment="true"
   * @generated
   */
  Expression getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Conditional_expression#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(Expression value);

} // Conditional_expression
