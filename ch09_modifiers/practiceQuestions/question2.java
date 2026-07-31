package ch09_modifiers.practiceQuestions;

class Cylinder2 {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class question2 {
    public static void main(String[] args) {

        Cylinder2 c = new Cylinder2();

        c.setRadius(5);
        c.setHeight(10);

        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}
