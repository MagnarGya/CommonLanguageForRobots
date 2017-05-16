import java.util.ArrayList;
import input.RobotScript;
import CommonLanguageObjects.*;

public class navigate extends RobotScript {
	void buildModel() {
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
							"int desu = 9"
						),new Expression(
							"int bebe = desu"
						),new Expression(
							"MoveForward(5)"
						),new If(
							new Expression(
								"Touching()"
							),
							new Block(new Expression[] {
								new Expression(
									"MoveBackward(5)"
								)
							})
						),new Else(
							new Block(new Expression[] {
								new Expression(
									"MoveForward(2)"
								)
							})
						),new Expression(
							"string wot = \"bit\""
						),new Expression(
							"boolean bof = false"
						),new Expression(
							"loop()"
						),new Expression(
							"test(5,true)"
						),new Expression(
							"test(bebe,bof)"
						)
					})
				),new Method(
					"void",
					"test",
					new Parameter[] {
						new Expression(
							"int gaga"
						),new Expression(
							"boolean dada"
						)
					},
					new Block(new Expression[] {
						new Expression(
							"test(5,true)"
						),new Expression(
							"test(gaga,dada)"
						)
					})
				)
			}
		);
		robotlist.add("arduino,test1");
		robotlist.add("lego,ev3");
		generateCode();
	};
};
