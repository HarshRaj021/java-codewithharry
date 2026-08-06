package ch17_AdvancedJAVA.practiceQuestions;

import java.io.FileWriter;
import java.io.IOException;

public class Q4 {

    public static void main(String[] args) {

        int n = 5;

        try {

            FileWriter fw = new FileWriter("Table.txt");

            for (int i = 1; i <= 10; i++) {
                fw.write(n + " x " + i + " = " + (n * i) + "\n");
            }

            fw.close();

            System.out.println("Table Written Successfully");

        } catch (IOException e) {

            System.out.println(e);

        }
    }
}

