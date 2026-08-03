package shapes;
import shapes.Rectangle;
import shapes.Square;
import shapes.Circle;
import shapes.Cylinder;
import shapes.Sphere;


public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());

        Square square = new Square(4);
        System.out.println("Square Area = " + square.area());
        System.out.println("Square Perimeter = " + square.perimeter());

        Circle circle = new Circle(7);
        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Circumference = " + circle.circumference());

        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Volume = " + cylinder.volume());
        System.out.println("Cylinder Surface Area = " + cylinder.surfaceArea());

        Sphere sphere = new Sphere(4);
        System.out.println("Sphere Volume = " + sphere.volume());
        System.out.println("Sphere Surface Area = " + sphere.surfaceArea());
    }
}