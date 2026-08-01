package ch10_inheritence.practice_questions;



class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {

    double height;

    Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class question2 {

    public static void main(String[] args) {

        Cuboid c = new Cuboid(4,5,6);

        System.out.println("Area = " + c.area());
        System.out.println("Volume = " + c.volume());

    }
}
