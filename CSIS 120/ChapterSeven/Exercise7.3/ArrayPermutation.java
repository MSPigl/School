import java.util.Arrays;
import java.util.Random;

/**
 * This program generates three random permutations of the numbers 1 to 10
 * 
 * @author Matthew Pigliavento 
 * @version April 11, 2016
 */
public class ArrayPermutation
{
    // INSTANCE VARIABLE values
    private int[] values;

    /**
     * Constructor for objects of class ArrayPermutation
     */
    public ArrayPermutation()
    {
        // INITIALISE INSTANCE VARIABLE values
        values = new int[10];
        int num = 1;
        for (int i = 0; i < values.length; i++)
        {
            values[i] = num;
            num++;
        }
    }

    public void resetArray()
    {
        int num = 1;
        for (int i = 0; i < values.length; i++)
        {
            values[i] = num;
            num++;
        }
    }
    
    /**
     * Takes a random element from array values and uses it to fill a new permuted array (ten times)
     * @return newValues the new permuted array
     */
    public void permuteArray()
    {
        int[] newValues = new int[10];
        int currentSize = values.length;
        Random r = new Random();

        for (int i = 0; i < newValues.length; i++)
        {
            int ran = r.nextInt(currentSize);
            newValues[i] = values[ran];
            values[ran] = values[currentSize - 1];
            currentSize--;
        }
        int num = 1;
        for (int i = 0; i < values.length; i++)
        {
            values[i] = num;
            num++;
        }
        for (int i = 0; i < newValues.length; i++)
        {
            System.out.print(newValues[i] + " ");
        }
        System.out.println();
    }

    /**
     * Prints the array
     */
    public void printArray()
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        // CREATES A NEW ArrayPermutation OBJECT
        ArrayPermutation test = new ArrayPermutation();
        // PRINTS THE ORIGINAL ARRAY
        System.out.println("The original array:");
        test.printArray();

        // CALLS the permuteArray METHOD TEN TIMES AND PRINTS THE PERMUTED ARRAY
        System.out.println("Permutation 1:");
        test.permuteArray();
        
        System.out.println("Permutation 2:");
        test.permuteArray();

        System.out.println("Permutation 3:");
        test.permuteArray();

        System.out.println("Permutation 4:");
        test.permuteArray();

        System.out.println("Permutation 5:");
        test.permuteArray();

        System.out.println("Permutation 6:");
        test.permuteArray();

        System.out.println("Permutation 7:");
        test.permuteArray();

        System.out.println("Permutation 8:");
        test.permuteArray();

        System.out.println("Permutation 9:");
        test.permuteArray();

        System.out.println("Permutation 10:");
        test.permuteArray();
    }
}