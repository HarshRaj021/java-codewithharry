package ch11_abstract.practice_questions;

interface TVRemote {

    void on();

    void off();
}

class TV implements TVRemote {

    public void on() {
        System.out.println("TV ON");
    }

    public void off() {
        System.out.println("TV OFF");
    }
}

public class q5 {

    public static void main(String[] args) {

        TV t = new TV();

        t.on();
        t.off();
    }
}
