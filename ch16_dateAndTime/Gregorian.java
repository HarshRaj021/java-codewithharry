package ch16_dateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {
        Calendar v = Calendar.getInstance();
        System.out.println(v.getTime());
        System.out.println(v.get(Calendar.DATE));
        System.out.println(v.get(Calendar.SECOND));
        System.out.println(v.get(Calendar.HOUR));
        System.out.println(v.get(Calendar.SECOND));
        System.out.println(v.get(Calendar.HOUR_OF_DAY) + ":" + v.get(Calendar.MINUTE) +":"+v.get(Calendar.SECOND));
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2028));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
        System.out.println(TimeZone.getAvailableIDs()[6]);
        System.out.println(TimeZone.getAvailableIDs()[7]);
        System.out.println(TimeZone.getAvailableIDs()[8]);
        System.out.println(TimeZone.getAvailableIDs()[9]);
    }
    
}
