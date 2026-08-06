package ch18_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name : Harsh Raj\n");
            writer.write("Course : B.Tech CSE(IoT)\n");
            writer.write("Learning Java File Handling");

            writer.close();

            System.out.println("Data Written Successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}