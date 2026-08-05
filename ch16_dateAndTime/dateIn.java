package ch16_dateAndTime;

import java.util.Date;


public class dateIn {
    public static void main(String[] args) {
        
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
    
}
