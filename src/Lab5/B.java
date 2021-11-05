package Lab5;

public class B extends A {
    protected String b;

    public B(String b, X x)
    {
        super("aaa", x);
        this.b = b;
    }

    public String toString()
    {
        return super.toString() + ", b = " + b;
    }
}
