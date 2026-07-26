package ch04_conditionals;

import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        System.out.print("ENTER YOUR AGE:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
        }
    }
    
}
