package ch17_AdvancedJAVA.practiceQuestions;


interface Greeting {

    void sayHello();

}

public class Q3 {

    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello!");

        g.sayHello();

    }
}
