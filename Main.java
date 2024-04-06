import geometry.*;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(5.0, 4.7);

        ColoredCircle coloredCircle = new ColoredCircle(center, 5, "red");

        System.out.println("Center: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor());
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter());
    }
}
