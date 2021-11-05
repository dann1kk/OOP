package Lab5.Task3;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String a)
    {
        this.a = a;
    }
    @Override
    public String toString()
    {
        return "a = " + a ;
    }
}
