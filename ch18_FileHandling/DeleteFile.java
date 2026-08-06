package ch18_FileHandling;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("student.txt");

        if (file.delete()) {
            System.out.println("File Deleted Successfully");
        } else {
            System.out.println("File Not Found");
        }
    }
}