/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Arguments;
import org.xtext.example.mydsl.myDsl.Class_creator_rest;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class creator rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Class_creator_restImpl#getClassbody <em>Classbody</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class_creator_restImpl extends MinimalEObjectImpl.Container implements Class_creator_rest
{
  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected Arguments arguments;

  /**
   * The cached value of the '{@link #getClassbody() <em>Classbody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassbody()
   * @generated
   * @ordered
   */
  protected Class_declaration classbody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_creator_restImpl()
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
    return MyDslPackage.Literals.CLASS_CREATOR_REST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(Arguments newArguments, NotificationChain msgs)
  {
    Arguments oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(Arguments newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS, newArguments, newArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_declaration getClassbody()
  {
    return classbody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassbody(Class_declaration newClassbody, NotificationChain msgs)
  {
    Class_declaration oldClassbody = classbody;
    classbody = newClassbody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_CREATOR_REST__CLASSBODY, oldClassbody, newClassbody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassbody(Class_declaration newClassbody)
  {
    if (newClassbody != classbody)
    {
      NotificationChain msgs = null;
      if (classbody != null)
        msgs = ((InternalEObject)classbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS_CREATOR_REST__CLASSBODY, null, msgs);
      if (newClassbody != null)
        msgs = ((InternalEObject)newClassbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS_CREATOR_REST__CLASSBODY, null, msgs);
      msgs = basicSetClassbody(newClassbody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS_CREATOR_REST__CLASSBODY, newClassbody, newClassbody));
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
      case MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS:
        return basicSetArguments(null, msgs);
      case MyDslPackage.CLASS_CREATOR_REST__CLASSBODY:
        return basicSetClassbody(null, msgs);
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
      case MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS:
        return getArguments();
      case MyDslPackage.CLASS_CREATOR_REST__CLASSBODY:
        return getClassbody();
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
      case MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS:
        setArguments((Arguments)newValue);
        return;
      case MyDslPackage.CLASS_CREATOR_REST__CLASSBODY:
        setClassbody((Class_declaration)newValue);
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
      case MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS:
        setArguments((Arguments)null);
        return;
      case MyDslPackage.CLASS_CREATOR_REST__CLASSBODY:
        setClassbody((Class_declaration)null);
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
      case MyDslPackage.CLASS_CREATOR_REST__ARGUMENTS:
        return arguments != null;
      case MyDslPackage.CLASS_CREATOR_REST__CLASSBODY:
        return classbody != null;
    }
    return super.eIsSet(featureID);
  }

} //Class_creator_restImpl
