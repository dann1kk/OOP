package Lab5.Task2;

public class J extends I {
    protected String j;

    public J(String j, X x)
    {
        super("iii", x);
        this.j = j;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", j = " + j;
    }
}
