/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Variable_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Variable_declaratorImpl#getNameVariable <em>Name Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Variable_declaratorImpl extends MinimalEObjectImpl.Container implements Variable_declarator
{
  /**
   * The default value of the '{@link #getNameVariable() <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVariable()
   * @generated
   * @ordered
   */
  protected static final String NAME_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameVariable() <em>Name Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVariable()
   * @generated
   * @ordered
   */
  protected String nameVariable = NAME_VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable_declaratorImpl()
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
    return MyJavaPackage.Literals.VARIABLE_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameVariable()
  {
    return nameVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameVariable(String newNameVariable)
  {
    String oldNameVariable = nameVariable;
    nameVariable = newNameVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.VARIABLE_DECLARATOR__NAME_VARIABLE, oldNameVariable, nameVariable));
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
      case MyJavaPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        return getNameVariable();
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
      case MyJavaPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        setNameVariable((String)newValue);
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
      case MyJavaPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        setNameVariable(NAME_VARIABLE_EDEFAULT);
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
      case MyJavaPackage.VARIABLE_DECLARATOR__NAME_VARIABLE:
        return NAME_VARIABLE_EDEFAULT == null ? nameVariable != null : !NAME_VARIABLE_EDEFAULT.equals(nameVariable);
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
    result.append(" (nameVariable: ");
    result.append(nameVariable);
    result.append(')');
    return result.toString();
  }

} //Variable_declaratorImpl
