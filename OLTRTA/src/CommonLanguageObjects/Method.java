package CommonLanguageObjects;

public class Method {
	public String type;
    public String name;
    public Parameter[] parameters;
    public Block bl;

    public Method(String _type, String _name, Parameter[] _parameters, Block _bl) {
        type = _type;
        name = _name;
        parameters = _parameters;
        bl = _bl;
    }

    public Method(String _type, String _name, Block _bl) {
        type = _type;
        name = _name;
        parameters = null;
        bl = _bl;
    }

    public Method() {

    }
}
