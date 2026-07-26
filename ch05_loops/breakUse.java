package ch05_loops;
public class breakUse {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
    
}
