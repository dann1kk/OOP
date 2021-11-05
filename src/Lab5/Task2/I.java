package Lab5.Task2;

public class I extends H {
    protected String i;

    public I(String i, X x)
    {
        super("hhh", x);
        this.i = i;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", i = " + i;
    }
}
