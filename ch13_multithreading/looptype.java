package ch13_multithreading;

public class looptype {
    static class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }

    }

}

    public static class Main {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main Thread");

    }

}
    
}
