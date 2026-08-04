package ch14_errorsAndExceptions;


import java.util.Scanner;
public class nestedTryCatch{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] marks = new int[3];
        marks[0]= 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE INDEX OF ARRAY = ");
        int ind = sc.nextInt();

        //System.out.print("enter no u want divide value with = ");
        //int number = sc.nextInt();
        boolean flag = true;
        while(flag){
        try{
            System.out.println("welcome");
            try{
            System.out.println( marks[ind]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this index doesnt exist");
            System.out.println("exception in level 2");
        }
    }
        catch (Exception e){
            System.out.println("exception in level 1");
        }
        
    }
    System.out.println("thanks");
}
    
}

