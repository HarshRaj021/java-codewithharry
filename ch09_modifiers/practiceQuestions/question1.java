package ch09_modifiers.practiceQuestions;

class Cylinder {

    private double radius;
    private double height;

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }
}

public class question1 {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.setRadius(5);
        c.setHeight(10);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}
