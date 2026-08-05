package ch16_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeFormatter {
    public static void main(String[] args) {
        LocalDateTime nj = LocalDateTime.now();
        System.out.println(nj);

        DateTimeFormatter hn = DateTimeFormatter.ofPattern("dd-mm-yyyy---E----a");
        DateTimeFormatter hn2 = DateTimeFormatter.ISO_DATE_TIME;

        String MyDate = hn.format(nj);
        System.out.println(MyDate);

    }
    
}
