/**
 * generated by Xtext 2.12.0
 */
package org.xtext.trabalho.mAL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.trabalho.mAL.TypeName#getAt <em>At</em>}</li>
 * </ul>
 *
 * @see org.xtext.trabalho.mAL.MALPackage#getTypeName()
 * @model
 * @generated
 */
public interface TypeName extends Result
{
  /**
   * Returns the value of the '<em><b>At</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' containment reference.
   * @see #setAt(AnyType)
   * @see org.xtext.trabalho.mAL.MALPackage#getTypeName_At()
   * @model containment="true"
   * @generated
   */
  AnyType getAt();

  /**
   * Sets the value of the '{@link org.xtext.trabalho.mAL.TypeName#getAt <em>At</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' containment reference.
   * @see #getAt()
   * @generated
   */
  void setAt(AnyType value);

} // TypeName
