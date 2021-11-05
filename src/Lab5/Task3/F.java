package Lab5.Task3;

public class F extends E {
    protected String f;
    public F(String f)
    {
        super("eee");
        this.f = f;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", f = " + f;
    }
}
