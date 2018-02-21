
/**
 * This program generates a multiplication table
 * Page 299. E6.14
 * @author Matthew Pigliavento 
 * @version March 22, 2016
 */
public class MultTable
{
    public static void main(String[] args)
    {
        // PRINTS A MULTIPLICATIONS TABLE STARTING AT 1 AND ENDING AT 10
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}
