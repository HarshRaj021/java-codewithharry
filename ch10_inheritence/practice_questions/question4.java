package ch10_inheritence.practice_questions;



class Base{

    Base(){
        System.out.println("Base Constructor");
    }
}

class Derived1 extends Base{

    Derived1(){
        System.out.println("Derived1 Constructor");
    }
}

class Derived2 extends Derived1{

    Derived2(){
        System.out.println("Derived2 Constructor");
    }
}

public class question4 {

    public static void main(String[] args) {

        Derived2 obj = new Derived2();

    }
}