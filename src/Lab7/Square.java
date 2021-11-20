package Lab7;

public class Square extends Figure{
    public double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return length * length;
    }

    @Override
    public double getPerimeter(){
        return 4 * length;
    }
}
