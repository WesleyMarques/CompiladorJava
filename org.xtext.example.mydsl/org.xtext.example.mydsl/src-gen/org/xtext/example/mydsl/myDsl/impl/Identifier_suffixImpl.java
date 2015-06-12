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
import org.xtext.example.mydsl.myDsl.Identifier_suffix;
import org.xtext.example.mydsl.myDsl.Inner_creator;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier suffix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl#getExplicitgenericinvocation <em>Explicitgenericinvocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Identifier_suffixImpl#getInnercreator <em>Innercreator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Identifier_suffixImpl extends MinimalEObjectImpl.Container implements Identifier_suffix
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
   * The cached value of the '{@link #getExplicitgenericinvocation() <em>Explicitgenericinvocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplicitgenericinvocation()
   * @generated
   * @ordered
   */
  protected Explicit_generic_invocation explicitgenericinvocation;

  /**
   * The cached value of the '{@link #getInnercreator() <em>Innercreator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnercreator()
   * @generated
   * @ordered
   */
  protected Inner_creator innercreator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Identifier_suffixImpl()
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
    return MyDslPackage.Literals.IDENTIFIER_SUFFIX;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS, oldArguments, newArguments);
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
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS, newArguments, newArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Explicit_generic_invocation getExplicitgenericinvocation()
  {
    return explicitgenericinvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExplicitgenericinvocation(Explicit_generic_invocation newExplicitgenericinvocation, NotificationChain msgs)
  {
    Explicit_generic_invocation oldExplicitgenericinvocation = explicitgenericinvocation;
    explicitgenericinvocation = newExplicitgenericinvocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION, oldExplicitgenericinvocation, newExplicitgenericinvocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitgenericinvocation(Explicit_generic_invocation newExplicitgenericinvocation)
  {
    if (newExplicitgenericinvocation != explicitgenericinvocation)
    {
      NotificationChain msgs = null;
      if (explicitgenericinvocation != null)
        msgs = ((InternalEObject)explicitgenericinvocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION, null, msgs);
      if (newExplicitgenericinvocation != null)
        msgs = ((InternalEObject)newExplicitgenericinvocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION, null, msgs);
      msgs = basicSetExplicitgenericinvocation(newExplicitgenericinvocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION, newExplicitgenericinvocation, newExplicitgenericinvocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inner_creator getInnercreator()
  {
    return innercreator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnercreator(Inner_creator newInnercreator, NotificationChain msgs)
  {
    Inner_creator oldInnercreator = innercreator;
    innercreator = newInnercreator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR, oldInnercreator, newInnercreator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnercreator(Inner_creator newInnercreator)
  {
    if (newInnercreator != innercreator)
    {
      NotificationChain msgs = null;
      if (innercreator != null)
        msgs = ((InternalEObject)innercreator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR, null, msgs);
      if (newInnercreator != null)
        msgs = ((InternalEObject)newInnercreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR, null, msgs);
      msgs = basicSetInnercreator(newInnercreator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR, newInnercreator, newInnercreator));
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
      case MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return basicSetArguments(null, msgs);
      case MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION:
        return basicSetExplicitgenericinvocation(null, msgs);
      case MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR:
        return basicSetInnercreator(null, msgs);
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
      case MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return getArguments();
      case MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION:
        return getExplicitgenericinvocation();
      case MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR:
        return getInnercreator();
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
      case MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        setArguments((Arguments)newValue);
        return;
      case MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION:
        setExplicitgenericinvocation((Explicit_generic_invocation)newValue);
        return;
      case MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR:
        setInnercreator((Inner_creator)newValue);
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
      case MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        setArguments((Arguments)null);
        return;
      case MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION:
        setExplicitgenericinvocation((Explicit_generic_invocation)null);
        return;
      case MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR:
        setInnercreator((Inner_creator)null);
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
      case MyDslPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return arguments != null;
      case MyDslPackage.IDENTIFIER_SUFFIX__EXPLICITGENERICINVOCATION:
        return explicitgenericinvocation != null;
      case MyDslPackage.IDENTIFIER_SUFFIX__INNERCREATOR:
        return innercreator != null;
    }
    return super.eIsSet(featureID);
  }

} //Identifier_suffixImpl
