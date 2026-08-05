package ch15_collectionFramework.hashingTypes;



import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Harsh");
        students.put(102, "Raj");
        students.put(103, "Aman");

        System.out.println(students);

        System.out.println(students.get(102));

    }
}

