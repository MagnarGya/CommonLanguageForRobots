package input;

import java.lang.reflect.Array;
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
		return elseb;
	}
	
	Expression checkExpression(Expression exp){
		switch (exp.getClass().toString()) {
        case "class CommonLanguageObjects.If": return checkIf((If)exp);
        case "class CommonLanguageObjects.Else": return checkElse((Else)exp);
        case "class CommonLanguageObjects.Block": return checkBlock((Block)exp);
        case "class CommonLanguageObjects.While": return checkWhile((While)exp);
        case "class CommonLanguageObjects.For": return checkFor((For)exp);
        default: if(exp.content.matches(".*(.*).*")){
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
		for(int i = 0; i < bl.exs.length; i++){
			bl.exs[i] = checkExpression(bl.exs[i]);
		}
		
		ArrayList<Expression> expressionlist = new ArrayList<Expression>();
		for(Expression exs : bl.exs){
			if(exs!=null){
				expressionlist.add(exs);
			}
		}
		bl.exs = expressionlist.toArray(new Expression[0]);
		for(int i = 0; i < bl.exs.length; i++){
			if(bl.exs[i].getClass().toString().contains("Else")){
				Else elseB = (Else) bl.exs[i];
				int j = 1;
				while(bl.exs[i-j]==null||i-j<0){
					j++;
				}
				if(!(bl.exs[i-j].getClass().toString().contains("If")||bl.exs[i].getClass().toString().contains("Else"))){
					bl.exs[i] = elseB.ex;
				}
				if(elseB.ex == null){
					bl.exs[i] = null;
				}
			}
		}
		
		expressionlist = new ArrayList<Expression>();
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
