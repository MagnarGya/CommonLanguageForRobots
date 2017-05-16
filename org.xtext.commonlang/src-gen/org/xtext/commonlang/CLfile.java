/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.CLfile#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.xtext.commonlang.CLfile#getMets <em>Mets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getCLfile()
 * @model
 * @generated
 */
public interface CLfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.commonlang.Script}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scripts</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getCLfile_Scripts()
   * @model containment="true"
   * @generated
   */
  EList<Script> getScripts();

  /**
   * Returns the value of the '<em><b>Mets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mets</em>' containment reference.
   * @see #setMets(MetaMethods)
   * @see org.xtext.commonlang.CommonlangPackage#getCLfile_Mets()
   * @model containment="true"
   * @generated
   */
  MetaMethods getMets();

  /**
   * Sets the value of the '{@link org.xtext.commonlang.CLfile#getMets <em>Mets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mets</em>' containment reference.
   * @see #getMets()
   * @generated
   */
  void setMets(MetaMethods value);

} // CLfile
