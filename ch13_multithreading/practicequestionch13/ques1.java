package ch13_multithreading.practicequestionch13;
class mymessage extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
    System.out.println("Good Morning");
}
}
}
class myothermessage extends Thread{
   
    public void run(){
         for (int i= 1 ; i<=10; i++)
        System.out.println("welcome");
    }
}
public class ques1 {
    public static void main(String[] args) {
        mymessage m1 = new mymessage();
        myothermessage m2 = new myothermessage();

        m1.start();
        m2.start();
    }
    
}
