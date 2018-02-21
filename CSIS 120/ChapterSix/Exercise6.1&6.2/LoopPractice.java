
/**
 * This program practices the while loop
 * E6.1a and E6.1c, page 297 - 298
 * @author Matthew Pigliavento
 * @version March 14, 2016
 */
public class LoopPractice
{
    public static void main(String[] args)
    {
        // E6.1a - THE SUM OF ALL EVEN NUMBERS BETWEEN 2 AND 100 (INCLUSIVE)
        int n = 0;
        int sum = 0;
        while (n <= 100)
        {
            sum = sum + n;
            n = n + 2;
        }
        System.out.println("The sum of all even numbers between 2 and 100 is " + sum + "\n");
        
        // E6.1c - ALL POWERS OF 2 FROM 2^0 TO 2^20
        int x = 0;
        double pwr = 0; 
        System.out.println("Powers of 2:");
        while (x < 21)
        {
            pwr = Math.pow(2, x);
            System.out.println("2 to the power of " + x + " is " + pwr);
            x++;
        }
    }
}
