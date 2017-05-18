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
								"SeeingLeft()"
							),
							new Block(new Expression[] {
								new Expression(
									"TurnRight(90)"
								)
							})
						),new Else(
							new If(
								new Expression(
									"SeeingRight()"
								),
								new Block(new Expression[] {
									new Expression(
										"TurnLeft(90)"
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
