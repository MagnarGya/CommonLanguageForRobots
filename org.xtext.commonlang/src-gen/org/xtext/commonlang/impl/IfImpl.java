/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.commonlang.Block;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Else;
import org.xtext.commonlang.If;
import org.xtext.commonlang.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.IfImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.IfImpl#getBl <em>Bl</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.IfImpl#getEl <em>El</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends StructureExpressionImpl implements If
{
  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected ValueExpression ex;

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
   * The cached value of the '{@link #getEl() <em>El</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEl()
   * @generated
   * @ordered
   */
  protected Else el;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
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
    return CommonlangPackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(ValueExpression newEx, NotificationChain msgs)
  {
    ValueExpression oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(ValueExpression newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__EX, newEx, newEx));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__BL, oldBl, newBl);
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
        msgs = ((InternalEObject)bl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__BL, null, msgs);
      if (newBl != null)
        msgs = ((InternalEObject)newBl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__BL, null, msgs);
      msgs = basicSetBl(newBl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__BL, newBl, newBl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Else getEl()
  {
    return el;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEl(Else newEl, NotificationChain msgs)
  {
    Else oldEl = el;
    el = newEl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__EL, oldEl, newEl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEl(Else newEl)
  {
    if (newEl != el)
    {
      NotificationChain msgs = null;
      if (el != null)
        msgs = ((InternalEObject)el).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__EL, null, msgs);
      if (newEl != null)
        msgs = ((InternalEObject)newEl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.IF__EL, null, msgs);
      msgs = basicSetEl(newEl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.IF__EL, newEl, newEl));
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
      case CommonlangPackage.IF__EX:
        return basicSetEx(null, msgs);
      case CommonlangPackage.IF__BL:
        return basicSetBl(null, msgs);
      case CommonlangPackage.IF__EL:
        return basicSetEl(null, msgs);
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
      case CommonlangPackage.IF__EX:
        return getEx();
      case CommonlangPackage.IF__BL:
        return getBl();
      case CommonlangPackage.IF__EL:
        return getEl();
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
      case CommonlangPackage.IF__EX:
        setEx((ValueExpression)newValue);
        return;
      case CommonlangPackage.IF__BL:
        setBl((Block)newValue);
        return;
      case CommonlangPackage.IF__EL:
        setEl((Else)newValue);
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
      case CommonlangPackage.IF__EX:
        setEx((ValueExpression)null);
        return;
      case CommonlangPackage.IF__BL:
        setBl((Block)null);
        return;
      case CommonlangPackage.IF__EL:
        setEl((Else)null);
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
      case CommonlangPackage.IF__EX:
        return ex != null;
      case CommonlangPackage.IF__BL:
        return bl != null;
      case CommonlangPackage.IF__EL:
        return el != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
