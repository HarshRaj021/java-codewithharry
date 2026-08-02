package ch11_abstract.practice_questions;

class Monkey {

    void jump() {
        System.out.println("Monkey Jump");
    }

    void bite() {
        System.out.println("Monkey Bite");
    }
}

interface BasicAnimal {

    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class q4 {

    public static void main(String[] args) {

        Monkey m = new Human();

        m.jump();
        m.bite();

        // m.eat();  // Not Allowed
        // m.sleep(); // Not Allowed
    }
}