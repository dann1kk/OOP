package Lab7;

public class Rectangle extends Figure {
    public double width, length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }
}
