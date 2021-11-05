package Lab5.Task2;

public class A {
    protected String a;
    public X x;
    public A(String a, X x)
    {
        this.a = a;
        this.x = x;
    }
@Override
    public String toString()
    {
        return "a = " + a + ", x = " + x.getValue() ;
    }
}
