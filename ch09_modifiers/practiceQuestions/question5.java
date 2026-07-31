package ch09_modifiers.practiceQuestions;

class Sphere5 {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class question5 {

    public static void main(String[] args) {

        Sphere5 s = new Sphere5();

        s.setRadius(5);

        System.out.println("Radius: " + s.getRadius());
    }
}