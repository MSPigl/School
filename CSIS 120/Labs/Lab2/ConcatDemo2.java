
/**
 * This program concatates four string objects manually using the "+" operator
 * 
 * @author Matthew Pigliavento, Sonja Vasovic 
 * @version February 3, 2016
 */
public class ConcatDemo2
{
    public static void main (String[] args)
    {
        // CREATES FOUR STRING OBJECTS
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        
        // CONCATATES THE FOUR STRINGS MANUALLY WITH THE "+" OPERATOR
        String concatString = (article + " " + animal1 + " " + action + " " + article + " " + animal2);
        
        // PRINTS THE CONCATATED STRING
        System.out.println("Concatated string: " + concatString);
        
    }
}
