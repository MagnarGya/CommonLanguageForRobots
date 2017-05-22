/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Assignment#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.commonlang.Assignment#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' containment reference.
   * @see #setVari(Declaration)
   * @see org.xtext.commonlang.CommonlangPackage#getAssignment_Vari()
   * @model containment="true"
   * @generated
   */
  Declaration getVari();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Assignment#getVari <em>Vari</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' containment reference.
   * @see #getVari()
   * @generated
   */
  void setVari(Declaration value);

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
   * @see org.xtext.commonlang.CommonlangPackage#getAssignment_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Assignment#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getAssignment_Value()
   * @model containment="true"
   * @generated
   */
  ValueExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Assignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueExpression value);

} // Assignment
