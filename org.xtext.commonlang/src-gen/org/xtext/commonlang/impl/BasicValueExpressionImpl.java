/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.commonlang.BasicValueExpression;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Value Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.BasicValueExpressionImpl#getVarleft <em>Varleft</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicValueExpressionImpl extends ValueExpressionImpl implements BasicValueExpression
{
  /**
   * The cached value of the '{@link #getVarleft() <em>Varleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarleft()
   * @generated
   * @ordered
   */
  protected Value varleft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicValueExpressionImpl()
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
    return CommonlangPackage.Literals.BASIC_VALUE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVarleft()
  {
    return varleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarleft(Value newVarleft, NotificationChain msgs)
  {
    Value oldVarleft = varleft;
    varleft = newVarleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT, oldVarleft, newVarleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarleft(Value newVarleft)
  {
    if (newVarleft != varleft)
    {
      NotificationChain msgs = null;
      if (varleft != null)
        msgs = ((InternalEObject)varleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT, null, msgs);
      if (newVarleft != null)
        msgs = ((InternalEObject)newVarleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT, null, msgs);
      msgs = basicSetVarleft(newVarleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT, newVarleft, newVarleft));
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
      case CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT:
        return basicSetVarleft(null, msgs);
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
      case CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT:
        return getVarleft();
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
      case CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT:
        setVarleft((Value)newValue);
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
      case CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT:
        setVarleft((Value)null);
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
      case CommonlangPackage.BASIC_VALUE_EXPRESSION__VARLEFT:
        return varleft != null;
    }
    return super.eIsSet(featureID);
  }

} //BasicValueExpressionImpl
