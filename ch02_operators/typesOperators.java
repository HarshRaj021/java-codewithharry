public class typesOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic:");
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1


        // 2. Assignment Operators
        System.out.println("\nAssignment:");

        int x = 10;

        x += 5; // x = x + 5
        System.out.println(x); // 15

        x -= 2;
        System.out.println(x); // 13

        x *= 2;
        System.out.println(x); // 26

        x /= 2;
        System.out.println(x); // 13

        x %= 5;
        System.out.println(x); // 3


        // 3. Comparison Operators
        System.out.println("\nComparison:");

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false


        // 4. Logical Operators
        System.out.println("\nLogical:");

        boolean p = true;
        boolean q = false;

        System.out.println(p && q); // false
        System.out.println(p || q); // true
        System.out.println(!p);     // false


        // 5. Increment / Decrement
        System.out.println("\nIncrement Decrement:");

        int num = 5;

        num++;
        System.out.println(num); // 6

        num--;
        System.out.println(num); // 5


        // 6. Pre-increment and Post-increment
        System.out.println("\nPre/Post Increment:");

        int n = 5;

        System.out.println(n++); // 5
        System.out.println(n);   // 6

        System.out.println(++n); // 7


        // 7. Bitwise Operators
        System.out.println("\nBitwise:");

        int m = 5; // 0101
        int k = 3; // 0011

        System.out.println(m & k);  // 1
        System.out.println(m | k);  // 7
        System.out.println(m ^ k);  // 6
        System.out.println(~m);     // -6


        // 8. Shift Operators
        System.out.println("\nShift:");

        System.out.println(5 << 1);  // 10
        System.out.println(5 >> 1);  // 2


        // 9. Ternary Operator
        System.out.println("\nTernary:");

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);
    }
}