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

import org.xtext.example.mydsl.myJava.Expression_line;
import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Numeric_Expression_line;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Expression line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_Expression_lineImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_Expression_lineImpl#getExpressionLine <em>Expression Line</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_Expression_lineImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_Expression_lineImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Numeric_Expression_lineImpl extends MinimalEObjectImpl.Container implements Numeric_Expression_line
{
  /**
   * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected static final String INCREMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected String increment = INCREMENT_EDEFAULT;

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
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Numeric_Expression_lineImpl()
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
    return MyJavaPackage.Literals.NUMERIC_EXPRESSION_LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncrement()
  {
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncrement(String newIncrement)
  {
    String oldIncrement = increment;
    increment = newIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__INCREMENT, oldIncrement, increment));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE, oldExpressionLine, newExpressionLine);
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
        msgs = ((InternalEObject)expressionLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE, null, msgs);
      if (newExpressionLine != null)
        msgs = ((InternalEObject)newExpressionLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE, null, msgs);
      msgs = basicSetExpressionLine(newExpressionLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE, newExpressionLine, newExpressionLine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__OP, oldOp, op));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION, newExpression, newExpression));
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
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE:
        return basicSetExpressionLine(null, msgs);
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__INCREMENT:
        return getIncrement();
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE:
        return getExpressionLine();
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__OP:
        return getOp();
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION:
        return getExpression();
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
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__INCREMENT:
        setIncrement((String)newValue);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE:
        setExpressionLine((Expression_line)newValue);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__OP:
        setOp((String)newValue);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION:
        setExpression((EObject)newValue);
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
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__INCREMENT:
        setIncrement(INCREMENT_EDEFAULT);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE:
        setExpressionLine((Expression_line)null);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__OP:
        setOp(OP_EDEFAULT);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION:
        setExpression((EObject)null);
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
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__INCREMENT:
        return INCREMENT_EDEFAULT == null ? increment != null : !INCREMENT_EDEFAULT.equals(increment);
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION_LINE:
        return expressionLine != null;
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case MyJavaPackage.NUMERIC_EXPRESSION_LINE__EXPRESSION:
        return expression != null;
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
    result.append(" (increment: ");
    result.append(increment);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //Numeric_Expression_lineImpl
