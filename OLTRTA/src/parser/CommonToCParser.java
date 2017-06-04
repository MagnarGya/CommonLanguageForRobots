package parser;

import CommonLanguageObjects.*;

public class CommonToCParser implements CommonToLanguageParser{

	@Override
	public String parseBlock(Block _bl) {
		String returnString = "";
        for (Expression ex : _bl.exs) {
            returnString += parseExpression(ex);
            if(ex.getClass().toString()=="class CommonLanguageObjects.Expression"){
            	returnString += ";";
            }
        }
        
        String[] lines = returnString.split("\\r\\n|\\n|\\r");
        for (int i = 0; i < lines.length; i++) {
        	
            lines[i] = "    " + lines[i] +"\n";
        }
        returnString = "";
        returnString += "{\n";
        for (String str : lines) {
            returnString += str;
        }
        returnString += "}	\n";

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
		switch (_exp.getClass().toString()) {
        case "class CommonLanguageObjects.If": return parseIf((If)_exp);
        case "class CommonLanguageObjects.Else": return parseElse((Else)_exp);
        case "class CommonLanguageObjects.Block": return parseBlock((Block)_exp);
        case "class CommonLanguageObjects.While": return parseWhile((While)_exp);
        case "class CommonLanguageObjects.For": return parseFor((For)_exp);
        case "class CommonLanguageObjects.Declaration": return _exp.content + "\n";
        default: return _exp.content+";\n";
		}
	}

	public String fixDeclarationTypes(String str) {
		if (str.startsWith("boolean ",0)) {
			str = ("bool "+str.substring(8));
		} 
		
		return str;
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

        returnString += "if (" + parseExpression(_if.ex).replaceAll(";\n", "") + ")";
        returnString += parseBlock(_if.bl);
        if (_if.el != null) {
        	returnString += parseElse(_if.el);
        }
        return returnString;
	}

	@Override
	public String parseMethod(Method _method) {
		String returnString = "";
		
		if (_method.type.equals("boolean")) {
			_method.type = "bool";
		}
		
        returnString += _method.type + " " + _method.name + "(";
        if (_method.parameters != null) {
            for (Parameter param : _method.parameters) {
                returnString += parseParameter(param);
                if (param != _method.parameters[_method.parameters.length-1]) {
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

		if (_parameter.type.equals("boolean")) {
			_parameter.type = "bool";
		}
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
	
	public String parseScript(Script _script){
		String returnString = "";
		
		for(int i = 0; i < _script.body.length; i++){
			returnString += parseMethod(_script.body[i]) + "\n";
		}
		
		return returnString;
	}

}
