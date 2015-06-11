/**
 */
package org.xtext.example.mydsl.myJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myJava.Expression;
import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Numeric_Expression;
import org.xtext.example.mydsl.myJava.Numeric_Expression_line;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_ExpressionImpl#getUnaryOp <em>Unary Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_ExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Numeric_ExpressionImpl#getNumericExpressionLine <em>Numeric Expression Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Numeric_ExpressionImpl extends MinimalEObjectImpl.Container implements Numeric_Expression
{
  /**
   * The default value of the '{@link #getUnaryOp() <em>Unary Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryOp()
   * @generated
   * @ordered
   */
  protected static final String UNARY_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnaryOp() <em>Unary Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryOp()
   * @generated
   * @ordered
   */
  protected String unaryOp = UNARY_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getNumericExpressionLine() <em>Numeric Expression Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumericExpressionLine()
   * @generated
   * @ordered
   */
  protected Numeric_Expression_line numericExpressionLine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Numeric_ExpressionImpl()
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
    return MyJavaPackage.Literals.NUMERIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnaryOp()
  {
    return unaryOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryOp(String newUnaryOp)
  {
    String oldUnaryOp = unaryOp;
    unaryOp = newUnaryOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION__UNARY_OP, oldUnaryOp, unaryOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric_Expression_line getNumericExpressionLine()
  {
    return numericExpressionLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumericExpressionLine(Numeric_Expression_line newNumericExpressionLine, NotificationChain msgs)
  {
    Numeric_Expression_line oldNumericExpressionLine = numericExpressionLine;
    numericExpressionLine = newNumericExpressionLine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE, oldNumericExpressionLine, newNumericExpressionLine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumericExpressionLine(Numeric_Expression_line newNumericExpressionLine)
  {
    if (newNumericExpressionLine != numericExpressionLine)
    {
      NotificationChain msgs = null;
      if (numericExpressionLine != null)
        msgs = ((InternalEObject)numericExpressionLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE, null, msgs);
      if (newNumericExpressionLine != null)
        msgs = ((InternalEObject)newNumericExpressionLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE, null, msgs);
      msgs = basicSetNumericExpressionLine(newNumericExpressionLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE, newNumericExpressionLine, newNumericExpressionLine));
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
      case MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE:
        return basicSetNumericExpressionLine(null, msgs);
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
      case MyJavaPackage.NUMERIC_EXPRESSION__UNARY_OP:
        return getUnaryOp();
      case MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return getExpression();
      case MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE:
        return getNumericExpressionLine();
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
      case MyJavaPackage.NUMERIC_EXPRESSION__UNARY_OP:
        setUnaryOp((String)newValue);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE:
        setNumericExpressionLine((Numeric_Expression_line)newValue);
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
      case MyJavaPackage.NUMERIC_EXPRESSION__UNARY_OP:
        setUnaryOp(UNARY_OP_EDEFAULT);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE:
        setNumericExpressionLine((Numeric_Expression_line)null);
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
      case MyJavaPackage.NUMERIC_EXPRESSION__UNARY_OP:
        return UNARY_OP_EDEFAULT == null ? unaryOp != null : !UNARY_OP_EDEFAULT.equals(unaryOp);
      case MyJavaPackage.NUMERIC_EXPRESSION__EXPRESSION:
        return expression != null;
      case MyJavaPackage.NUMERIC_EXPRESSION__NUMERIC_EXPRESSION_LINE:
        return numericExpressionLine != null;
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
    result.append(" (unaryOp: ");
    result.append(unaryOp);
    result.append(')');
    return result.toString();
  }

} //Numeric_ExpressionImpl
