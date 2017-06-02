package org.xtext.commonlang.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.FileExtensionProvider
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.CommonlangInjectorProvider
import org.xtext.commonlang.CLfile
import org.xtext.commonlang.CommonlangPackage
import org.xtext.commonlang.Return
import org.xtext.commonlang.impl.ReturnImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.util.StringInputStream
import org.xtext.generator.CommonlangGenerator
import org.xtext.commonlang.Script
import org.xtext.commonlang.Assignment
import org.xtext.commonlang.Method
import org.xtext.commonlang.UserMethod
import static org.junit.Assert.*;

@InjectWith(CommonlangInjectorProvider)
@RunWith(XtextRunner)
class CommonlangTesting {
	@Inject
	ResourceSet rs
	@Inject
	extension FileExtensionProvider fep
	
	@Inject
	ParseHelper<CLfile> fileparser
	@Inject
	extension ValidationTestHelper
	
	@Test
	def void testInvalidTypes() {
		var sc = fileparser.parse('''
			script AntiTest targets (RobotType,Robot) {
				void assignments() {
					//Instantiate wrong type or empty
					int j;
					int i = "";
					string s = true;
					boolean b = 0;
					
					//Assign wrong type to existing variable
					i = false;
					s = 0;
					b = "";
					
					//Increment and decrement non-int
					s++;
					s--;
					b++;
					b--;
				}
				
				//return wrong types
				int returnsValueInt() {
					return true;
				}
			metamethodscollection{}	
		''')
		
		//Instantiation
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected int got string")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected string got boolean")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected boolean got int")
		
		//Assignments
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected int got boolean")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected string got int")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected boolean got string")
		
		//Increment/decrement
		sc.assertError(CommonlangPackage::eINSTANCE.crement,null,"Invalid type: Cannot perform ++ operation on string")
		sc.assertError(CommonlangPackage::eINSTANCE.crement,null,"Invalid type: Cannot perform -- operation on string")
		sc.assertError(CommonlangPackage::eINSTANCE.crement,null,"Invalid type: Cannot perform ++ operation on boolean")
		sc.assertError(CommonlangPackage::eINSTANCE.crement,null,"Invalid type: Cannot perform -- operation on boolean")
	
		//Return wrong value
		sc.assertError(CommonlangPackage::eINSTANCE.method,null,"Must return value of type int")
	}
	
	@Test
	def void testInvalidCalls() {
		var sc = fileparser.parse('''
			script AntiTest targets (RobotType,Robot) {
				void call() {
					//User method misspelt
					assignment();
					//Metamethod with missing parameter
					MetaMethodVoid();
				}
				
				void assignments() {}
			}
			metamethodscollection{
				meta void MetaMethodVoid(int x);
			}
			''')
		sc.assertError(CommonlangPackage::eINSTANCE.userMethodCall,"org.eclipse.xtext.diagnostics.Diagnostic.Linking","Couldn't resolve reference to Method 'assignment'")
		sc.assertError(CommonlangPackage::eINSTANCE.metaMethodCall,null,"Wrong number of arguments!")
	}
	
	@Test
	def void testInvalidValues() {
		var sc = fileparser.parse('''
		script AntiTest targets (RobotType,Robot) {
			void values() {
				//Invalid math expressions
				int i = (2 + "");
				boolean b = true;
				b = (true && i);
				b = true + false;
				//String values with invalid operators
				string s = "Hello" + "howdy"; 
				s -= "s";
				//Negative non-number
				i = -false;
				b = -false;
				s = -"string";
				//Comparison operators with invalid values
				b = true > false;
				b = "string" < "string";
				b = false <=2;
				b = i >="string";
				b = false < "string";
			}
		}
		metamethodscollection{
			meta void MetaMethodVoid(int x);
		}''')
		//Invalid math
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Type mismatch: Cannot perform + on int and string")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Type mismatch: Cannot perform && on boolean and int")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Operator + is invalid for types boolean and boolean")
		//String values with invalid operators
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Operator + is invalid for types string and string")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Invalid operation for type string")
		//Negative non-number
		sc.assertError(CommonlangPackage::eINSTANCE.negNumberValue,"org.eclipse.xtext.diagnostics.Diagnostic.Syntax","mismatched input 'false' expecting RULE_INT")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected boolean got int")
		sc.assertError(CommonlangPackage::eINSTANCE.assignment,null,"Type mismatch: Expected string got int")
		//Comparison operators with invalid values
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Cannot compare sizes of boolean and boolean")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Cannot compare sizes of string and string")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Cannot compare sizes of boolean and int")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Cannot compare sizes of int and string")
		sc.assertError(CommonlangPackage::eINSTANCE.valueExpression,null,"Cannot compare sizes of boolean and string")
	}
	
	@Test
	def void testInvalidStructures() {
		var sc = fileparser.parse('''
			script Test targets (RobotType,Robot) {
				void structureExpressions() {
					//Invalid expressions in structures
					if (1+2) {
					} else {
					}
					
					while ("Hello") {
					}
					
					for (int i = 0; i + 5; i++) {
					}
				}
				
				boolean returnStructure() {
					//Return value only through one path
					if (false) {
					} else {
						return true;
					}
				}
			}
			metamethodscollection{}
			''')
			//Invalid expressions in structures
			sc.assertError(CommonlangPackage::eINSTANCE.getIf,null,"Expected boolean expression")
			sc.assertError(CommonlangPackage::eINSTANCE.getWhile,null,"Expected boolean expression")
			sc.assertError(CommonlangPackage::eINSTANCE.getFor,null,"Expected boolean expression")
			//Return value only through one path
			sc.assertError(CommonlangPackage::eINSTANCE.method,null,"Method has return type boolean but may not return a valid value")
	}
	
	@Test
	def void testValidScript() {
		var sc = fileparser.parse(validScript)
		sc.assertNoErrors()
	}
	
	@Test
	def void testGeneration() {
		/*	This test verifies that the valid script used in testing produces the expected output
			It is based on a known correct code, and will likely need to be updated if new functionality
			is to be added, or existing functionality is significantly changed. Only
			changes to generated code should trigger a change here, no internal changes should
			affect it.
		*/
		val resource = rs.createResource(URI.createURI("test." + primaryFileExtension))
		resource.load(validScript.asStream, null)
		var result = "";
		for (e : resource.allContents.toIterable.filter(Script)) {
			result = (new CommonlangGenerator()).compile(e).toString
			println(result)
			assertTrue(result.equals(generatedScript))
		}
		
	}
	
	def private asStream(CharSequence s) {
		new StringInputStream(s.toString)
	}
	
	var generatedScript = '''
			package input;
			import java.util.ArrayList;
			import input.RobotScript;
			import CommonLanguageObjects.*;
			
			public class Test extends RobotScript {
				public static void main(String[] args) {
					Test roboscript = new Test();
					roboscript.buildModel();
				}
				public void buildModel() {
					name = "Test";
					robotlist = new ArrayList<String>();
					sc = new Script(
						new Method[] {
							new Method(
								"void",
								"assignments",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new Expression(
										"int i = 0"
									),new Expression(
										"string s = \"\""
									),new Expression(
										"boolean b = true"
									),new Expression(
										"i = 1"
									),new Expression(
										"s = \"Hello\""
									),new Expression(
										"b = false"
									),new Expression(
										"i+=1"
									),new Expression(
										"i-=1"
									)
								})
							),new Method(
								"void",
								"call",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new Expression(
										"assignments()"
									),new Expression(
										"MoveForward(5)"
									)
								})
							),new Method(
								"void",
								"values",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new Expression(
										"int i = (1+2)/3*2-5"
									),new Expression(
										"i = -5"
									),new Expression(
										"boolean b = true"
									),new Expression(
										"b = (true&&false)||i==2"
									),new Expression(
										"string s = \"Hello\""
									)
								})
							),new Method(
								"void",
								"operators",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new Expression(
										"int i = 1+2"
									),new Expression(
										"i = 2-3"
									),new Expression(
										"i = 2/3"
									),new Expression(
										"i = 2*3"
									),new Expression(
										"boolean b = true||false"
									),new Expression(
										"b = true&&false"
									),new Expression(
										"b = true!&&false"
									),new Expression(
										"b = true!||false"
									),new Expression(
										"b = i>2"
									),new Expression(
										"b = i<2"
									),new Expression(
										"b = i<=2"
									),new Expression(
										"b = i>=2"
									),new Expression(
										"b = i==2"
									),new Expression(
										"b = i!=2"
									)
								})
							),new Method(
								"void",
								"structures",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new If(
										new Expression(
											"true&&false"
										),
										new Block(new Expression[] {
											new Expression(
												"LightOn()"
											)
										}),
										new Else(
											new Block(new Expression[] {
												new Expression(
													"LightOff()"
												)
											})
										)
									),new While(
										new Expression(
											"false"
										),
										new Block(new Expression[] {
											new Expression(
												"Idle(5)"
											)
										})
									),new For(
										new Expression(
											"int i = 0"
										),
										new Expression(
											"i<10"
										),
										new Expression(
											"i+=1"
										),
										new Block(new Expression[] {
											new Expression(
												"TurnLeft(i)"
											)
										})
									)
								})
							),new Method(
								"int",
								"returnsValue",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new Expression(
										"return 5"
									)
								})
							),new Method(
								"boolean",
								"returnStructure",
								new Parameter[] {
								},
								new Block(new Expression[] {
									new If(
										new Expression(
											"false"
										),
										new Block(new Expression[] {
											new Expression(
												"return true"
											)
										}),
										new Else(
											new Block(new Expression[] {
												new Expression(
													"return false"
												)
											})
										)
									)
								})
							)
						}
					);
					robotlist.add("RobotType,Robot");
					generateCode();
				};
			};
	'''
	
	var validScript = '''
			script Test targets (RobotType,Robot) {
				void assignments() {
					//Instantiate
					int i = 0;
					string s = "";
					boolean b = true;
					//Assign to existing variable
					i = 1;
					s = "Hello";
					b = false;
					//Increment and decrement
					i++;
					i--;
				}
				
				void call() {
					//User method
					assignments(); 
					//Metamethod
					MoveForward(5);
				}
				
				void values() {
					//Mathematical expression
					int i = (1 + 2 )/ 3 * 2 - 5;
					//Negative number 
					i = -5;
					//Boolean values
					boolean b = true;
					b = (true && false) || i == 2;
					//String values
					string s = "Hello";
				}
				
				void operators() {
					//Mathematical operators
					int i = 1 + 2;
					i = 2-3;
					i = 2/3;
					i = 2*3;
					
					//Boolean operators
					boolean b = true || false;
					b = true && false;
					b = true !&& false;
					b = true !|| false;
					
					//Comparison operators
					b = i > 2;
					b = i < 2;
					b = i <=2;
					b = i >=2;
					b = i == 2;
					b = i != 2;
				}
				
				void structures() {
					//If - else
					if (true && false) {
						LightOn();
					} else {
						LightOff();
					}
					//While
					while (false) {
						Idle(5);
					}
					//For
					for (int i = 0; i < 10; i++) {
						TurnLeft(i);
					}
				}
				
				int returnsValue() {
					//return value
					return 5;
				}
				
				boolean returnStructure() {
					//Returns value through structure
					if (false) {
						return true;
					} else {
						return false; 
					}
				}
			}
			
			metamethodscollection {
				meta void ReadSensors();
				meta boolean Touching();
				meta boolean TouchingBoth();
				meta boolean TouchingLeft();
				meta boolean TouchingRight();
				meta boolean Seeing();
				meta boolean SeeingBoth();
				meta boolean SeeingLeft();
				meta boolean SeeingRight();
				meta void MoveForward(int time);
				meta void MoveBackward(int time);
				meta void TurnRight(int time);
				meta void TurnLeft(int time);
				meta void Idle(int time);
				meta void LightOn();
				meta void LightOff();
				meta boolean FoundObject();
				meta void FollowObject();
				meta void Delay(int time);
			}'''
}
