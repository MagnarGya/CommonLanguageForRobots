/**
 */
package org.xtext.commonlang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.commonlang.CLfile;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.MetaMethods;
import org.xtext.commonlang.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLfile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.CLfileImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.CLfileImpl#getMets <em>Mets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLfileImpl extends MinimalEObjectImpl.Container implements CLfile
{
  /**
   * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScripts()
   * @generated
   * @ordered
   */
  protected EList<Script> scripts;

  /**
   * The cached value of the '{@link #getMets() <em>Mets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMets()
   * @generated
   * @ordered
   */
  protected MetaMethods mets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CLfileImpl()
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
    return CommonlangPackage.Literals.CLFILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Script> getScripts()
  {
    if (scripts == null)
    {
      scripts = new EObjectContainmentEList<Script>(Script.class, this, CommonlangPackage.CLFILE__SCRIPTS);
    }
    return scripts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaMethods getMets()
  {
    return mets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMets(MetaMethods newMets, NotificationChain msgs)
  {
    MetaMethods oldMets = mets;
    mets = newMets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.CLFILE__METS, oldMets, newMets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMets(MetaMethods newMets)
  {
    if (newMets != mets)
    {
      NotificationChain msgs = null;
      if (mets != null)
        msgs = ((InternalEObject)mets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.CLFILE__METS, null, msgs);
      if (newMets != null)
        msgs = ((InternalEObject)newMets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.CLFILE__METS, null, msgs);
      msgs = basicSetMets(newMets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.CLFILE__METS, newMets, newMets));
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
      case CommonlangPackage.CLFILE__SCRIPTS:
        return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
      case CommonlangPackage.CLFILE__METS:
        return basicSetMets(null, msgs);
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
      case CommonlangPackage.CLFILE__SCRIPTS:
        return getScripts();
      case CommonlangPackage.CLFILE__METS:
        return getMets();
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
      case CommonlangPackage.CLFILE__SCRIPTS:
        getScripts().clear();
        getScripts().addAll((Collection<? extends Script>)newValue);
        return;
      case CommonlangPackage.CLFILE__METS:
        setMets((MetaMethods)newValue);
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
      case CommonlangPackage.CLFILE__SCRIPTS:
        getScripts().clear();
        return;
      case CommonlangPackage.CLFILE__METS:
        setMets((MetaMethods)null);
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
      case CommonlangPackage.CLFILE__SCRIPTS:
        return scripts != null && !scripts.isEmpty();
      case CommonlangPackage.CLFILE__METS:
        return mets != null;
    }
    return super.eIsSet(featureID);
  }

} //CLfileImpl
