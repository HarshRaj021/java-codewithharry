package ch06_arrays.practiceQuestions;

public class question3 {
    public static void main(String[] args) {
        float [] marks = {1.0f, 3.0f, 5.0f, 7.0f, 9.0f};
        float sum =0;
        for (float element:marks) {
            sum = sum + element;


        }
        System.out.println("the avg is " + sum/marks.length);
    }
    
}
    

