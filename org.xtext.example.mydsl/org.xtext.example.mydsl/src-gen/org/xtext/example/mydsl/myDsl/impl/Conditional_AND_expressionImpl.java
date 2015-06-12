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

import org.xtext.example.mydsl.myDsl.Conditional_AND_expression;
import org.xtext.example.mydsl.myDsl.Inclusive_OR_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional AND expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_AND_expressionImpl#getInclusiveorexpression <em>Inclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Conditional_AND_expressionImpl extends MinimalEObjectImpl.Container implements Conditional_AND_expression
{
  /**
   * The cached value of the '{@link #getInclusiveorexpression() <em>Inclusiveorexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusiveorexpression()
   * @generated
   * @ordered
   */
  protected EList<Inclusive_OR_expression> inclusiveorexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Conditional_AND_expressionImpl()
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
    return MyDslPackage.Literals.CONDITIONAL_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Inclusive_OR_expression> getInclusiveorexpression()
  {
    if (inclusiveorexpression == null)
    {
      inclusiveorexpression = new EObjectContainmentEList<Inclusive_OR_expression>(Inclusive_OR_expression.class, this, MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION);
    }
    return inclusiveorexpression;
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
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION:
        return ((InternalEList<?>)getInclusiveorexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION:
        return getInclusiveorexpression();
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
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION:
        getInclusiveorexpression().clear();
        getInclusiveorexpression().addAll((Collection<? extends Inclusive_OR_expression>)newValue);
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
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION:
        getInclusiveorexpression().clear();
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
      case MyDslPackage.CONDITIONAL_AND_EXPRESSION__INCLUSIVEOREXPRESSION:
        return inclusiveorexpression != null && !inclusiveorexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Conditional_AND_expressionImpl
