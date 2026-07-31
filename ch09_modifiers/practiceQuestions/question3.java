package ch09_modifiers.practiceQuestions;

class Cylinder3 {

    private double radius;
    private double height;

    // Constructor
    Cylinder3(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

public class question3 {

    public static void main(String[] args) {

        Cylinder3 c = new Cylinder3(5, 10);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}