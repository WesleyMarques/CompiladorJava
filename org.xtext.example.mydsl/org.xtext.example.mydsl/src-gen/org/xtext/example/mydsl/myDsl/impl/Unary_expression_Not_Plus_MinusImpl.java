/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Cast_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Primary_expression;
import org.xtext.example.mydsl.myDsl.Selector;
import org.xtext.example.mydsl.myDsl.Unary_expression;
import org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl#getCastexpression <em>Castexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Unary_expression_Not_Plus_MinusImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Unary_expression_Not_Plus_MinusImpl extends Unary_expressionImpl implements Unary_expression_Not_Plus_Minus
{
  /**
   * The cached value of the '{@link #getUnaryexpression() <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryexpression()
   * @generated
   * @ordered
   */
  protected Unary_expression unaryexpression;

  /**
   * The cached value of the '{@link #getCastexpression() <em>Castexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastexpression()
   * @generated
   * @ordered
   */
  protected Cast_expression castexpression;

  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected Primary_expression primary;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected EList<Selector> selector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Unary_expression_Not_Plus_MinusImpl()
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
    return MyDslPackage.Literals.UNARY_EXPRESSION_NOT_PLUS_MINUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expression getUnaryexpression()
  {
    return unaryexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryexpression(Unary_expression newUnaryexpression, NotificationChain msgs)
  {
    Unary_expression oldUnaryexpression = unaryexpression;
    unaryexpression = newUnaryexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, oldUnaryexpression, newUnaryexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryexpression(Unary_expression newUnaryexpression)
  {
    if (newUnaryexpression != unaryexpression)
    {
      NotificationChain msgs = null;
      if (unaryexpression != null)
        msgs = ((InternalEObject)unaryexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, null, msgs);
      if (newUnaryexpression != null)
        msgs = ((InternalEObject)newUnaryexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, null, msgs);
      msgs = basicSetUnaryexpression(newUnaryexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, newUnaryexpression, newUnaryexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast_expression getCastexpression()
  {
    return castexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastexpression(Cast_expression newCastexpression, NotificationChain msgs)
  {
    Cast_expression oldCastexpression = castexpression;
    castexpression = newCastexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, oldCastexpression, newCastexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastexpression(Cast_expression newCastexpression)
  {
    if (newCastexpression != castexpression)
    {
      NotificationChain msgs = null;
      if (castexpression != null)
        msgs = ((InternalEObject)castexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, null, msgs);
      if (newCastexpression != null)
        msgs = ((InternalEObject)newCastexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, null, msgs);
      msgs = basicSetCastexpression(newCastexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, newCastexpression, newCastexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary_expression getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary(Primary_expression newPrimary, NotificationChain msgs)
  {
    Primary_expression oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(Primary_expression newPrimary)
  {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, newPrimary, newPrimary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Selector> getSelector()
  {
    if (selector == null)
    {
      selector = new EObjectContainmentEList<Selector>(Selector.class, this, MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR);
    }
    return selector;
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
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return basicSetUnaryexpression(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return basicSetCastexpression(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return basicSetPrimary(null, msgs);
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR:
        return ((InternalEList<?>)getSelector()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return getUnaryexpression();
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return getCastexpression();
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return getPrimary();
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR:
        return getSelector();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        setUnaryexpression((Unary_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        setCastexpression((Cast_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        setPrimary((Primary_expression)newValue);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR:
        getSelector().clear();
        getSelector().addAll((Collection<? extends Selector>)newValue);
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
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        setUnaryexpression((Unary_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        setCastexpression((Cast_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        setPrimary((Primary_expression)null);
        return;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR:
        getSelector().clear();
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
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return unaryexpression != null;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return castexpression != null;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return primary != null;
      case MyDslPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__SELECTOR:
        return selector != null && !selector.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Unary_expression_Not_Plus_MinusImpl
