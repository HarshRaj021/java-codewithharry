package ch06_arrays.practiceQuestions;
import java.util.Scanner;


public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    float [] marks = {1.0f, 3.0f, 5.0f, 7.0f, 9.0f};

    System.out.print("ENTER YOUR NUMBER: ");
    float num = sc.nextFloat();

    boolean found = false;
    for(float element: marks) {
        if(element == num) {
            found = true;
            break;
        }
    }

    if(found) {
        System.out.println("Number is present");
    } else {
        System.out.println("Number is not present");
    }

    sc.close();
  }
}


