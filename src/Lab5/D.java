package Lab5;

public class D extends C {
    protected String d;
    protected X x = new X("xx");

    public D(String d, X x)
    {
        super("ccc", x);
        this.d = d;
    }

    public String toString()
    {
        return super.toString() + ", d = " + d;
    }
}
