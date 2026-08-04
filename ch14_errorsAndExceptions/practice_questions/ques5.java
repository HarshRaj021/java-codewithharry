package ch14_errorsAndExceptions.practice_questions;


    import java.util.Scanner;

class MaxRetriesException extends Exception {

    public MaxRetriesException(String message) {
        super(message);
    }
}
public class ques5 {

    static void accessArray() throws MaxRetriesException {

        Scanner sc = new Scanner(System.in);

        int[] marks = {10, 20, 30, 40, 50};
        int attempts = 0;

        while (attempts < 5) {

            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                System.out.println("Value = " + marks[index]);
                sc.close();
                return;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index");
                attempts++;
            }
        }

        sc.close();
        throw new MaxRetriesException("Maximum retries reached");
    }

    public static void main(String[] args) {

        try {
            accessArray();
        }
        catch (MaxRetriesException e) {
            System.out.println(e.getMessage());
        }
    }
}

