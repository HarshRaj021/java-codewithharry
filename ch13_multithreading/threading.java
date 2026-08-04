package ch13_multithreading;

class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("my cooking thread is runing ");
            System.out.println("i am happy");
            i++;
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("thread 2 is ruuning");
            System.out.println("i m sad");
            i++;
        }
    }
}

public class threading {
    public static void main(String[] args) {
        MyThread y1 = new MyThread();
        MyThread1 y2 = new MyThread1();
        y1.start();
        y2.start();
    }
}

