/**
 */
package org.xtext.compilador.java.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.compilador.java.myDsl.For_Statement;
import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.For_StatementImpl#getStatementInFor <em>Statement In For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_StatementImpl extends MinimalEObjectImpl.Container implements For_Statement
{
  /**
   * The cached value of the '{@link #getStatementInFor() <em>Statement In For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementInFor()
   * @generated
   * @ordered
   */
  protected Statement statementInFor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected For_StatementImpl()
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
    return MyDslPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatementInFor()
  {
    return statementInFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementInFor(Statement newStatementInFor, NotificationChain msgs)
  {
    Statement oldStatementInFor = statementInFor;
    statementInFor = newStatementInFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR, oldStatementInFor, newStatementInFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementInFor(Statement newStatementInFor)
  {
    if (newStatementInFor != statementInFor)
    {
      NotificationChain msgs = null;
      if (statementInFor != null)
        msgs = ((InternalEObject)statementInFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR, null, msgs);
      if (newStatementInFor != null)
        msgs = ((InternalEObject)newStatementInFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR, null, msgs);
      msgs = basicSetStatementInFor(newStatementInFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR, newStatementInFor, newStatementInFor));
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
      case MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR:
        return basicSetStatementInFor(null, msgs);
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
      case MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR:
        return getStatementInFor();
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
      case MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR:
        setStatementInFor((Statement)newValue);
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
      case MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR:
        setStatementInFor((Statement)null);
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
      case MyDslPackage.FOR_STATEMENT__STATEMENT_IN_FOR:
        return statementInFor != null;
    }
    return super.eIsSet(featureID);
  }

} //For_StatementImpl
