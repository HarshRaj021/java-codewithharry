package ch03_strings.practiceQuestion;

public class replaceLetter {
    
    public static void main(String[] args) {
        String letter = " Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Harsh");
        System.out.println(letter);
    }
}
