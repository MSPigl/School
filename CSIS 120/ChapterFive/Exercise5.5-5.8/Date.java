import java.util.Scanner;

/**
 * This class takes a user inputted date and returns the season
 * Page 29, E5.14
 * @author Matthew Pigliavento 
 * @version March 11, 2016
 */
public class Date
{
    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
    } 
   
    /**
     * Accepts a month and day, and returns the season
     * @param month a month as an integer
     * @param day a day as an integer
     * @return season the season
     */
    public String getSeason(int month, int day)
    {
        String season = null;
        
        if ((month <= 0 || month > 12) || (day <=0 || day > 31))
        {
            System.out.println("You entered an illegal input");
        }
        if (month == 1 || month == 2 || month == 3)
        {
            season = "Winter";
        }
        else if (month == 4 || month == 5 || month == 6)
        {
            season = "Spring";
        }
        else if (month == 7 || month == 8 || month == 9)
        {
            season = "Summer";
        }
        else if (month == 10 || month == 11 || month == 12)
        {
            season = "Fall";
        }
        if ((month == 3 || month == 6 || month == 9 || month == 12) && day >= 21)
        {
            if (season.equals("Winter"))
            {
                season = "Spring";
            }
            else if (season.equals("Spring"))
            {
                season = "Summer";
            }
            else if (season.equals("Summer"))
            {
                season = "Fall";
            }
            else
            {
                season = "Winter";
            }
        }
        
        return season;
    }
    
    public static void main(String[] args)
    {
       // CREATES A Date OBJECT
       Date test = new Date(); 
        
        // CREATES TWO Scanner OBJECTS
        Scanner i = new Scanner(System.in);
        Scanner i1 = new Scanner(System.in);
        
        // PRINTS A MONTH AS INTEGER GUIDE
        System.out.println("Months as Integers: January = 1, February = 2...December = 12 \n");
        
        // REQUESTS A MONTH AND DAY (AS INTEGERS) FROM THE USER
        System.out.print("Please enter a month as an integer: ");
        int month = i.nextInt();
        System.out.print("Please enter a day as an integer: ");
        int day = i.nextInt();
        
        // CALLS THE getSeason METHOD
       String season = test.getSeason(month, day);
       
       // PRINTS THE SEASON BASED ON THE USER-INPUTTED DATA
       System.out.println("The season is " + season);
    }
}