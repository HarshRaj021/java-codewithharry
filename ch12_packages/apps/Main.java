package ch12_packages.apps;

import ch12_packages.maths.Calculator;
import ch12_packages.maths.ScientificCalculator;
import ch12_packages.greetings.Greeting;


public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.add(10,20);

        ScientificCalculator sc = new ScientificCalculator();
        sc.square(5);

        Greeting g = new Greeting();
        g.hello();
}
}