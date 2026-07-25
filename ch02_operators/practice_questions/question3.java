import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        int a = 10;
    
        System.out.print("ENTER A NUMBER:");
        Scanner num  = new Scanner(System.in);
        int enteredNumber = num.nextInt();
        if (enteredNumber >= a) {
            System.out.println(" ENTERED NUMBER IS GREATER THAN 10");
        } 
    }
    
}
