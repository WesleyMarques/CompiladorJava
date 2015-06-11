/**
 */
package org.xtext.example.mydsl.myJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myJava.MyJavaPackage;
import org.xtext.example.mydsl.myJava.Statement;
import org.xtext.example.mydsl.myJava.Statement_block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myJava.impl.Statement_blockImpl#getStatments <em>Statments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Statement_blockImpl extends StatementImpl implements Statement_block
{
  /**
   * The cached value of the '{@link #getStatments() <em>Statments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatments()
   * @generated
   * @ordered
   */
  protected EList<Statement> statments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Statement_blockImpl()
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
    return MyJavaPackage.Literals.STATEMENT_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatments()
  {
    if (statments == null)
    {
      statments = new EObjectContainmentEList<Statement>(Statement.class, this, MyJavaPackage.STATEMENT_BLOCK__STATMENTS);
    }
    return statments;
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
      case MyJavaPackage.STATEMENT_BLOCK__STATMENTS:
        return ((InternalEList<?>)getStatments()).basicRemove(otherEnd, msgs);
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
      case MyJavaPackage.STATEMENT_BLOCK__STATMENTS:
        return getStatments();
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
      case MyJavaPackage.STATEMENT_BLOCK__STATMENTS:
        getStatments().clear();
        getStatments().addAll((Collection<? extends Statement>)newValue);
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
      case MyJavaPackage.STATEMENT_BLOCK__STATMENTS:
        getStatments().clear();
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
      case MyJavaPackage.STATEMENT_BLOCK__STATMENTS:
        return statments != null && !statments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Statement_blockImpl
