package ch13_multithreading.practicequestionch13.ch13_multithreading.practice;

public class ques5 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current Thread: " + t);
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());
        System.out.println("Thread State: " + t.getState());
    }
}
