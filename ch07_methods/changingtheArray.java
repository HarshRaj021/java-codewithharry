package ch07_methods;

public class changingtheArray {
    static void change(int [] arr) {
        arr [0] = 98;
    }
    public static void main(String[] args) {
        int [] marks = {52,73,88,46,69};
        change(marks);
        System.out.println("value of x after change is :"+ marks[0]);
        
    }
}
