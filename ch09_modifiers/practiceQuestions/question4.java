package ch09_modifiers.practiceQuestions;

class Rectangle4 {

    private int length;
    private int breadth;

    // Default constructor
    Rectangle4() {
        length = 4;
        breadth = 5;
    }

    // Parameterized constructor
    Rectangle4(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class question4 {

    public static void main(String[] args) {

        Rectangle4 r1 = new Rectangle4();

        Rectangle4 r2 = new Rectangle4(10, 20);

        System.out.println("Default Rectangle:");
        System.out.println("Length: " + r1.getLength());
        System.out.println("Breadth: " + r1.getBreadth());

        System.out.println("Custom Rectangle:");
        System.out.println("Length: " + r2.getLength());
        System.out.println("Breadth: " + r2.getBreadth());
    }
}