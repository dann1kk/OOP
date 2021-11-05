package Lab5.Task2;

public class C extends B {
    protected String c;


    public C(String c, X x)
    {
        super("bbb", x);
        this.c = c;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", c = " + c;
    }
}
