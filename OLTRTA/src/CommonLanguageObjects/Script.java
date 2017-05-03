package CommonLanguageObjects;

public class Script {
	public Expression[] header;
    public Method[] body;

    public Script() {
        header = null;
        body = null;
    }

    public Script(Expression[] _header, Method[] _body) {
        header = _header;
        body = _body;
    }
}
