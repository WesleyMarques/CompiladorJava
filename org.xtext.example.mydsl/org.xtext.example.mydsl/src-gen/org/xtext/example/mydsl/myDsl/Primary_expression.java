/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifiersuffix <em>Identifiersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getSupersuffix <em>Supersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Primary_expression#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression()
 * @model
 * @generated
 */
public interface Primary_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parexpression</em>' containment reference.
   * @see #setParexpression(Parens_expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Parexpression()
   * @model containment="true"
   * @generated
   */
  Parens_expression getParexpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getParexpression <em>Parexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parexpression</em>' containment reference.
   * @see #getParexpression()
   * @generated
   */
  void setParexpression(Parens_expression value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Identifier()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifier();

  /**
   * Returns the value of the '<em><b>Identifiersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiersuffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiersuffix</em>' containment reference.
   * @see #setIdentifiersuffix(Identifier_suffix)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Identifiersuffix()
   * @model containment="true"
   * @generated
   */
  Identifier_suffix getIdentifiersuffix();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getIdentifiersuffix <em>Identifiersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiersuffix</em>' containment reference.
   * @see #getIdentifiersuffix()
   * @generated
   */
  void setIdentifiersuffix(Identifier_suffix value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Supersuffix()
   * @model containment="true"
   * @generated
   */
  Super_suffix getSupersuffix();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getSupersuffix <em>Supersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supersuffix</em>' containment reference.
   * @see #getSupersuffix()
   * @generated
   */
  void setSupersuffix(Super_suffix value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>Creator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creator</em>' containment reference.
   * @see #setCreator(Creator)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Creator()
   * @model containment="true"
   * @generated
   */
  Creator getCreator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getCreator <em>Creator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creator</em>' containment reference.
   * @see #getCreator()
   * @generated
   */
  void setCreator(Creator value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimary_expression_Primitivetype()
   * @model containment="true"
   * @generated
   */
  Primitive_type getPrimitivetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Primary_expression#getPrimitivetype <em>Primitivetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitivetype</em>' containment reference.
   * @see #getPrimitivetype()
   * @generated
   */
  void setPrimitivetype(Primitive_type value);

} // Primary_expression
