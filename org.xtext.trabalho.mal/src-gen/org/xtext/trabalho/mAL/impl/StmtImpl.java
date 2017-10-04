/**
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho.mAL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.trabalho.mAL.Expr;
import org.xtext.trabalho.mAL.MALPackage;
import org.xtext.trabalho.mAL.Stmt;
import org.xtext.trabalho.mAL.Varlist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.trabalho.mAL.impl.StmtImpl#isFlow <em>Flow</em>}</li>
 *   <li>{@link org.xtext.trabalho.mAL.impl.StmtImpl#getList_of_variables <em>List of variables</em>}</li>
 *   <li>{@link org.xtext.trabalho.mAL.impl.StmtImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StmtImpl extends StatementImpl implements Stmt
{
  /**
   * The default value of the '{@link #isFlow() <em>Flow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlow()
   * @generated
   * @ordered
   */
  protected static final boolean FLOW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlow() <em>Flow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlow()
   * @generated
   * @ordered
   */
  protected boolean flow = FLOW_EDEFAULT;

  /**
   * The cached value of the '{@link #getList_of_variables() <em>List of variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList_of_variables()
   * @generated
   * @ordered
   */
  protected Varlist list_of_variables;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expr exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StmtImpl()
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
    return MALPackage.Literals.STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlow()
  {
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlow(boolean newFlow)
  {
    boolean oldFlow = flow;
    flow = newFlow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MALPackage.STMT__FLOW, oldFlow, flow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Varlist getList_of_variables()
  {
    return list_of_variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList_of_variables(Varlist newList_of_variables, NotificationChain msgs)
  {
    Varlist oldList_of_variables = list_of_variables;
    list_of_variables = newList_of_variables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MALPackage.STMT__LIST_OF_VARIABLES, oldList_of_variables, newList_of_variables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList_of_variables(Varlist newList_of_variables)
  {
    if (newList_of_variables != list_of_variables)
    {
      NotificationChain msgs = null;
      if (list_of_variables != null)
        msgs = ((InternalEObject)list_of_variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MALPackage.STMT__LIST_OF_VARIABLES, null, msgs);
      if (newList_of_variables != null)
        msgs = ((InternalEObject)newList_of_variables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MALPackage.STMT__LIST_OF_VARIABLES, null, msgs);
      msgs = basicSetList_of_variables(newList_of_variables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MALPackage.STMT__LIST_OF_VARIABLES, newList_of_variables, newList_of_variables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expr newExp, NotificationChain msgs)
  {
    Expr oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MALPackage.STMT__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expr newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MALPackage.STMT__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MALPackage.STMT__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MALPackage.STMT__EXP, newExp, newExp));
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
      case MALPackage.STMT__LIST_OF_VARIABLES:
        return basicSetList_of_variables(null, msgs);
      case MALPackage.STMT__EXP:
        return basicSetExp(null, msgs);
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
      case MALPackage.STMT__FLOW:
        return isFlow();
      case MALPackage.STMT__LIST_OF_VARIABLES:
        return getList_of_variables();
      case MALPackage.STMT__EXP:
        return getExp();
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
      case MALPackage.STMT__FLOW:
        setFlow((Boolean)newValue);
        return;
      case MALPackage.STMT__LIST_OF_VARIABLES:
        setList_of_variables((Varlist)newValue);
        return;
      case MALPackage.STMT__EXP:
        setExp((Expr)newValue);
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
      case MALPackage.STMT__FLOW:
        setFlow(FLOW_EDEFAULT);
        return;
      case MALPackage.STMT__LIST_OF_VARIABLES:
        setList_of_variables((Varlist)null);
        return;
      case MALPackage.STMT__EXP:
        setExp((Expr)null);
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
      case MALPackage.STMT__FLOW:
        return flow != FLOW_EDEFAULT;
      case MALPackage.STMT__LIST_OF_VARIABLES:
        return list_of_variables != null;
      case MALPackage.STMT__EXP:
        return exp != null;
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
    result.append(" (flow: ");
    result.append(flow);
    result.append(')');
    return result.toString();
  }

} //StmtImpl
