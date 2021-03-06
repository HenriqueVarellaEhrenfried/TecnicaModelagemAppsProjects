/**
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho.mAL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.trabalho.mAL.Helpinfo;
import org.xtext.trabalho.mAL.MALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helpinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.trabalho.mAL.impl.HelpinfoImpl#getString_literal <em>String literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HelpinfoImpl extends MinimalEObjectImpl.Container implements Helpinfo
{
  /**
   * The default value of the '{@link #getString_literal() <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_literal()
   * @generated
   * @ordered
   */
  protected static final String STRING_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString_literal() <em>String literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_literal()
   * @generated
   * @ordered
   */
  protected String string_literal = STRING_LITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelpinfoImpl()
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
    return MALPackage.Literals.HELPINFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString_literal()
  {
    return string_literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString_literal(String newString_literal)
  {
    String oldString_literal = string_literal;
    string_literal = newString_literal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MALPackage.HELPINFO__STRING_LITERAL, oldString_literal, string_literal));
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
      case MALPackage.HELPINFO__STRING_LITERAL:
        return getString_literal();
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
      case MALPackage.HELPINFO__STRING_LITERAL:
        setString_literal((String)newValue);
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
      case MALPackage.HELPINFO__STRING_LITERAL:
        setString_literal(STRING_LITERAL_EDEFAULT);
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
      case MALPackage.HELPINFO__STRING_LITERAL:
        return STRING_LITERAL_EDEFAULT == null ? string_literal != null : !STRING_LITERAL_EDEFAULT.equals(string_literal);
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
    result.append(" (string_literal: ");
    result.append(string_literal);
    result.append(')');
    return result.toString();
  }

} //HelpinfoImpl
