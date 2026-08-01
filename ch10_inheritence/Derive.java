package ch10_inheritence;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Derive{
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method
    }
}
