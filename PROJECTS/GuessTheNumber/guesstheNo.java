package PROJECTS.GuessTheNumber;


    import java.util.Random;
import java.util.Scanner;

class Game {

    private int number;
    private int userInput;
    private int noOfGuesses = 0;

    // Constructor
    Game() {
        Random random = new Random();
        number = random.nextInt(100) + 1;
    }

    // Take user input
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        userInput = sc.nextInt();
        noOfGuesses++;
    }

    // Check guess
    boolean isCorrectNumber() {

        if (userInput == number) {
            System.out.println("Correct!");
            return true;
        } 
        else if (userInput < number) {
            System.out.println("Too low!");
        } 
        else {
            System.out.println("Too high!");
        }

        return false;
    }

    int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class guesstheNo {

    public static void main(String[] args) {

        Game game = new Game();

        while (!game.isCorrectNumber()) {
            game.takeUserInput();
        }

        System.out.println("Guesses: " + game.getNoOfGuesses());
    }
}
    

