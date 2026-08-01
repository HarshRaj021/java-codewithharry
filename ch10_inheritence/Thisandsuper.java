package ch10_inheritence;
class BaseAnimal {

    String name = "Animal";

    BaseAnimal() {
        System.out.println("Animal constructor");
    }
}

class Puppy extends BaseAnimal {

    String name = "Dog";

    Puppy() {
        super();   // parent constructor call
        System.out.println("Dog constructor");
    }

    void show() {
        System.out.println(this.name);   // Dog
        System.out.println(super.name);  // Animal
    }
}

public class Thisandsuper {

    public static void main(String[] args) {

        Puppy d = new Puppy();
        d.show();
    }
}
