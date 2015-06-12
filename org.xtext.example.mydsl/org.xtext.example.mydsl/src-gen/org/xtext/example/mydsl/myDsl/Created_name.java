/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Created name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Created_name#getArraycreatorrest <em>Arraycreatorrest</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Created_name#getClassorinterfacetype <em>Classorinterfacetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Created_name#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreated_name()
 * @model
 * @generated
 */
public interface Created_name extends Creator
{
  /**
   * Returns the value of the '<em><b>Arraycreatorrest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arraycreatorrest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arraycreatorrest</em>' containment reference.
   * @see #setArraycreatorrest(Array_creator_rest)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreated_name_Arraycreatorrest()
   * @model containment="true"
   * @generated
   */
  Array_creator_rest getArraycreatorrest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Created_name#getArraycreatorrest <em>Arraycreatorrest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arraycreatorrest</em>' containment reference.
   * @see #getArraycreatorrest()
   * @generated
   */
  void setArraycreatorrest(Array_creator_rest value);

  /**
   * Returns the value of the '<em><b>Classorinterfacetype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classorinterfacetype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classorinterfacetype</em>' containment reference.
   * @see #setClassorinterfacetype(Class_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreated_name_Classorinterfacetype()
   * @model containment="true"
   * @generated
   */
  Class_declaration getClassorinterfacetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Created_name#getClassorinterfacetype <em>Classorinterfacetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classorinterfacetype</em>' containment reference.
   * @see #getClassorinterfacetype()
   * @generated
   */
  void setClassorinterfacetype(Class_declaration value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreated_name_Primitivetype()
   * @model containment="true"
   * @generated
   */
  Primitive_type getPrimitivetype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Created_name#getPrimitivetype <em>Primitivetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitivetype</em>' containment reference.
   * @see #getPrimitivetype()
   * @generated
   */
  void setPrimitivetype(Primitive_type value);

} // Created_name
