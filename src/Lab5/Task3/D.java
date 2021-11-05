package Lab5.Task3;

public class D extends C {
    protected String d;
    protected X x = new X("xx");

    public D(String d)
    {
        super("ccc");
        this.d = d;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", d = " + d;
    }
}
