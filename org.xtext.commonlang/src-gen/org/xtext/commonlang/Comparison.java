/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Comparison#getVarleft <em>Varleft</em>}</li>
 *   <li>{@link org.xtext.commonlang.Comparison#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.Comparison#getVarright <em>Varright</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends SimpleExpression
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
   * @see org.xtext.commonlang.CommonlangPackage#getComparison_Varleft()
   * @model containment="true"
   * @generated
   */
  Value getVarleft();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Comparison#getVarleft <em>Varleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varleft</em>' containment reference.
   * @see #getVarleft()
   * @generated
   */
  void setVarleft(Value value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.commonlang.CommonlangPackage#getComparison_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Comparison#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Varright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varright</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varright</em>' containment reference.
   * @see #setVarright(Value)
   * @see org.xtext.commonlang.CommonlangPackage#getComparison_Varright()
   * @model containment="true"
   * @generated
   */
  Value getVarright();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Comparison#getVarright <em>Varright</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varright</em>' containment reference.
   * @see #getVarright()
   * @generated
   */
  void setVarright(Value value);

} // Comparison
