package ch07_methods;

import java.util.Scanner;

public class variableArgs {
    
   



    static int add(int... numbers) { //static int add(int .... numbers) <----- var ags
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Sum = " + add(numbers));

        sc.close();
    }
}

