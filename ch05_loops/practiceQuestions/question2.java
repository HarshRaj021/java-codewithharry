package ch05_loops.practiceQuestions;

public class question2 {
    public static void main(String[] args) {
       
        int n = 5;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + (2 * i);
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
        