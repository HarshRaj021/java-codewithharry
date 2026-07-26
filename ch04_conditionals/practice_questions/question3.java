package ch04_conditionals.practice_questions;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lakhs per annum: ");
        float income = sc.nextFloat();

        if(income < 2.5){
            System.out.println("You don't have to pay tax");
        }
        else if(income >= 2.5 && income <= 5){
            System.out.println("You have to pay 5% tax");
        }
        else if(income >= 5 && income <= 10){
            System.out.println("You have to pay 20% tax");
        }
        else{
            System.out.println("You have to pay 30% tax");
        }
    }
}

        