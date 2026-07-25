public class precedenceAssociativity {
    public static void main(String[] args) {

        // 1. Precedence
        int a = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + a);
        // * executes first
        // 10 + 10 = 20


        // 2. Parentheses change precedence
        int b = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + b);
        // 15 * 2 = 30


        // 3. Left to Right Associativity
        int c = 20 / 5 * 2;
        System.out.println("20 / 5 * 2 = " + c);
        // / and * have same precedence
        // Left to Right
        // 20 / 5 = 4
        // 4 * 2 = 8


        // 4. Another Left to Right example
        int d = 20 - 5 + 2;
        System.out.println("20 - 5 + 2 = " + d);
        // 20 - 5 = 15
        // 15 + 2 = 17


        // 5. Right to Left Associativity
        int x, y, z;

        x = y = z = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        // Assignment works Right to Left
        // z = 10
        // y = 10
        // x = 10
    }
}