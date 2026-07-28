package ch07_methods.practicequestion;

public class practiceQuestion3 {
    static int sumRec(int n ){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);

    }
    public static void main(String[] args) {
        int c = sumRec(6);
        System.out.println(c);
    }
    
}
