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

import org.xtext.example.mydsl.myDsl.Additive_expression;
import org.xtext.example.mydsl.myDsl.Multiplicative_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Additive_expressionImpl#getMultiplicativeexpression <em>Multiplicativeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Additive_expressionImpl extends MinimalEObjectImpl.Container implements Additive_expression
{
  /**
   * The cached value of the '{@link #getMultiplicativeexpression() <em>Multiplicativeexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicativeexpression()
   * @generated
   * @ordered
   */
  protected EList<Multiplicative_expression> multiplicativeexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Additive_expressionImpl()
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
    return MyDslPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Multiplicative_expression> getMultiplicativeexpression()
  {
    if (multiplicativeexpression == null)
    {
      multiplicativeexpression = new EObjectContainmentEList<Multiplicative_expression>(Multiplicative_expression.class, this, MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION);
    }
    return multiplicativeexpression;
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
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return ((InternalEList<?>)getMultiplicativeexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return getMultiplicativeexpression();
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
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        getMultiplicativeexpression().clear();
        getMultiplicativeexpression().addAll((Collection<? extends Multiplicative_expression>)newValue);
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
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        getMultiplicativeexpression().clear();
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
      case MyDslPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return multiplicativeexpression != null && !multiplicativeexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Additive_expressionImpl
