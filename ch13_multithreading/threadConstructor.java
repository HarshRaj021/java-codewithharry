package ch13_multithreading;

class mythr extends Thread{
    public mythr(String name){
    super(name);
}
public void run(){
    int i = 20;
   System.out.println("thank u");
    }
}


public class threadConstructor {
    public static void main(String[] args) {
        mythr t = new mythr("harsh");
         mythr t2 = new mythr("MESSI");
        t.start();
        t2.start();
        System.out.println("id of a thread " + t.getId());
        System.out.println("id of a thread " + t.getName());
         System.out.println("id of a thread " + t2.getId());
        System.out.println("id of a thread " + t2.getName());
    }

    
}
