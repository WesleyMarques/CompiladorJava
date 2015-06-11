/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.Expression;
import org.xtext.example.mydsl.myJava.Expression_line;
import org.xtext.example.mydsl.myJava.MyJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.ExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.ExpressionImpl#getLParen <em>LParen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.ExpressionImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.ExpressionImpl#getExpressionLine <em>Expression Line</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.ExpressionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EObject expression;

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
   * The cached value of the '{@link #getExpressionLine() <em>Expression Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionLine()
   * @generated
   * @ordered
   */
  protected Expression_line expressionLine;

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
  protected ExpressionImpl()
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
    return MyJavaPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(EObject newExpression, NotificationChain msgs)
  {
    EObject oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(EObject newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__LPAREN, oldLParen, lParen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_line getExpressionLine()
  {
    return expressionLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionLine(Expression_line newExpressionLine, NotificationChain msgs)
  {
    Expression_line oldExpressionLine = expressionLine;
    expressionLine = newExpressionLine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__EXPRESSION_LINE, oldExpressionLine, newExpressionLine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionLine(Expression_line newExpressionLine)
  {
    if (newExpressionLine != expressionLine)
    {
      NotificationChain msgs = null;
      if (expressionLine != null)
        msgs = ((InternalEObject)expressionLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.EXPRESSION__EXPRESSION_LINE, null, msgs);
      if (newExpressionLine != null)
        msgs = ((InternalEObject)newExpressionLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.EXPRESSION__EXPRESSION_LINE, null, msgs);
      msgs = basicSetExpressionLine(newExpressionLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__EXPRESSION_LINE, newExpressionLine, newExpressionLine));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.EXPRESSION__NAME, oldName, name));
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
      case MyJavaPackage.EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyJavaPackage.EXPRESSION__EXPRESSION_LINE:
        return basicSetExpressionLine(null, msgs);
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
      case MyJavaPackage.EXPRESSION__EXPRESSION:
        return getExpression();
      case MyJavaPackage.EXPRESSION__LPAREN:
        return getLParen();
      case MyJavaPackage.EXPRESSION__RPARENT:
        return getRparent();
      case MyJavaPackage.EXPRESSION__EXPRESSION_LINE:
        return getExpressionLine();
      case MyJavaPackage.EXPRESSION__NAME:
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
      case MyJavaPackage.EXPRESSION__EXPRESSION:
        setExpression((EObject)newValue);
        return;
      case MyJavaPackage.EXPRESSION__LPAREN:
        setLParen((String)newValue);
        return;
      case MyJavaPackage.EXPRESSION__RPARENT:
        setRparent((String)newValue);
        return;
      case MyJavaPackage.EXPRESSION__EXPRESSION_LINE:
        setExpressionLine((Expression_line)newValue);
        return;
      case MyJavaPackage.EXPRESSION__NAME:
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
      case MyJavaPackage.EXPRESSION__EXPRESSION:
        setExpression((EObject)null);
        return;
      case MyJavaPackage.EXPRESSION__LPAREN:
        setLParen(LPAREN_EDEFAULT);
        return;
      case MyJavaPackage.EXPRESSION__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyJavaPackage.EXPRESSION__EXPRESSION_LINE:
        setExpressionLine((Expression_line)null);
        return;
      case MyJavaPackage.EXPRESSION__NAME:
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
      case MyJavaPackage.EXPRESSION__EXPRESSION:
        return expression != null;
      case MyJavaPackage.EXPRESSION__LPAREN:
        return LPAREN_EDEFAULT == null ? lParen != null : !LPAREN_EDEFAULT.equals(lParen);
      case MyJavaPackage.EXPRESSION__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyJavaPackage.EXPRESSION__EXPRESSION_LINE:
        return expressionLine != null;
      case MyJavaPackage.EXPRESSION__NAME:
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
    result.append(" (lParen: ");
    result.append(lParen);
    result.append(", rparent: ");
    result.append(rparent);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
