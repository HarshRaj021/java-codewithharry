package ch05_loops.practiceQuestions;

public class question6 {
    public static void main(String[] args) {
        
    

        int n = 5;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }
}