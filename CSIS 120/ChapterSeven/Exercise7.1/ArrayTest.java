import java.util.Random;

/**
 * This program initializes an array with ten random integers, then prints every element at an 
 * even index, every even element, all elements in reverse order, and only the first and last element
 * Page 366, E7.1
 * @author Matthew Pigliavento 
 * @version March 31, 2016
 */
public class ArrayTest
{
    public static void main(String[] args)
    {
        // CREATES A RANDOM OBJECT
        Random ran = new Random();

        // STORES TEN DIFFERENT RANDOM INTEGERS BETWEEN 1 AND 10 (INCLUSIVE) IN TEN DIFFERENT VARIABLES
        int ranInt1 = ran.nextInt(10)+1;
        int ranInt2 = ran.nextInt(10)+1;
        int ranInt3 = ran.nextInt(10)+1;
        int ranInt4 = ran.nextInt(10)+1;
        int ranInt5 = ran.nextInt(10)+1;
        int ranInt6 = ran.nextInt(10)+1;
        int ranInt7 = ran.nextInt(10)+1;
        int ranInt8 = ran.nextInt(10)+1;
        int ranInt9 = ran.nextInt(10)+1;
        int ranInt10 = ran.nextInt(10)+1;

        // INITIALISES AN ARRAY WITH TEN INTEGERS
        int array[] = {ranInt1, ranInt2, ranInt3, ranInt4, ranInt5, ranInt6, ranInt7, ranInt8, ranInt9, ranInt10};

        // PRINTS ELEMENTS AT EVEN INDICES
        System.out.println("Elements at even indices: " + array[2] + " " + array[4] + " " + array[6] + " " + array[8]);

        // PRINTS ONLY THE EVEN ELEMENTS
        System.out.print("Even elements: ");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                if (array[i] == 0 || array[i] == 1)
                {
                    System.out.print("");
                }
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
        
        // PRINTS ALL ELEMENTS IN REVERSE ORDER
        System.out.print("Elements in reverse order: " + array[9] + " " + array[8] + " " + array[7] + " " + array[6] + " " + array[5] + " " + array[4] + " " + array[3] + " " +array[2] + " " + array[1] + " " + array[0] + "\n");
        
        // PRINTS OUT ONLY THE FIRST AND LAST ELEMENT
        System.out.println("First element: " + array[0] + " | Last element: " + array[9]);
    }
}
