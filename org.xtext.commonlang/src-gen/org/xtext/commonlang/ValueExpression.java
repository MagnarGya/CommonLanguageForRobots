/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.ValueExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.ValueExpression#getVarright <em>Varright</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getValueExpression()
 * @model
 * @generated
 */
public interface ValueExpression extends EObject
{
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
   * @see org.xtext.commonlang.CommonlangPackage#getValueExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.ValueExpression#getOp <em>Op</em>}' attribute.
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
   * @see #setVarright(ValueExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getValueExpression_Varright()
   * @model containment="true"
   * @generated
   */
  ValueExpression getVarright();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.ValueExpression#getVarright <em>Varright</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varright</em>' containment reference.
   * @see #getVarright()
   * @generated
   */
  void setVarright(ValueExpression value);

} // ValueExpression
