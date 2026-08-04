package ch14_errorsAndExceptions;

public class tryCatchblock {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("result is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            //System.out.println(e);
        }

        System.out.println("program ended");

    }
}