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

import org.xtext.example.mydsl.myDsl.Exclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.Inclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusive OR expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Inclusive_OR_expressionImpl#getExclusiveorexpression <em>Exclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Inclusive_OR_expressionImpl extends MinimalEObjectImpl.Container implements Inclusive_OR_expression
{
  /**
   * The cached value of the '{@link #getExclusiveorexpression() <em>Exclusiveorexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusiveorexpression()
   * @generated
   * @ordered
   */
  protected EList<Exclusive_OR_expression> exclusiveorexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Inclusive_OR_expressionImpl()
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
    return MyDslPackage.Literals.INCLUSIVE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Exclusive_OR_expression> getExclusiveorexpression()
  {
    if (exclusiveorexpression == null)
    {
      exclusiveorexpression = new EObjectContainmentEList<Exclusive_OR_expression>(Exclusive_OR_expression.class, this, MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION);
    }
    return exclusiveorexpression;
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return ((InternalEList<?>)getExclusiveorexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return getExclusiveorexpression();
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION:
        getExclusiveorexpression().clear();
        getExclusiveorexpression().addAll((Collection<? extends Exclusive_OR_expression>)newValue);
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION:
        getExclusiveorexpression().clear();
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
      case MyDslPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return exclusiveorexpression != null && !exclusiveorexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Inclusive_OR_expressionImpl
