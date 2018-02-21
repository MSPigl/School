import java.util.Random;
import java.util.Arrays;

/**
 * This program determines whether or not an array has a number that isn't present in  another array
 * 
 * @author Matthew Pigliavento
 * @version April 14, 2016
 */
public class AdaptArray
{
    /**
     * Constructor for objects of class AdaptArray
     */
    public AdaptArray()
    {
    }

    /**
     * Takes two arrays as input and determines whether or not one contains an integer that isn't
     * present in the other
     */
    public boolean determineArray(int[] data, int[] values)
    {
        boolean found = false;
        for (int j = 0; j < data.length; j++)
        {
            for (int i = 0; i < values.length; i++)
            {
                if (data[j] == values[i])
                {
                    found = true;
                }
            }
            if (found == false)
            {
                return false;
            }
            found = false;
        }
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < data.length; j++)
            {
                if (values[i] == data[j])
                {
                    found = true;
                }
            }
            if (found == false)
            {
                return false;
            }
            found = false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        // CREATES A AdaptArray OBJECT
        AdaptArray test = new AdaptArray();

        // CREATES A Random OBJECT
        Random ran = new Random();

        // SETS ARRAYS TO RANDOM SIZES AND RANDOM ELEMENTS
        int[] data = {1, 3, 4, 5, 2};
        int[] values = {1, 2, 3, 4, 5, 8};

        System.out.println("Array 1: " + Arrays.toString(data));
        System.out.println("Array 2: " + Arrays.toString(values));
        test.determineArray(data, values);
        if (test.determineArray(data, values) == true)
        {
            System.out.println("The arrays have the same numbers");
        }
        else
        {
            System.out.println("The arrays have different numbers");
        }
    }
}