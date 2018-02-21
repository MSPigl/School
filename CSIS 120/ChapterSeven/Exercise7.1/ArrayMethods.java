
/**
 * This class contains methods that can swap the position of the first and last element, shift all elements one place to the right, replace all elements containing an
 * even integer with a 0, and replace each element (excluding the first and last) with its larger neighbor
 * 
 * @author Matthew Pigliavento 
 * @version April 1, 2016
 */
public class ArrayMethods
{
    // INSTANCE VARIABLES
    private int[] values;

    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods()
    {
        // INITIALISES values' CONTENTS
        values = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    /**
     * Swaps the position of the first and last element in the array
     * @return values the altered array
     */
    public int[] swapFirstLast()
    {
        int newFirst = values[0];
        int newLast = values[values.length - 1];
        values[0] = newLast;
        values[values.length - 1] = newFirst;
        return values;
    }

    /**
     * Shifts all values one place to the right and moves the last element to the first position
     * @return values the altered array
     */
    public int[] shiftRight()
    {
        int last = values[values.length-1];
        for (int i = values.length - 2; i >= 0 ; i--)
        {
            values[i+1] = values[i];
        }
        values[0] = last;
        return values;
    }

    /**
     * Replaces all elements that contain an even value with a zero
     * @return values the altered array
     */
    public int[] replaceEven()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
        return values;
    }

    /**
     * Replaces an element with the largest of its neighbor, excluding the first and last element
     * @return values the altered array
     */
    public int[] replaceNeighbor()
    {
        for (int i = 1; i < values.length-1; i++)
        {
            int left = values[i-1];
            int right = values[i+1];
            if (left > right) 
            {
                values[i] = left;
            }
            else if (right > left)
            {
                values[i] = right;
            }
        }
        return values;
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

    /**
     * Main method for class ArrayMethods
     */
    public static void main(String[] args)
    {
        // CREATES A NEW ArrayMethods OBJECT
        ArrayMethods arr = new ArrayMethods();

        // PRINTS THE ORIGINAL ARRAY
        System.out.println("The original array:");
        arr.printArray();

        // CALLS THE swapFirstLast METHODS THEN PRINTS THE ALTERED ARRAY
        arr.swapFirstLast();
        System.out.println("After swapFirstLast:");
        arr.printArray();

        // CALLS THE shiftRight METHOD THEN PRINTS THE ALTERED ARRAY
        arr.shiftRight();
        System.out.println("After shiftRight:");
        arr.printArray();

        // CALLS THE replaceEven METHOD THEN PRINTS THE ALTERED ARRAY
        arr.replaceEven();
        System.out.println("After replaceEven:");
        arr.printArray();

        // CALLS THE replaceNeighbor METHOD THEN PRINTS THE ALTERED ARRAY
        arr.replaceNeighbor();
        System.out.println("After replaceNeighbor:");
        arr.printArray();
    }
}