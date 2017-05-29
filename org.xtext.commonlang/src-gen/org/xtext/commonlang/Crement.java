/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Crement#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.commonlang.Crement#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getCrement()
 * @model
 * @generated
 */
public interface Crement extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(VarReference)
   * @see org.xtext.commonlang.CommonlangPackage#getCrement_Value()
   * @model containment="true"
   * @generated
   */
  VarReference getValue();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Crement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(VarReference value);

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
   * @see org.xtext.commonlang.CommonlangPackage#getCrement_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Crement#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // Crement
