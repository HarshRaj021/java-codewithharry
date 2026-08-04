package ch14_errorsAndExceptions;

public class logicalErrors {

    public static void main(String[] args) {

        int length = 10;
        int breadth = 9;

        // Wrong Formula
        int area = 2 * (length + breadth);
        System.out.println("Area = " + area);

    }
}
