import java.util.Scanner;

/**
 * This program performs various math funcitons while practicing with loops
 * 
 * @author Matthew Pigliavento
 * @version March 19, 2016
 */
public class LoopMath
{
    public static void main(String[] args)
    {
        // CREATES A NEW Scanner OBJECT
        Scanner in = new Scanner(System.in);
        
        // REQUESTS FLOAT INPUTS FROM THE USER
        System.out.println("Please enter a floating point number (type Q to stop input): ");
        
        // CREATES FIVE double OBJECTS
        double total = 0;
        double average = 0;
        double range = 0;
        double smallest = in.nextDouble();
        double largest = in.nextDouble();
        
        // CREATES AN int OBJECT
        int count = 0;

        // CONTINUALLY ACCEPTS USER INPUTS UNTIL THE USER ENTERS "Q," THEN PRINTS
        // THE AVERAGE OF THE INPUTS, THE SMALLESTS AND LARGEST INPUTS, AND THE
        // RANGE OF THE INPUTS
        if (!in.equals("Q"))
        {
            while (in.hasNextDouble())
            {
                double input = in.nextDouble();
                total = total + input;
                count++;
                if (input < smallest)
                {
                    smallest = input;
                }
                else if (input > largest)
                {
                    largest = input;
                }
            }
            if (count > 0)
            {
                average = total / count;
                range = largest - smallest;
                System.out.println("The average of your inputs is " + average);
                System.out.println("The smallest of your inputs is " + smallest);
                System.out.println("The largest of your inputs is " + largest);
                System.out.println("The range of your inputs is " + range);
            }
        }
    }
}