package ch05_loops.practiceQuestions;

public class question3 {
    
    public static void main(String[] args) {

        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (2 * i);
        }

        System.out.println("Sum = " + sum);
    }
}