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
import org.xtext.example.mydsl.myDsl.Conditional_OR_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional OR expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_OR_expressionImpl#getConditionalandexpression <em>Conditionalandexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Conditional_OR_expressionImpl extends MinimalEObjectImpl.Container implements Conditional_OR_expression
{
  /**
   * The cached value of the '{@link #getConditionalandexpression() <em>Conditionalandexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalandexpression()
   * @generated
   * @ordered
   */
  protected EList<Conditional_AND_expression> conditionalandexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Conditional_OR_expressionImpl()
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
    return MyDslPackage.Literals.CONDITIONAL_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Conditional_AND_expression> getConditionalandexpression()
  {
    if (conditionalandexpression == null)
    {
      conditionalandexpression = new EObjectContainmentEList<Conditional_AND_expression>(Conditional_AND_expression.class, this, MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION);
    }
    return conditionalandexpression;
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
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return ((InternalEList<?>)getConditionalandexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return getConditionalandexpression();
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
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        getConditionalandexpression().clear();
        getConditionalandexpression().addAll((Collection<? extends Conditional_AND_expression>)newValue);
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
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        getConditionalandexpression().clear();
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
      case MyDslPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return conditionalandexpression != null && !conditionalandexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Conditional_OR_expressionImpl
