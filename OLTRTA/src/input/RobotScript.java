package input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public String name;
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
			CodeOutputWriter COW = new CodeOutputWriter(bm, sc, name);
			COW.writeToFile();
		}
	}
	
	Expression checkIf(If ifb){
		if(checkExpression(ifb.ex)==null){
			if (ifb.el != null) {
				return (checkExpression(ifb.el.ex));
			}
			return null;
		}else{
			if (ifb.el != null) {
				ifb.el = checkElse(ifb.el);
			}
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
		String methodRegex = "[a-zA-Z]([a-zA-Z_0-9])*[(]";
		
		switch (exp.getClass().toString()) {
        case "class CommonLanguageObjects.If": return checkIf((If)exp);
        case "class CommonLanguageObjects.Else": return checkElse((Else)exp);
        case "class CommonLanguageObjects.Block": return checkBlock((Block)exp);
        case "class CommonLanguageObjects.While": return checkWhile((While)exp);
        case "class CommonLanguageObjects.For": return checkFor((For)exp);
        default: 
        	if(exp.content.matches(".*"+methodRegex+".*")) {	
	        	Matcher m = Pattern.compile(methodRegex).matcher(exp.content);
	        	String methodString = "";
	        	while (m.find()) {
	        		boolean isMethod = false;
	        		methodString = exp.content.substring(m.start(), m.end()-1);
	        		for(Method method : methodlist){
	            		if(method.name.contains(methodString)) {
	            			isMethod = true;
	            		}
	            	}
	            	if(!isMethod){
	            		System.err.println(methodString + " is called as a method, but isn't defined. \n"
	            				+ "Removed the method call and any surrounding structure");
	            		return null;
	            	}
	        	}
        	} 
        	return exp;
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
			//Check the current expression. Null if current is null
			Expression checked = null;
			if (current != null) {	
				checked = checkExpression(current);
				//If the current expression is null
				if (checked.getClass() == Block.class) {
					Block blex = (Block)(checked);
					
					int blockLength = blex.exs.length;
					Expression[] newList = new Expression[blockLength + bl.exs.length];

					//Copy up to (not including) current index
					for (int k = 0; k < i; k++) {
						newList[k] = bl.exs[k];
					}
					//Fill in the contents of the block into the current one
					for (int k = 0; k < blockLength; k++) {
						newList[i+k+1] = blex.exs[k];
					}
					//Append the last parts of the current block
					for (int k = i+1; k < bl.exs.length; k++) {
						newList[k+blockLength] = bl.exs[k];
					}
					bl.exs = newList;
					checked = null;
				}
			}
			//Finally assign the value to array
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
