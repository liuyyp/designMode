package designMode.a17_Interpreter;

public class TerminalExpression extends AbstractExpression
{
    private final int i;

    public TerminalExpression(final int i)
    {
        this.i = i;
    }

    @Override
    public int interpreter(final Context context)
    {
        return this.i;
    }

}