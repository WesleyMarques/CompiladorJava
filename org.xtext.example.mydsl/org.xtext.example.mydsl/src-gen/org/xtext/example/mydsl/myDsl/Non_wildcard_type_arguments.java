/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non wildcard type arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getCreatedname <em>Createdname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNon_wildcard_type_arguments()
 * @model
 * @generated
 */
public interface Non_wildcard_type_arguments extends Creator
{
  /**
   * Returns the value of the '<em><b>Createdname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Createdname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Createdname</em>' containment reference.
   * @see #setCreatedname(Created_name)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNon_wildcard_type_arguments_Createdname()
   * @model containment="true"
   * @generated
   */
  Created_name getCreatedname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getCreatedname <em>Createdname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Createdname</em>' containment reference.
   * @see #getCreatedname()
   * @generated
   */
  void setCreatedname(Created_name value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNon_wildcard_type_arguments_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Non_wildcard_type_arguments
