/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.For_Statement;
import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Statement;
import org.xtext.example.mydsl.myJava.Variable_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.For_StatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.For_StatementImpl#getRParent <em>RParent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.For_StatementImpl#getForStatement <em>For Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_StatementImpl extends MinimalEObjectImpl.Container implements For_Statement
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable_declaration variable;

  /**
   * The default value of the '{@link #getRParent() <em>RParent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRParent()
   * @generated
   * @ordered
   */
  protected static final String RPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRParent() <em>RParent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRParent()
   * @generated
   * @ordered
   */
  protected String rParent = RPARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getForStatement() <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStatement()
   * @generated
   * @ordered
   */
  protected Statement forStatement;

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
    return MyJavaPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable_declaration newVariable, NotificationChain msgs)
  {
    Variable_declaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.FOR_STATEMENT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable_declaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.FOR_STATEMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.FOR_STATEMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.FOR_STATEMENT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRParent()
  {
    return rParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRParent(String newRParent)
  {
    String oldRParent = rParent;
    rParent = newRParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.FOR_STATEMENT__RPARENT, oldRParent, rParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getForStatement()
  {
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStatement(Statement newForStatement, NotificationChain msgs)
  {
    Statement oldForStatement = forStatement;
    forStatement = newForStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT, oldForStatement, newForStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStatement(Statement newForStatement)
  {
    if (newForStatement != forStatement)
    {
      NotificationChain msgs = null;
      if (forStatement != null)
        msgs = ((InternalEObject)forStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT, null, msgs);
      if (newForStatement != null)
        msgs = ((InternalEObject)newForStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetForStatement(newForStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT, newForStatement, newForStatement));
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
      case MyJavaPackage.FOR_STATEMENT__VARIABLE:
        return basicSetVariable(null, msgs);
      case MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT:
        return basicSetForStatement(null, msgs);
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
      case MyJavaPackage.FOR_STATEMENT__VARIABLE:
        return getVariable();
      case MyJavaPackage.FOR_STATEMENT__RPARENT:
        return getRParent();
      case MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT:
        return getForStatement();
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
      case MyJavaPackage.FOR_STATEMENT__VARIABLE:
        setVariable((Variable_declaration)newValue);
        return;
      case MyJavaPackage.FOR_STATEMENT__RPARENT:
        setRParent((String)newValue);
        return;
      case MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT:
        setForStatement((Statement)newValue);
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
      case MyJavaPackage.FOR_STATEMENT__VARIABLE:
        setVariable((Variable_declaration)null);
        return;
      case MyJavaPackage.FOR_STATEMENT__RPARENT:
        setRParent(RPARENT_EDEFAULT);
        return;
      case MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT:
        setForStatement((Statement)null);
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
      case MyJavaPackage.FOR_STATEMENT__VARIABLE:
        return variable != null;
      case MyJavaPackage.FOR_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rParent != null : !RPARENT_EDEFAULT.equals(rParent);
      case MyJavaPackage.FOR_STATEMENT__FOR_STATEMENT:
        return forStatement != null;
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
    result.append(" (rParent: ");
    result.append(rParent);
    result.append(')');
    return result.toString();
  }

} //For_StatementImpl
