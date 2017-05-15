/**
 */
package org.xtext.commonlang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.commonlang.CommonlangFactory
 * @model kind="package"
 * @generated
 */
public interface CommonlangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "commonlang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Commonlang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "commonlang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonlangPackage eINSTANCE = org.xtext.commonlang.impl.CommonlangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.CLfileImpl <em>CLfile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.CLfileImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getCLfile()
   * @generated
   */
  int CLFILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLFILE__NAME = 0;

  /**
   * The number of structural features of the '<em>CLfile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLFILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ScriptImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__NAME = CLFILE__NAME;

  /**
   * The feature id for the '<em><b>Robottypes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__ROBOTTYPES = CLFILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Robotconfigs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__ROBOTCONFIGS = CLFILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__METHODS = CLFILE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = CLFILE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.MetaMethodsImpl <em>Meta Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.MetaMethodsImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMethods()
   * @generated
   */
  int META_METHODS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_METHODS__NAME = CLFILE__NAME;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_METHODS__METHODS = CLFILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Meta Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_METHODS_FEATURE_COUNT = CLFILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ExpressionImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.StructureExpressionImpl <em>Structure Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.StructureExpressionImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getStructureExpression()
   * @generated
   */
  int STRUCTURE_EXPRESSION = 5;

  /**
   * The number of structural features of the '<em>Structure Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.BlockImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 3;

  /**
   * The feature id for the '<em><b>Exs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXS = STRUCTURE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.SimpleExpressionImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getSimpleExpression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 4;

  /**
   * The number of structural features of the '<em>Simple Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.AssignmentImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 7;

  /**
   * The feature id for the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARI = SIMPLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = SIMPLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = SIMPLE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.MethodImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.CallImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getCall()
   * @generated
   */
  int CALL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__NAME = SIMPLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__PARAMETERS = SIMPLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = SIMPLE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.UserMethodImpl <em>User Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.UserMethodImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getUserMethod()
   * @generated
   */
  int USER_METHOD = 10;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_METHOD__METHOD = 0;

  /**
   * The feature id for the '<em><b>Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_METHOD__BL = 1;

  /**
   * The number of structural features of the '<em>User Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.MetaMethodImpl <em>Meta Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.MetaMethodImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMethod()
   * @generated
   */
  int META_METHOD = 11;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_METHOD__METHOD = 0;

  /**
   * The number of structural features of the '<em>Meta Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.MetaMetaMethodImpl <em>Meta Meta Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.MetaMetaMethodImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMetaMethod()
   * @generated
   */
  int META_META_METHOD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_META_METHOD__NAME = 0;

  /**
   * The number of structural features of the '<em>Meta Meta Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_META_METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ComparisonImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 13;

  /**
   * The feature id for the '<em><b>Varleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__VARLEFT = SIMPLE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = SIMPLE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Varright</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__VARRIGHT = SIMPLE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = SIMPLE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.IfImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getIf()
   * @generated
   */
  int IF = 14;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EX = STRUCTURE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__BL = STRUCTURE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ElseImpl <em>Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ElseImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getElse()
   * @generated
   */
  int ELSE = 15;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE__EX = STRUCTURE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_FEATURE_COUNT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ForImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getFor()
   * @generated
   */
  int FOR = 16;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__INIT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CHECK = STRUCTURE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__ACTION = STRUCTURE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__BL = STRUCTURE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.WhileImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 17;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EX = STRUCTURE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BL = STRUCTURE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = STRUCTURE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.ValueImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 18;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.BasicValueImpl <em>Basic Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.BasicValueImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBasicValue()
   * @generated
   */
  int BASIC_VALUE = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.BooleanValueImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = BASIC_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = BASIC_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.StringValueImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = BASIC_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = BASIC_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.NumberValueImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__VALUE = BASIC_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = BASIC_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.VarReferenceImpl <em>Var Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.VarReferenceImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getVarReference()
   * @generated
   */
  int VAR_REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Vari</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REFERENCE__VARI = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.commonlang.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.commonlang.impl.DeclarationImpl
   * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.CLfile <em>CLfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLfile</em>'.
   * @see org.xtext.commonlang.CLfile
   * @generated
   */
  EClass getCLfile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.CLfile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.commonlang.CLfile#getName()
   * @see #getCLfile()
   * @generated
   */
  EAttribute getCLfile_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.xtext.commonlang.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.commonlang.Script#getRobottypes <em>Robottypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Robottypes</em>'.
   * @see org.xtext.commonlang.Script#getRobottypes()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Robottypes();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.commonlang.Script#getRobotconfigs <em>Robotconfigs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Robotconfigs</em>'.
   * @see org.xtext.commonlang.Script#getRobotconfigs()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Robotconfigs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.commonlang.Script#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.xtext.commonlang.Script#getMethods()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Methods();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.MetaMethods <em>Meta Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Methods</em>'.
   * @see org.xtext.commonlang.MetaMethods
   * @generated
   */
  EClass getMetaMethods();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.commonlang.MetaMethods#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.xtext.commonlang.MetaMethods#getMethods()
   * @see #getMetaMethods()
   * @generated
   */
  EReference getMetaMethods_Methods();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.commonlang.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.commonlang.Block#getExs <em>Exs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exs</em>'.
   * @see org.xtext.commonlang.Block#getExs()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Exs();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expression</em>'.
   * @see org.xtext.commonlang.SimpleExpression
   * @generated
   */
  EClass getSimpleExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.StructureExpression <em>Structure Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Expression</em>'.
   * @see org.xtext.commonlang.StructureExpression
   * @generated
   */
  EClass getStructureExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.commonlang.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.xtext.commonlang.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.Assignment#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vari</em>'.
   * @see org.xtext.commonlang.Assignment#getVari()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Vari();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.commonlang.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.commonlang.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.commonlang.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.commonlang.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.commonlang.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.commonlang.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.xtext.commonlang.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.commonlang.Call#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.commonlang.Call#getName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.commonlang.Call#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.commonlang.Call#getParameters()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.UserMethod <em>User Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Method</em>'.
   * @see org.xtext.commonlang.UserMethod
   * @generated
   */
  EClass getUserMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.UserMethod#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.xtext.commonlang.UserMethod#getMethod()
   * @see #getUserMethod()
   * @generated
   */
  EReference getUserMethod_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.UserMethod#getBl <em>Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl</em>'.
   * @see org.xtext.commonlang.UserMethod#getBl()
   * @see #getUserMethod()
   * @generated
   */
  EReference getUserMethod_Bl();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.MetaMethod <em>Meta Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Method</em>'.
   * @see org.xtext.commonlang.MetaMethod
   * @generated
   */
  EClass getMetaMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.MetaMethod#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.xtext.commonlang.MetaMethod#getMethod()
   * @see #getMetaMethod()
   * @generated
   */
  EReference getMetaMethod_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.MetaMetaMethod <em>Meta Meta Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Meta Method</em>'.
   * @see org.xtext.commonlang.MetaMetaMethod
   * @generated
   */
  EClass getMetaMetaMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.MetaMetaMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.commonlang.MetaMetaMethod#getName()
   * @see #getMetaMetaMethod()
   * @generated
   */
  EAttribute getMetaMetaMethod_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see org.xtext.commonlang.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.Comparison#getVarleft <em>Varleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Varleft</em>'.
   * @see org.xtext.commonlang.Comparison#getVarleft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Varleft();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.commonlang.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.Comparison#getVarright <em>Varright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Varright</em>'.
   * @see org.xtext.commonlang.Comparison#getVarright()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Varright();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.xtext.commonlang.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.If#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.commonlang.If#getEx()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.If#getBl <em>Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl</em>'.
   * @see org.xtext.commonlang.If#getBl()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Bl();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Else <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else</em>'.
   * @see org.xtext.commonlang.Else
   * @generated
   */
  EClass getElse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.Else#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.commonlang.Else#getEx()
   * @see #getElse()
   * @generated
   */
  EReference getElse_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.xtext.commonlang.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.For#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.xtext.commonlang.For#getInit()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Init();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.For#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check</em>'.
   * @see org.xtext.commonlang.For#getCheck()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Check();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.For#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.commonlang.For#getAction()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.For#getBl <em>Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl</em>'.
   * @see org.xtext.commonlang.For#getBl()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Bl();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.xtext.commonlang.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.While#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.commonlang.While#getEx()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Ex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.commonlang.While#getBl <em>Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bl</em>'.
   * @see org.xtext.commonlang.While#getBl()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Bl();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.commonlang.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.BasicValue <em>Basic Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Value</em>'.
   * @see org.xtext.commonlang.BasicValue
   * @generated
   */
  EClass getBasicValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.BasicValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.commonlang.BasicValue#getValue()
   * @see #getBasicValue()
   * @generated
   */
  EAttribute getBasicValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.xtext.commonlang.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.xtext.commonlang.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see org.xtext.commonlang.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.VarReference <em>Var Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Reference</em>'.
   * @see org.xtext.commonlang.VarReference
   * @generated
   */
  EClass getVarReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.commonlang.VarReference#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vari</em>'.
   * @see org.xtext.commonlang.VarReference#getVari()
   * @see #getVarReference()
   * @generated
   */
  EReference getVarReference_Vari();

  /**
   * Returns the meta object for class '{@link org.xtext.commonlang.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.commonlang.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.commonlang.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.commonlang.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.commonlang.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommonlangFactory getCommonlangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.CLfileImpl <em>CLfile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.CLfileImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getCLfile()
     * @generated
     */
    EClass CLFILE = eINSTANCE.getCLfile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLFILE__NAME = eINSTANCE.getCLfile_Name();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ScriptImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Robottypes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__ROBOTTYPES = eINSTANCE.getScript_Robottypes();

    /**
     * The meta object literal for the '<em><b>Robotconfigs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__ROBOTCONFIGS = eINSTANCE.getScript_Robotconfigs();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__METHODS = eINSTANCE.getScript_Methods();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.MetaMethodsImpl <em>Meta Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.MetaMethodsImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMethods()
     * @generated
     */
    EClass META_METHODS = eINSTANCE.getMetaMethods();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_METHODS__METHODS = eINSTANCE.getMetaMethods_Methods();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.BlockImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Exs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__EXS = eINSTANCE.getBlock_Exs();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.SimpleExpressionImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getSimpleExpression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getSimpleExpression();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.StructureExpressionImpl <em>Structure Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.StructureExpressionImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getStructureExpression()
     * @generated
     */
    EClass STRUCTURE_EXPRESSION = eINSTANCE.getStructureExpression();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ExpressionImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.AssignmentImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VARI = eINSTANCE.getAssignment_Vari();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.MethodImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.CallImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__NAME = eINSTANCE.getCall_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__PARAMETERS = eINSTANCE.getCall_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.UserMethodImpl <em>User Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.UserMethodImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getUserMethod()
     * @generated
     */
    EClass USER_METHOD = eINSTANCE.getUserMethod();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_METHOD__METHOD = eINSTANCE.getUserMethod_Method();

    /**
     * The meta object literal for the '<em><b>Bl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_METHOD__BL = eINSTANCE.getUserMethod_Bl();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.MetaMethodImpl <em>Meta Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.MetaMethodImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMethod()
     * @generated
     */
    EClass META_METHOD = eINSTANCE.getMetaMethod();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_METHOD__METHOD = eINSTANCE.getMetaMethod_Method();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.MetaMetaMethodImpl <em>Meta Meta Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.MetaMetaMethodImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getMetaMetaMethod()
     * @generated
     */
    EClass META_META_METHOD = eINSTANCE.getMetaMetaMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_META_METHOD__NAME = eINSTANCE.getMetaMetaMethod_Name();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ComparisonImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Varleft</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__VARLEFT = eINSTANCE.getComparison_Varleft();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Varright</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__VARRIGHT = eINSTANCE.getComparison_Varright();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.IfImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EX = eINSTANCE.getIf_Ex();

    /**
     * The meta object literal for the '<em><b>Bl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__BL = eINSTANCE.getIf_Bl();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ElseImpl <em>Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ElseImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getElse()
     * @generated
     */
    EClass ELSE = eINSTANCE.getElse();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE__EX = eINSTANCE.getElse_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ForImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__INIT = eINSTANCE.getFor_Init();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__CHECK = eINSTANCE.getFor_Check();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__ACTION = eINSTANCE.getFor_Action();

    /**
     * The meta object literal for the '<em><b>Bl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__BL = eINSTANCE.getFor_Bl();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.WhileImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EX = eINSTANCE.getWhile_Ex();

    /**
     * The meta object literal for the '<em><b>Bl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__BL = eINSTANCE.getWhile_Bl();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.ValueImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.BasicValueImpl <em>Basic Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.BasicValueImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBasicValue()
     * @generated
     */
    EClass BASIC_VALUE = eINSTANCE.getBasicValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_VALUE__VALUE = eINSTANCE.getBasicValue_Value();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.BooleanValueImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.StringValueImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.NumberValueImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.VarReferenceImpl <em>Var Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.VarReferenceImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getVarReference()
     * @generated
     */
    EClass VAR_REFERENCE = eINSTANCE.getVarReference();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_REFERENCE__VARI = eINSTANCE.getVarReference_Vari();

    /**
     * The meta object literal for the '{@link org.xtext.commonlang.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.commonlang.impl.DeclarationImpl
     * @see org.xtext.commonlang.impl.CommonlangPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

  }

} //CommonlangPackage
