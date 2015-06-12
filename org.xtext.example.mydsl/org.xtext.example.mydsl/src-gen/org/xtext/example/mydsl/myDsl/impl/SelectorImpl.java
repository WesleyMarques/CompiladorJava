/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Inner_creator;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Selector;
import org.xtext.example.mydsl.myDsl.Super_suffix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SelectorImpl#getSupersuffix <em>Supersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SelectorImpl#getInnercreator <em>Innercreator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SelectorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorImpl extends MinimalEObjectImpl.Container implements Selector
{
  /**
   * The cached value of the '{@link #getSupersuffix() <em>Supersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupersuffix()
   * @generated
   * @ordered
   */
  protected Super_suffix supersuffix;

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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
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
    return MyDslPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Super_suffix getSupersuffix()
  {
    return supersuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupersuffix(Super_suffix newSupersuffix, NotificationChain msgs)
  {
    Super_suffix oldSupersuffix = supersuffix;
    supersuffix = newSupersuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__SUPERSUFFIX, oldSupersuffix, newSupersuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupersuffix(Super_suffix newSupersuffix)
  {
    if (newSupersuffix != supersuffix)
    {
      NotificationChain msgs = null;
      if (supersuffix != null)
        msgs = ((InternalEObject)supersuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__SUPERSUFFIX, null, msgs);
      if (newSupersuffix != null)
        msgs = ((InternalEObject)newSupersuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__SUPERSUFFIX, null, msgs);
      msgs = basicSetSupersuffix(newSupersuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__SUPERSUFFIX, newSupersuffix, newSupersuffix));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__INNERCREATOR, oldInnercreator, newInnercreator);
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
        msgs = ((InternalEObject)innercreator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__INNERCREATOR, null, msgs);
      if (newInnercreator != null)
        msgs = ((InternalEObject)newInnercreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__INNERCREATOR, null, msgs);
      msgs = basicSetInnercreator(newInnercreator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__INNERCREATOR, newInnercreator, newInnercreator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SELECTOR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SELECTOR__EXPRESSION, newExpression, newExpression));
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
      case MyDslPackage.SELECTOR__SUPERSUFFIX:
        return basicSetSupersuffix(null, msgs);
      case MyDslPackage.SELECTOR__INNERCREATOR:
        return basicSetInnercreator(null, msgs);
      case MyDslPackage.SELECTOR__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case MyDslPackage.SELECTOR__SUPERSUFFIX:
        return getSupersuffix();
      case MyDslPackage.SELECTOR__INNERCREATOR:
        return getInnercreator();
      case MyDslPackage.SELECTOR__EXPRESSION:
        return getExpression();
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
      case MyDslPackage.SELECTOR__SUPERSUFFIX:
        setSupersuffix((Super_suffix)newValue);
        return;
      case MyDslPackage.SELECTOR__INNERCREATOR:
        setInnercreator((Inner_creator)newValue);
        return;
      case MyDslPackage.SELECTOR__EXPRESSION:
        setExpression((Expression)newValue);
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
      case MyDslPackage.SELECTOR__SUPERSUFFIX:
        setSupersuffix((Super_suffix)null);
        return;
      case MyDslPackage.SELECTOR__INNERCREATOR:
        setInnercreator((Inner_creator)null);
        return;
      case MyDslPackage.SELECTOR__EXPRESSION:
        setExpression((Expression)null);
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
      case MyDslPackage.SELECTOR__SUPERSUFFIX:
        return supersuffix != null;
      case MyDslPackage.SELECTOR__INNERCREATOR:
        return innercreator != null;
      case MyDslPackage.SELECTOR__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectorImpl
