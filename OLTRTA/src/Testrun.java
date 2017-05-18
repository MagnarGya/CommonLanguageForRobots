
import java.util.ArrayList;

import input.Navigate;
import input.RobotScript;
import parser.*;
import CommonLanguageObjects.*;

public class Testrun {

	public static void main(String[] args) {
		/*
		Expression[] exs = new Expression[8];
		exs[0] = new Expression("LightOn()");
        exs[1] = new Expression("ReadSensors()");

        Expression[] bl1Exs = { new Expression("MoveBackward(300)")};
        Block block1 = new Block(bl1Exs);
        exs[2] = new If(new Expression("Touching()"), block1);

        Expression[] bl2Exs = { new Expression("MoveBackward(100)") };
        Block block2 = new Block(bl2Exs);
        exs[3] = new If(new Expression("SeeingBoth()"), block2);

        Expression[] bl3Exs = { new Expression("TurnRight(90)") };
        Block block3 = new Block(bl3Exs);
        exs[4] = new Else(new If(new Expression("SeeingLeft()"), block3));

        Expression[] bl4Exs = { new Expression("TurnLeft(90)") };
        Block block4 = new Block(bl4Exs);
        exs[5] = new Else(new If(new Expression("SeeingRight()"), block4));

        Expression[] bl5Exs = { new Expression("MoveForward(300)"),new Expression("Blink(100)") };
        Block block5 = new Block(bl5Exs);
        exs[6] = new Else(block5);

        exs[7] = new Expression("LightOff()");
        
        Method method = new Method("void","loop",new Block(exs));
        Method[] methodarray = {method};
        Script loop = new Script(methodarray);
		
        RobotScript rs = new RobotScript();
        rs.robotlist = new ArrayList<String>();
        rs.robotlist.add("ArduinoShieldBot,ShieldBot1");
        rs.robotlist.add("LegoMindstormsEV3,EV3_1");
        rs.sc = loop;
        rs.generateCode();*/
		
		Navigate nav = new Navigate();
		nav.buildModel();
	}

}
