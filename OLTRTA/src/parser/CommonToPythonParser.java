package parser;

import CommonLanguageObjects.*;


public class CommonToPythonParser implements CommonToLanguageParser{

	@Override
	public String parseBlock(Block _bl) {
		String returnString = "";
        for (Expression ex : _bl.exs) {
            returnString += parseExpression(ex);
            if (ex.getClass() == Expression.class) {
                returnString += "\n";
            }
        }

        String[] lines = returnString.split("\\r\\n|\\n|\\r");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "    " + lines[i] + "\n";
        }
        returnString = "";
        returnString += "\n";
        for(String str : lines) {
            returnString += str;
        }

        return returnString;
	}

	@Override
	public String parseElse(Else _else) {
		String returnString = "";

        if (_else.ex.getClass() == If.class) {
            returnString += "el";
            returnString += parseExpression(_else.ex);
        } else {
            returnString += "else: ";
            returnString += parseExpression(_else.ex);
        }
        return returnString;
	}

	@Override
	public String parseExpression(Expression _exp) {
		switch (_exp.getClass().toString()) {
        case "class CommonLanguageObjects.If": return parseIf((If)_exp);
        case "class CommonLanguageObjects.Else": return parseElse((Else)_exp);
        case "class CommonLanguageObjects.Block": return parseBlock((Block)_exp);
        case "class CommonLanguageObjects.While": return parseWhile((While)_exp);
        case "class CommonLanguageObjects.For": return parseFor((For)_exp);
        case "class CommonLanguageObjects.Declaration": return _exp.content + "\n";
        default: return _exp.content;
    }
	}

	@Override
	public String parseFor(For _for) {
		String returnString = "";

        returnString += "for (" + parseExpression(_for.init) + ";" + parseExpression(_for.check) + ";" + parseExpression(_for.action) + ": ";
        returnString += parseBlock(_for.bl);

        return returnString;
	}

	@Override
	public String parseIf(If _if) {
		String returnString = "";

        returnString += "if " + parseExpression(_if.ex) + ":";
        returnString += parseBlock(_if.bl);

        return returnString;
	}

	@Override
	public String parseMethod(Method _method) {
		String returnString = "";

        returnString += "def " + _method.name + "(";
        if (_method.parameters != null) {
            for(Parameter param : _method.parameters) {
                returnString += parseParameter(param);
                if (param != _method.parameters[_method.parameters.length-1]) {
                    returnString += ",";
                }
            }
        }
        returnString += "):";
        returnString += parseBlock(_method.bl);

        return returnString;
	}

	@Override
	public String parseParameter(Parameter _parameter) {
		String returnString = "";

        returnString += _parameter.type + " " + _parameter.content;

        return returnString;
	}

	@Override
	public String parseWhile(While _while) {
		String returnString = "";

        returnString += "while (" + parseExpression(_while.ex) + "): ";
        returnString += parseBlock(_while.bl);

        return returnString;
	}
	
}
