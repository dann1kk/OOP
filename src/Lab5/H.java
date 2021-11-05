package Lab5;

public class H extends G {
    protected String h;
    private X x = new X("xlsx");

    public H(String h, X x)
    {
        super("ggg", x);
        this.h = h;
    }

    public String toString()
    {
        return super.toString() + ", h = " + h;
    }
}
