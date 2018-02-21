
/**
 * This class tests  various array methods
 * 
 * @author Matthew Pigliavento 
 * @version April 18, 2016
 */
public class ArrayMethods
{
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods()
    {
    }

    /**
     * Prints the array elements separated by commas
     * @param arrayToPrint the array to be printed
     */
    public void printArray(String[] arrayToPrint)
    {
        for (int i = 0; i < arrayToPrint.length - 1; i++)
        {
            System.out.print(arrayToPrint[i] + ", ");
        }
        for (int i = arrayToPrint.length - 1; i < arrayToPrint.length; i++)
        {
            System.out.print(arrayToPrint[i]);
        }
    }

    /**
     * Swaps the first and last array element
     * @param arrayToSwap the array to swap
     */
    public void swapItems(String[] arrayToSwap)
    {
        for (int i = 0; i < arrayToSwap.length; i++)
        {
            String first = arrayToSwap[0];
            arrayToSwap[0] = arrayToSwap[arrayToSwap.length - 1];
            arrayToSwap[arrayToSwap.length - 1] = first;
        }
    }

    /**
     * Checks if the array elements are in alphabetical order
     * @return true the elements are in alphabetical order
     */
    public boolean alphabetical(String[] arrayToCheck)
    {
        boolean alpha = true;
        for (int i = 0; i < arrayToCheck.length - 1; i++)
        {
            if (arrayToCheck[i].compareTo(arrayToCheck[i + 1]) <= 0) 
            {
                alpha =  true;
            }
            else
            {
                alpha = false;
            }
        }
        if (alpha == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Shifts all array elements one position to the left
     * @param arrayShift the array to be shifted
     */
    public void shiftLeft(String[] arrayShift)
    {
        String first = arrayShift[0];
        for (int i = 1; i < arrayShift.length; i++)
        {
            arrayShift[i-1] = arrayShift[i];
        }
        arrayShift[arrayShift.length-1] = first;
    }

    /**
     * Moves even character length elements to the front
     * @param arrayToMove the array to be altered
     * @return newArray the new array
     */
    public String[] evenToFront(String[] arrayToMove)
    {
        String[] newArray = new String[arrayToMove.length];
        int count = 0;
        int count2 = 0;        
        for (int i = 0; i < arrayToMove.length; i++)
        {
            if (arrayToMove[i].length()%2 == 0)
            {
                newArray[count] = arrayToMove[i];
                count++;
                count2++;
            }
        }
        for (int i = 0; i < arrayToMove.length; i++)
        {
            if (arrayToMove[i].length()%2 != 0)
            {
                newArray[count2] = arrayToMove[i];
                count2++;
            }
        }
        return newArray;
    }

    /**
     * Returns the second largest string from the array
     * @param arrayToCheck the array to check
     * @return sec the second largest string element in the array
     */
    public String secondLongest(String[] arrayToCheck) 
    {
        String large = "";
        String sec = "";
        for (int i = 0; i < arrayToCheck.length; i++)
        {
            if (arrayToCheck[i].length() > large.length())
            {
                sec = large;
                large = arrayToCheck[i];
            }
            else if (arrayToCheck[i].length() > sec.length())
            {
                sec = arrayToCheck[i];
            }
        }
        return sec;
    }
    
    /**
     * Main method
     */
    public static void main(String[] args)
    {
        // CREATES AN ArrayMethods OBJECT
        ArrayMethods am = new ArrayMethods();

        // CREATES A NEW STRING ARRAY AND PRINTS IT
        String[] myArray = {"This", "may", "or", "may", "not", "be", "fantastic"};
        System.out.print("Original array: ");
        am.printArray(myArray);
        System.out.println("\n");

        // CALLS THE swapItems METHOD AND PRINTS THE SWAPPED ARRAY
        System.out.print("After swap array: ");
        am.swapItems(myArray);
        am.printArray(myArray);
        System.out.println("\n");

        // CHECKS WHETHER OR NOT THE ARRAY IS IN ALPHABETICAL ORDER USING THE alphabetical METHOD
        System.out.println("Is the array in alphabetical order? " + am.alphabetical(myArray));
        System.out.println();

        // CALLS THE shiftLeft METHOD AND PRINTS THE SHIFTED ARRAY
        System.out.print("After shifting the array: ");
        am.shiftLeft(myArray);
        am.printArray(myArray);
        System.out.println("\n");

        // SAVES THE NEW ARRAY RETURNED BY evenToFront IN A VARIABLE THEN PRINTS THE NEW ARRAY
        //String[] newArray = am.evenToFront(myArray);
        String[] newArray = am.evenToFront(myArray);
        System.out.print("After evenToFront: ");
        am.printArray(newArray);
        System.out.println("\n");
        
        // CALLS THE secondLongest METHOD AND PRINTS THE RETURNED STRING
        System.out.println("The second longest string: " + am.secondLongest(myArray));
    }
}