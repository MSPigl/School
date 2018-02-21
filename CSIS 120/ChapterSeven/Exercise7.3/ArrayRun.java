import java.util.Random;

/**
 * This program generates a sequence of 20 random die tosses in an array and prints the 
 * die values, marking the runs (sequence of adjacent repeated values) by including them
 * in parantheses
 * Page 370, P7.1
 * 
 * @author Matthew Pigliavento 
 * @version April 11, 2016
 */
public class ArrayRun
{
    // INSTANCE VARIABLE data
    private int[] data;

    /**
     * Constructor for objects of class ArrayRun
     */
    public ArrayRun()
    {
        // CREATES A Random OBJECT
        Random ran = new Random();

        // INITIALISE INSTANCE VARIABLE data
        data = new int[25];
        for (int i = 0; i <= 20; i++)
        {
            int die = ran.nextInt(6) + 1;
            data[i] = die;
        }
    }

    /**
     * Identifies if there are any runs in array data and, if so, prints them inside parentheses,
     * then prints the other array elements
     */
    public void runIdentifier()
    {
        boolean inRun = false;
        for (int i = 1; i < 21; i++)
        {
            if (inRun)
            {
                if (data[i] != data[i - 1])
                {
                    System.out.print(") ");
                    inRun = false;
                }
            }
            if (!inRun)
            {
                if (data[i] == data[i + 1])
                {
                    System.out.print("(");
                    inRun = true;
                }
            }
            if (data[i] != data[i - 1])
            {
                System.out.print(data[i] + " ");
            }
            else if (data[i] == data[i - 1] && (data[i] == data[i + 1]))
            {
                System.out.print(" " + data[i]);
            }
            else if (data[i] == data[i - 1] && (data[i] != data[i + 1]))
            {
                System.out.print(" " + data[i]);
            }
            else
            {
                System.out.print(data[i]);
            }
        }
        if (inRun)
        {
            System.out.print(") ");
        }
    }

    public static void main(String[] args)
    {
        // CREATES A NEW ArrayRun OBJECT
        ArrayRun toss = new ArrayRun();

        // CALLS THE runIdentifier METHOD
        toss.runIdentifier();
    }
}