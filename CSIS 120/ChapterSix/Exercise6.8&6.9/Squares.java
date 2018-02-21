import java.util.Scanner;

/**
 * This program requests an integer from the user and then prints two boxes (one "full" and one
 * "empty") with the dimensions being that user input.
 * Page 300, E6.15
 * @author Matthew Pigliavento
 * @version March 23, 2016
 */
public class Squares
{
    public static void main(String[] args)
    {
        // CREATES A NEW SCANNER OBJECT
        Scanner input = new Scanner(System.in);

        // REQUESTS A USER INPUT
        System.out.print("Please enter an integer for your boxes: ");
        int in = input.nextInt();

        // PRINTS A FILLED BOX AND AN EMPTY BOX BASED ON THE USER-INPUTTED DIMENSION
        for (int i = 1; i <= in; i++)
        {
            for (int j = 1; j <= in; j++)
            {
                System.out.print("*");
            }
            System.out.print("  ");
            for (int k = 1; k <= in; k++)
            {
                if (i == (in-(in-1)) || i == in)
                {
                    System.out.print("*");
                }
                else if(k == (in-(in-1)) || k == in)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}