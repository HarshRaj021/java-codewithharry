package ch14_errorsAndExceptions.practice_questions;

public class ques2 {
    

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Haha");
        }

        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
    }
}

