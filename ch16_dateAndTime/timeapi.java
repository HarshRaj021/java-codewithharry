package ch16_dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class timeapi {
    public static void main(String[] args) {
        LocalDate m = LocalDate.now();
        System.out.println(m);

        LocalDate b = LocalDate.now();
        System.out.println(b);

        LocalDateTime mb = LocalDateTime.now();
        System.out.println(mb);
    }
    
}
