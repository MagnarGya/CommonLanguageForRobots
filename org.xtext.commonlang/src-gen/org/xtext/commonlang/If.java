/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.If#getEx <em>Ex</em>}</li>
 *   <li>{@link org.xtext.commonlang.If#getBl <em>Bl</em>}</li>
 *   <li>{@link org.xtext.commonlang.If#getEl <em>El</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getIf()
 * @model
 * @generated
 */
public interface If extends StructureExpression
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
   * @see org.xtext.commonlang.CommonlangPackage#getIf_Ex()
   * @model containment="true"
   * @generated
   */
  ValueExpression getEx();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.If#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(ValueExpression value);

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
   * @see org.xtext.commonlang.CommonlangPackage#getIf_Bl()
   * @model containment="true"
   * @generated
   */
  Block getBl();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.If#getBl <em>Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl</em>' containment reference.
   * @see #getBl()
   * @generated
   */
  void setBl(Block value);

  /**
   * Returns the value of the '<em><b>El</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>El</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>El</em>' containment reference.
   * @see #setEl(Else)
   * @see org.xtext.commonlang.CommonlangPackage#getIf_El()
   * @model containment="true"
   * @generated
   */
  Else getEl();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.If#getEl <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>El</em>' containment reference.
   * @see #getEl()
   * @generated
   */
  void setEl(Else value);

} // If
