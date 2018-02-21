import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This program prints out the date and weekday 100 days from today, the weekday of my birthday, and the date that is 10,000 days from my birthday
 * Page 7-78, P2.7
 * @author Matthew Pigliavento 
 * @version January 29, 2016
 */
public class CalendarProgramming
{
    public static void main(String[] args)
    {
        // CONSTRUCTS A NEW GREGORIAN CALENDAR OBJECT (TODAY'S DATE)
        GregorianCalendar cal = new GregorianCalendar();
        
        // ADDS 100 DAYS TO CALENDAR OBJECT cal
        cal.add(Calendar.DAY_OF_MONTH, 100);
        
        // SAVES THE UPDATED DAY OF MONTH, DAY OF WEEK, MONTH, AND YEAR AS AN INTEGER
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        
        // PRINTS OUT A MONTH AND WEEKDAY NUMBER GUIDE 
        System.out.println("Months: 0 represents January, 2 is February,...,  11 is December");
        System.out.println("Weekdays: 1 represents Sunday, 2 is Monday,..., 7 is Saturday");
        System.out.println("");
        
        // PRINTS OUT THE DATE THAT IS 100 DAYS FROM TODAY
        System.out.println("The date that is 100 days from today is " + month + "/" + dayOfMonth + "/" + year + ", and the weekday is " + weekday);
        System.out.println("");
        
        // CONSTRUCTS A NEW GREGORIAN CALENDAR OBJECT (MY BIRTHDAY)
        GregorianCalendar birth = new GregorianCalendar(1996, Calendar.OCTOBER, 11);
        
        // SAVES THE WEEKDAY OF MY BIRTHDAY AS AN INTEGER
        int weekdayOfBirthday = birth.get(Calendar.DAY_OF_WEEK);
        
        // PRINTS OUT THE WEEKDAY OF MY BIRTHDAY
        System.out.println("The weekday of my birthday is: " + weekdayOfBirthday);
        System.out.println("");
        
        // ADDS 10,000 DAYS TO THE DATE OF MY BIRTH
        birth.add(Calendar.DAY_OF_MONTH, 10000);
        
        // SAVES THE UPDATED DAY OF MONTH, DAY OF WEEK, MONTH, AND YEAR AS AN INTEGER
        int dayOfMonth2 = birth.get(Calendar.DAY_OF_MONTH);
        int weekday2 = birth.get(Calendar.DAY_OF_WEEK);
        int month2 = birth.get(Calendar.MONTH);
        int year2 = birth.get(Calendar.YEAR);
        
        // PRINTS OUT THE DATE AND WEEKDAY THAT IS 10,000 DAYS FROM MY BIRTHDAY
        System.out.println("The date that is 10,000 days from my birthday is " + month2 + "/" + dayOfMonth2 + "/" + year2 + ", and the weekday is " + weekday2);
    }
}
