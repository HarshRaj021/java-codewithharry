package ch11_abstract;


abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractClass {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();

    }
}