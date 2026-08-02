package ch11_abstract;

interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
} 
class mySample implements childsample{
    public void meth1(){
        System.out.println("meth 1");
    }
     public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
     public void meth4(){
        System.out.println("meth 4");
    }
}
public class inheritanceIninterfaces {
    public static void main(String[] args) {
        mySample obj = new mySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
    
}
