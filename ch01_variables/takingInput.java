import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("TAKING INPUT FROM USER:");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        int a = sc.nextInt();
        System.out.println("ENTER NUMBER 2");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("ENTER NUMBER 2");
        System.out.println(sum);
    }
}