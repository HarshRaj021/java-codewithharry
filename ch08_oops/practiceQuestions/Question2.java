package ch08_oops.practiceQuestions;
class cellPhone{
    public void ring(){
        System.out.println("your phone linging");

    }
    public void vibrate(){
        System.out.println("your phone vibrating");
    }
}
public class Question2 {
    public static void main(String[] args) {
        cellPhone poco = new cellPhone();
        poco.ring();
        poco.vibrate();
    }
    
}
