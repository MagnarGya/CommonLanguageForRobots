/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.commonlang.Block;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Method;
import org.xtext.commonlang.UserMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.UserMethodImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.UserMethodImpl#getBl <em>Bl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserMethodImpl extends MinimalEObjectImpl.Container implements UserMethod
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Method method;

  /**
   * The cached value of the '{@link #getBl() <em>Bl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBl()
   * @generated
   * @ordered
   */
  protected Block bl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserMethodImpl()
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
    return CommonlangPackage.Literals.USER_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs)
  {
    Method oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.USER_METHOD__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Method newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.USER_METHOD__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.USER_METHOD__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.USER_METHOD__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBl()
  {
    return bl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBl(Block newBl, NotificationChain msgs)
  {
    Block oldBl = bl;
    bl = newBl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.USER_METHOD__BL, oldBl, newBl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBl(Block newBl)
  {
    if (newBl != bl)
    {
      NotificationChain msgs = null;
      if (bl != null)
        msgs = ((InternalEObject)bl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.USER_METHOD__BL, null, msgs);
      if (newBl != null)
        msgs = ((InternalEObject)newBl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.USER_METHOD__BL, null, msgs);
      msgs = basicSetBl(newBl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.USER_METHOD__BL, newBl, newBl));
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
      case CommonlangPackage.USER_METHOD__METHOD:
        return basicSetMethod(null, msgs);
      case CommonlangPackage.USER_METHOD__BL:
        return basicSetBl(null, msgs);
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
      case CommonlangPackage.USER_METHOD__METHOD:
        return getMethod();
      case CommonlangPackage.USER_METHOD__BL:
        return getBl();
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
      case CommonlangPackage.USER_METHOD__METHOD:
        setMethod((Method)newValue);
        return;
      case CommonlangPackage.USER_METHOD__BL:
        setBl((Block)newValue);
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
      case CommonlangPackage.USER_METHOD__METHOD:
        setMethod((Method)null);
        return;
      case CommonlangPackage.USER_METHOD__BL:
        setBl((Block)null);
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
      case CommonlangPackage.USER_METHOD__METHOD:
        return method != null;
      case CommonlangPackage.USER_METHOD__BL:
        return bl != null;
    }
    return super.eIsSet(featureID);
  }

} //UserMethodImpl
