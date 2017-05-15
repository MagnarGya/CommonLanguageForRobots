/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Methods</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.MetaMethods#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getMetaMethods()
 * @model
 * @generated
 */
public interface MetaMethods extends CLfile
{
  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.commonlang.MetaMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getMetaMethods_Methods()
   * @model containment="true"
   * @generated
   */
  EList<MetaMethod> getMethods();

} // MetaMethods
