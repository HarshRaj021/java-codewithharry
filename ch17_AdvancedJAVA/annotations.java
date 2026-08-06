package ch17_AdvancedJAVA;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }

    @Deprecated
    void oldMethod() {
        System.out.println("This is an old method.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

@SuppressWarnings("deprecation")
public class annotations {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();        // @Override

        d.oldMethod();    // @Deprecated
    }
}