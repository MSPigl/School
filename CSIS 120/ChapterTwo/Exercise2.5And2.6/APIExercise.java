
/**
 * This program acts as an exercise to become more familiar with the Java API by using integers and strings 
 * Exercise 2.5-2.6
 * @author Matthew Pigliavento
 * @version February 1, 2016
 */
public class APIExercise
{
    public static void main (String[] args)
    {
        // CREATES AN INTEGER OBJECT (MY BIRTH YEAR) THAT EXCEPTS A STRING ARGUMENT
        Integer birthYear = new Integer("1996");
        
        // CREATES AN INTEGER OBJECT (THE CURRENT YEAR) THAT EXCEPTS AN INTEGER ARGUMENT
        Integer currentYear = new Integer(2016);
        
        // COMPARES THE TWO PREVIOUSLY CREATED INTEGER OBJECTS
        int comparedInts = birthYear.compareTo(currentYear);
        
        // PRINTS OUT THE COMPARISON, SHOULD PRODUCE A NEGATIVE INTEGER
        System.out.println("Should be less than 0: " + comparedInts);
        System.out.println("");
        
        // CREATES A STRING OBJECT CONSISTING OF MY FIRST AND LAST NAME
        String myName = "Matthew Pigliavento";
        
        // SAVES THE BLANK SPACE BETWEEN MY FIRST AND LAST NAME IN THE STRING AS AN INTEGER
        int whitespace = myName.lastIndexOf(" ");
        
        // SAVES MY FIRST NAME INTO A VARIABLE USING THE substring STRING METHOD THAT USES A BEGIN AND END INDEX INTEGER
        String firstName = myName.substring(0, whitespace);
        
        // PRINTS OUT MY FIRST NAME
        System.out.println("First name: " + firstName);
        System.out.println("");
        
        // SAVES MY LAST NAME INTO A VARIABLE USING THE substring STRING METHOD THAT ONLY TAKE A START INTEGER
        String lastName = myName.substring(whitespace);
        
        // PRINTS OUT MY LAST NAME
        System.out.println("Last name:" + lastName);
    }
}
