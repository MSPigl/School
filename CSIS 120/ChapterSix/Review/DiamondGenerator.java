import java.util.Scanner;

/**
 * This program generates a filled diamond with a user-inputted dimension
 * Page 300, E6.16
 * @author Matthew Pigliavento 
 * @version March 29, 2016
 */
public class DiamondGenerator
{
    public static void main(String[] args)
    {
        // CREATES A NEW SCANNER OBJECT
        Scanner input = new Scanner(System.in);

        // CREATES THREE INTEGER OBJECTS
        int i = 0;
        int j = 0;
        int l = 0;
        
        // CREATES AN INTEGER OBJECT TO REGULATE SPACING
        int spc = 1;

        // PROMPTS THE USER FOR AN INPUT
        System.out.print("Please enter an integer: ");
        int in = input.nextInt();
        System.out.println();
        
        // SETS VARIABLE spc EQUAL TO in MINUS ONE
        spc = in - 1;

        // PRINTS A DIAMOND MADE OF ASTERISKS BASED ON THE Scanner INPUT
        for (i = 1; i <= in; i++)
        {
            for (j = 1; j <= spc; j++)
            {
                System.out.print(" ");
            }
            spc--;
            for (j = 1; j <= (i*2)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        spc = 1;
        for (i = 1; i <= in-1; i++)
        {
            for (j = 1; j <= spc; j++)
            {
                System.out.print(" ");
            }
            spc++;
            for (j = 1; j <= 2 * (in - i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}