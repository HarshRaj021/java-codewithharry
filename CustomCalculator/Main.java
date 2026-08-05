package CustomCalculator;



import java.util.InputMismatchException;
import java.util.Scanner;

// ---------- Custom Exceptions ----------

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierException extends Exception {
    public MaxMultiplierException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

// ---------- Calculator Class ----------

class Calculator {

    public double calculate(int choice, double a, double b)
            throws InvalidInputException,
            MaxInputException,
            MaxMultiplierException,
            CannotDivideByZeroException {

        // Invalid Input
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException("8 and 9 are not allowed.");
        }

        // Max Input
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input cannot be greater than 100000.");
        }

        switch (choice) {

            case 1:
                return a + b;

            case 2:
                return a - b;

            case 3:
                if (a > 7000 || b > 7000) {
                    throw new MaxMultiplierException(
                            "For multiplication, inputs cannot exceed 7000.");
                }
                return a * b;

            case 4:
                if (b == 0) {
                    throw new CannotDivideByZeroException(
                            "Cannot divide by zero.");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid Choice.");
        }
    }
}

// ---------- Main Class ----------

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        try {

            System.out.println("===== CUSTOM CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter First Number: ");
            double a = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            double b = sc.nextDouble();

            double result = cal.calculate(choice, a, b);

            System.out.println("Result = " + result);

        }

        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        catch (MaxInputException e) {
            System.out.println(e.getMessage());
        }

        catch (MaxMultiplierException e) {
            System.out.println(e.getMessage());
        }

        catch (CannotDivideByZeroException e) {
            System.out.println(e.getMessage());
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers.");
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Calculator Closed.");
        }
    }
}
