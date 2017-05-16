/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.Comparison;
import org.xtext.commonlang.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.ComparisonImpl#getVarleft <em>Varleft</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ComparisonImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.ComparisonImpl#getVarright <em>Varright</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonImpl extends SimpleExpressionImpl implements Comparison
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
  protected Value varright;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonImpl()
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
    return CommonlangPackage.Literals.COMPARISON;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.COMPARISON__VARLEFT, oldVarleft, newVarleft);
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
        msgs = ((InternalEObject)varleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.COMPARISON__VARLEFT, null, msgs);
      if (newVarleft != null)
        msgs = ((InternalEObject)newVarleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.COMPARISON__VARLEFT, null, msgs);
      msgs = basicSetVarleft(newVarleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.COMPARISON__VARLEFT, newVarleft, newVarleft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.COMPARISON__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getVarright()
  {
    return varright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarright(Value newVarright, NotificationChain msgs)
  {
    Value oldVarright = varright;
    varright = newVarright;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.COMPARISON__VARRIGHT, oldVarright, newVarright);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarright(Value newVarright)
  {
    if (newVarright != varright)
    {
      NotificationChain msgs = null;
      if (varright != null)
        msgs = ((InternalEObject)varright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.COMPARISON__VARRIGHT, null, msgs);
      if (newVarright != null)
        msgs = ((InternalEObject)newVarright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.COMPARISON__VARRIGHT, null, msgs);
      msgs = basicSetVarright(newVarright, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.COMPARISON__VARRIGHT, newVarright, newVarright));
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
      case CommonlangPackage.COMPARISON__VARLEFT:
        return basicSetVarleft(null, msgs);
      case CommonlangPackage.COMPARISON__VARRIGHT:
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
      case CommonlangPackage.COMPARISON__VARLEFT:
        return getVarleft();
      case CommonlangPackage.COMPARISON__OP:
        return getOp();
      case CommonlangPackage.COMPARISON__VARRIGHT:
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
      case CommonlangPackage.COMPARISON__VARLEFT:
        setVarleft((Value)newValue);
        return;
      case CommonlangPackage.COMPARISON__OP:
        setOp((String)newValue);
        return;
      case CommonlangPackage.COMPARISON__VARRIGHT:
        setVarright((Value)newValue);
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
      case CommonlangPackage.COMPARISON__VARLEFT:
        setVarleft((Value)null);
        return;
      case CommonlangPackage.COMPARISON__OP:
        setOp(OP_EDEFAULT);
        return;
      case CommonlangPackage.COMPARISON__VARRIGHT:
        setVarright((Value)null);
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
      case CommonlangPackage.COMPARISON__VARLEFT:
        return varleft != null;
      case CommonlangPackage.COMPARISON__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case CommonlangPackage.COMPARISON__VARRIGHT:
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

} //ComparisonImpl
