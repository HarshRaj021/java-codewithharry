package ch07_methods;

public class MethodCallDemo {
    

    static double calculateAverage(int a, int b, int c) {
        int total = a + b + c;

        double average = total / 3.0;

        return average;
    }

    public static void main(String[] args) {

        double result = calculateAverage(80, 70, 90);

        System.out.println("Average = " + result);
    }
}

    

