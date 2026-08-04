package ch14_errorsAndExceptions.practice_questions;

public class ques1 {
  

    public static void main(String[] args) {

        // ---------------- Syntax Error ----------------
        // int x = 10      // Missing ; (Uncomment to see syntax error)

        // ---------------- Logical Error ----------------
        int length = 10;
        int breadth = 5;

        int area = 2 * (length + breadth);   // Wrong Formula
        System.out.println("Logical Error Output = " + area);

        // Correct Formula
        System.out.println("Correct Area = " + (length * breadth));

        // ---------------- Runtime Error ----------------
        int a = 10;
        int b = 0;

        System.out.println(a / b);   // ArithmeticException
    }
}

