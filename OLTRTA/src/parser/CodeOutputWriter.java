package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import CommonLanguageObjects.*;

public class CodeOutputWriter {
	BotMethods botmethods;
	Method loop;
	
	public CodeOutputWriter(BotMethods _botmethods, Method _loop){
		botmethods = _botmethods;
		loop = _loop;
	}
	
	public void writeToFile(){
		String script = "";
		for (int i = 0; i < botmethods.global_variables.length; i++){
			script += botmethods.parser.parseExpression(botmethods.global_variables[i]);
		}
        script += botmethods.parser.parseMethod(botmethods.setup);
        script += botmethods.parser.parseMethod(loop);
        for (int i = 0; i < botmethods.methods.length; i++) {
            script += botmethods.parser.parseMethod(botmethods.methods[i]);
        }
        for (int i = 0; i < botmethods.metamethods.length; i++) {
            script += botmethods.parser.parseMethod(botmethods.metamethods[i]);
        }
        
        
		try {
			String path = new File(".\\src\\"+botmethods.robot).getCanonicalPath();
			File folder = new File(path);
			File file;
			if(folder.exists()){
				path = new File(".\\src\\"+botmethods.robot+"\\"+botmethods.name+""+botmethods.extension).getCanonicalPath();
				file = new File(path);
				if(!(file.exists())){
					file.createNewFile();
				}
			}else{
				folder.mkdir();
				path = new File(".\\src\\"+botmethods.robot+"\\"+botmethods.name+""+botmethods.extension).getCanonicalPath();
				file = new File(path);
				file.createNewFile();
			}
			PrintWriter writer = new PrintWriter(file,"UTF-8");
			writer.print(script);
	    	writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        
	}
}
