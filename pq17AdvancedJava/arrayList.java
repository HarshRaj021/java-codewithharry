package pq17AdvancedJava;


    import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Harsh");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");
        students.add("Raj");
        students.add("Ankit");
        students.add("Karan");
        students.add("Vivek");
        students.add("Sourav");
        students.add("Priyanshu");

        for (String name : students) {
            System.out.println(name);
        }
    }
}

