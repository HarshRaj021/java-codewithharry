package ch13_multithreading.practicequestionch13.ch13_multithreading;
class mymessage extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
    System.out.println("Good Morning");
}
}
}
class myothermessage55 extends Thread{
   
    public void run(){
         for (int i= 1 ; i<=10; i++)
        System.out.println("welcome");
     try {
                Thread.sleep(200);   // Delay of 200 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
    }
}
public class ques2 {
    public static void main(String[] args) {
        mymessage m1 = new mymessage();
        myothermessage55 m2 = new myothermessage55();

        m1.start();
        m2.start();
    }
    
}
}


