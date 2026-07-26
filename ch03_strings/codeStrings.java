package ch03_strings;

public class codeStrings {
    public static void main(String[] args) {

        String name = "Harsh Raj";

        System.out.println(name);

        // Length
        System.out.println(name.length());

        // Uppercase
        System.out.println(name.toUpperCase());

        // Lowercase
        System.out.println(name.toLowerCase());

        // Character at index
        System.out.println(name.charAt(0));

        // Find position
        System.out.println(name.indexOf("Raj"));

        // Part of String
        System.out.println(name.substring(6));

        // Replace
        System.out.println(name.replace("Raj", "Kumar"));
    }
}
    

