/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Call#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.commonlang.Call#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends SimpleExpression, Value
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.commonlang.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getCall_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Value> getParameters();

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(Method)
   * @see org.xtext.commonlang.CommonlangPackage#getCall_Method()
   * @model
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Call#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

} // Call
