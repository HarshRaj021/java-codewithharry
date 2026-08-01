package projectRockPaperScissors;


import java.util.Scanner;
import java.util.Random;

public class projectrockpaperscissiors  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("0 = Rock");
        System.out.println("1 = Paper");
        System.out.println("2 = Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        // Computer randomly chooses 0, 1, or 2
        int computer = random.nextInt(3);

        if (user < 0 || user > 2) {
            System.out.println("Invalid choice!");
        }
        else {
            System.out.println("Computer chose: " + computer);

            // Draw
            if (user == computer) {
                System.out.println("It's a Draw!");
            }

            // User wins
            else if ((user == 0 && computer == 2) ||
                     (user == 1 && computer == 0) ||
                     (user == 2 && computer == 1)) {

                System.out.println("You Win!");
            }

            // Otherwise computer wins
            else {
                System.out.println("Computer Wins!");
            }
        }

        sc.close();
    }
}
    

