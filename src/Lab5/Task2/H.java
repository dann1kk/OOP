package Lab5.Task2;

public class H extends G {
    protected String h;
    private X x = new X("xlsx");

    public H(String h, X x)
    {
        super("ggg", x);
        this.h = h;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", h = " + h;
    }
}
