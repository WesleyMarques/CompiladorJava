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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Parameter;
import org.xtext.compilador.java.myDsl.Statement;
import org.xtext.compilador.java.myDsl.Try_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.Try_statementImpl#getStatementFinally <em>Statement Finally</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Try_statementImpl extends MinimalEObjectImpl.Container implements Try_statement
{
  /**
   * The cached value of the '{@link #getTryStatement() <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryStatement()
   * @generated
   * @ordered
   */
  protected Statement tryStatement;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected EList<Statement> statement;

  /**
   * The cached value of the '{@link #getStatementFinally() <em>Statement Finally</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementFinally()
   * @generated
   * @ordered
   */
  protected Statement statementFinally;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Try_statementImpl()
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
    return MyDslPackage.Literals.TRY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getTryStatement()
  {
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryStatement(Statement newTryStatement, NotificationChain msgs)
  {
    Statement oldTryStatement = tryStatement;
    tryStatement = newTryStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TRY_STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryStatement(Statement newTryStatement)
  {
    if (newTryStatement != tryStatement)
    {
      NotificationChain msgs = null;
      if (tryStatement != null)
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRY_STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, MyDslPackage.TRY_STATEMENT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatement()
  {
    if (statement == null)
    {
      statement = new EObjectContainmentEList<Statement>(Statement.class, this, MyDslPackage.TRY_STATEMENT__STATEMENT);
    }
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatementFinally()
  {
    return statementFinally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementFinally(Statement newStatementFinally, NotificationChain msgs)
  {
    Statement oldStatementFinally = statementFinally;
    statementFinally = newStatementFinally;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY, oldStatementFinally, newStatementFinally);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementFinally(Statement newStatementFinally)
  {
    if (newStatementFinally != statementFinally)
    {
      NotificationChain msgs = null;
      if (statementFinally != null)
        msgs = ((InternalEObject)statementFinally).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY, null, msgs);
      if (newStatementFinally != null)
        msgs = ((InternalEObject)newStatementFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY, null, msgs);
      msgs = basicSetStatementFinally(newStatementFinally, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY, newStatementFinally, newStatementFinally));
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
      case MyDslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
      case MyDslPackage.TRY_STATEMENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MyDslPackage.TRY_STATEMENT__STATEMENT:
        return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
      case MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY:
        return basicSetStatementFinally(null, msgs);
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
      case MyDslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case MyDslPackage.TRY_STATEMENT__PARAMETERS:
        return getParameters();
      case MyDslPackage.TRY_STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY:
        return getStatementFinally();
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
      case MyDslPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)newValue);
        return;
      case MyDslPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MyDslPackage.TRY_STATEMENT__STATEMENT:
        getStatement().clear();
        getStatement().addAll((Collection<? extends Statement>)newValue);
        return;
      case MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY:
        setStatementFinally((Statement)newValue);
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
      case MyDslPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)null);
        return;
      case MyDslPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        return;
      case MyDslPackage.TRY_STATEMENT__STATEMENT:
        getStatement().clear();
        return;
      case MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY:
        setStatementFinally((Statement)null);
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
      case MyDslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case MyDslPackage.TRY_STATEMENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyDslPackage.TRY_STATEMENT__STATEMENT:
        return statement != null && !statement.isEmpty();
      case MyDslPackage.TRY_STATEMENT__STATEMENT_FINALLY:
        return statementFinally != null;
    }
    return super.eIsSet(featureID);
  }

} //Try_statementImpl
