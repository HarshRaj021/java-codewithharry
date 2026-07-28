package ch07_methods.practicequestion;

public class practiceQuestion2 {

    static void pattern(int n) {

        // Increasing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

        // Decreasing
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(20);
    }
}

