/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.AND_expression;
import org.xtext.example.mydsl.myDsl.Exclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive OR expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Exclusive_OR_expressionImpl#getAndexpression <em>Andexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exclusive_OR_expressionImpl extends MinimalEObjectImpl.Container implements Exclusive_OR_expression
{
  /**
   * The cached value of the '{@link #getAndexpression() <em>Andexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndexpression()
   * @generated
   * @ordered
   */
  protected EList<AND_expression> andexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Exclusive_OR_expressionImpl()
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
    return MyDslPackage.Literals.EXCLUSIVE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AND_expression> getAndexpression()
  {
    if (andexpression == null)
    {
      andexpression = new EObjectContainmentEList<AND_expression>(AND_expression.class, this, MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION);
    }
    return andexpression;
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION:
        return ((InternalEList<?>)getAndexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION:
        return getAndexpression();
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION:
        getAndexpression().clear();
        getAndexpression().addAll((Collection<? extends AND_expression>)newValue);
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION:
        getAndexpression().clear();
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
      case MyDslPackage.EXCLUSIVE_OR_EXPRESSION__ANDEXPRESSION:
        return andexpression != null && !andexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Exclusive_OR_expressionImpl
