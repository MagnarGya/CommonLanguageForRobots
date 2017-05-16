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
   * Returns the value of the '<em><b>Mets</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mets</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getCLfile_Mets()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getMets();

} // CLfile
