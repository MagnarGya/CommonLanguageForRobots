/**
 */
package org.xtext.commonlang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.commonlang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonlangFactoryImpl extends EFactoryImpl implements CommonlangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommonlangFactory init()
  {
    try
    {
      CommonlangFactory theCommonlangFactory = (CommonlangFactory)EPackage.Registry.INSTANCE.getEFactory(CommonlangPackage.eNS_URI);
      if (theCommonlangFactory != null)
      {
        return theCommonlangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CommonlangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonlangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CommonlangPackage.CLFILE: return createCLfile();
      case CommonlangPackage.SCRIPT: return createScript();
      case CommonlangPackage.META_METHODS: return createMetaMethods();
      case CommonlangPackage.BLOCK: return createBlock();
      case CommonlangPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case CommonlangPackage.STRUCTURE_EXPRESSION: return createStructureExpression();
      case CommonlangPackage.EXPRESSION: return createExpression();
      case CommonlangPackage.ASSIGNMENT: return createAssignment();
      case CommonlangPackage.CALL: return createCall();
      case CommonlangPackage.METHOD: return createMethod();
      case CommonlangPackage.META_METHOD: return createMetaMethod();
      case CommonlangPackage.USER_METHOD: return createUserMethod();
      case CommonlangPackage.USER_METHOD_CALL: return createUserMethodCall();
      case CommonlangPackage.META_METHOD_CALL: return createMetaMethodCall();
      case CommonlangPackage.VALUE_EXPRESSION: return createValueExpression();
      case CommonlangPackage.PARAN_VALUE_EXPRESSION: return createParanValueExpression();
      case CommonlangPackage.BASIC_VALUE_EXPRESSION: return createBasicValueExpression();
      case CommonlangPackage.CREMENT: return createCrement();
      case CommonlangPackage.IF: return createIf();
      case CommonlangPackage.ELSE: return createElse();
      case CommonlangPackage.FOR: return createFor();
      case CommonlangPackage.WHILE: return createWhile();
      case CommonlangPackage.VALUE: return createValue();
      case CommonlangPackage.BASIC_VALUE: return createBasicValue();
      case CommonlangPackage.BOOLEAN_VALUE: return createBooleanValue();
      case CommonlangPackage.STRING_VALUE: return createStringValue();
      case CommonlangPackage.NUMBER_VALUE: return createNumberValue();
      case CommonlangPackage.VAR_REFERENCE: return createVarReference();
      case CommonlangPackage.DECLARATION: return createDeclaration();
      case CommonlangPackage.RETURN: return createReturn();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLfile createCLfile()
  {
    CLfileImpl cLfile = new CLfileImpl();
    return cLfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaMethods createMetaMethods()
  {
    MetaMethodsImpl metaMethods = new MetaMethodsImpl();
    return metaMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureExpression createStructureExpression()
  {
    StructureExpressionImpl structureExpression = new StructureExpressionImpl();
    return structureExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaMethod createMetaMethod()
  {
    MetaMethodImpl metaMethod = new MetaMethodImpl();
    return metaMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserMethod createUserMethod()
  {
    UserMethodImpl userMethod = new UserMethodImpl();
    return userMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserMethodCall createUserMethodCall()
  {
    UserMethodCallImpl userMethodCall = new UserMethodCallImpl();
    return userMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaMethodCall createMetaMethodCall()
  {
    MetaMethodCallImpl metaMethodCall = new MetaMethodCallImpl();
    return metaMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression createValueExpression()
  {
    ValueExpressionImpl valueExpression = new ValueExpressionImpl();
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParanValueExpression createParanValueExpression()
  {
    ParanValueExpressionImpl paranValueExpression = new ParanValueExpressionImpl();
    return paranValueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicValueExpression createBasicValueExpression()
  {
    BasicValueExpressionImpl basicValueExpression = new BasicValueExpressionImpl();
    return basicValueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crement createCrement()
  {
    CrementImpl crement = new CrementImpl();
    return crement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Else createElse()
  {
    ElseImpl else_ = new ElseImpl();
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicValue createBasicValue()
  {
    BasicValueImpl basicValue = new BasicValueImpl();
    return basicValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberValue createNumberValue()
  {
    NumberValueImpl numberValue = new NumberValueImpl();
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarReference createVarReference()
  {
    VarReferenceImpl varReference = new VarReferenceImpl();
    return varReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonlangPackage getCommonlangPackage()
  {
    return (CommonlangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CommonlangPackage getPackage()
  {
    return CommonlangPackage.eINSTANCE;
  }

} //CommonlangFactoryImpl
