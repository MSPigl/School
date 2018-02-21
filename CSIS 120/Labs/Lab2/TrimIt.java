
/**
 * This program practices the trim string methord
 * 
 * @author Matthew Pigliavento, Sonja Vasovic
 * @version February 3, 2016
 */
public class TrimIt
{
    public static void main(String[] args)
    {
        // CREATES THREE STRING OBJECTS
        String sentence1 = "     I   ";
        String sentence2 = "    Love";
        String sentence3 = "Java         ";
        
        // TRIMS THE WHITESPACE FROM EACH STRING OBJECT 
        String trimString = sentence1.trim();
        String trimString1 = sentence2.trim();
        String trimString2 = sentence3.trim();
        
        // CONCATATES THE THREE STRING OBJECTS
        String concatString = (trimString + trimString1 + trimString2);
        
        // PRINTS THE STRING
        System.out.println("Trimmed string: " + concatString);
        
    }
}
