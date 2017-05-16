/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Script#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.commonlang.Script#getRobottypes <em>Robottypes</em>}</li>
 *   <li>{@link org.xtext.commonlang.Script#getRobotconfigs <em>Robotconfigs</em>}</li>
 *   <li>{@link org.xtext.commonlang.Script#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.commonlang.CommonlangPackage#getScript_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.Script#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Robottypes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Robottypes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robottypes</em>' attribute list.
   * @see org.xtext.commonlang.CommonlangPackage#getScript_Robottypes()
   * @model unique="false"
   * @generated
   */
  EList<String> getRobottypes();

  /**
   * Returns the value of the '<em><b>Robotconfigs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Robotconfigs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robotconfigs</em>' attribute list.
   * @see org.xtext.commonlang.CommonlangPackage#getScript_Robotconfigs()
   * @model unique="false"
   * @generated
   */
  EList<String> getRobotconfigs();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.commonlang.UserMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getScript_Methods()
   * @model containment="true"
   * @generated
   */
  EList<UserMethod> getMethods();

} // Script
