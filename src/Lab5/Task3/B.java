package Lab5.Task3;

public class B extends A {
    protected String b;

    public B(String b)
    {
        super("aaa");
        this.b = b;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", b = " + b;
    }
}
