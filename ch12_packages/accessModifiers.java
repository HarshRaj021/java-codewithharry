package ch12_packages;


    class Student {

    public String name = "Harsh";
    private int password = 1234;
    protected int marks = 90;
    int age = 21; // default

    public void showPassword() {
        System.out.println("Password: " + password);
    }
}

public class accessModifiers {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name: " + s.name);   // public
        System.out.println("Marks: " + s.marks); // protected
        System.out.println("Age: " + s.age);     // default

        s.showPassword(); // private indirectly

    
        
}
}
    

