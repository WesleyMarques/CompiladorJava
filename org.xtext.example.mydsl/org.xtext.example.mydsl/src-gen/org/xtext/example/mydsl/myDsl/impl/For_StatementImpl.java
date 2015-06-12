/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.For_Statement;
import org.xtext.example.mydsl.myDsl.For_control;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl#getLparent <em>Lparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl#getForControl <em>For Control</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl#getRParent <em>RParent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl#getForStatement <em>For Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class For_StatementImpl extends MinimalEObjectImpl.Container implements For_Statement
{
  /**
   * The default value of the '{@link #getLparent() <em>Lparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLparent()
   * @generated
   * @ordered
   */
  protected static final String LPARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLparent() <em>Lparent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLparent()
   * @generated
   * @ordered
   */
  protected String lparent = LPARENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getForControl() <em>For Control</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForControl()
   * @generated
   * @ordered
   */
  protected For_control forControl;

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
    return MyDslPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLparent()
  {
    return lparent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLparent(String newLparent)
  {
    String oldLparent = lparent;
    lparent = newLparent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__LPARENT, oldLparent, lparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_control getForControl()
  {
    return forControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForControl(For_control newForControl, NotificationChain msgs)
  {
    For_control oldForControl = forControl;
    forControl = newForControl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__FOR_CONTROL, oldForControl, newForControl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForControl(For_control newForControl)
  {
    if (newForControl != forControl)
    {
      NotificationChain msgs = null;
      if (forControl != null)
        msgs = ((InternalEObject)forControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__FOR_CONTROL, null, msgs);
      if (newForControl != null)
        msgs = ((InternalEObject)newForControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__FOR_CONTROL, null, msgs);
      msgs = basicSetForControl(newForControl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__FOR_CONTROL, newForControl, newForControl));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__RPARENT, oldRParent, rParent));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__FOR_STATEMENT, oldForStatement, newForStatement);
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
        msgs = ((InternalEObject)forStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__FOR_STATEMENT, null, msgs);
      if (newForStatement != null)
        msgs = ((InternalEObject)newForStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR_STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetForStatement(newForStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR_STATEMENT__FOR_STATEMENT, newForStatement, newForStatement));
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
      case MyDslPackage.FOR_STATEMENT__FOR_CONTROL:
        return basicSetForControl(null, msgs);
      case MyDslPackage.FOR_STATEMENT__FOR_STATEMENT:
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
      case MyDslPackage.FOR_STATEMENT__LPARENT:
        return getLparent();
      case MyDslPackage.FOR_STATEMENT__FOR_CONTROL:
        return getForControl();
      case MyDslPackage.FOR_STATEMENT__RPARENT:
        return getRParent();
      case MyDslPackage.FOR_STATEMENT__FOR_STATEMENT:
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
      case MyDslPackage.FOR_STATEMENT__LPARENT:
        setLparent((String)newValue);
        return;
      case MyDslPackage.FOR_STATEMENT__FOR_CONTROL:
        setForControl((For_control)newValue);
        return;
      case MyDslPackage.FOR_STATEMENT__RPARENT:
        setRParent((String)newValue);
        return;
      case MyDslPackage.FOR_STATEMENT__FOR_STATEMENT:
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
      case MyDslPackage.FOR_STATEMENT__LPARENT:
        setLparent(LPARENT_EDEFAULT);
        return;
      case MyDslPackage.FOR_STATEMENT__FOR_CONTROL:
        setForControl((For_control)null);
        return;
      case MyDslPackage.FOR_STATEMENT__RPARENT:
        setRParent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.FOR_STATEMENT__FOR_STATEMENT:
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
      case MyDslPackage.FOR_STATEMENT__LPARENT:
        return LPARENT_EDEFAULT == null ? lparent != null : !LPARENT_EDEFAULT.equals(lparent);
      case MyDslPackage.FOR_STATEMENT__FOR_CONTROL:
        return forControl != null;
      case MyDslPackage.FOR_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rParent != null : !RPARENT_EDEFAULT.equals(rParent);
      case MyDslPackage.FOR_STATEMENT__FOR_STATEMENT:
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
    result.append(" (lparent: ");
    result.append(lparent);
    result.append(", rParent: ");
    result.append(rParent);
    result.append(')');
    return result.toString();
  }

} //For_StatementImpl
