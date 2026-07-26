package ch03_strings.practiceQuestion;

public class noofSpaces {
    public static void main(String[] args) {
        String myString = "This string contains  double and triple spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
    
}
