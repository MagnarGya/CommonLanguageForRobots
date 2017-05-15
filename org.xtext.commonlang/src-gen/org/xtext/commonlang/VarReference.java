/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.VarReference#getVari <em>Vari</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getVarReference()
 * @model
 * @generated
 */
public interface VarReference extends Value
{
  /**
   * Returns the value of the '<em><b>Vari</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' reference.
   * @see #setVari(Declaration)
   * @see org.xtext.commonlang.CommonlangPackage#getVarReference_Vari()
   * @model
   * @generated
   */
  Declaration getVari();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.VarReference#getVari <em>Vari</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' reference.
   * @see #getVari()
   * @generated
   */
  void setVari(Declaration value);

} // VarReference
