/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Value;
import org.xtext.commonlang.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.ValueExpressionImpl#getVarleft <em>Varleft</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ValueExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ValueExpressionImpl#getVarright <em>Varright</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueExpressionImpl extends MinimalEObjectImpl.Container implements ValueExpression
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
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarright() <em>Varright</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarright()
   * @generated
   * @ordered
   */
  protected ValueExpression varright;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueExpressionImpl()
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
    return CommonlangPackage.Literals.VALUE_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.VALUE_EXPRESSION__VARLEFT, oldVarleft, newVarleft);
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
        msgs = ((InternalEObject)varleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.VALUE_EXPRESSION__VARLEFT, null, msgs);
      if (newVarleft != null)
        msgs = ((InternalEObject)newVarleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.VALUE_EXPRESSION__VARLEFT, null, msgs);
      msgs = basicSetVarleft(newVarleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.VALUE_EXPRESSION__VARLEFT, newVarleft, newVarleft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.VALUE_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getVarright()
  {
    return varright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarright(ValueExpression newVarright, NotificationChain msgs)
  {
    ValueExpression oldVarright = varright;
    varright = newVarright;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.VALUE_EXPRESSION__VARRIGHT, oldVarright, newVarright);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarright(ValueExpression newVarright)
  {
    if (newVarright != varright)
    {
      NotificationChain msgs = null;
      if (varright != null)
        msgs = ((InternalEObject)varright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.VALUE_EXPRESSION__VARRIGHT, null, msgs);
      if (newVarright != null)
        msgs = ((InternalEObject)newVarright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.VALUE_EXPRESSION__VARRIGHT, null, msgs);
      msgs = basicSetVarright(newVarright, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.VALUE_EXPRESSION__VARRIGHT, newVarright, newVarright));
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
      case CommonlangPackage.VALUE_EXPRESSION__VARLEFT:
        return basicSetVarleft(null, msgs);
      case CommonlangPackage.VALUE_EXPRESSION__VARRIGHT:
        return basicSetVarright(null, msgs);
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
      case CommonlangPackage.VALUE_EXPRESSION__VARLEFT:
        return getVarleft();
      case CommonlangPackage.VALUE_EXPRESSION__OP:
        return getOp();
      case CommonlangPackage.VALUE_EXPRESSION__VARRIGHT:
        return getVarright();
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
      case CommonlangPackage.VALUE_EXPRESSION__VARLEFT:
        setVarleft((Value)newValue);
        return;
      case CommonlangPackage.VALUE_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case CommonlangPackage.VALUE_EXPRESSION__VARRIGHT:
        setVarright((ValueExpression)newValue);
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
      case CommonlangPackage.VALUE_EXPRESSION__VARLEFT:
        setVarleft((Value)null);
        return;
      case CommonlangPackage.VALUE_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case CommonlangPackage.VALUE_EXPRESSION__VARRIGHT:
        setVarright((ValueExpression)null);
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
      case CommonlangPackage.VALUE_EXPRESSION__VARLEFT:
        return varleft != null;
      case CommonlangPackage.VALUE_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case CommonlangPackage.VALUE_EXPRESSION__VARRIGHT:
        return varright != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ValueExpressionImpl
