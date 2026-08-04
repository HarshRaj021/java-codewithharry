package ch13_multithreading;


    class MyThread56 extends Thread {

    public MyThread56(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running");
        }
    }
}

public class threadPriority {

    public static void main(String[] args) {

        MyThread56 t1 = new MyThread56("Low Priority");
        MyThread56 t2 = new MyThread56("Normal Priority");
        MyThread56 t3 = new MyThread56("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
    

