package ch10_inheritence;
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int a){
        System.out.println("overloaded constructor with value of x as:"+ a);
    }
}

class Derived1 extends base1{
    Derived1(){
        super(1);
        System.out.println("derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("overloaded constructor b with value as:"+ y);
    }
}
public class constructorsInheritance {
    public static void main(String[] args) {
        Derived1 d = new Derived1(14,9);
    }
}
