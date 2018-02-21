import java.util.Random;

/**
 * This program takes an array with ten elements of random value, moves the even elements to the front, and print the second largest element
 * 
 * @author Matthew Pigliavento
 * @version April 4, 2016
 */
public class HarderArrayWork
{
    // INSTANCE VARIABLES
    private int[] values;

    /**
     * Constructor for objects of class HarderArrayWork
     */
    public HarderArrayWork()
    {
        // INITIALISE INSTANCE VARIABLES
        Random ran = new Random();
        int num1 = ran.nextInt(100);
        int num2 = ran.nextInt(100);
        int num3 = ran.nextInt(100);
        int num4 = ran.nextInt(100);
        int num5 = ran.nextInt(100);
        int num6 = ran.nextInt(100);
        int num7 = ran.nextInt(100);
        int num8 = ran.nextInt(100);
        int num9 = ran.nextInt(100);
        int num10 = ran.nextInt(100);
        values = new int[]{num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
    }

    /**
     * Moves all even elements to the front
     */
    public void evenToFront()
    {
        int shift = 0;
        int n = 0;
        for (int i = 0; i < values.length; i++)
        {
            if(values[i] % 2 == 0)
            {
                for (int j = i; j > n; j--)
                {
                    shift = values[j-1];
                    values[j-1] = values[j];
                    values[j] = shift;
                }
                n++;
            }
        }
    }

    /**
     * Returns the second largest element in the array
     */
    public int secondLargest()
    {
        int largest = 0;
        int largest2 = 0;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] > largest)
            {
               largest2 = largest;
               largest = values[i];
            }
            else if (values[i] > largest2)
            {
                largest2 = values[i];
            }
        }
        return largest2;
    }
    
    /**
     * Prints the array
     */
    public void printArray()
    {
        for (int i = 0; i < values.length-1; i++)
        {
            System.out.print(values[i] + ", ");
        }
        for (int i = values.length-1; i < values.length; i++)
        {
            System.out.print(values[i]);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // CREATES A NEW HarderArrayWork OBJECT
        HarderArrayWork test = new HarderArrayWork();
        
        // PRINTS THE ORIGINAL ARRAY
        System.out.println("The original array:");
        test.printArray();
        
        // CALLS THE evenToFront METHOD AND PRINTS THE ALTERED ARRAY
        test.evenToFront();
        System.out.println("After evenToFront:");
        test.printArray();

        // PRINST THE SECOND LARGEST ELEMENT IN THE ARRAY BY USING THE secondLargest METHOD
        System.out.println("The second largest element: " + test.secondLargest());
    }
}

