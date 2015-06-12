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

import org.xtext.example.mydsl.myDsl.Multiplicative_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Unary_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Multiplicative_expressionImpl#getUnaryexpression <em>Unaryexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Multiplicative_expressionImpl extends MinimalEObjectImpl.Container implements Multiplicative_expression
{
  /**
   * The cached value of the '{@link #getUnaryexpression() <em>Unaryexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryexpression()
   * @generated
   * @ordered
   */
  protected EList<Unary_expression> unaryexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Multiplicative_expressionImpl()
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
    return MyDslPackage.Literals.MULTIPLICATIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Unary_expression> getUnaryexpression()
  {
    if (unaryexpression == null)
    {
      unaryexpression = new EObjectContainmentEList<Unary_expression>(Unary_expression.class, this, MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION);
    }
    return unaryexpression;
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
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION:
        return ((InternalEList<?>)getUnaryexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION:
        return getUnaryexpression();
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
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION:
        getUnaryexpression().clear();
        getUnaryexpression().addAll((Collection<? extends Unary_expression>)newValue);
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
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION:
        getUnaryexpression().clear();
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
      case MyDslPackage.MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION:
        return unaryexpression != null && !unaryexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Multiplicative_expressionImpl
