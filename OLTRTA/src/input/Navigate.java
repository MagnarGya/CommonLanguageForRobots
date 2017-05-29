package input;
import java.util.ArrayList;
import input.RobotScript;
import CommonLanguageObjects.*;

public class Navigate extends RobotScript {
	public static void main(String[] args) {
		Navigate roboscript = new Navigate();
		roboscript.buildModel();
	}
	public void buildModel() {
		name = "Navigate";
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
							"int i = (2+(2)/2+((5+2)))"
						),new Expression(
							"ReadSensors()"
						),new If(
							new Expression(
								"Touching()&&Peeing()||\"Yo mama\"==\"fat\""
							),
							new Block(new Expression[] {
							})
						),new If(
							new Expression(
								"false==(\"String\"==\"String\")"
							),
							new Block(new Expression[] {
								new Expression(
									"TurnRight()"
								)
							})
						),new Else(
							new If(
								new Expression(
									"SeeingRight()"
								),
								new Block(new Expression[] {
									new Expression(
										"TurnLeft()"
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
										"MoveBackward()"
									)
								})
							)
						),new Else(
							new Block(new Expression[] {
								new Expression(
									"MoveForward()"
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
