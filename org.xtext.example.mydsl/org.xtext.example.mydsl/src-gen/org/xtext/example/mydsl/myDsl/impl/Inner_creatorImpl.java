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
import org.xtext.example.mydsl.myDsl.Inner_creator;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Inner_creatorImpl#getClasscreatorrest <em>Classcreatorrest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Inner_creatorImpl extends MinimalEObjectImpl.Container implements Inner_creator
{
  /**
   * The cached value of the '{@link #getNonwildcardtypearguments() <em>Nonwildcardtypearguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonwildcardtypearguments()
   * @generated
   * @ordered
   */
  protected Non_wildcard_type_arguments nonwildcardtypearguments;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

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
  protected Inner_creatorImpl()
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
    return MyDslPackage.Literals.INNER_CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Non_wildcard_type_arguments getNonwildcardtypearguments()
  {
    return nonwildcardtypearguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNonwildcardtypearguments(Non_wildcard_type_arguments newNonwildcardtypearguments, NotificationChain msgs)
  {
    Non_wildcard_type_arguments oldNonwildcardtypearguments = nonwildcardtypearguments;
    nonwildcardtypearguments = newNonwildcardtypearguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS, oldNonwildcardtypearguments, newNonwildcardtypearguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNonwildcardtypearguments(Non_wildcard_type_arguments newNonwildcardtypearguments)
  {
    if (newNonwildcardtypearguments != nonwildcardtypearguments)
    {
      NotificationChain msgs = null;
      if (nonwildcardtypearguments != null)
        msgs = ((InternalEObject)nonwildcardtypearguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS, null, msgs);
      if (newNonwildcardtypearguments != null)
        msgs = ((InternalEObject)newNonwildcardtypearguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS, null, msgs);
      msgs = basicSetNonwildcardtypearguments(newNonwildcardtypearguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS, newNonwildcardtypearguments, newNonwildcardtypearguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INNER_CREATOR__IDENTIFIER, oldIdentifier, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.INNER_CREATOR__CLASSCREATORREST, oldClasscreatorrest, newClasscreatorrest);
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
        msgs = ((InternalEObject)classcreatorrest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INNER_CREATOR__CLASSCREATORREST, null, msgs);
      if (newClasscreatorrest != null)
        msgs = ((InternalEObject)newClasscreatorrest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.INNER_CREATOR__CLASSCREATORREST, null, msgs);
      msgs = basicSetClasscreatorrest(newClasscreatorrest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INNER_CREATOR__CLASSCREATORREST, newClasscreatorrest, newClasscreatorrest));
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
      case MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS:
        return basicSetNonwildcardtypearguments(null, msgs);
      case MyDslPackage.INNER_CREATOR__CLASSCREATORREST:
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
      case MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS:
        return getNonwildcardtypearguments();
      case MyDslPackage.INNER_CREATOR__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.INNER_CREATOR__CLASSCREATORREST:
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
      case MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS:
        setNonwildcardtypearguments((Non_wildcard_type_arguments)newValue);
        return;
      case MyDslPackage.INNER_CREATOR__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case MyDslPackage.INNER_CREATOR__CLASSCREATORREST:
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
      case MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS:
        setNonwildcardtypearguments((Non_wildcard_type_arguments)null);
        return;
      case MyDslPackage.INNER_CREATOR__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.INNER_CREATOR__CLASSCREATORREST:
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
      case MyDslPackage.INNER_CREATOR__NONWILDCARDTYPEARGUMENTS:
        return nonwildcardtypearguments != null;
      case MyDslPackage.INNER_CREATOR__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.INNER_CREATOR__CLASSCREATORREST:
        return classcreatorrest != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //Inner_creatorImpl
