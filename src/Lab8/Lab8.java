package Lab8;

import java.util.stream.Stream;

public class Lab8 {
    public static void main(String[] args){
        GeometricBody[] bodies = new GeometricBody[]{
                new Cube(7.5),
                new Sphere(5.5),
                new Parallelepiped(8, 7, 12),
        };

        GeometricBody max   = getMaxVolume(bodies);
        System.out.println("The object " +  getMaxVolume(bodies).getClass().getSimpleName().toLowerCase() + " has the biggest volume: " + max.getVolume());

        max = getMaxSurface(bodies);
        System.out.println("The object " +  getMaxSurface(bodies).getClass().getSimpleName().toLowerCase() + " has the biggest surface: " + max.getSurface());

    }
    static GeometricBody getMaxVolume(GeometricBody[] objs){
        return Stream.of(objs).max((obj1, obj2) -> obj1.getVolume() - obj2.getVolume() > 0 ? 1 : -1).get();
    }

    static GeometricBody getMaxSurface(GeometricBody[] objs){
        return Stream.of(objs).max((obj1, obj2) -> obj1.getSurface() - obj2.getSurface() > 0 ? 1 : -1).get();
    }
}
