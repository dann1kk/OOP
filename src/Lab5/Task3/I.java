package Lab5.Task3;

public class I extends H{
    protected String i;

    public I(String i)
    {
        super("hhh");
        this.i = i;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", i = " + i;
    }
}
