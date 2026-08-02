package ch10_inheritence.practice_questions;



class Rectangle5 {

    private double length;
    private double breadth;

    public void setLength(double length){
        this.length = length;
    }

    public void setBreadth(double breadth){
        this.breadth = breadth;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public double area(){
        return length * breadth;
    }
}

class Cuboid extends Rectangle5{

    private double height;

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double volume(){
        return getLength()*getBreadth()*height;
    }
}

public class question3 {

    public static void main(String[] args) {

        Cuboid c = new Cuboid();

        c.setLength(4);
        c.setBreadth(5);
        c.setHeight(6);

        System.out.println("Area = " + c.area());
        System.out.println("Volume = " + c.volume());

    }
}