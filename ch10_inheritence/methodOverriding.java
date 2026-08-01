package ch10_inheritence;
class lion{
    void sound(){
        System.out.println("makes a roar");
    }
}
    class tiger extends lion {
        @Override
        void sound() {
            System.out.println("tiger roar");
        }
    }


public class methodOverriding {
    public static void main(String[] args) {
        tiger  t = new tiger();
            t.sound();
    }
    
}
