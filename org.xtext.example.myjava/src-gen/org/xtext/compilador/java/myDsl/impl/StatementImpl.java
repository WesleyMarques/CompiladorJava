/**
 */
package org.xtext.compilador.java.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.compilador.java.myDsl.Do_Statement;
import org.xtext.compilador.java.myDsl.For_Statement;
import org.xtext.compilador.java.myDsl.If_statement;
import org.xtext.compilador.java.myDsl.MyDslPackage;
import org.xtext.compilador.java.myDsl.Statement;
import org.xtext.compilador.java.myDsl.Try_statement;
import org.xtext.compilador.java.myDsl.Variable_declaration;
import org.xtext.compilador.java.myDsl.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getDoStatement <em>Do Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getWhileStatement <em>While Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getForStatement <em>For Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getNameStatement <em>Name Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getSyncStatement <em>Sync Statement</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.compilador.java.myDsl.impl.StatementImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends If_statementImpl implements Statement
{
  /**
   * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclaration()
   * @generated
   * @ordered
   */
  protected Variable_declaration variableDeclaration;

  /**
   * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatement()
   * @generated
   * @ordered
   */
  protected If_statement ifStatement;

  /**
   * The cached value of the '{@link #getDoStatement() <em>Do Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoStatement()
   * @generated
   * @ordered
   */
  protected Do_Statement doStatement;

  /**
   * The cached value of the '{@link #getWhileStatement() <em>While Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileStatement()
   * @generated
   * @ordered
   */
  protected While_Statement whileStatement;

  /**
   * The cached value of the '{@link #getForStatement() <em>For Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStatement()
   * @generated
   * @ordered
   */
  protected For_Statement forStatement;

  /**
   * The cached value of the '{@link #getTryStatement() <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTryStatement()
   * @generated
   * @ordered
   */
  protected Try_statement tryStatement;

  /**
   * The default value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected static final String NAME_STATEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameStatement() <em>Name Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStatement()
   * @generated
   * @ordered
   */
  protected String nameStatement = NAME_STATEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * The cached value of the '{@link #getSyncStatement() <em>Sync Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyncStatement()
   * @generated
   * @ordered
   */
  protected Statement syncStatement;

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
   * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseStatement()
   * @generated
   * @ordered
   */
  protected Statement elseStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration getVariableDeclaration()
  {
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclaration(Variable_declaration newVariableDeclaration, NotificationChain msgs)
  {
    Variable_declaration oldVariableDeclaration = variableDeclaration;
    variableDeclaration = newVariableDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclaration(Variable_declaration newVariableDeclaration)
  {
    if (newVariableDeclaration != variableDeclaration)
    {
      NotificationChain msgs = null;
      if (variableDeclaration != null)
        msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      if (newVariableDeclaration != null)
        msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_statement getIfStatement()
  {
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStatement(If_statement newIfStatement, NotificationChain msgs)
  {
    If_statement oldIfStatement = ifStatement;
    ifStatement = newIfStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IF_STATEMENT, oldIfStatement, newIfStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStatement(If_statement newIfStatement)
  {
    if (newIfStatement != ifStatement)
    {
      NotificationChain msgs = null;
      if (ifStatement != null)
        msgs = ((InternalEObject)ifStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      if (newIfStatement != null)
        msgs = ((InternalEObject)newIfStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIfStatement(newIfStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__IF_STATEMENT, newIfStatement, newIfStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do_Statement getDoStatement()
  {
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoStatement(Do_Statement newDoStatement, NotificationChain msgs)
  {
    Do_Statement oldDoStatement = doStatement;
    doStatement = newDoStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__DO_STATEMENT, oldDoStatement, newDoStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoStatement(Do_Statement newDoStatement)
  {
    if (newDoStatement != doStatement)
    {
      NotificationChain msgs = null;
      if (doStatement != null)
        msgs = ((InternalEObject)doStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      if (newDoStatement != null)
        msgs = ((InternalEObject)newDoStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      msgs = basicSetDoStatement(newDoStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__DO_STATEMENT, newDoStatement, newDoStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Statement getWhileStatement()
  {
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileStatement(While_Statement newWhileStatement, NotificationChain msgs)
  {
    While_Statement oldWhileStatement = whileStatement;
    whileStatement = newWhileStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__WHILE_STATEMENT, oldWhileStatement, newWhileStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileStatement(While_Statement newWhileStatement)
  {
    if (newWhileStatement != whileStatement)
    {
      NotificationChain msgs = null;
      if (whileStatement != null)
        msgs = ((InternalEObject)whileStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhileStatement != null)
        msgs = ((InternalEObject)newWhileStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhileStatement(newWhileStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__WHILE_STATEMENT, newWhileStatement, newWhileStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Statement getForStatement()
  {
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStatement(For_Statement newForStatement, NotificationChain msgs)
  {
    For_Statement oldForStatement = forStatement;
    forStatement = newForStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__FOR_STATEMENT, oldForStatement, newForStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStatement(For_Statement newForStatement)
  {
    if (newForStatement != forStatement)
    {
      NotificationChain msgs = null;
      if (forStatement != null)
        msgs = ((InternalEObject)forStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      if (newForStatement != null)
        msgs = ((InternalEObject)newForStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetForStatement(newForStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__FOR_STATEMENT, newForStatement, newForStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement getTryStatement()
  {
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTryStatement(Try_statement newTryStatement, NotificationChain msgs)
  {
    Try_statement oldTryStatement = tryStatement;
    tryStatement = newTryStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, oldTryStatement, newTryStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTryStatement(Try_statement newTryStatement)
  {
    if (newTryStatement != tryStatement)
    {
      NotificationChain msgs = null;
      if (tryStatement != null)
        msgs = ((InternalEObject)tryStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTryStatement != null)
        msgs = ((InternalEObject)newTryStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTryStatement(newTryStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TRY_STATEMENT, newTryStatement, newTryStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameStatement()
  {
    return nameStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameStatement(String newNameStatement)
  {
    String oldNameStatement = nameStatement;
    nameStatement = newNameStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME_STATEMENT, oldNameStatement, nameStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getSyncStatement()
  {
    return syncStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSyncStatement(Statement newSyncStatement, NotificationChain msgs)
  {
    Statement oldSyncStatement = syncStatement;
    syncStatement = newSyncStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SYNC_STATEMENT, oldSyncStatement, newSyncStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyncStatement(Statement newSyncStatement)
  {
    if (newSyncStatement != syncStatement)
    {
      NotificationChain msgs = null;
      if (syncStatement != null)
        msgs = ((InternalEObject)syncStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      if (newSyncStatement != null)
        msgs = ((InternalEObject)newSyncStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      msgs = basicSetSyncStatement(newSyncStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__SYNC_STATEMENT, newSyncStatement, newSyncStatement));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getElseStatement()
  {
    return elseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseStatement(Statement newElseStatement, NotificationChain msgs)
  {
    Statement oldElseStatement = elseStatement;
    elseStatement = newElseStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ELSE_STATEMENT, oldElseStatement, newElseStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseStatement(Statement newElseStatement)
  {
    if (newElseStatement != elseStatement)
    {
      NotificationChain msgs = null;
      if (elseStatement != null)
        msgs = ((InternalEObject)elseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ELSE_STATEMENT, null, msgs);
      if (newElseStatement != null)
        msgs = ((InternalEObject)newElseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMENT__ELSE_STATEMENT, null, msgs);
      msgs = basicSetElseStatement(newElseStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__ELSE_STATEMENT, newElseStatement, newElseStatement));
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
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return basicSetVariableDeclaration(null, msgs);
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return basicSetIfStatement(null, msgs);
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return basicSetDoStatement(null, msgs);
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return basicSetWhileStatement(null, msgs);
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return basicSetForStatement(null, msgs);
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return basicSetTryStatement(null, msgs);
      case MyDslPackage.STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return basicSetSyncStatement(null, msgs);
      case MyDslPackage.STATEMENT__ELSE_STATEMENT:
        return basicSetElseStatement(null, msgs);
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
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return getVariableDeclaration();
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return getIfStatement();
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return getDoStatement();
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return getWhileStatement();
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return getForStatement();
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return getTryStatement();
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return getNameStatement();
      case MyDslPackage.STATEMENT__STATEMENT:
        return getStatement();
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return getSyncStatement();
      case MyDslPackage.STATEMENT__NAME:
        return getName();
      case MyDslPackage.STATEMENT__ELSE_STATEMENT:
        return getElseStatement();
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
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)newValue);
        return;
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement((String)newValue);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        setSyncStatement((Statement)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)newValue);
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
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariableDeclaration((Variable_declaration)null);
        return;
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        setIfStatement((If_statement)null);
        return;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        setDoStatement((Do_Statement)null);
        return;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        setWhileStatement((While_Statement)null);
        return;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        setForStatement((For_Statement)null);
        return;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        setTryStatement((Try_statement)null);
        return;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        setNameStatement(NAME_STATEMENT_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__STATEMENT:
        setStatement((Statement)null);
        return;
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        setSyncStatement((Statement)null);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.STATEMENT__ELSE_STATEMENT:
        setElseStatement((Statement)null);
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
      case MyDslPackage.STATEMENT__VARIABLE_DECLARATION:
        return variableDeclaration != null;
      case MyDslPackage.STATEMENT__IF_STATEMENT:
        return ifStatement != null;
      case MyDslPackage.STATEMENT__DO_STATEMENT:
        return doStatement != null;
      case MyDslPackage.STATEMENT__WHILE_STATEMENT:
        return whileStatement != null;
      case MyDslPackage.STATEMENT__FOR_STATEMENT:
        return forStatement != null;
      case MyDslPackage.STATEMENT__TRY_STATEMENT:
        return tryStatement != null;
      case MyDslPackage.STATEMENT__NAME_STATEMENT:
        return NAME_STATEMENT_EDEFAULT == null ? nameStatement != null : !NAME_STATEMENT_EDEFAULT.equals(nameStatement);
      case MyDslPackage.STATEMENT__STATEMENT:
        return statement != null;
      case MyDslPackage.STATEMENT__SYNC_STATEMENT:
        return syncStatement != null;
      case MyDslPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.STATEMENT__ELSE_STATEMENT:
        return elseStatement != null;
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
    result.append(" (nameStatement: ");
    result.append(nameStatement);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
