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
import org.xtext.example.mydsl.myDsl.Explicit_generic_invocation;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Non_wildcard_type_arguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit generic invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl#getNonwildcardtypearguments <em>Nonwildcardtypearguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Explicit_generic_invocationImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Explicit_generic_invocationImpl extends MinimalEObjectImpl.Container implements Explicit_generic_invocation
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
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected Arguments arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Explicit_generic_invocationImpl()
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
    return MyDslPackage.Literals.EXPLICIT_GENERIC_INVOCATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS, oldNonwildcardtypearguments, newNonwildcardtypearguments);
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
        msgs = ((InternalEObject)nonwildcardtypearguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS, null, msgs);
      if (newNonwildcardtypearguments != null)
        msgs = ((InternalEObject)newNonwildcardtypearguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS, null, msgs);
      msgs = basicSetNonwildcardtypearguments(newNonwildcardtypearguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS, newNonwildcardtypearguments, newNonwildcardtypearguments));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPLICIT_GENERIC_INVOCATION__IDENTIFIER, oldIdentifier, identifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS, oldArguments, newArguments);
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
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS, newArguments, newArguments));
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
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS:
        return basicSetNonwildcardtypearguments(null, msgs);
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS:
        return basicSetArguments(null, msgs);
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
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS:
        return getNonwildcardtypearguments();
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS:
        return getArguments();
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
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS:
        setNonwildcardtypearguments((Non_wildcard_type_arguments)newValue);
        return;
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS:
        setArguments((Arguments)newValue);
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
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS:
        setNonwildcardtypearguments((Non_wildcard_type_arguments)null);
        return;
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS:
        setArguments((Arguments)null);
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
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__NONWILDCARDTYPEARGUMENTS:
        return nonwildcardtypearguments != null;
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case MyDslPackage.EXPLICIT_GENERIC_INVOCATION__ARGUMENTS:
        return arguments != null;
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

} //Explicit_generic_invocationImpl
