import geometry.*;

public class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 5);
        circles[1] = new ColoredCircle(new Point(5, 20), 9, "red");

        for (Circle circle : circles) {
            System.out.println("The area of the circle [radius = " + circle.getRadius() + "]: ");
            System.out.println("Area: " + circle.calculateArea());

            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Color: " + color);
            }
        }
    }
}
