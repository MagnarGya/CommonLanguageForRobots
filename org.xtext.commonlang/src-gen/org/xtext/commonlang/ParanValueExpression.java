/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paran Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.ParanValueExpression#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getParanValueExpression()
 * @model
 * @generated
 */
public interface ParanValueExpression extends ValueExpression
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(ValueExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getParanValueExpression_Ex()
   * @model containment="true"
   * @generated
   */
  ValueExpression getEx();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.ParanValueExpression#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(ValueExpression value);

} // ParanValueExpression
