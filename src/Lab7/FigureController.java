package Lab7;

import java.util.Arrays;

public class FigureController {
    public static Figure getMaxAreaFigure(Figure[] figures) {
        return Arrays.stream(figures).max((fig1, fig2) -> ((fig1.getArea() - fig2.getArea()) > 0) ? 1 : -1).get();
    }

    public static Figure getMaxPerimeterFigure(Figure[] figures) {
        return Arrays.stream(figures).max((fig1, fig2) -> ((fig1.getPerimeter() - fig2.getPerimeter()) > 0) ? 1 : -1).get();
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(6,8);
        figures[1] = new Square(6.5);
        figures[2] = new Triangle(7, 9, 11);
        figures[3] = new Square(2.5);

        Figure max   = getMaxAreaFigure(figures);
        System.out.println("Max Area: " + max.getArea());

        max = getMaxPerimeterFigure(figures);
        System.out.println("Max Perimeter: " + max.getPerimeter());

        var circle = new Figure() {
            final double radius = 5;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }
        };

        System.out.println("\nCirce area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        figures[3] = circle;

        max = getMaxAreaFigure(figures);
        System.out.println("\n Max area: " + max.getArea());

        max = getMaxPerimeterFigure(figures);
        System.out.println("Max perimeter: " + max.getPerimeter());

    }
}
