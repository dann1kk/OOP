package Lab5.Task3;

public class E extends D {
    protected String e;
    public E(String e)
    {
        super("ddd");
        this.e = e;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", e = " + e;
    }
}
