package ch14_errorsAndExceptions;
import java.util.Scanner;
class myexception extends Exception{
    public String toString(){
        return /*5super.toString()+ */"i am toString()";
    }

    public String getMessage() {
        return /*super.getMessage() +*/  " i am get";
    }
}
public class exceptionClass {
    public static void main(String[] args) {
     int a ;
     Scanner sc = new Scanner(System.in);
     a= sc.nextInt();
     if(a<99){
        try{
        //throw new myexception();
        throw new ArithmeticException("this is an exception");
     }
     catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println("done");
     }
     System.out.println("not done");
    }
    
}
}