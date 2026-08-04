package ch14_errorsAndExceptions.practice_questions;


    import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = {10, 20, 30, 40, 50};
        int attempts = 0;

        while (attempts < 5) {

            try {
                System.out.print("Enter array index: ");
                int index = sc.nextInt();

                System.out.println("Value = " + marks[index]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index");
                attempts++;
            }
        }

        if (attempts == 5) {
            System.out.println("Error");
        }

        sc.close();
    }
}

