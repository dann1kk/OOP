package Lab5.Task2;

public class G extends F {
    protected String g;
    public G(String g, X x)
    {
        super("fff", x);
        this.g = g;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", g = " + g;
    }
}
