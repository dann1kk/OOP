package Lab5;

public class E extends D {
    protected String e;
    public E(String e, X x)
    {
        super("ddd", x);
        this.e = e;
    }

    public String toString()
    {
        return super.toString() + ", e = " + e;
    }
}
