package shapes;

public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}