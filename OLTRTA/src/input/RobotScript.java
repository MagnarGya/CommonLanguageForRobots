package input;

import java.util.ArrayList;
import java.util.Arrays;

import parser.CodeOutputWriter;
import CommonLanguageObjects.Block;
import CommonLanguageObjects.BotMethods;
import CommonLanguageObjects.Else;
import CommonLanguageObjects.Expression;
import CommonLanguageObjects.For;
import CommonLanguageObjects.If;
import CommonLanguageObjects.Method;
import CommonLanguageObjects.Script;
import CommonLanguageObjects.While;

public class RobotScript {
	public ArrayList<String> robotlist;
	public Script sc;
	protected ArrayList<Method> methodlist;
	
	public void generateCode(){
		for(String robot : robotlist){
			String[] robotdetails = robot.split(",");
			BotMethods bm = new BotMethods(robotdetails[0],robotdetails[1]);
			methodlist = new ArrayList<Method>(Arrays.asList(sc.body));
			methodlist.addAll(Arrays.asList(bm.methods));
			methodlist.addAll(Arrays.asList(bm.metamethods));
			for(int i = 0; i < sc.body.length; i++){
				sc.body[i].bl = checkBlock(sc.body[i].bl);
			}
			ArrayList<Method> blocklist = new ArrayList<Method>();
			for(int i = 0;i < sc.body.length; i++){
				if(sc.body[i].bl!=null){
					blocklist.add(sc.body[i]);
				}
			}
			sc.body = blocklist.toArray(new Method[0]);
			CodeOutputWriter COW = new CodeOutputWriter(bm, sc);
			COW.writeToFile();
		}
	}
	
	If checkIf(If ifb){
		if(checkExpression(ifb.ex)==null){
			return null;
		}else{
			ifb.bl = checkBlock(ifb.bl);
			return ifb;
		}
		
	}
	
	Else checkElse(Else elseb){
		elseb.ex = checkExpression(elseb.ex);
		if (elseb.ex == null) {
			return null;
		}
		return elseb;
	}
	
	Expression checkExpression(Expression exp){
		switch (exp.getClass().toString()) {
        case "class CommonLanguageObjects.If": return checkIf((If)exp);
        case "class CommonLanguageObjects.Else": return checkElse((Else)exp);
        case "class CommonLanguageObjects.Block": return checkBlock((Block)exp);
        case "class CommonLanguageObjects.While": return checkWhile((While)exp);
        case "class CommonLanguageObjects.For": return checkFor((For)exp);
        default: if(exp.content.matches(".*[(].*[)].*")) {
        	String checkstring = exp.content.substring(0,exp.content.lastIndexOf('('));
        	checkstring = checkstring.substring(getIndex(checkstring));
        	boolean isMethod = false;
        	for(Method method : methodlist){
        		if(method.name.contains(checkstring)){
        			isMethod = true;
        		}
        	}
        	if(isMethod){
        		return exp;
        	}else{
        		System.err.println(checkstring + " is called as a method, but isn't defined. \n"
        				+ "Removed the method call and any surrounding structure");
        		return null;
        	}
        }else{
        	return exp;
        }
		}
	}
	
	int getIndex(String s){
		for (int i = s.length() - 1; i >= 0; i--) {
	        char c = s.charAt(i);
	        if (!Character.isLetter(c))
	            return i+1;
	    }
		return 0;
	}
	
	Block checkBlock(Block bl){
		//Iterate through all expressions within block. Invalid ones become null
		for(int i = 0; i < bl.exs.length; i++){
			//Store the current and next expression
			Expression current = bl.exs[i];
			//Next is null if current is at the end of the list
			Expression next = null;
			if (i+1 < bl.exs.length) {
				next = bl.exs[i+1];
			}
			//Check the current expression. Null if current is null
			Expression checked = null;
			if (current != null) {	
				checked = checkExpression(current);
				//If the current expression is null, but the next isnt
				if (checked == null && next != null) {
					
					//If the current is an IF and next is an ELSE
					if (current.getClass() == If.class && next.getClass() == Else.class) {
						//Get the else's expression
						Expression elseEx = ((Else)next).ex;
						//If the else is not a block, replace the else with it's expression
						if (elseEx.getClass() != Block.class) {
							bl.exs[i+1] = elseEx;
						} else {
							//If the else expression has a block following it, insert it's contents into the code
							
							//Create a new list for the current block, with the total size of both
							int elseBlockLength = ((Block)elseEx).exs.length;
							Expression[] newList = new Expression[elseBlockLength + bl.exs.length];

							//Copy up to (not including) index of If statement
							for (int k = 0; k < i; k++) {
								newList[k] = bl.exs[k];
							}
							//Fill in the contents of the block into the current one
							for (int k = 0; k < elseBlockLength; k++) {
								newList[i+k+2] = ((Block)elseEx).exs[k];
							}
							//Append the last parts of the current block
							for (int k = i+2; k < bl.exs.length; k++) {
								newList[k+elseBlockLength] = bl.exs[k];
							}
							bl.exs = newList;
						}
					}
				}
			}
			//Finally assign the value to array at nice
			bl.exs[i] = checked;
		}
		
		ArrayList<Expression>expressionlist = new ArrayList<Expression>();
		for(Expression exs : bl.exs){
			if(exs!=null){
				expressionlist.add(exs);
			}
		}
		bl.exs = expressionlist.toArray(new Expression[0]);
		return bl;
	}
	
	
	While checkWhile(While whileb){
		if(checkExpression(whileb.ex)==null){
			return null;
		}else{
			whileb.bl = checkBlock(whileb.bl);
			return whileb;
		}
	}
	
	For checkFor(For forb){
		forb.init = checkExpression(forb.init);
		forb.check = checkExpression(forb.check);
		forb.action = checkExpression(forb.action);
		if(forb.init ==null || forb.check ==null || forb.action ==null){
			return null;
		}
		forb.bl = checkBlock(forb.bl);
		return forb;
	}
	
}
