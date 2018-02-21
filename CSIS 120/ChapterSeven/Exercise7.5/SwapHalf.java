import java.util.Arrays;

/**
 * This program swaps the first and second half of an array with an even length
 * Page 367, E7.9
 * @author Matthew Pigliavento 
 * @version April 16, 2016
 */
public class SwapHalf
{
    /**
     * Constructor for objects of class SwapHalf
     */
    public SwapHalf()
    {
    }

    /**
     * Swaps the first and second half of an even numbered array
     * @param data the array to be manipulated
     */
    public int[] swap(int[] data)
    {
        int i = 0;
        int j = data.length/2;
        while (i < data.length/2)
        {
            int placeholder = data[j];
            data[j] = data[i];
            data[i] = placeholder;
            i++;
            j++;
        }
        return data;
    }
    
    /**
     * Main method for class SwapHalf
     */
    public static void main(String[] args)
    {
        // CREATES A SwapHalf OBJECT
        SwapHalf test = new SwapHalf();
        
        // CREATES A FILLED ARRAY
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        
        // PRINTS THE ORIGINAL ARRAY
        System.out.print("The original array: " + Arrays.toString(data));
        System.out.println();
        
        // CALLS THE swap METHOD
        test.swap(data);
        
        // PRINTS THE ALTERED ARRAY
        System.out.print("After swap: " + Arrays.toString(data));
    }
}