package ch08_oops;

public class Abstraction {
   static abstract class Animal {
    abstract void sound();
}

static class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public static class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
}