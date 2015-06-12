/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Conditional_OR_expression;
import org.xtext.example.mydsl.myDsl.Conditional_expression;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl#getAssignmentoperator <em>Assignmentoperator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl#getConditionalorexpression <em>Conditionalorexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Conditional_expressionImpl#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Conditional_expressionImpl extends ExpressionImpl implements Conditional_expression
{
  /**
   * The default value of the '{@link #getAssignmentoperator() <em>Assignmentoperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignmentoperator()
   * @generated
   * @ordered
   */
  protected static final String ASSIGNMENTOPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssignmentoperator() <em>Assignmentoperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignmentoperator()
   * @generated
   * @ordered
   */
  protected String assignmentoperator = ASSIGNMENTOPERATOR_EDEFAULT;

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
   * The cached value of the '{@link #getConditionalorexpression() <em>Conditionalorexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalorexpression()
   * @generated
   * @ordered
   */
  protected Conditional_OR_expression conditionalorexpression;

  /**
   * The cached value of the '{@link #getExpression1() <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression1()
   * @generated
   * @ordered
   */
  protected Expression expression1;

  /**
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected Expression expression2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Conditional_expressionImpl()
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
    return MyDslPackage.Literals.CONDITIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssignmentoperator()
  {
    return assignmentoperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignmentoperator(String newAssignmentoperator)
  {
    String oldAssignmentoperator = assignmentoperator;
    assignmentoperator = newAssignmentoperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR, oldAssignmentoperator, assignmentoperator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional_OR_expression getConditionalorexpression()
  {
    return conditionalorexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionalorexpression(Conditional_OR_expression newConditionalorexpression, NotificationChain msgs)
  {
    Conditional_OR_expression oldConditionalorexpression = conditionalorexpression;
    conditionalorexpression = newConditionalorexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION, oldConditionalorexpression, newConditionalorexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionalorexpression(Conditional_OR_expression newConditionalorexpression)
  {
    if (newConditionalorexpression != conditionalorexpression)
    {
      NotificationChain msgs = null;
      if (conditionalorexpression != null)
        msgs = ((InternalEObject)conditionalorexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION, null, msgs);
      if (newConditionalorexpression != null)
        msgs = ((InternalEObject)newConditionalorexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION, null, msgs);
      msgs = basicSetConditionalorexpression(newConditionalorexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION, newConditionalorexpression, newConditionalorexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression1()
  {
    return expression1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression1(Expression newExpression1, NotificationChain msgs)
  {
    Expression oldExpression1 = expression1;
    expression1 = newExpression1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1, oldExpression1, newExpression1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression1(Expression newExpression1)
  {
    if (newExpression1 != expression1)
    {
      NotificationChain msgs = null;
      if (expression1 != null)
        msgs = ((InternalEObject)expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1, null, msgs);
      if (newExpression1 != null)
        msgs = ((InternalEObject)newExpression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1, null, msgs);
      msgs = basicSetExpression1(newExpression1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1, newExpression1, newExpression1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression2()
  {
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression2(Expression newExpression2, NotificationChain msgs)
  {
    Expression oldExpression2 = expression2;
    expression2 = newExpression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2, oldExpression2, newExpression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression2(Expression newExpression2)
  {
    if (newExpression2 != expression2)
    {
      NotificationChain msgs = null;
      if (expression2 != null)
        msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2, null, msgs);
      if (newExpression2 != null)
        msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2, null, msgs);
      msgs = basicSetExpression2(newExpression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2, newExpression2, newExpression2));
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
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION:
        return basicSetConditionalorexpression(null, msgs);
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1:
        return basicSetExpression1(null, msgs);
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2:
        return basicSetExpression2(null, msgs);
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
      case MyDslPackage.CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR:
        return getAssignmentoperator();
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
        return getExpression();
      case MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION:
        return getConditionalorexpression();
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1:
        return getExpression1();
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2:
        return getExpression2();
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
      case MyDslPackage.CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR:
        setAssignmentoperator((String)newValue);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION:
        setConditionalorexpression((Conditional_OR_expression)newValue);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1:
        setExpression1((Expression)newValue);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2:
        setExpression2((Expression)newValue);
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
      case MyDslPackage.CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR:
        setAssignmentoperator(ASSIGNMENTOPERATOR_EDEFAULT);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION:
        setConditionalorexpression((Conditional_OR_expression)null);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1:
        setExpression1((Expression)null);
        return;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2:
        setExpression2((Expression)null);
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
      case MyDslPackage.CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR:
        return ASSIGNMENTOPERATOR_EDEFAULT == null ? assignmentoperator != null : !ASSIGNMENTOPERATOR_EDEFAULT.equals(assignmentoperator);
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION:
        return expression != null;
      case MyDslPackage.CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION:
        return conditionalorexpression != null;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION1:
        return expression1 != null;
      case MyDslPackage.CONDITIONAL_EXPRESSION__EXPRESSION2:
        return expression2 != null;
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
    result.append(" (assignmentoperator: ");
    result.append(assignmentoperator);
    result.append(')');
    return result.toString();
  }

} //Conditional_expressionImpl
