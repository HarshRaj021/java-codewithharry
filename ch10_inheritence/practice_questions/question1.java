package ch10_inheritence.practice_questions;
class circle{
    public int radius;

    circle(int r){
        System.out.println("circle parameter");
        this.radius =r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;

    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r , int h){
      super(r);
      System.out.println("cylinder parameter");
        this.height = h;
    }
    
    public double volume(){
         return Math.PI*this.radius*this.radius*this.height;
    }

}
public class question1 {
    public static void main(String[] args) {
         cylinder c = new cylinder(5, 10);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Cylinder Volume = " + c.volume());
        
    }
    
}
