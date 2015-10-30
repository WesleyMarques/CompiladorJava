/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getTypeVector <em>Type Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Specifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Specifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Specifier</em>' attribute.
   * @see #setTypeSpecifier(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_TypeSpecifier()
   * @model
   * @generated
   */
  String getTypeSpecifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Specifier</em>' attribute.
   * @see #getTypeSpecifier()
   * @generated
   */
  void setTypeSpecifier(String value);

  /**
   * Returns the value of the '<em><b>Type Vector</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Vector</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Vector</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_TypeVector()
   * @model unique="false"
   * @generated
   */
  EList<String> getTypeVector();

} // Type
