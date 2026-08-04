package ch14_errorsAndExceptions;
class  NegativeRadiusException extends Exception{
    public String toString()
{
    return "radius cant be negative";
}
public String getMesaage(){
    return "radius cant be negative";
}
}

public class throwsVsthrow {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            //int c = divide(7,8);
            //System.out.println(c);
            double ar = area(6);
        } 
        catch(Exception e){
        System.out.println("exception");
            // no cleanup needed
        }
    }
    
}
