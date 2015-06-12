/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.For_expression;
import org.xtext.example.mydsl.myDsl.For_expression_operator;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.Variable_value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_expressionImpl#getVariable1 <em>Variable1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_expressionImpl#getExpOp <em>Exp Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_expressionImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_expressionImpl extends MinimalEObjectImpl.Container implements For_expression
{
  /**
   * The cached value of the '{@link #getVariable1() <em>Variable1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable1()
   * @generated
   * @ordered
   */
  protected Variable variable1;

  /**
   * The cached value of the '{@link #getExpOp() <em>Exp Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpOp()
   * @generated
   * @ordered
   */
  protected For_expression_operator expOp;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected Variable_value limit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_expressionImpl()
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
    return MyDslPackage.Literals.FOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable1()
  {
    return variable1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable1(Variable newVariable1, NotificationChain msgs)
  {
    Variable oldVariable1 = variable1;
    variable1 = newVariable1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__VARIABLE1, oldVariable1, newVariable1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable1(Variable newVariable1)
  {
    if (newVariable1 != variable1)
    {
      NotificationChain msgs = null;
      if (variable1 != null)
        msgs = ((InternalEObject)variable1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__VARIABLE1, null, msgs);
      if (newVariable1 != null)
        msgs = ((InternalEObject)newVariable1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__VARIABLE1, null, msgs);
      msgs = basicSetVariable1(newVariable1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__VARIABLE1, newVariable1, newVariable1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_expression_operator getExpOp()
  {
    return expOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpOp(For_expression_operator newExpOp, NotificationChain msgs)
  {
    For_expression_operator oldExpOp = expOp;
    expOp = newExpOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__EXP_OP, oldExpOp, newExpOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpOp(For_expression_operator newExpOp)
  {
    if (newExpOp != expOp)
    {
      NotificationChain msgs = null;
      if (expOp != null)
        msgs = ((InternalEObject)expOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__EXP_OP, null, msgs);
      if (newExpOp != null)
        msgs = ((InternalEObject)newExpOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__EXP_OP, null, msgs);
      msgs = basicSetExpOp(newExpOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__EXP_OP, newExpOp, newExpOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_value getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimit(Variable_value newLimit, NotificationChain msgs)
  {
    Variable_value oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__LIMIT, oldLimit, newLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(Variable_value newLimit)
  {
    if (newLimit != limit)
    {
      NotificationChain msgs = null;
      if (limit != null)
        msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__LIMIT, null, msgs);
      if (newLimit != null)
        msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_EXPRESSION__LIMIT, null, msgs);
      msgs = basicSetLimit(newLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_EXPRESSION__LIMIT, newLimit, newLimit));
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
      case MyDslPackage.FOR_EXPRESSION__VARIABLE1:
        return basicSetVariable1(null, msgs);
      case MyDslPackage.FOR_EXPRESSION__EXP_OP:
        return basicSetExpOp(null, msgs);
      case MyDslPackage.FOR_EXPRESSION__LIMIT:
        return basicSetLimit(null, msgs);
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
      case MyDslPackage.FOR_EXPRESSION__VARIABLE1:
        return getVariable1();
      case MyDslPackage.FOR_EXPRESSION__EXP_OP:
        return getExpOp();
      case MyDslPackage.FOR_EXPRESSION__LIMIT:
        return getLimit();
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
      case MyDslPackage.FOR_EXPRESSION__VARIABLE1:
        setVariable1((Variable)newValue);
        return;
      case MyDslPackage.FOR_EXPRESSION__EXP_OP:
        setExpOp((For_expression_operator)newValue);
        return;
      case MyDslPackage.FOR_EXPRESSION__LIMIT:
        setLimit((Variable_value)newValue);
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
      case MyDslPackage.FOR_EXPRESSION__VARIABLE1:
        setVariable1((Variable)null);
        return;
      case MyDslPackage.FOR_EXPRESSION__EXP_OP:
        setExpOp((For_expression_operator)null);
        return;
      case MyDslPackage.FOR_EXPRESSION__LIMIT:
        setLimit((Variable_value)null);
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
      case MyDslPackage.FOR_EXPRESSION__VARIABLE1:
        return variable1 != null;
      case MyDslPackage.FOR_EXPRESSION__EXP_OP:
        return expOp != null;
      case MyDslPackage.FOR_EXPRESSION__LIMIT:
        return limit != null;
    }
    return super.eIsSet(featureID);
  }

} //For_expressionImpl
