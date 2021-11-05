package Lab5.Task3;

public class G extends F {
    protected String g;
    public G(String g)
    {
        super("fff");
        this.g = g;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", g = " + g;
    }
}
