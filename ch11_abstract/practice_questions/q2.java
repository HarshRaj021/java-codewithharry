package ch11_abstract.practice_questions;
class monkey{
    void jump(){
          System.out.println("monkey jump");
    }
    void bite() {
          System.out.println("monkey bites");

    }
}
interface BasicAnimal {
    public void eat();
    public void sleep();
}
class human extends monkey implements BasicAnimal {
    public void speak() {
        System.out.println("speaking");
    }
    public void laugh() {
        System.out.println("laughing");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class q2 {
    public static void main(String[] args) {
        human h = new human();
        h.eat();
        h.sleep();
    }
    
}
