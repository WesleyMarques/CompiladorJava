/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.For_control;
import org.xtext.example.mydsl.myDsl.For_expression;
import org.xtext.example.mydsl.myDsl.For_init;
import org.xtext.example.mydsl.myDsl.For_update;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_controlImpl#getForinit <em>Forinit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_controlImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_controlImpl#getForupdate <em>Forupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_controlImpl extends MinimalEObjectImpl.Container implements For_control
{
  /**
   * The cached value of the '{@link #getForinit() <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForinit()
   * @generated
   * @ordered
   */
  protected For_init forinit;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected For_expression expression;

  /**
   * The cached value of the '{@link #getForupdate() <em>Forupdate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForupdate()
   * @generated
   * @ordered
   */
  protected For_update forupdate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_controlImpl()
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
    return MyDslPackage.Literals.FOR_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_init getForinit()
  {
    return forinit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForinit(For_init newForinit, NotificationChain msgs)
  {
    For_init oldForinit = forinit;
    forinit = newForinit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__FORINIT, oldForinit, newForinit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForinit(For_init newForinit)
  {
    if (newForinit != forinit)
    {
      NotificationChain msgs = null;
      if (forinit != null)
        msgs = ((InternalEObject)forinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__FORINIT, null, msgs);
      if (newForinit != null)
        msgs = ((InternalEObject)newForinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__FORINIT, null, msgs);
      msgs = basicSetForinit(newForinit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__FORINIT, newForinit, newForinit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(For_expression newExpression, NotificationChain msgs)
  {
    For_expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(For_expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_update getForupdate()
  {
    return forupdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForupdate(For_update newForupdate, NotificationChain msgs)
  {
    For_update oldForupdate = forupdate;
    forupdate = newForupdate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__FORUPDATE, oldForupdate, newForupdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForupdate(For_update newForupdate)
  {
    if (newForupdate != forupdate)
    {
      NotificationChain msgs = null;
      if (forupdate != null)
        msgs = ((InternalEObject)forupdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__FORUPDATE, null, msgs);
      if (newForupdate != null)
        msgs = ((InternalEObject)newForupdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_CONTROL__FORUPDATE, null, msgs);
      msgs = basicSetForupdate(newForupdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_CONTROL__FORUPDATE, newForupdate, newForupdate));
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
      case MyDslPackage.FOR_CONTROL__FORINIT:
        return basicSetForinit(null, msgs);
      case MyDslPackage.FOR_CONTROL__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.FOR_CONTROL__FORUPDATE:
        return basicSetForupdate(null, msgs);
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
      case MyDslPackage.FOR_CONTROL__FORINIT:
        return getForinit();
      case MyDslPackage.FOR_CONTROL__EXPRESSION:
        return getExpression();
      case MyDslPackage.FOR_CONTROL__FORUPDATE:
        return getForupdate();
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
      case MyDslPackage.FOR_CONTROL__FORINIT:
        setForinit((For_init)newValue);
        return;
      case MyDslPackage.FOR_CONTROL__EXPRESSION:
        setExpression((For_expression)newValue);
        return;
      case MyDslPackage.FOR_CONTROL__FORUPDATE:
        setForupdate((For_update)newValue);
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
      case MyDslPackage.FOR_CONTROL__FORINIT:
        setForinit((For_init)null);
        return;
      case MyDslPackage.FOR_CONTROL__EXPRESSION:
        setExpression((For_expression)null);
        return;
      case MyDslPackage.FOR_CONTROL__FORUPDATE:
        setForupdate((For_update)null);
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
      case MyDslPackage.FOR_CONTROL__FORINIT:
        return forinit != null;
      case MyDslPackage.FOR_CONTROL__EXPRESSION:
        return expression != null;
      case MyDslPackage.FOR_CONTROL__FORUPDATE:
        return forupdate != null;
    }
    return super.eIsSet(featureID);
  }

} //For_controlImpl
