import java.util.Random;

/**
 * This program simulates a die roll by generating a random number between one and six every time it's run
 * Page 75, E2.11                                                                                                       
 * @author Matthew Pigliavento
 * @version January 27, 2016
 */
public class DieSimulator
{
    public static void main (String[] args)
    {
        // CONSTRUCTS THE RANDOM OBJECT
        Random die = new Random();
        
        // ESTABLISHES A POSSIBLE INTEGER RANGE OF ZERO TO FOUR, THEN ADDS ONE TO MEET THE ASSIGNED BOUNDS
        int roll = die.nextInt(5)+1;
        
        // PRINTS A RANDOM NUMBER BETWEEN ONE AND SIX
        System.out.println("Your number is: " + roll);
        
    }    
}
