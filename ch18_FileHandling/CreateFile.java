package ch18_FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        File file = new File("student.txt");

        try {

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}