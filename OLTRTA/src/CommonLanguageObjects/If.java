package CommonLanguageObjects;

public class If extends Expression{
	public Expression ex;
    public Block bl;

    public If(Expression _ex, Block _bl) {
        ex = _ex;
        bl = _bl;
    }
}
