import java.util.Scanner;
public class kmTomiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter distance in km:");
        double kilometer = sc.nextDouble();
         
        double miles = kilometer * 0.621371;
        System.out.println("distance in miles: " + miles);
    }
    
}
