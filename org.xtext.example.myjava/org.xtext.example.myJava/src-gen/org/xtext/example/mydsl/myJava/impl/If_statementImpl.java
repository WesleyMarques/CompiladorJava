/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.If_statement;
import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.If_statementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.If_statementImpl#getIdStatement <em>Id Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.If_statementImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class If_statementImpl extends MinimalEObjectImpl.Container implements If_statement
{
  /**
   * The default value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected static final String RPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRparent() <em>Rparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRparent()
   * @generated
   * @ordered
   */
  protected String rparent = RPARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdStatement() <em>Id Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdStatement()
   * @generated
   * @ordered
   */
  protected Statement idStatement;

  /**
   * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseStatement()
   * @generated
   * @ordered
   */
  protected Statement elseStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected If_statementImpl()
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
    return MyJavaPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRparent()
  {
    return rparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRparent(String newRparent)
  {
    String oldRparent = rparent;
    rparent = newRparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.IF_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getIdStatement()
  {
    return idStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdStatement(Statement newIdStatement, NotificationChain msgs)
  {
    Statement oldIdStatement = idStatement;
    idStatement = newIdStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.IF_STATEMENT__ID_STATEMENT, oldIdStatement, newIdStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdStatement(Statement newIdStatement)
  {
    if (newIdStatement != idStatement)
    {
      NotificationChain msgs = null;
      if (idStatement != null)
        msgs = ((InternalEObject)idStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.IF_STATEMENT__ID_STATEMENT, null, msgs);
      if (newIdStatement != null)
        msgs = ((InternalEObject)newIdStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.IF_STATEMENT__ID_STATEMENT, null, msgs);
      msgs = basicSetIdStatement(newIdStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.IF_STATEMENT__ID_STATEMENT, newIdStatement, newIdStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getElseStatement()
  {
    return elseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs)
  {
    Statement oldElseStatement = elseStatement;
    elseStatement = newElseStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT, oldElseStatement, newElseStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseStatement(Statement newElseStatement)
  {
    if (newElseStatement != elseStatement)
    {
      NotificationChain msgs = null;
      if (elseStatement != null)
        msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      if (newElseStatement != null)
        msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      msgs = basicSetElseStatement(newElseStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT, newElseStatement, newElseStatement));
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
      case MyJavaPackage.IF_STATEMENT__ID_STATEMENT:
        return basicSetIdStatement(null, msgs);
      case MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT:
        return basicSetElseStatement(null, msgs);
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
      case MyJavaPackage.IF_STATEMENT__RPARENT:
        return getRparent();
      case MyJavaPackage.IF_STATEMENT__ID_STATEMENT:
        return getIdStatement();
      case MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT:
        return getElseStatement();
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
      case MyJavaPackage.IF_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyJavaPackage.IF_STATEMENT__ID_STATEMENT:
        setIdStatement((Statement)newValue);
        return;
      case MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)newValue);
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
      case MyJavaPackage.IF_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyJavaPackage.IF_STATEMENT__ID_STATEMENT:
        setIdStatement((Statement)null);
        return;
      case MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)null);
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
      case MyJavaPackage.IF_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyJavaPackage.IF_STATEMENT__ID_STATEMENT:
        return idStatement != null;
      case MyJavaPackage.IF_STATEMENT__ELSE_STATEMENT:
        return elseStatement != null;
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
    result.append(" (rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //If_statementImpl
