package pq17AdvancedJava;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q4 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(time.format(formatter));

    }
}
