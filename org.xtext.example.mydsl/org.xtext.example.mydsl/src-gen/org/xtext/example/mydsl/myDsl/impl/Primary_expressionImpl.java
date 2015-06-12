/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.Creator;
import org.xtext.example.mydsl.myDsl.Identifier_suffix;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Parens_expression;
import org.xtext.example.mydsl.myDsl.Primary_expression;
import org.xtext.example.mydsl.myDsl.Primitive_type;
import org.xtext.example.mydsl.myDsl.Super_suffix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getIdentifiersuffix <em>Identifiersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getSupersuffix <em>Supersuffix</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Primary_expressionImpl#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Primary_expressionImpl extends MinimalEObjectImpl.Container implements Primary_expression
{
  /**
   * The cached value of the '{@link #getParexpression() <em>Parexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParexpression()
   * @generated
   * @ordered
   */
  protected Parens_expression parexpression;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected EList<String> identifier;

  /**
   * The cached value of the '{@link #getIdentifiersuffix() <em>Identifiersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiersuffix()
   * @generated
   * @ordered
   */
  protected Identifier_suffix identifiersuffix;

  /**
   * The cached value of the '{@link #getSupersuffix() <em>Supersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupersuffix()
   * @generated
   * @ordered
   */
  protected Super_suffix supersuffix;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreator()
   * @generated
   * @ordered
   */
  protected Creator creator;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Primary_expressionImpl()
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
    return MyDslPackage.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parens_expression getParexpression()
  {
    return parexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParexpression(Parens_expression newParexpression, NotificationChain msgs)
  {
    Parens_expression oldParexpression = parexpression;
    parexpression = newParexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION, oldParexpression, newParexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParexpression(Parens_expression newParexpression)
  {
    if (newParexpression != parexpression)
    {
      NotificationChain msgs = null;
      if (parexpression != null)
        msgs = ((InternalEObject)parexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION, null, msgs);
      if (newParexpression != null)
        msgs = ((InternalEObject)newParexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION, null, msgs);
      msgs = basicSetParexpression(newParexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION, newParexpression, newParexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIdentifier()
  {
    if (identifier == null)
    {
      identifier = new EDataTypeEList<String>(String.class, this, MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIER);
    }
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier_suffix getIdentifiersuffix()
  {
    return identifiersuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifiersuffix(Identifier_suffix newIdentifiersuffix, NotificationChain msgs)
  {
    Identifier_suffix oldIdentifiersuffix = identifiersuffix;
    identifiersuffix = newIdentifiersuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX, oldIdentifiersuffix, newIdentifiersuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifiersuffix(Identifier_suffix newIdentifiersuffix)
  {
    if (newIdentifiersuffix != identifiersuffix)
    {
      NotificationChain msgs = null;
      if (identifiersuffix != null)
        msgs = ((InternalEObject)identifiersuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX, null, msgs);
      if (newIdentifiersuffix != null)
        msgs = ((InternalEObject)newIdentifiersuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX, null, msgs);
      msgs = basicSetIdentifiersuffix(newIdentifiersuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX, newIdentifiersuffix, newIdentifiersuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Super_suffix getSupersuffix()
  {
    return supersuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupersuffix(Super_suffix newSupersuffix, NotificationChain msgs)
  {
    Super_suffix oldSupersuffix = supersuffix;
    supersuffix = newSupersuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX, oldSupersuffix, newSupersuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupersuffix(Super_suffix newSupersuffix)
  {
    if (newSupersuffix != supersuffix)
    {
      NotificationChain msgs = null;
      if (supersuffix != null)
        msgs = ((InternalEObject)supersuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX, null, msgs);
      if (newSupersuffix != null)
        msgs = ((InternalEObject)newSupersuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX, null, msgs);
      msgs = basicSetSupersuffix(newSupersuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX, newSupersuffix, newSupersuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creator getCreator()
  {
    return creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreator(Creator newCreator, NotificationChain msgs)
  {
    Creator oldCreator = creator;
    creator = newCreator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__CREATOR, oldCreator, newCreator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreator(Creator newCreator)
  {
    if (newCreator != creator)
    {
      NotificationChain msgs = null;
      if (creator != null)
        msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__CREATOR, null, msgs);
      if (newCreator != null)
        msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__CREATOR, null, msgs);
      msgs = basicSetCreator(newCreator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__CREATOR, newCreator, newCreator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE, oldPrimitivetype, newPrimitivetype);
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
        msgs = ((InternalEObject)primitivetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE, null, msgs);
      if (newPrimitivetype != null)
        msgs = ((InternalEObject)newPrimitivetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE, null, msgs);
      msgs = basicSetPrimitivetype(newPrimitivetype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE, newPrimitivetype, newPrimitivetype));
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
      case MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION:
        return basicSetParexpression(null, msgs);
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX:
        return basicSetIdentifiersuffix(null, msgs);
      case MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX:
        return basicSetSupersuffix(null, msgs);
      case MyDslPackage.PRIMARY_EXPRESSION__CREATOR:
        return basicSetCreator(null, msgs);
      case MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE:
        return basicSetPrimitivetype(null, msgs);
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
      case MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION:
        return getParexpression();
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIER:
        return getIdentifier();
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX:
        return getIdentifiersuffix();
      case MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX:
        return getSupersuffix();
      case MyDslPackage.PRIMARY_EXPRESSION__LITERAL:
        return getLiteral();
      case MyDslPackage.PRIMARY_EXPRESSION__CREATOR:
        return getCreator();
      case MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE:
        return getPrimitivetype();
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
      case MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION:
        setParexpression((Parens_expression)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIER:
        getIdentifier().clear();
        getIdentifier().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX:
        setIdentifiersuffix((Identifier_suffix)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX:
        setSupersuffix((Super_suffix)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__LITERAL:
        setLiteral((String)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__CREATOR:
        setCreator((Creator)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)newValue);
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
      case MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION:
        setParexpression((Parens_expression)null);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIER:
        getIdentifier().clear();
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX:
        setIdentifiersuffix((Identifier_suffix)null);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX:
        setSupersuffix((Super_suffix)null);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__CREATOR:
        setCreator((Creator)null);
        return;
      case MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE:
        setPrimitivetype((Primitive_type)null);
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
      case MyDslPackage.PRIMARY_EXPRESSION__PAREXPRESSION:
        return parexpression != null;
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIER:
        return identifier != null && !identifier.isEmpty();
      case MyDslPackage.PRIMARY_EXPRESSION__IDENTIFIERSUFFIX:
        return identifiersuffix != null;
      case MyDslPackage.PRIMARY_EXPRESSION__SUPERSUFFIX:
        return supersuffix != null;
      case MyDslPackage.PRIMARY_EXPRESSION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case MyDslPackage.PRIMARY_EXPRESSION__CREATOR:
        return creator != null;
      case MyDslPackage.PRIMARY_EXPRESSION__PRIMITIVETYPE:
        return primitivetype != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(", literal: ");
    result.append(literal);
    result.append(')');
    return result.toString();
  }

} //Primary_expressionImpl
