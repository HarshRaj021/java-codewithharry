package ch06_arrays.practiceQuestions;

public class question6 {
    // 6. Find maximum element in an array

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 30};

        int max = arr[0];

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("Maximum = " + max);
    }
}
    

