package ch04_conditionals;

public class logicalOperators  {
    public static void main(String[] args) {

        int age = 21;
        boolean hasID = true;
        boolean banned = false;

        // AND
        System.out.println(age >= 18 && hasID);
        // true && true = true

        // OR
        System.out.println(age < 18 || hasID);
        // false || true = true

        // NOT
        System.out.println(!banned);
        // !false = true

        // Combined condition
        if (age >= 18 && hasID && !banned) {
            System.out.println("Entry Allowed");
        }
    }
}
    

