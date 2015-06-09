/**
 */
package org.xtext.compilador.java.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Statement;
import org.xtext.compilador.java.myDsl.Try_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getNameStatement <em>Name Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The default value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected static final String NAME_STATEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected String nameStatement = NAME_STATEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * The cached value of the '{@link #getTryStatement() <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryStatement()
   * @generated
   * @ordered
   */
  protected Try_statement tryStatement;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameStatement()
  {
    return nameStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameStatement(String newNameStatement)
  {
    String oldNameStatement = nameStatement;
    nameStatement = newNameStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME_STATEMENT, oldNameStatement, nameStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement getTryStatement()
  {
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryStatement(Try_statement newTryStatement, NotificationChain msgs)
  {
    Try_statement oldTryStatement = tryStatement;
    tryStatement = newTryStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryStatement(Try_statement newTryStatement)
  {
    if (newTryStatement != tryStatement)
    {
      NotificationChain msgs = null;
      if (tryStatement != null)
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME, oldName, name));
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
      case MyDslPackage.STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
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
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return getNameStatement();
      case MyDslPackage.STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case MyDslPackage.STATEMENT__NAME:
        return getName();
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
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement((String)newValue);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName((String)newValue);
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
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement(NAME_STATEMENT_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)null);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)null);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
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
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return NAME_STATEMENT_EDEFAULT == null ? nameStatement != null : !NAME_STATEMENT_EDEFAULT.equals(nameStatement);
      case MyDslPackage.STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case MyDslPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (nameStatement: ");
    result.append(nameStatement);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
