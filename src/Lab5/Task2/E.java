package Lab5.Task2;

public class E extends D {
    protected String e;
    public E(String e, X x)
    {
        super("ddd", x);
        this.e = e;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", e = " + e;
    }
}
