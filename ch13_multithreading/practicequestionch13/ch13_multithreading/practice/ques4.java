package ch13_multithreading.practicequestionch13.ch13_multithreading.practice;

class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class ques4 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println("Before start: " + t1.getState());

        t1.start();

        System.out.println("After start: " + t1.getState());
    }
}