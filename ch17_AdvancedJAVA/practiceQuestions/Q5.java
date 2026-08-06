package ch17_AdvancedJAVA.practiceQuestions;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q5 {

    public static void main(String[] args) {

        File folder = new File("Tables");

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {

            for (int n = 2; n <= 9; n++) {

                FileWriter fw = new FileWriter("Tables/Table_" + n + ".txt");

                for (int i = 1; i <= 10; i++) {
                    fw.write(n + " x " + i + " = " + (n * i) + "\n");
                }

                fw.close();
            }

            System.out.println("All Tables Created Successfully");

        } catch (IOException e) {

            System.out.println(e);

        }
    }
}
