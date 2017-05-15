/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Declaration;
import org.xtext.commonlang.VarReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.VarReferenceImpl#getVari <em>Vari</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarReferenceImpl extends ValueImpl implements VarReference
{
  /**
   * The cached value of the '{@link #getVari() <em>Vari</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected Declaration vari;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarReferenceImpl()
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
    return CommonlangPackage.Literals.VAR_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getVari()
  {
    if (vari != null && vari.eIsProxy())
    {
      InternalEObject oldVari = (InternalEObject)vari;
      vari = (Declaration)eResolveProxy(oldVari);
      if (vari != oldVari)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonlangPackage.VAR_REFERENCE__VARI, oldVari, vari));
      }
    }
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration basicGetVari()
  {
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVari(Declaration newVari)
  {
    Declaration oldVari = vari;
    vari = newVari;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.VAR_REFERENCE__VARI, oldVari, vari));
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
      case CommonlangPackage.VAR_REFERENCE__VARI:
        if (resolve) return getVari();
        return basicGetVari();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CommonlangPackage.VAR_REFERENCE__VARI:
        setVari((Declaration)newValue);
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
      case CommonlangPackage.VAR_REFERENCE__VARI:
        setVari((Declaration)null);
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
      case CommonlangPackage.VAR_REFERENCE__VARI:
        return vari != null;
    }
    return super.eIsSet(featureID);
  }

} //VarReferenceImpl
