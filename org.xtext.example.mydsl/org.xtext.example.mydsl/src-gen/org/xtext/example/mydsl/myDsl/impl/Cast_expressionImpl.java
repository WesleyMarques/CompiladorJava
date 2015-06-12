/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Cast_expression;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Primitive_type;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Unary_expression;
import org.xtext.example.mydsl.myDsl.Unary_expression_Not_Plus_Minus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getLparent <em>Lparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getPrimitivetype <em>Primitivetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getRparent <em>Rparent</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Cast_expressionImpl#getUnaryexpressionnotplusminus <em>Unaryexpressionnotplusminus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Cast_expressionImpl extends MinimalEObjectImpl.Container implements Cast_expression
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
   * The cached value of the '{@link #getPrimitivetype() <em>Primitivetype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitivetype()
   * @generated
   * @ordered
   */
  protected Primitive_type primitivetype;

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
   * The cached value of the '{@link #getUnaryexpression() <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryexpression()
   * @generated
   * @ordered
   */
  protected Unary_expression unaryexpression;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

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
   * The cached value of the '{@link #getUnaryexpressionnotplusminus() <em>Unaryexpressionnotplusminus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryexpressionnotplusminus()
   * @generated
   * @ordered
   */
  protected Unary_expression_Not_Plus_Minus unaryexpressionnotplusminus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cast_expressionImpl()
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
    return MyDslPackage.Literals.CAST_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__LPARENT, oldLparent, lparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive_type getPrimitivetype()
  {
    return primitivetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitivetype(Primitive_type newPrimitivetype, NotificationChain msgs)
  {
    Primitive_type oldPrimitivetype = primitivetype;
    primitivetype = newPrimitivetype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE, oldPrimitivetype, newPrimitivetype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitivetype(Primitive_type newPrimitivetype)
  {
    if (newPrimitivetype != primitivetype)
    {
      NotificationChain msgs = null;
      if (primitivetype != null)
        msgs = ((InternalEObject)primitivetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE, null, msgs);
      if (newPrimitivetype != null)
        msgs = ((InternalEObject)newPrimitivetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE, null, msgs);
      msgs = basicSetPrimitivetype(newPrimitivetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE, newPrimitivetype, newPrimitivetype));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__RPARENT, oldRparent, rparent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expression getUnaryexpression()
  {
    return unaryexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryexpression(Unary_expression newUnaryexpression, NotificationChain msgs)
  {
    Unary_expression oldUnaryexpression = unaryexpression;
    unaryexpression = newUnaryexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION, oldUnaryexpression, newUnaryexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryexpression(Unary_expression newUnaryexpression)
  {
    if (newUnaryexpression != unaryexpression)
    {
      NotificationChain msgs = null;
      if (unaryexpression != null)
        msgs = ((InternalEObject)unaryexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION, null, msgs);
      if (newUnaryexpression != null)
        msgs = ((InternalEObject)newUnaryexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION, null, msgs);
      msgs = basicSetUnaryexpression(newUnaryexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION, newUnaryexpression, newUnaryexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary_expression_Not_Plus_Minus getUnaryexpressionnotplusminus()
  {
    return unaryexpressionnotplusminus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryexpressionnotplusminus(Unary_expression_Not_Plus_Minus newUnaryexpressionnotplusminus, NotificationChain msgs)
  {
    Unary_expression_Not_Plus_Minus oldUnaryexpressionnotplusminus = unaryexpressionnotplusminus;
    unaryexpressionnotplusminus = newUnaryexpressionnotplusminus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS, oldUnaryexpressionnotplusminus, newUnaryexpressionnotplusminus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryexpressionnotplusminus(Unary_expression_Not_Plus_Minus newUnaryexpressionnotplusminus)
  {
    if (newUnaryexpressionnotplusminus != unaryexpressionnotplusminus)
    {
      NotificationChain msgs = null;
      if (unaryexpressionnotplusminus != null)
        msgs = ((InternalEObject)unaryexpressionnotplusminus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS, null, msgs);
      if (newUnaryexpressionnotplusminus != null)
        msgs = ((InternalEObject)newUnaryexpressionnotplusminus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS, null, msgs);
      msgs = basicSetUnaryexpressionnotplusminus(newUnaryexpressionnotplusminus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS, newUnaryexpressionnotplusminus, newUnaryexpressionnotplusminus));
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
      case MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE:
        return basicSetPrimitivetype(null, msgs);
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION:
        return basicSetUnaryexpression(null, msgs);
      case MyDslPackage.CAST_EXPRESSION__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.CAST_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS:
        return basicSetUnaryexpressionnotplusminus(null, msgs);
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
      case MyDslPackage.CAST_EXPRESSION__LPARENT:
        return getLparent();
      case MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE:
        return getPrimitivetype();
      case MyDslPackage.CAST_EXPRESSION__RPARENT:
        return getRparent();
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION:
        return getUnaryexpression();
      case MyDslPackage.CAST_EXPRESSION__TYPE:
        return getType();
      case MyDslPackage.CAST_EXPRESSION__EXPRESSION:
        return getExpression();
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS:
        return getUnaryexpressionnotplusminus();
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
      case MyDslPackage.CAST_EXPRESSION__LPARENT:
        setLparent((String)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__RPARENT:
        setRparent((String)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION:
        setUnaryexpression((Unary_expression)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS:
        setUnaryexpressionnotplusminus((Unary_expression_Not_Plus_Minus)newValue);
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
      case MyDslPackage.CAST_EXPRESSION__LPARENT:
        setLparent(LPARENT_EDEFAULT);
        return;
      case MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)null);
        return;
      case MyDslPackage.CAST_EXPRESSION__RPARENT:
        setRparent(RPARENT_EDEFAULT);
        return;
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION:
        setUnaryexpression((Unary_expression)null);
        return;
      case MyDslPackage.CAST_EXPRESSION__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.CAST_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS:
        setUnaryexpressionnotplusminus((Unary_expression_Not_Plus_Minus)null);
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
      case MyDslPackage.CAST_EXPRESSION__LPARENT:
        return LPARENT_EDEFAULT == null ? lparent != null : !LPARENT_EDEFAULT.equals(lparent);
      case MyDslPackage.CAST_EXPRESSION__PRIMITIVETYPE:
        return primitivetype != null;
      case MyDslPackage.CAST_EXPRESSION__RPARENT:
        return RPARENT_EDEFAULT == null ? rparent != null : !RPARENT_EDEFAULT.equals(rparent);
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSION:
        return unaryexpression != null;
      case MyDslPackage.CAST_EXPRESSION__TYPE:
        return type != null;
      case MyDslPackage.CAST_EXPRESSION__EXPRESSION:
        return expression != null;
      case MyDslPackage.CAST_EXPRESSION__UNARYEXPRESSIONNOTPLUSMINUS:
        return unaryexpressionnotplusminus != null;
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
    result.append(", rparent: ");
    result.append(rparent);
    result.append(')');
    return result.toString();
  }

} //Cast_expressionImpl
