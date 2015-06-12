/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getCastexpression <em>Castexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnary_expression_Not_Plus_Minus()
 * @model
 * @generated
 */
public interface Unary_expression_Not_Plus_Minus extends Unary_expression
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnary_expression_Not_Plus_Minus_Unaryexpression()
   * @model containment="true"
   * @generated
   */
  Unary_expression getUnaryexpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getUnaryexpression <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unaryexpression</em>' containment reference.
   * @see #getUnaryexpression()
   * @generated
   */
  void setUnaryexpression(Unary_expression value);

  /**
   * Returns the value of the '<em><b>Castexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Castexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Castexpression</em>' containment reference.
   * @see #setCastexpression(Cast_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnary_expression_Not_Plus_Minus_Castexpression()
   * @model containment="true"
   * @generated
   */
  Cast_expression getCastexpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getCastexpression <em>Castexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Castexpression</em>' containment reference.
   * @see #getCastexpression()
   * @generated
   */
  void setCastexpression(Cast_expression value);

  /**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(Primary_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnary_expression_Not_Plus_Minus_Primary()
   * @model containment="true"
   * @generated
   */
  Primary_expression getPrimary();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(Primary_expression value);

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUnary_expression_Not_Plus_Minus_Selector()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelector();

} // Unary_expression_Not_Plus_Minus
