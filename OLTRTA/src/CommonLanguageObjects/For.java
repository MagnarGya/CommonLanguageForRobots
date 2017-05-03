package CommonLanguageObjects;

public class For extends Expression{
	public Expression init;
    public Expression check;
    public Expression action;
    public Block bl;

    public For(Expression _init, Expression _check, Expression _action, Block _bl) {
        init = _init;
        check = _check;
        action = _action;
        bl = _bl;
    }
}
