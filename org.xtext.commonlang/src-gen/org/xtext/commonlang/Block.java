/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.commonlang.Block#getExs <em>Exs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.commonlang.CommonlangPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends StructureExpression
{
  /**
   * Returns the value of the '<em><b>Exs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.commonlang.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exs</em>' containment reference list.
   * @see org.xtext.commonlang.CommonlangPackage#getBlock_Exs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExs();

} // Block
