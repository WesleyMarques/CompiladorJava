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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Relational_expression;
import org.xtext.example.mydsl.myDsl.Shift_expression;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl#getShiftexpression <em>Shiftexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Relational_expressionImpl#getRelationalop <em>Relationalop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relational_expressionImpl extends InstanceOf_expressionImpl implements Relational_expression
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getShiftexpression() <em>Shiftexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShiftexpression()
   * @generated
   * @ordered
   */
  protected EList<Shift_expression> shiftexpression;

  /**
   * The cached value of the '{@link #getRelationalop() <em>Relationalop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalop()
   * @generated
   * @ordered
   */
  protected EList<String> relationalop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Relational_expressionImpl()
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
    return MyDslPackage.Literals.RELATIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RELATIONAL_EXPRESSION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RELATIONAL_EXPRESSION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RELATIONAL_EXPRESSION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RELATIONAL_EXPRESSION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Shift_expression> getShiftexpression()
  {
    if (shiftexpression == null)
    {
      shiftexpression = new EObjectContainmentEList<Shift_expression>(Shift_expression.class, this, MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION);
    }
    return shiftexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelationalop()
  {
    if (relationalop == null)
    {
      relationalop = new EDataTypeEList<String>(String.class, this, MyDslPackage.RELATIONAL_EXPRESSION__RELATIONALOP);
    }
    return relationalop;
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
      case MyDslPackage.RELATIONAL_EXPRESSION__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION:
        return ((InternalEList<?>)getShiftexpression()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.RELATIONAL_EXPRESSION__TYPE:
        return getType();
      case MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION:
        return getShiftexpression();
      case MyDslPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        return getRelationalop();
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
      case MyDslPackage.RELATIONAL_EXPRESSION__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION:
        getShiftexpression().clear();
        getShiftexpression().addAll((Collection<? extends Shift_expression>)newValue);
        return;
      case MyDslPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        getRelationalop().clear();
        getRelationalop().addAll((Collection<? extends String>)newValue);
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
      case MyDslPackage.RELATIONAL_EXPRESSION__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION:
        getShiftexpression().clear();
        return;
      case MyDslPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        getRelationalop().clear();
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
      case MyDslPackage.RELATIONAL_EXPRESSION__TYPE:
        return type != null;
      case MyDslPackage.RELATIONAL_EXPRESSION__SHIFTEXPRESSION:
        return shiftexpression != null && !shiftexpression.isEmpty();
      case MyDslPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        return relationalop != null && !relationalop.isEmpty();
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
    result.append(" (relationalop: ");
    result.append(relationalop);
    result.append(')');
    return result.toString();
  }

} //Relational_expressionImpl
