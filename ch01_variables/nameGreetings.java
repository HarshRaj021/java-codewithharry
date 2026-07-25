import java.util.Scanner;
public class nameGreetings {
    public static void main(String[] args) {
        System.out.println("WHAT IS YOUR NAME?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("HELLO " + name + " WELCOME TO JAVA");
    }
    
}
