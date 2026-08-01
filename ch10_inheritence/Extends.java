package ch10_inheritence;

class base{
    int x;

    public int getX() {
        return x;
    }
public void setX(int x){
    System.out.println("i am setting x now");
    this.x = x;
}

public void printMe(){
    System.out.println("I AM A CONSTRUCTOR");
}

}
class Derived extends base{
    int y;

    public int getY(){
        return y; 
        }

        public void setY(int y){
            this.y = y;
        }
    }


public class Extends {
    public static void main(String[] args){
        Derived b = new Derived();
        b.setX(7);
        System.out.println(b.getX());
        

    }

   
}
