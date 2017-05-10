package parser;

import CommonLanguageObjects.*;


public interface CommonToLanguageParser {
	String parseBlock(Block _bl);
    String parseElse(Else _else);
    String parseExpression(Expression _exp);
    String parseFor(For _for);
    String parseIf(If _if);
    String parseMethod(Method _method);
    String parseParameter(Parameter _parameter);
    String parseWhile(While _while);
    String parseScript(Script _script);
}
