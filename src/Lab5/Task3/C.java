package Lab5.Task3;

public class C extends B {
    protected String c;


    public C(String c)
    {
        super("bbb");
        this.c = c;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", c = " + c;
    }
}
