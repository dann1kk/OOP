package Lab8;

public class Parallelepiped implements GeometricBody{
    public double width;
    public double length;
    public double height;

    Parallelepiped(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public double getSurface(){
        return 2 * height * (width + 2 + length);
    }

    @Override
    public double getVolume(){
        return height * width * length;
    }
}
