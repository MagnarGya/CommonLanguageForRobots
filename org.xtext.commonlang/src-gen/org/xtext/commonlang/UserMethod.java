/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.UserMethod#getBl <em>Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getUserMethod()
 * @model
 * @generated
 */
public interface UserMethod extends Method
{
  /**
   * Returns the value of the '<em><b>Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bl</em>' containment reference.
   * @see #setBl(Block)
   * @see org.xtext.commonlang.CommonlangPackage#getUserMethod_Bl()
   * @model containment="true"
   * @generated
   */
  Block getBl();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.UserMethod#getBl <em>Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl</em>' containment reference.
   * @see #getBl()
   * @generated
   */
  void setBl(Block value);

} // UserMethod
