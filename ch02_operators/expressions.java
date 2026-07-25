public class expressions {
    public static void main(String[] args) {

        double x = 10, y = 4;
        double a = 2, b = 5, c = 3, d = 4;
        double v = 10, u = 6;

        // (x - y) / 2
        double exp1 = (x - y) / 2;

        // (b² - 4ac) / 2a
        double exp2 = (b * b - 4 * a * c) / (2 * a);

        // v² - u²
        double exp3 = v * v - u * u;

        // a * b - d
        double exp4 = a * b - d;

        System.out.println("Expression 1 = " + exp1);
        System.out.println("Expression 2 = " + exp2);
        System.out.println("Expression 3 = " + exp3);
        System.out.println("Expression 4 = " + exp4);
    }
}