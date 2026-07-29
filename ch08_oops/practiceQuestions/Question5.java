package ch08_oops.practiceQuestions;

public class Question5 {
    static class Circle {

        double radius;

        double area() {
            return Math.PI * radius * radius;
        }

        double circumference() {
            return 2 * Math.PI * radius;
        }
    }

    public static class Main {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 5;

        System.out.println("Area = " + c.area());
        System.out.println("Circumference = " + c.circumference());
    }
}
    
}
