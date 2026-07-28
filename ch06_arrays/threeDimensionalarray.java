package ch06_arrays;

public class threeDimensionalarray {
    public static void main(String[] args) {

        int[][][] arr = new int[2][2][3];

        arr[0][0][0] = 10;
        arr[0][0][1] = 20;
        arr[0][0][2] = 30;

        arr[0][1][0] = 40;
        arr[0][1][1] = 50;
        arr[0][1][2] = 60;

        arr[1][0][0] = 70;
        arr[1][0][1] = 80;
        arr[1][0][2] = 90;

        arr[1][1][0] = 100;
        arr[1][1][1] = 110;
        arr[1][1][2] = 120;

        // Printing 3D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
    

