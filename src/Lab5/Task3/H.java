package Lab5.Task3;

public class H extends G {
    protected String h;
    private X x = new X("xlsx");

    public H(String h)
    {
        super("ggg");
        this.h = h;
    }
    protected X getX(){
        return x;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", h = " + h;
    }
}
