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

import org.xtext.compilador.java.myDsl.Method_declaration;
import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Parameter_list;
import org.xtext.compilador.java.myDsl.Statement_block;
import org.xtext.compilador.java.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl#getModifiersMethod <em>Modifiers Method</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl#getTypeMethod <em>Type Method</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl#getNameMethod <em>Name Method</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl#getParameterListMethod <em>Parameter List Method</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Method_declarationImpl#getStatementMethod <em>Statement Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Method_declarationImpl extends MinimalEObjectImpl.Container implements Method_declaration
{
  /**
   * The cached value of the '{@link #getModifiersMethod() <em>Modifiers Method</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiersMethod()
   * @generated
   * @ordered
   */
  protected EList<String> modifiersMethod;

  /**
   * The cached value of the '{@link #getTypeMethod() <em>Type Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeMethod()
   * @generated
   * @ordered
   */
  protected Type typeMethod;

  /**
   * The default value of the '{@link #getNameMethod() <em>Name Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameMethod()
   * @generated
   * @ordered
   */
  protected static final String NAME_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameMethod() <em>Name Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameMethod()
   * @generated
   * @ordered
   */
  protected String nameMethod = NAME_METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterListMethod() <em>Parameter List Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterListMethod()
   * @generated
   * @ordered
   */
  protected Parameter_list parameterListMethod;

  /**
   * The cached value of the '{@link #getStatementMethod() <em>Statement Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementMethod()
   * @generated
   * @ordered
   */
  protected Statement_block statementMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Method_declarationImpl()
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
    return MyDslPackage.Literals.METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiersMethod()
  {
    if (modifiersMethod == null)
    {
      modifiersMethod = new EDataTypeEList<String>(String.class, this, MyDslPackage.METHOD_DECLARATION__MODIFIERS_METHOD);
    }
    return modifiersMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTypeMethod()
  {
    return typeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeMethod(Type newTypeMethod, NotificationChain msgs)
  {
    Type oldTypeMethod = typeMethod;
    typeMethod = newTypeMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__TYPE_METHOD, oldTypeMethod, newTypeMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeMethod(Type newTypeMethod)
  {
    if (newTypeMethod != typeMethod)
    {
      NotificationChain msgs = null;
      if (typeMethod != null)
        msgs = ((InternalEObject)typeMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__TYPE_METHOD, null, msgs);
      if (newTypeMethod != null)
        msgs = ((InternalEObject)newTypeMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__TYPE_METHOD, null, msgs);
      msgs = basicSetTypeMethod(newTypeMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__TYPE_METHOD, newTypeMethod, newTypeMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameMethod()
  {
    return nameMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameMethod(String newNameMethod)
  {
    String oldNameMethod = nameMethod;
    nameMethod = newNameMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__NAME_METHOD, oldNameMethod, nameMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list getParameterListMethod()
  {
    return parameterListMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterListMethod(Parameter_list newParameterListMethod, NotificationChain msgs)
  {
    Parameter_list oldParameterListMethod = parameterListMethod;
    parameterListMethod = newParameterListMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD, oldParameterListMethod, newParameterListMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterListMethod(Parameter_list newParameterListMethod)
  {
    if (newParameterListMethod != parameterListMethod)
    {
      NotificationChain msgs = null;
      if (parameterListMethod != null)
        msgs = ((InternalEObject)parameterListMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD, null, msgs);
      if (newParameterListMethod != null)
        msgs = ((InternalEObject)newParameterListMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD, null, msgs);
      msgs = basicSetParameterListMethod(newParameterListMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD, newParameterListMethod, newParameterListMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block getStatementMethod()
  {
    return statementMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementMethod(Statement_block newStatementMethod, NotificationChain msgs)
  {
    Statement_block oldStatementMethod = statementMethod;
    statementMethod = newStatementMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD, oldStatementMethod, newStatementMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementMethod(Statement_block newStatementMethod)
  {
    if (newStatementMethod != statementMethod)
    {
      NotificationChain msgs = null;
      if (statementMethod != null)
        msgs = ((InternalEObject)statementMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD, null, msgs);
      if (newStatementMethod != null)
        msgs = ((InternalEObject)newStatementMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD, null, msgs);
      msgs = basicSetStatementMethod(newStatementMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD, newStatementMethod, newStatementMethod));
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
      case MyDslPackage.METHOD_DECLARATION__TYPE_METHOD:
        return basicSetTypeMethod(null, msgs);
      case MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD:
        return basicSetParameterListMethod(null, msgs);
      case MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD:
        return basicSetStatementMethod(null, msgs);
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
      case MyDslPackage.METHOD_DECLARATION__MODIFIERS_METHOD:
        return getModifiersMethod();
      case MyDslPackage.METHOD_DECLARATION__TYPE_METHOD:
        return getTypeMethod();
      case MyDslPackage.METHOD_DECLARATION__NAME_METHOD:
        return getNameMethod();
      case MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD:
        return getParameterListMethod();
      case MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD:
        return getStatementMethod();
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
      case MyDslPackage.METHOD_DECLARATION__MODIFIERS_METHOD:
        getModifiersMethod().clear();
        getModifiersMethod().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.METHOD_DECLARATION__TYPE_METHOD:
        setTypeMethod((Type)newValue);
        return;
      case MyDslPackage.METHOD_DECLARATION__NAME_METHOD:
        setNameMethod((String)newValue);
        return;
      case MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD:
        setParameterListMethod((Parameter_list)newValue);
        return;
      case MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD:
        setStatementMethod((Statement_block)newValue);
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
      case MyDslPackage.METHOD_DECLARATION__MODIFIERS_METHOD:
        getModifiersMethod().clear();
        return;
      case MyDslPackage.METHOD_DECLARATION__TYPE_METHOD:
        setTypeMethod((Type)null);
        return;
      case MyDslPackage.METHOD_DECLARATION__NAME_METHOD:
        setNameMethod(NAME_METHOD_EDEFAULT);
        return;
      case MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD:
        setParameterListMethod((Parameter_list)null);
        return;
      case MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD:
        setStatementMethod((Statement_block)null);
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
      case MyDslPackage.METHOD_DECLARATION__MODIFIERS_METHOD:
        return modifiersMethod != null && !modifiersMethod.isEmpty();
      case MyDslPackage.METHOD_DECLARATION__TYPE_METHOD:
        return typeMethod != null;
      case MyDslPackage.METHOD_DECLARATION__NAME_METHOD:
        return NAME_METHOD_EDEFAULT == null ? nameMethod != null : !NAME_METHOD_EDEFAULT.equals(nameMethod);
      case MyDslPackage.METHOD_DECLARATION__PARAMETER_LIST_METHOD:
        return parameterListMethod != null;
      case MyDslPackage.METHOD_DECLARATION__STATEMENT_METHOD:
        return statementMethod != null;
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
    result.append(" (modifiersMethod: ");
    result.append(modifiersMethod);
    result.append(", nameMethod: ");
    result.append(nameMethod);
    result.append(')');
    return result.toString();
  }

} //Method_declarationImpl