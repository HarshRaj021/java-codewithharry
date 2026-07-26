package ch04_conditionals.practice_questions;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the type of url: ");
    String website = sc.next();
    if(website.endsWith(".com")){
        System.out.println("This is a commercial website");
    }
    else if(website.endsWith(".org")){
        System.out.println("This is an organizational website");
    }
    else if(website.endsWith(".in")){
        System.out.println("This is an Indian website");
    }
    else{
        System.out.println("Invalid website type");
    }

    
    
}
}
