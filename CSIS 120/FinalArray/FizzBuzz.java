import java.util.Arrays;

/**
 * (See: CodingBat - FizzBuzz)
 * 
 * @author Matthew Pigliavento 
 * @version April 27, 2016
 */
public class FizzBuzz
{
    public String[] fizzBuzz(int start, int end)
    {
        int bound = (end - start);
        String[] data = new String[bound];
        int count = 0;
        while (count < bound)
        {
            for (int j = start; j < end; j++)
            {
                if (j%3 == 0 || j%5 == 0)
                {
                    if (j%3 == 0 && j%5 == 0)
                    {
                        data[count] = "FizzBuzz";
                    }
                    if (j%3 == 0 && j%5 != 0)
                    {
                        data[count] = "Fizz";
                    }
                    if (j%5 == 0 && j%3 != 0)
                    {
                        data[count] = "Buzz";
                    }
                }
                else
                {
                    data[count] = data[count].valueOf(j);
                }
                if (count < end)
                {
                    count++;
                }
            }
        }
        return data;
    }

    public static void main(String[] args)
    {
        // CREATES A NEW FizzBuzz OBJECT
        FizzBuzz test = new FizzBuzz();
        
        // CREATES A STRING ARRAY
        String[] thing = test.fizzBuzz(9, 17);
        
        // PRINTS THE RETURNED ARRAY
        System.out.println(Arrays.toString(thing));
    }
}