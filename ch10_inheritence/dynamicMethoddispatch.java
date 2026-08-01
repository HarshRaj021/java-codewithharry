package ch10_inheritence;
class  phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("my name is harsh");
}
public void music(){
        System.out.println("simi simi ye simi simi wo");
}
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("swagat");
    }
    public void on(){
        System.out.println("name is harsh in 3rd yr");
    }
}
public class dynamicMethoddispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.greet();
        obj.name();
        obj.music();
    }
    
}
