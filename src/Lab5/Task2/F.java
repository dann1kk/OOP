package Lab5.Task2;

public class F extends E {
    protected String f;
    public F(String f, X x)
    {
        super("eee", x);
        this.f = f;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", f = " + f;
    }
}
