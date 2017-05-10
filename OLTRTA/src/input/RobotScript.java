package input;

import java.util.ArrayList;

import parser.CodeOutputWriter;
import CommonLanguageObjects.BotMethods;
import CommonLanguageObjects.Script;

public class RobotScript {
	ArrayList<String> robotlist;
	Script sc;
	
	void generateCode(){
		for(String robot : robotlist){
			String[] robotdetails = robot.split(",");
			BotMethods bm = new BotMethods(robotdetails[0],robotdetails[1]);
			CodeOutputWriter COW = new CodeOutputWriter(bm, sc);
			
		}
	}
}
