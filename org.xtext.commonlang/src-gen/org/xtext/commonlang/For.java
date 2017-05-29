/**
 */
package org.xtext.commonlang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.For#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.commonlang.For#getCheck <em>Check</em>}</li>
 *   <li>{@link org.xtext.commonlang.For#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.commonlang.For#getBl <em>Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getFor()
 * @model
 * @generated
 */
public interface For extends StructureExpression
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(SimpleExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getFor_Init()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getInit();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.For#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' containment reference.
   * @see #setCheck(ValueExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getFor_Check()
   * @model containment="true"
   * @generated
   */
  ValueExpression getCheck();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.For#getCheck <em>Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check</em>' containment reference.
   * @see #getCheck()
   * @generated
   */
  void setCheck(ValueExpression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(SimpleExpression)
   * @see org.xtext.commonlang.CommonlangPackage#getFor_Action()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getAction();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.For#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(SimpleExpression value);

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
   * @see org.xtext.commonlang.CommonlangPackage#getFor_Bl()
   * @model containment="true"
   * @generated
   */
  Block getBl();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.For#getBl <em>Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bl</em>' containment reference.
   * @see #getBl()
   * @generated
   */
  void setBl(Block value);

} // For
