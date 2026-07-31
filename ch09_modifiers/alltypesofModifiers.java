package ch09_modifiers;

class Student {

    public String name = "Harsh";
    private int password = 1234;
    protected int marks = 90;
    int age = 21;

    public void showPassword() {
        System.out.println("Password: " + password);
    }
}

public class alltypesofModifiers {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Age: " + s.age);

        s.showPassword();
    }
}