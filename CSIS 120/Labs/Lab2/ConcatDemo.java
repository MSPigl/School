
/**
 * This program tests string concatation
 * 
 * @author Matthew Pigliavento, Sonja Vasovic 
 * @version February 3 2016
 */
public class ConcatDemo
{
    public static void main (String[] args)
    {
        // CREATES FOUR STRING OBJECTS
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        
        // CONCATATES THE FOUR CREATED STRING OBJECTS
        String concatString = article.concat(" ");
        String concatString1 = concatString.concat(animal1);
        String concatString2 = concatString1.concat(" ");
        String concatString3 = concatString2.concat(action);
        String concatString4 = concatString3.concat(" ");
        String concatString5 = concatString4.concat(article);
        String concatString6 = concatString5.concat(" ");
        String concatString7 = concatString6.concat(animal2);
        
        // PRINTS THE CONCATATED STRING
        System.out.println("Concatated string: " + concatString7);
        
        
        
        
        
    }
}
