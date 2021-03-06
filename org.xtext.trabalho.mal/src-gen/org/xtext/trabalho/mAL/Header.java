/**
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho.mAL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.trabalho.mAL.Header#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.trabalho.mAL.Header#getStm1 <em>Stm1</em>}</li>
 *   <li>{@link org.xtext.trabalho.mAL.Header#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.trabalho.mAL.Header#getStm2 <em>Stm2</em>}</li>
 * </ul>
 *
 * @see org.xtext.trabalho.mAL.MALPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends Definition
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.trabalho.mAL.MALPackage#getHeader_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.trabalho.mAL.Header#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Stm1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.trabalho.mAL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stm1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stm1</em>' containment reference list.
   * @see org.xtext.trabalho.mAL.MALPackage#getHeader_Stm1()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStm1();

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.trabalho.mAL.MALPackage#getHeader_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.trabalho.mAL.Header#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Stm2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.trabalho.mAL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stm2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stm2</em>' containment reference list.
   * @see org.xtext.trabalho.mAL.MALPackage#getHeader_Stm2()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStm2();

} // Header
