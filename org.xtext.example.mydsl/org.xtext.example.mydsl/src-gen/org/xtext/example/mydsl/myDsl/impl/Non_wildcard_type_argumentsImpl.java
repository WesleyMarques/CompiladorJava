/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Created_name;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non wildcard type arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl#getCreatedname <em>Createdname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Non_wildcard_type_argumentsImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Non_wildcard_type_argumentsImpl extends CreatorImpl implements Non_wildcard_type_arguments
{
  /**
   * The cached value of the '{@link #getCreatedname() <em>Createdname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedname()
   * @generated
   * @ordered
   */
  protected Created_name createdname;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Non_wildcard_type_argumentsImpl()
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
    return MyDslPackage.Literals.NON_WILDCARD_TYPE_ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Created_name getCreatedname()
  {
    return createdname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreatedname(Created_name newCreatedname, NotificationChain msgs)
  {
    Created_name oldCreatedname = createdname;
    createdname = newCreatedname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME, oldCreatedname, newCreatedname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatedname(Created_name newCreatedname)
  {
    if (newCreatedname != createdname)
    {
      NotificationChain msgs = null;
      if (createdname != null)
        msgs = ((InternalEObject)createdname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME, null, msgs);
      if (newCreatedname != null)
        msgs = ((InternalEObject)newCreatedname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME, null, msgs);
      msgs = basicSetCreatedname(newCreatedname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME, newCreatedname, newCreatedname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE, newType, newType));
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
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME:
        return basicSetCreatedname(null, msgs);
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE:
        return basicSetType(null, msgs);
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
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME:
        return getCreatedname();
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE:
        return getType();
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
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME:
        setCreatedname((Created_name)newValue);
        return;
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE:
        setType((Type)newValue);
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
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME:
        setCreatedname((Created_name)null);
        return;
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE:
        setType((Type)null);
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
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__CREATEDNAME:
        return createdname != null;
      case MyDslPackage.NON_WILDCARD_TYPE_ARGUMENTS__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //Non_wildcard_type_argumentsImpl
