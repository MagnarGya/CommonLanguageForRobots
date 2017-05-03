package parser;

public class CommonToCParser implements CommonToLanguageParser{

	@Override
	public String parseBlock(Block _bl) {
		String returnString = "";
        for (Expression ex : _bl.exs) {
            returnString += parseExpression(ex);
            if(ex.GetType() == typeof(Expression)){
                returnString += ";\n";
            }
        }
        
        String[] lines = returnString.Split(new String[] { "\r\n", "\n" }, StringSplitOptions.None);
        for (int i = 0; i < lines.length-1; i++) {
            lines[i] = "    " + lines[i] +"\n";
        }
        returnString = "";
        returnString += "{\n";
        for (String str : lines) {
            returnString += str;
        }
        returnString += "} \n";

        return returnString;
	}

	@Override
	public String parseElse(Else _else) {
		String returnString = "";

        returnString += "else ";
        returnString += parseExpression(_else.ex);

        return returnString;
	}

	@Override
	public String parseExpression(Expression _exp) {
		switch (_exp.GetType().ToString()) {
        case "OLTRTA.CommonLanguageObjects.If": return parseIf((If)_exp);
        case "OLTRTA.CommonLanguageObjects.Else": return parseElse((Else)_exp);
        case "OLTRTA.CommonLanguageObjects.Block": return parseBlock((Block)_exp);
        case "OLTRTA.CommonLanguageObjects.While": return parseWhile((While)_exp);
        case "OLTRTA.CommonLanguageObjects.For": return parseFor((For)_exp);
        case "OLTRTA.CommonLanguageObjects.Declaration": return _exp.content + ";\n";
        default: return _exp.content;
    }
	}

	@Override
	public String parseFor(For _for) {
		String returnString = "";

        returnString += "for (" + parseExpression(_for.init) + ";" + parseExpression(_for.check) + ";" + parseExpression(_for.action);
        returnString += parseBlock(_for.bl);

        return returnString;
	}

	@Override
	public String parseIf(If _if) {
		String returnString = "";

        returnString += "if (" + parseExpression(_if.ex) + ")";
        returnString += parseBlock(_if.bl);

        return returnString;
	}

	@Override
	public String parseMethod(Method _method) {
		String returnString = "";

        returnString += _method.type + " " + _method.name + "(";
        if (_method.parameters != null) {
            for (Parameter param : _method.parameters) {
                returnString += parseParameter(param);
                if (param != _method.parameters.Last()) {
                    returnString += ",";
                }
            }
        }
        returnString += ")";
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

        returnString += "while (" + parseExpression(_while.ex) + ")";
        returnString += parseBlock(_while.bl);

        return returnString;
	}

}
