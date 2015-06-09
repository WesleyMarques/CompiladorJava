/**
 */
package org.xtext.compilador.java.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.compilador.java.myDsl.Constructor_declaration;
import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Parameter_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl#getModifiersConstructor <em>Modifiers Constructor</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl#getNameConstructor <em>Name Constructor</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl#getParameterListConstructor <em>Parameter List Constructor</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Constructor_declarationImpl#getStatementConstructor <em>Statement Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Constructor_declarationImpl extends MinimalEObjectImpl.Container implements Constructor_declaration
{
  /**
   * The cached value of the '{@link #getModifiersConstructor() <em>Modifiers Constructor</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiersConstructor()
   * @generated
   * @ordered
   */
  protected EList<String> modifiersConstructor;

  /**
   * The default value of the '{@link #getNameConstructor() <em>Name Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameConstructor()
   * @generated
   * @ordered
   */
  protected static final String NAME_CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameConstructor() <em>Name Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameConstructor()
   * @generated
   * @ordered
   */
  protected String nameConstructor = NAME_CONSTRUCTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterListConstructor() <em>Parameter List Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterListConstructor()
   * @generated
   * @ordered
   */
  protected Parameter_list parameterListConstructor;

  /**
   * The default value of the '{@link #getStatementConstructor() <em>Statement Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementConstructor()
   * @generated
   * @ordered
   */
  protected static final String STATEMENT_CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatementConstructor() <em>Statement Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementConstructor()
   * @generated
   * @ordered
   */
  protected String statementConstructor = STATEMENT_CONSTRUCTOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Constructor_declarationImpl()
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
    return MyDslPackage.Literals.CONSTRUCTOR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiersConstructor()
  {
    if (modifiersConstructor == null)
    {
      modifiersConstructor = new EDataTypeEList<String>(String.class, this, MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR);
    }
    return modifiersConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameConstructor()
  {
    return nameConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameConstructor(String newNameConstructor)
  {
    String oldNameConstructor = nameConstructor;
    nameConstructor = newNameConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR, oldNameConstructor, nameConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list getParameterListConstructor()
  {
    return parameterListConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterListConstructor(Parameter_list newParameterListConstructor, NotificationChain msgs)
  {
    Parameter_list oldParameterListConstructor = parameterListConstructor;
    parameterListConstructor = newParameterListConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, oldParameterListConstructor, newParameterListConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterListConstructor(Parameter_list newParameterListConstructor)
  {
    if (newParameterListConstructor != parameterListConstructor)
    {
      NotificationChain msgs = null;
      if (parameterListConstructor != null)
        msgs = ((InternalEObject)parameterListConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, null, msgs);
      if (newParameterListConstructor != null)
        msgs = ((InternalEObject)newParameterListConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, null, msgs);
      msgs = basicSetParameterListConstructor(newParameterListConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR, newParameterListConstructor, newParameterListConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatementConstructor()
  {
    return statementConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementConstructor(String newStatementConstructor)
  {
    String oldStatementConstructor = statementConstructor;
    statementConstructor = newStatementConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR, oldStatementConstructor, statementConstructor));
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return basicSetParameterListConstructor(null, msgs);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        return getModifiersConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        return getNameConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return getParameterListConstructor();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        return getStatementConstructor();
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        getModifiersConstructor().clear();
        getModifiersConstructor().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        setNameConstructor((String)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        setParameterListConstructor((Parameter_list)newValue);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        setStatementConstructor((String)newValue);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        getModifiersConstructor().clear();
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        setNameConstructor(NAME_CONSTRUCTOR_EDEFAULT);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        setParameterListConstructor((Parameter_list)null);
        return;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        setStatementConstructor(STATEMENT_CONSTRUCTOR_EDEFAULT);
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
      case MyDslPackage.CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR:
        return modifiersConstructor != null && !modifiersConstructor.isEmpty();
      case MyDslPackage.CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR:
        return NAME_CONSTRUCTOR_EDEFAULT == null ? nameConstructor != null : !NAME_CONSTRUCTOR_EDEFAULT.equals(nameConstructor);
      case MyDslPackage.CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR:
        return parameterListConstructor != null;
      case MyDslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR:
        return STATEMENT_CONSTRUCTOR_EDEFAULT == null ? statementConstructor != null : !STATEMENT_CONSTRUCTOR_EDEFAULT.equals(statementConstructor);
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
    result.append(" (modifiersConstructor: ");
    result.append(modifiersConstructor);
    result.append(", nameConstructor: ");
    result.append(nameConstructor);
    result.append(", statementConstructor: ");
    result.append(statementConstructor);
    result.append(')');
    return result.toString();
  }

} //Constructor_declarationImpl
