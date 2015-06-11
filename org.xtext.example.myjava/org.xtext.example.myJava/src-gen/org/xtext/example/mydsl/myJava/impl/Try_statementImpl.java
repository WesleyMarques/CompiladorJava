/**
 */
package org.xtext.example.mydsl.myJava.impl;

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

import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Parameter;
import org.xtext.example.mydsl.myJava.Statement;
import org.xtext.example.mydsl.myJava.Try_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getCatchStatement <em>Catch Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Try_statementImpl#getFinallyStatement <em>Finally Statement</em>}</li>
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
   * The default value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected static final String LPAREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLParen() <em>LParen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLParen()
   * @generated
   * @ordered
   */
  protected String lParen = LPAREN_EDEFAULT;

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
   * The cached value of the '{@link #getCatchStatement() <em>Catch Statement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchStatement()
   * @generated
   * @ordered
   */
  protected EList<Statement> catchStatement;

  /**
   * The cached value of the '{@link #getFinallyStatement() <em>Finally Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyStatement()
   * @generated
   * @ordered
   */
  protected Statement finallyStatement;

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
    return MyJavaPackage.Literals.TRY_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
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
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLParen()
  {
    return lParen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLParen(String newLParen)
  {
    String oldLParen = lParen;
    lParen = newLParen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__LPAREN, oldLParen, lParen));
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
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, MyJavaPackage.TRY_STATEMENT__PARAMETERS);
    }
    return parameters;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getCatchStatement()
  {
    if (catchStatement == null)
    {
      catchStatement = new EObjectContainmentEList<Statement>(Statement.class, this, MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT);
    }
    return catchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getFinallyStatement()
  {
    return finallyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyStatement(Statement newFinallyStatement, NotificationChain msgs)
  {
    Statement oldFinallyStatement = finallyStatement;
    finallyStatement = newFinallyStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, oldFinallyStatement, newFinallyStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyStatement(Statement newFinallyStatement)
  {
    if (newFinallyStatement != finallyStatement)
    {
      NotificationChain msgs = null;
      if (finallyStatement != null)
        msgs = ((InternalEObject)finallyStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      if (newFinallyStatement != null)
        msgs = ((InternalEObject)newFinallyStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      msgs = basicSetFinallyStatement(newFinallyStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT, newFinallyStatement, newFinallyStatement));
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
      case MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
      case MyJavaPackage.TRY_STATEMENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT:
        return ((InternalEList<?>)getCatchStatement()).basicRemove(otherEnd, msgs);
      case MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return basicSetFinallyStatement(null, msgs);
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
      case MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case MyJavaPackage.TRY_STATEMENT__LPAREN:
        return getLParen();
      case MyJavaPackage.TRY_STATEMENT__PARAMETERS:
        return getParameters();
      case MyJavaPackage.TRY_STATEMENT__RPARENT:
        return getRparent();
      case MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT:
        return getCatchStatement();
      case MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return getFinallyStatement();
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
      case MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)newValue);
        return;
      case MyJavaPackage.TRY_STATEMENT__LPAREN:
        setLParen((String)newValue);
        return;
      case MyJavaPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MyJavaPackage.TRY_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT:
        getCatchStatement().clear();
        getCatchStatement().addAll((Collection<? extends Statement>)newValue);
        return;
      case MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinallyStatement((Statement)newValue);
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
      case MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTryStatement((Statement)null);
        return;
      case MyJavaPackage.TRY_STATEMENT__LPAREN:
        setLParen(LPAREN_EDEFAULT);
        return;
      case MyJavaPackage.TRY_STATEMENT__PARAMETERS:
        getParameters().clear();
        return;
      case MyJavaPackage.TRY_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT:
        getCatchStatement().clear();
        return;
      case MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinallyStatement((Statement)null);
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
      case MyJavaPackage.TRY_STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case MyJavaPackage.TRY_STATEMENT__LPAREN:
        return LPAREN_EDEFAULT == null ? lParen != null : !LPAREN_EDEFAULT.equals(lParen);
      case MyJavaPackage.TRY_STATEMENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyJavaPackage.TRY_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyJavaPackage.TRY_STATEMENT__CATCH_STATEMENT:
        return catchStatement != null && !catchStatement.isEmpty();
      case MyJavaPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return finallyStatement != null;
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
    result.append(" (lParen: ");
    result.append(lParen);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //Try_statementImpl
