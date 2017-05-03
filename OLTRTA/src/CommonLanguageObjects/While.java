package CommonLanguageObjects;

public class While extends Expression{
	public Expression ex;
    public Block bl;

    public While(Expression _ex, Block _bl) {
        ex = _ex;
        bl = _bl;
    }
}
