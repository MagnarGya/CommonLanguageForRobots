package parser;

import CommonLanguageObjects.*;

public class CodeOutputWriter {
	CommonToLanguageParser parser;
	BotMethods botmethods;
	Method loop;
	
	public CodeOutputWriter(CommonToLanguageParser _parser, BotMethods _botmethods, Method _loop){
		parser = _parser;
		botmethods = _botmethods;
		loop = _loop;
	}
	
	public void writeToFile(){
		String script = "";
		//TODO EVERYTHING
	}
}
