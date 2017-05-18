package input;
import java.util.ArrayList;
import input.RobotScript;
import CommonLanguageObjects.*;

public class Navigate extends RobotScript {
	public void buildModel() {
		robotlist = new ArrayList<String>();
		sc = new Script(
			new Method[] {
				new Method(
					"void",
					"loop",
					new Parameter[] {
					},
					new Block(new Expression[] {
						new Expression(
							"ReadSensors()"
						),new If(
							new Expression(
								"Peeing()"
							),
							new Block(new Expression[] {
								new Expression(
									"TurnLeft(69)"
								)
							})
						),new Else(
							new Block(new Expression[] {
								new Expression(
									"MoveBackward(4)"
								),new Expression(
									"MoveForward(6)"
								),new While(
									new Expression(
										"true"
									),
									new Block(new Expression[] {
										new Expression(
											"TurnRight(22)"
										)
									})
								)
							})
						),new If(
							new Expression(
								"Seeing()"
							),
							new Block(new Expression[] {
								new Expression(
									"MoveBackward(1)"
								)
							})
						),new Else(
							new If(
								new Expression(
									"KeeingLeft()"
								),
								new Block(new Expression[] {
									new Expression(
										"TurnRight(45)"
									)
								})
							)
						),new Else(
							new If(
								new Expression(
									"SeeingRight()"
								),
								new Block(new Expression[] {
									new Expression(
										"TurnLeft(45)"
									)
								})
							)
						),new Else(
							new If(
								new Expression(
									"Touching()"
								),
								new Block(new Expression[] {
									new Expression(
										"MoveBackward(500)"
									)
								})
							)
						),new Else(
							new Block(new Expression[] {
								new Expression(
									"MoveForward(500)"
								)
							})
						)
					})
				)
			}
		);
		robotlist.add("LegoMindstormsEV3,EV3_1");
		generateCode();
	};
};
