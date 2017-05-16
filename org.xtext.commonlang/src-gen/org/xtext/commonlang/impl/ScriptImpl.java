/**
 */
package org.xtext.commonlang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Script;
import org.xtext.commonlang.UserMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.ScriptImpl#getRobottypes <em>Robottypes</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ScriptImpl#getRobotconfigs <em>Robotconfigs</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ScriptImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends CLfileImpl implements Script
{
  /**
   * The cached value of the '{@link #getRobottypes() <em>Robottypes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobottypes()
   * @generated
   * @ordered
   */
  protected EList<String> robottypes;

  /**
   * The cached value of the '{@link #getRobotconfigs() <em>Robotconfigs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRobotconfigs()
   * @generated
   * @ordered
   */
  protected EList<String> robotconfigs;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<UserMethod> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CommonlangPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRobottypes()
  {
    if (robottypes == null)
    {
      robottypes = new EDataTypeEList<String>(String.class, this, CommonlangPackage.SCRIPT__ROBOTTYPES);
    }
    return robottypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRobotconfigs()
  {
    if (robotconfigs == null)
    {
      robotconfigs = new EDataTypeEList<String>(String.class, this, CommonlangPackage.SCRIPT__ROBOTCONFIGS);
    }
    return robotconfigs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UserMethod> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<UserMethod>(UserMethod.class, this, CommonlangPackage.SCRIPT__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CommonlangPackage.SCRIPT__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CommonlangPackage.SCRIPT__ROBOTTYPES:
        return getRobottypes();
      case CommonlangPackage.SCRIPT__ROBOTCONFIGS:
        return getRobotconfigs();
      case CommonlangPackage.SCRIPT__METHODS:
        return getMethods();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CommonlangPackage.SCRIPT__ROBOTTYPES:
        getRobottypes().clear();
        getRobottypes().addAll((Collection<? extends String>)newValue);
        return;
      case CommonlangPackage.SCRIPT__ROBOTCONFIGS:
        getRobotconfigs().clear();
        getRobotconfigs().addAll((Collection<? extends String>)newValue);
        return;
      case CommonlangPackage.SCRIPT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends UserMethod>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CommonlangPackage.SCRIPT__ROBOTTYPES:
        getRobottypes().clear();
        return;
      case CommonlangPackage.SCRIPT__ROBOTCONFIGS:
        getRobotconfigs().clear();
        return;
      case CommonlangPackage.SCRIPT__METHODS:
        getMethods().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CommonlangPackage.SCRIPT__ROBOTTYPES:
        return robottypes != null && !robottypes.isEmpty();
      case CommonlangPackage.SCRIPT__ROBOTCONFIGS:
        return robotconfigs != null && !robotconfigs.isEmpty();
      case CommonlangPackage.SCRIPT__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (robottypes: ");
    result.append(robottypes);
    result.append(", robotconfigs: ");
    result.append(robotconfigs);
    result.append(')');
    return result.toString();
  }

} //ScriptImpl
