package Lab5.Task2;

public class B extends A {
    protected String b;

    public B(String b, X x)
    {
        super("aaa", x);
        this.b = b;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", b = " + b;
    }
}
