package ch13_multithreading;



class MyThread98 extends Thread {

    public MyThread98(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Current Thread : " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000);   // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println(getName() + " Finished");
    }
}

public class threadMethods {

    public static void main(String[] args) throws InterruptedException {

        MyThread98 t1 = new MyThread98("Download");
        MyThread98 t2 = new MyThread98("Upload");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + " Priority = " + t1.getPriority());
        System.out.println(t2.getName() + " Priority = " + t2.getPriority());

        System.out.println("Before Start : " + t1.isAlive());

        t1.start();
        t2.start();

        System.out.println("After Start : " + t1.isAlive());

        t1.join();     // Wait for t1 to finish

        System.out.println("Download Thread Completed");

        t2.join();     // Wait for t2

        System.out.println("All Threads Finished");
    }
}