package ch05_loops.practiceQuestions;

public class question8 {
    public static void main(String[] args) {

        int i = 4;

        while (i >= 1) {

            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
    

