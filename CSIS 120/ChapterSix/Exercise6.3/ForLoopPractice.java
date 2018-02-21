
/**
 * This program practices for loops
 * Page 299, E6.8 and E6.9
 * @author Matthew Pigliavento 
 * @version March 17, 2016
 */
public class ForLoopPractice
{
    public static void main(String[] args)
    {
        // CREATES A STRING OBJECT TO USE WITH BOTH E6.8 AND E6.9
        String s = "Matthew";
        
        // E6.8 - PRINTS ALL CHARACTERS OF A STRING ON DIFFERENT LINES
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
        
        System.out.println("");
        
        // E6.9 - PRINTS INPUT WORD IN REVERSE
        for (int i = s.length()-1; i >= 0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
