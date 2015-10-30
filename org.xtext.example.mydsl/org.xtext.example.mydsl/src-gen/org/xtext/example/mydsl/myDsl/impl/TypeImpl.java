/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl#getTypeVector <em>Type Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected static final String TYPE_SPECIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected String typeSpecifier = TYPE_SPECIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeVector() <em>Type Vector</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeVector()
   * @generated
   * @ordered
   */
  protected EList<String> typeVector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return MyDslPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeSpecifier()
  {
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpecifier(String newTypeSpecifier)
  {
    String oldTypeSpecifier = typeSpecifier;
    typeSpecifier = newTypeSpecifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE__TYPE_SPECIFIER, oldTypeSpecifier, typeSpecifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypeVector()
  {
    if (typeVector == null)
    {
      typeVector = new EDataTypeEList<String>(String.class, this, MyDslPackage.TYPE__TYPE_VECTOR);
    }
    return typeVector;
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        return getTypeSpecifier();
      case MyDslPackage.TYPE__TYPE_VECTOR:
        return getTypeVector();
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        setTypeSpecifier((String)newValue);
        return;
      case MyDslPackage.TYPE__TYPE_VECTOR:
        getTypeVector().clear();
        getTypeVector().addAll((Collection<? extends String>)newValue);
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        setTypeSpecifier(TYPE_SPECIFIER_EDEFAULT);
        return;
      case MyDslPackage.TYPE__TYPE_VECTOR:
        getTypeVector().clear();
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
      case MyDslPackage.TYPE__TYPE_SPECIFIER:
        return TYPE_SPECIFIER_EDEFAULT == null ? typeSpecifier != null : !TYPE_SPECIFIER_EDEFAULT.equals(typeSpecifier);
      case MyDslPackage.TYPE__TYPE_VECTOR:
        return typeVector != null && !typeVector.isEmpty();
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
    result.append(" (typeSpecifier: ");
    result.append(typeSpecifier);
    result.append(", typeVector: ");
    result.append(typeVector);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
