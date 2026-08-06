
package ch17_AdvancedJAVA;

interface Greeting {
    void sayHello();
}

public class lambda {

    public static void main(String[] args) {

        // Anonymous Class
        Greeting g1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        // Lambda Expression
        Greeting g2 = () -> System.out.println("Hello from Lambda");

        g1.sayHello();
        g2.sayHello();
    }
}
    

