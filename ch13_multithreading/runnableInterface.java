package ch13_multithreading;
class threadrun implements Runnable{
    public void run(){
        for (int i = 0;i<20;i++)
        System.out.println("i am not a threat");
    }

}
class threadrun2 implements Runnable{
   
    public void run(){
        for (int i = 0;i<20;i++)
           
        System.out.println("i am a threat" );
    }
    
}

public class runnableInterface {
    public static void main(String[] args) {
   
        threadrun bullet1 = new threadrun();
        Thread gun1 = new Thread(bullet1);
        threadrun2 bullet2 = new threadrun2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
        
    }
    
}
