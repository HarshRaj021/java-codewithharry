package ch18_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt", true);

            writer.write("\nWelcome to Advanced Java.");

            writer.close();

            System.out.println("Data Appended Successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}