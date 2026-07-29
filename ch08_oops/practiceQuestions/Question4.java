package ch08_oops.practiceQuestions;

public class Question4 {
    static class Rectangle {

    int length;
    int breadth;

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }
}

public static class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}
}