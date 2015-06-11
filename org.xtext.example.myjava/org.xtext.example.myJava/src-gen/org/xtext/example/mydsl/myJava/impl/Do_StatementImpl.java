/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.Do_Statement;
import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Do_StatementImpl#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Do_StatementImpl#getRparent <em>Rparent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Do_StatementImpl extends MinimalEObjectImpl.Container implements Do_Statement
{
  /**
   * The cached value of the '{@link #getDoStatement() <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoStatement()
   * @generated
   * @ordered
   */
  protected Statement doStatement;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Do_StatementImpl()
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
    return MyJavaPackage.Literals.DO_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getDoStatement()
  {
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoStatement(Statement newDoStatement, NotificationChain msgs)
  {
    Statement oldDoStatement = doStatement;
    doStatement = newDoStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.DO_STATEMENT__DO_STATEMENT, oldDoStatement, newDoStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoStatement(Statement newDoStatement)
  {
    if (newDoStatement != doStatement)
    {
      NotificationChain msgs = null;
      if (doStatement != null)
        msgs = ((InternalEObject)doStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.DO_STATEMENT__DO_STATEMENT, null, msgs);
      if (newDoStatement != null)
        msgs = ((InternalEObject)newDoStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.DO_STATEMENT__DO_STATEMENT, null, msgs);
      msgs = basicSetDoStatement(newDoStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.DO_STATEMENT__DO_STATEMENT, newDoStatement, newDoStatement));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.DO_STATEMENT__RPARENT, oldRparent, rparent));
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
      case MyJavaPackage.DO_STATEMENT__DO_STATEMENT:
        return basicSetDoStatement(null, msgs);
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
      case MyJavaPackage.DO_STATEMENT__DO_STATEMENT:
        return getDoStatement();
      case MyJavaPackage.DO_STATEMENT__RPARENT:
        return getRparent();
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
      case MyJavaPackage.DO_STATEMENT__DO_STATEMENT:
        setDoStatement((Statement)newValue);
        return;
      case MyJavaPackage.DO_STATEMENT__RPARENT:
        setRparent((String)newValue);
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
      case MyJavaPackage.DO_STATEMENT__DO_STATEMENT:
        setDoStatement((Statement)null);
        return;
      case MyJavaPackage.DO_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
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
      case MyJavaPackage.DO_STATEMENT__DO_STATEMENT:
        return doStatement != null;
      case MyJavaPackage.DO_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
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

} //Do_StatementImpl
