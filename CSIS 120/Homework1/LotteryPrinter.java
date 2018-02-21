import java.util.Random;

/**
 * This program generates a sequence of six random numbers, in the style of a lottery ticket, and then prints them after a string
 * Page 77, P2.5
 * @author Matthew Pigliavento 
 * @version January 28, 2016
 */
public class LotteryPrinter
{
    public static void main(String[] args)
    {
        // CONSTRUCTS SIX RANDOM OBJECTS
        Random num1 = new Random();
        Random num2 = new Random();
        Random num3 = new Random();
        Random num4 = new Random();
        Random num5 = new Random();
        Random num6 = new Random();
        
        
        // ESTABLISHES A POSSIBLE INTEGER RANGE BETWEEN 1 AND 49 FOR EACH RANDOM OBJECT
        int lotto = num1.nextInt(47)+2;
        int lotto1 = num2.nextInt(47)+2;
        int lotto2 = num3.nextInt(47)+2;
        int lotto3 = num4.nextInt(47)+2;
        int lotto4 = num5.nextInt(47)+2;
        int lotto5 = num6.nextInt(47)+2;
        
        // PRINTS OUT THE SEQUENCE OF SIX NUMBERS ALONG WITH A DESCRIPTION
        System.out.println("If you play this combo, you can kiss student loans goodbye: " + lotto + "-" + lotto1 + "-" + lotto2 + "-" + lotto3 + "-" + lotto4 + "-" + lotto5);    
    }
}
