/**
 */
package org.xtext.compilador.java.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.Compilation_unit#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Compilation_unit#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.Compilation_unit#getTypeDeclaration <em>Type Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.compilador.java.myDsl.MyDslPackage#getCompilation_unit()
 * @model
 * @generated
 */
public interface Compilation_unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Package_statement)
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getCompilation_unit_Name()
   * @model containment="true"
   * @generated
   */
  Package_statement getName();

  /**
   * Sets the value of the '{@link org.xtext.compilador.java.myDsl.Compilation_unit#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Package_statement value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilador.java.myDsl.Import_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getCompilation_unit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import_statement> getImports();

  /**
   * Returns the value of the '<em><b>Type Declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilador.java.myDsl.Type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Declaration</em>' containment reference list.
   * @see org.xtext.compilador.java.myDsl.MyDslPackage#getCompilation_unit_TypeDeclaration()
   * @model containment="true"
   * @generated
   */
  EList<Type_declaration> getTypeDeclaration();

} // Compilation_unit
