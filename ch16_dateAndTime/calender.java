package ch16_dateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class calender {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("asia/singapore"));
        System.out.println(c.getCalendarType());
    System.out.println(c.getTimeZone());
    System.out.println(c.getTimeZone().getID());
}
}
