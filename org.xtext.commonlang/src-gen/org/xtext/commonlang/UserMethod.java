/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.UserMethod#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.commonlang.UserMethod#getBl <em>Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getUserMethod()
 * @model
 * @generated
 */
public interface UserMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(Method)
   * @see org.xtext.commonlang.CommonlangPackage#getUserMethod_Method()
   * @model containment="true"
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.UserMethod#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

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
