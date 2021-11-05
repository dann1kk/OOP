package Lab5.Task3;

public class J extends I{
    protected String j;

    public J(String j)
    {
        super("iii");
        this.j = j;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", j = " + j + ", x = " + getX().getValue();
    }
}
