/**
 * (See: CodingBat - modThree)
 * 
 * @author Matthew Pigliavento
 * @version April 27, 2016
 */
public class ModThree
{   
    public boolean modThree(int[] nums)
    {
        boolean check = true;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]%2 == 0)
            {
                evenCount++;
                oddCount = 0;
            }
            else
            {
                oddCount++;
                evenCount = 0;
            }
            if (evenCount == 3 || oddCount == 3)
            {
                return check;
            }
        }

        if (evenCount == 3 || oddCount == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        // CREATES A NEW ModThree OBJECT
        ModThree test = new ModThree();
        
        // CREATES THREE INTEGER ARRAYS, SHOULD RETURN FALSE, TRUE, TRUE RESPECTIVELY
        int[] data = {1, 3, 2, 3};
        int[] odd = {3, 3, 1, 6};
        int[] even = {2, 4, 6, 3};
        
        // TESTS THE ARRAYS
        System.out.println("ModThree? " + test.modThree(data));
        System.out.println("ModThree? " + test.modThree(odd));
        System.out.println("ModThree? " + test.modThree(even));
    }
}