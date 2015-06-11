/**
 */
package org.xtext.example.mydsl.myJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.Interface_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Interface_declaration#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Interface_declaration#getInterfaceHerdada <em>Interface Herdada</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.Interface_declaration#getInterfacesHerdadas <em>Interfaces Herdadas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getInterface_declaration()
 * @model
 * @generated
 */
public interface Interface_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getInterface_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

  /**
   * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Name</em>' attribute.
   * @see #setInterfaceName(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getInterface_declaration_InterfaceName()
   * @model
   * @generated
   */
  String getInterfaceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Interface_declaration#getInterfaceName <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Name</em>' attribute.
   * @see #getInterfaceName()
   * @generated
   */
  void setInterfaceName(String value);

  /**
   * Returns the value of the '<em><b>Interface Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Herdada</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Herdada</em>' attribute.
   * @see #setInterfaceHerdada(String)
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getInterface_declaration_InterfaceHerdada()
   * @model
   * @generated
   */
  String getInterfaceHerdada();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myJava.Interface_declaration#getInterfaceHerdada <em>Interface Herdada</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Herdada</em>' attribute.
   * @see #getInterfaceHerdada()
   * @generated
   */
  void setInterfaceHerdada(String value);

  /**
   * Returns the value of the '<em><b>Interfaces Herdadas</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces Herdadas</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces Herdadas</em>' attribute list.
   * @see org.xtext.example.mydsl.myJava.MyJavaPackage#getInterface_declaration_InterfacesHerdadas()
   * @model unique="false"
   * @generated
   */
  EList<String> getInterfacesHerdadas();

} // Interface_declaration
