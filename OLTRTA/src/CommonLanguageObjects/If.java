package CommonLanguageObjects;

public class If extends Expression{
	public Expression ex;
    public Block bl;
    public Else el;
    
    public If(Expression _ex, Block _bl, Else _el) {
        ex = _ex;
        bl = _bl;
        el = _el;
    }
}
