package ch14_errorsAndExceptions;
import java.util.Scanner;
public class handlingException {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] marks = new int[3];
        marks[0]= 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE INDEX OF ARRAY = ");
        int ind = sc.nextInt();

        System.out.print("enter no u want divide value with = ");
        int number = sc.nextInt();
        try{
            System.out.println("value of array at index = "+ marks[ind])  ;
            System.out.println("value of array value/nymber is"+ marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("some arithemetic exception occured");
        }
       
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsExceptionoccured");
        }
         catch (Exception e){
            System.out.println("some exception occured");
        }
        }
    }
    

