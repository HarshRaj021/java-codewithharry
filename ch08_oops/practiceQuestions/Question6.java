package ch08_oops.practiceQuestions;
class TommyVecetti {

    void hit() {
        System.out.println("Tommy is hitting...");
    }

    void run() {
        System.out.println("Tommy is running...");
    }

    void fire() {
        System.out.println("Tommy is firing...");
    }
}
public class Question6 {
     public static void main(String[] args) {

        TommyVecetti tommy = new TommyVecetti();

        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}


