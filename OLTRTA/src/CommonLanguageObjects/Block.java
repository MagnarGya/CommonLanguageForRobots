package CommonLanguageObjects;

public class Block extends Expression{
	public Expression[] exs;

    public Block(Expression[] _exs) {
        exs = _exs;
    }
}
