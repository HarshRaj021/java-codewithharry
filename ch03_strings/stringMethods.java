package ch03_strings;

public class stringMethods {
    public static void main(String[] args) {

        String name = "  Harsh Raj  ";

        // 1. length() - total characters
        System.out.println(name.length());

        // 2. toLowerCase()
        System.out.println(name.toLowerCase());

        // 3. toUpperCase()
        System.out.println(name.toUpperCase());

        // 4. trim() - starting/ending spaces remove
        System.out.println(name.trim());

        // Clean string for examples below
        String str = "Harsh Raj";

        // 5. charAt() - character at given index
        System.out.println(str.charAt(0));      // H

        // 6. indexOf() - position find
        System.out.println(str.indexOf("Raj")); // 6

        // 7. substring() - part of string
        System.out.println(str.substring(6));   // Raj
        System.out.println(str.substring(0, 5));// Harsh

        // 8. replace()
        System.out.println(str.replace("Raj", "Kumar")); // Harsh Kumar

        // 9. startsWith()
        System.out.println(str.startsWith("Har")); // true

        // 10. endsWith()
        System.out.println(str.endsWith("Raj"));   // true

        // 11. equals()
        System.out.println(str.equals("Harsh Raj")); // true

        // 12. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("HARSH RAJ")); // true

        // 13. contains()
        System.out.println(str.contains("Raj")); // true

        // 14. isEmpty()
        System.out.println(str.isEmpty()); // false
    }
}
    

