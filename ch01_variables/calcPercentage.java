import java.util.Scanner;
public class calcPercentage {
    public static void main(String[] args) {
        System.out.println("CALCULATING PERCENTAGE OF STUDENT:");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF SUBJECT 1");
        int sub1 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUBJECT 2");
        int sub2 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUBJECT 3");
        int sub3 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUBJECT 4");
        int sub4 = sc.nextInt();
        System.out.println("ENTER MARKS OF SUBJECT 5");
        int sub5 = sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (totalMarks / 500.0f) * 100;
        System.out.println("TOTAL MARKS: " + totalMarks);
        System.out.println("PERCENTAGE: " + percentage + "%");
    }
    
}
