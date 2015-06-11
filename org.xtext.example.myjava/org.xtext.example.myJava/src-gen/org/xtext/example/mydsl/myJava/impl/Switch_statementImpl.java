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
import org.xtext.example.mydsl.myJava.Statement;
import org.xtext.example.mydsl.myJava.Switch_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Switch_statementImpl#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Switch_statementImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Switch_statementImpl#getSwitchStatements <em>Switch Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Switch_statementImpl extends MinimalEObjectImpl.Container implements Switch_statement
{
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
   * The cached value of the '{@link #getSwitchStatements() <em>Switch Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> switchStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Switch_statementImpl()
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
    return MyJavaPackage.Literals.SWITCH_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.SWITCH_STATEMENT__LPAREN, oldLParen, lParen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.SWITCH_STATEMENT__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getSwitchStatements()
  {
    if (switchStatements == null)
    {
      switchStatements = new EObjectContainmentEList<Statement>(Statement.class, this, MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS);
    }
    return switchStatements;
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
      case MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return ((InternalEList<?>)getSwitchStatements()).basicRemove(otherEnd, msgs);
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
      case MyJavaPackage.SWITCH_STATEMENT__LPAREN:
        return getLParen();
      case MyJavaPackage.SWITCH_STATEMENT__RPARENT:
        return getRparent();
      case MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return getSwitchStatements();
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
      case MyJavaPackage.SWITCH_STATEMENT__LPAREN:
        setLParen((String)newValue);
        return;
      case MyJavaPackage.SWITCH_STATEMENT__RPARENT:
        setRparent((String)newValue);
        return;
      case MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        getSwitchStatements().clear();
        getSwitchStatements().addAll((Collection<? extends Statement>)newValue);
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
      case MyJavaPackage.SWITCH_STATEMENT__LPAREN:
        setLParen(LPAREN_EDEFAULT);
        return;
      case MyJavaPackage.SWITCH_STATEMENT__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        getSwitchStatements().clear();
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
      case MyJavaPackage.SWITCH_STATEMENT__LPAREN:
        return LPAREN_EDEFAULT == null ? lParen != null : !LPAREN_EDEFAULT.equals(lParen);
      case MyJavaPackage.SWITCH_STATEMENT__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyJavaPackage.SWITCH_STATEMENT__SWITCH_STATEMENTS:
        return switchStatements != null && !switchStatements.isEmpty();
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

} //Switch_statementImpl
