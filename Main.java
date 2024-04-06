import geometry.*;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);

        Circle circle = new Circle(center, 5);

        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
