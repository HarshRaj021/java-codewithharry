package ch13_multithreading.practicequestionch13.ch13_multithreading.practice;

class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class ques3 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setPriority(2);
        t2.setPriority(8);

        System.out.println("Thread 1 Priority = " + t1.getPriority());
        System.out.println("Thread 2 Priority = " + t2.getPriority());

        t1.start();
        t2.start();
    }
}