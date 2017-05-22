/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.commonlang.Bool;
import org.xtext.commonlang.CommonlangPackage;
import org.xtext.commonlang.ValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.commonlang.impl.BoolImpl#getVarleft <em>Varleft</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.BoolImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.BoolImpl#getVarright <em>Varright</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.BoolImpl#getBop <em>Bop</em>}</li>
 *   <li>{@link org.xtext.commonlang.impl.BoolImpl#getBnext <em>Bnext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoolImpl extends MinimalEObjectImpl.Container implements Bool
{
  /**
   * The cached value of the '{@link #getVarleft() <em>Varleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarleft()
   * @generated
   * @ordered
   */
  protected ValueExpression varleft;

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
   * The default value of the '{@link #getBop() <em>Bop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBop()
   * @generated
   * @ordered
   */
  protected static final String BOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBop() <em>Bop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBop()
   * @generated
   * @ordered
   */
  protected String bop = BOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getBnext() <em>Bnext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBnext()
   * @generated
   * @ordered
   */
  protected Bool bnext;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoolImpl()
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
    return CommonlangPackage.Literals.BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression getVarleft()
  {
    return varleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarleft(ValueExpression newVarleft, NotificationChain msgs)
  {
    ValueExpression oldVarleft = varleft;
    varleft = newVarleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__VARLEFT, oldVarleft, newVarleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarleft(ValueExpression newVarleft)
  {
    if (newVarleft != varleft)
    {
      NotificationChain msgs = null;
      if (varleft != null)
        msgs = ((InternalEObject)varleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__VARLEFT, null, msgs);
      if (newVarleft != null)
        msgs = ((InternalEObject)newVarleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__VARLEFT, null, msgs);
      msgs = basicSetVarleft(newVarleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__VARLEFT, newVarleft, newVarleft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__OP, oldOp, op));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__VARRIGHT, oldVarright, newVarright);
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
        msgs = ((InternalEObject)varright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__VARRIGHT, null, msgs);
      if (newVarright != null)
        msgs = ((InternalEObject)newVarright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__VARRIGHT, null, msgs);
      msgs = basicSetVarright(newVarright, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__VARRIGHT, newVarright, newVarright));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBop()
  {
    return bop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBop(String newBop)
  {
    String oldBop = bop;
    bop = newBop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__BOP, oldBop, bop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bool getBnext()
  {
    return bnext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBnext(Bool newBnext, NotificationChain msgs)
  {
    Bool oldBnext = bnext;
    bnext = newBnext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__BNEXT, oldBnext, newBnext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBnext(Bool newBnext)
  {
    if (newBnext != bnext)
    {
      NotificationChain msgs = null;
      if (bnext != null)
        msgs = ((InternalEObject)bnext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__BNEXT, null, msgs);
      if (newBnext != null)
        msgs = ((InternalEObject)newBnext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonlangPackage.BOOL__BNEXT, null, msgs);
      msgs = basicSetBnext(newBnext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommonlangPackage.BOOL__BNEXT, newBnext, newBnext));
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
      case CommonlangPackage.BOOL__VARLEFT:
        return basicSetVarleft(null, msgs);
      case CommonlangPackage.BOOL__VARRIGHT:
        return basicSetVarright(null, msgs);
      case CommonlangPackage.BOOL__BNEXT:
        return basicSetBnext(null, msgs);
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
      case CommonlangPackage.BOOL__VARLEFT:
        return getVarleft();
      case CommonlangPackage.BOOL__OP:
        return getOp();
      case CommonlangPackage.BOOL__VARRIGHT:
        return getVarright();
      case CommonlangPackage.BOOL__BOP:
        return getBop();
      case CommonlangPackage.BOOL__BNEXT:
        return getBnext();
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
      case CommonlangPackage.BOOL__VARLEFT:
        setVarleft((ValueExpression)newValue);
        return;
      case CommonlangPackage.BOOL__OP:
        setOp((String)newValue);
        return;
      case CommonlangPackage.BOOL__VARRIGHT:
        setVarright((ValueExpression)newValue);
        return;
      case CommonlangPackage.BOOL__BOP:
        setBop((String)newValue);
        return;
      case CommonlangPackage.BOOL__BNEXT:
        setBnext((Bool)newValue);
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
      case CommonlangPackage.BOOL__VARLEFT:
        setVarleft((ValueExpression)null);
        return;
      case CommonlangPackage.BOOL__OP:
        setOp(OP_EDEFAULT);
        return;
      case CommonlangPackage.BOOL__VARRIGHT:
        setVarright((ValueExpression)null);
        return;
      case CommonlangPackage.BOOL__BOP:
        setBop(BOP_EDEFAULT);
        return;
      case CommonlangPackage.BOOL__BNEXT:
        setBnext((Bool)null);
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
      case CommonlangPackage.BOOL__VARLEFT:
        return varleft != null;
      case CommonlangPackage.BOOL__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case CommonlangPackage.BOOL__VARRIGHT:
        return varright != null;
      case CommonlangPackage.BOOL__BOP:
        return BOP_EDEFAULT == null ? bop != null : !BOP_EDEFAULT.equals(bop);
      case CommonlangPackage.BOOL__BNEXT:
        return bnext != null;
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
    result.append(", bop: ");
    result.append(bop);
    result.append(')');
    return result.toString();
  }

} //BoolImpl
