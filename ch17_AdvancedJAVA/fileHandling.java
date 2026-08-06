package ch17_AdvancedJAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        File myFile = new File("fileHandling.txt");
        try{
           // myFile.createNewFile();   ---------- creating
           //adding
            FileWriter fileWriter =new FileWriter("filehandling.txt");
            fileWriter.write("our first file\n ok now bye");
            fileWriter.close();
        }catch(IOException e) {
            System.out.println("unable to create new file");
            e.printStackTrace();
        }
        //reading
        File myFile12 = new File("this.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        File myFile33 = new File("deleted_" + myFile.getName());
        if(myFile.delete()){
            System.out.println("deleted"+ myFile.getName());
        }
        else {
            System.out.println("some problem emerged");
        }
        
    }
    
}
