/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Class_creator_rest;
import org.xtext.example.mydsl.myDsl.Creator;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CreatorImpl#getClasscreatorrest <em>Classcreatorrest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatorImpl extends MinimalEObjectImpl.Container implements Creator
{
  /**
   * The cached value of the '{@link #getClasscreatorrest() <em>Classcreatorrest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasscreatorrest()
   * @generated
   * @ordered
   */
  protected Class_creator_rest classcreatorrest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreatorImpl()
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
    return MyDslPackage.Literals.CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_creator_rest getClasscreatorrest()
  {
    return classcreatorrest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClasscreatorrest(Class_creator_rest newClasscreatorrest, NotificationChain msgs)
  {
    Class_creator_rest oldClasscreatorrest = classcreatorrest;
    classcreatorrest = newClasscreatorrest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATOR__CLASSCREATORREST, oldClasscreatorrest, newClasscreatorrest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClasscreatorrest(Class_creator_rest newClasscreatorrest)
  {
    if (newClasscreatorrest != classcreatorrest)
    {
      NotificationChain msgs = null;
      if (classcreatorrest != null)
        msgs = ((InternalEObject)classcreatorrest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATOR__CLASSCREATORREST, null, msgs);
      if (newClasscreatorrest != null)
        msgs = ((InternalEObject)newClasscreatorrest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CREATOR__CLASSCREATORREST, null, msgs);
      msgs = basicSetClasscreatorrest(newClasscreatorrest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CREATOR__CLASSCREATORREST, newClasscreatorrest, newClasscreatorrest));
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
      case MyDslPackage.CREATOR__CLASSCREATORREST:
        return basicSetClasscreatorrest(null, msgs);
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
      case MyDslPackage.CREATOR__CLASSCREATORREST:
        return getClasscreatorrest();
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
      case MyDslPackage.CREATOR__CLASSCREATORREST:
        setClasscreatorrest((Class_creator_rest)newValue);
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
      case MyDslPackage.CREATOR__CLASSCREATORREST:
        setClasscreatorrest((Class_creator_rest)null);
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
      case MyDslPackage.CREATOR__CLASSCREATORREST:
        return classcreatorrest != null;
    }
    return super.eIsSet(featureID);
  }

} //CreatorImpl
