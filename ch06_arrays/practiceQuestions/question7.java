package ch06_arrays.practiceQuestions;

public class question7 {// 7. Find minimum element in an array


    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 30};

        int min = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        System.out.println("Minimum = " + min);
    }
}
    

