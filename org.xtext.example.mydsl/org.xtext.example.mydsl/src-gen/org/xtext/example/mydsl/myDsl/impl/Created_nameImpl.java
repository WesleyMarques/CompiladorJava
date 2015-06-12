/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Array_creator_rest;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Created_name;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Primitive_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Created name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Created_nameImpl#getArraycreatorrest <em>Arraycreatorrest</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Created_nameImpl#getClassorinterfacetype <em>Classorinterfacetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Created_nameImpl#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Created_nameImpl extends CreatorImpl implements Created_name
{
  /**
   * The cached value of the '{@link #getArraycreatorrest() <em>Arraycreatorrest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraycreatorrest()
   * @generated
   * @ordered
   */
  protected Array_creator_rest arraycreatorrest;

  /**
   * The cached value of the '{@link #getClassorinterfacetype() <em>Classorinterfacetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassorinterfacetype()
   * @generated
   * @ordered
   */
  protected Class_declaration classorinterfacetype;

  /**
   * The cached value of the '{@link #getPrimitivetype() <em>Primitivetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitivetype()
   * @generated
   * @ordered
   */
  protected Primitive_type primitivetype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Created_nameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CREATED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_creator_rest getArraycreatorrest()
  {
    return arraycreatorrest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArraycreatorrest(Array_creator_rest newArraycreatorrest, NotificationChain msgs)
  {
    Array_creator_rest oldArraycreatorrest = arraycreatorrest;
    arraycreatorrest = newArraycreatorrest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__ARRAYCREATORREST, oldArraycreatorrest, newArraycreatorrest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArraycreatorrest(Array_creator_rest newArraycreatorrest)
  {
    if (newArraycreatorrest != arraycreatorrest)
    {
      NotificationChain msgs = null;
      if (arraycreatorrest != null)
        msgs = ((InternalEObject)arraycreatorrest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__ARRAYCREATORREST, null, msgs);
      if (newArraycreatorrest != null)
        msgs = ((InternalEObject)newArraycreatorrest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__ARRAYCREATORREST, null, msgs);
      msgs = basicSetArraycreatorrest(newArraycreatorrest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__ARRAYCREATORREST, newArraycreatorrest, newArraycreatorrest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_declaration getClassorinterfacetype()
  {
    return classorinterfacetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassorinterfacetype(Class_declaration newClassorinterfacetype, NotificationChain msgs)
  {
    Class_declaration oldClassorinterfacetype = classorinterfacetype;
    classorinterfacetype = newClassorinterfacetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE, oldClassorinterfacetype, newClassorinterfacetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassorinterfacetype(Class_declaration newClassorinterfacetype)
  {
    if (newClassorinterfacetype != classorinterfacetype)
    {
      NotificationChain msgs = null;
      if (classorinterfacetype != null)
        msgs = ((InternalEObject)classorinterfacetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE, null, msgs);
      if (newClassorinterfacetype != null)
        msgs = ((InternalEObject)newClassorinterfacetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE, null, msgs);
      msgs = basicSetClassorinterfacetype(newClassorinterfacetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE, newClassorinterfacetype, newClassorinterfacetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive_type getPrimitivetype()
  {
    return primitivetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitivetype(Primitive_type newPrimitivetype, NotificationChain msgs)
  {
    Primitive_type oldPrimitivetype = primitivetype;
    primitivetype = newPrimitivetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__PRIMITIVETYPE, oldPrimitivetype, newPrimitivetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitivetype(Primitive_type newPrimitivetype)
  {
    if (newPrimitivetype != primitivetype)
    {
      NotificationChain msgs = null;
      if (primitivetype != null)
        msgs = ((InternalEObject)primitivetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__PRIMITIVETYPE, null, msgs);
      if (newPrimitivetype != null)
        msgs = ((InternalEObject)newPrimitivetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATED_NAME__PRIMITIVETYPE, null, msgs);
      msgs = basicSetPrimitivetype(newPrimitivetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATED_NAME__PRIMITIVETYPE, newPrimitivetype, newPrimitivetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CREATED_NAME__ARRAYCREATORREST:
        return basicSetArraycreatorrest(null, msgs);
      case MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE:
        return basicSetClassorinterfacetype(null, msgs);
      case MyDslPackage.CREATED_NAME__PRIMITIVETYPE:
        return basicSetPrimitivetype(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CREATED_NAME__ARRAYCREATORREST:
        return getArraycreatorrest();
      case MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE:
        return getClassorinterfacetype();
      case MyDslPackage.CREATED_NAME__PRIMITIVETYPE:
        return getPrimitivetype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CREATED_NAME__ARRAYCREATORREST:
        setArraycreatorrest((Array_creator_rest)newValue);
        return;
      case MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE:
        setClassorinterfacetype((Class_declaration)newValue);
        return;
      case MyDslPackage.CREATED_NAME__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CREATED_NAME__ARRAYCREATORREST:
        setArraycreatorrest((Array_creator_rest)null);
        return;
      case MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE:
        setClassorinterfacetype((Class_declaration)null);
        return;
      case MyDslPackage.CREATED_NAME__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CREATED_NAME__ARRAYCREATORREST:
        return arraycreatorrest != null;
      case MyDslPackage.CREATED_NAME__CLASSORINTERFACETYPE:
        return classorinterfacetype != null;
      case MyDslPackage.CREATED_NAME__PRIMITIVETYPE:
        return primitivetype != null;
    }
    return super.eIsSet(featureID);
  }

} //Created_nameImpl
