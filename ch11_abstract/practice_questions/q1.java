package ch11_abstract.practice_questions;
abstract class pen {
     abstract void write();
     abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing nib");

    }
}
public class q1 {
    public static void main(String[] args) {
        FountainPen pp = new FountainPen();
        pp.refill();
        pp.write();
        pp.changeNib();
    }
    
}
