/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neg Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.NegNumberValue#getVarleft <em>Varleft</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getNegNumberValue()
 * @model
 * @generated
 */
public interface NegNumberValue extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Varleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varleft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varleft</em>' containment reference.
   * @see #setVarleft(Value)
   * @see org.xtext.commonlang.CommonlangPackage#getNegNumberValue_Varleft()
   * @model containment="true"
   * @generated
   */
  Value getVarleft();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.NegNumberValue#getVarleft <em>Varleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varleft</em>' containment reference.
   * @see #getVarleft()
   * @generated
   */
  void setVarleft(Value value);

} // NegNumberValue
