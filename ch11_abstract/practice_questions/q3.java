package ch11_abstract.practice_questions;

abstract class Telephone {

    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    public void ring() {
        System.out.println("Ringing...");
    }

    public void lift() {
        System.out.println("Call Picked");
    }

    public void disconnect() {
        System.out.println("Call Ended");
    }

    public void camera() {
        System.out.println("Opening Camera");
    }
}

public class q3 {

    public static void main(String[] args) {

        Telephone t = new SmartTelephone();

        t.ring();
        t.lift();
        t.disconnect();
    }
}
