package ch04_conditionals.practice_questions;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        s1 = sc.nextInt();
        System.out.print("Enter marks of subject 1: ");
        s2 = sc.nextInt();
        System.out.print("Enter marks of subject 1: ");
        s3 = sc.nextInt();
        
        float avg =( s1 + s2 + s3)/3;
        if(avg >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

    }
    
}
