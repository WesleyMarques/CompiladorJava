/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Additive_expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Shift_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl#getAdditiveexpression <em>Additiveexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Shift_expressionImpl#getShiftop <em>Shiftop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Shift_expressionImpl extends MinimalEObjectImpl.Container implements Shift_expression
{
  /**
   * The cached value of the '{@link #getAdditiveexpression() <em>Additiveexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditiveexpression()
   * @generated
   * @ordered
   */
  protected EList<Additive_expression> additiveexpression;

  /**
   * The cached value of the '{@link #getShiftop() <em>Shiftop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShiftop()
   * @generated
   * @ordered
   */
  protected EList<String> shiftop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Shift_expressionImpl()
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
    return MyDslPackage.Literals.SHIFT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Additive_expression> getAdditiveexpression()
  {
    if (additiveexpression == null)
    {
      additiveexpression = new EObjectContainmentEList<Additive_expression>(Additive_expression.class, this, MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION);
    }
    return additiveexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getShiftop()
  {
    if (shiftop == null)
    {
      shiftop = new EDataTypeEList<String>(String.class, this, MyDslPackage.SHIFT_EXPRESSION__SHIFTOP);
    }
    return shiftop;
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
      case MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION:
        return ((InternalEList<?>)getAdditiveexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION:
        return getAdditiveexpression();
      case MyDslPackage.SHIFT_EXPRESSION__SHIFTOP:
        return getShiftop();
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
      case MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION:
        getAdditiveexpression().clear();
        getAdditiveexpression().addAll((Collection<? extends Additive_expression>)newValue);
        return;
      case MyDslPackage.SHIFT_EXPRESSION__SHIFTOP:
        getShiftop().clear();
        getShiftop().addAll((Collection<? extends String>)newValue);
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
      case MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION:
        getAdditiveexpression().clear();
        return;
      case MyDslPackage.SHIFT_EXPRESSION__SHIFTOP:
        getShiftop().clear();
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
      case MyDslPackage.SHIFT_EXPRESSION__ADDITIVEEXPRESSION:
        return additiveexpression != null && !additiveexpression.isEmpty();
      case MyDslPackage.SHIFT_EXPRESSION__SHIFTOP:
        return shiftop != null && !shiftop.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (shiftop: ");
    result.append(shiftop);
    result.append(')');
    return result.toString();
  }

} //Shift_expressionImpl
