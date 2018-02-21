import java.util.StringTokenizer;

/**
 * This program tests the string tokenizer class
 * 
 * @author Matthew Pigliavento, Sonja Vasovic 
 * @version February 3. 2016
 */
public class Tokenizer
{
    public static void main(String[] args)
    {
        // CREATES A STRING OBJECT
        
        
        String sentence = "Mary had a little lamb.";
        
        // CREATES A NEW StringTokenizer
        StringTokenizer mystery = new StringTokenizer(sentence);
        
        // COUNTS THE NUMBER OF WORDS IN STRING OBJECT sentence
        int numWords = mystery.countTokens();
        
        // PRINTS THE NUMBER OF WORDS IN STRING OBJECT sentence
        System.out.println("Number of words in sentence: " + numWords);
        System.out.println("");
        
        // SETS UP THE STRING SO THAT IT WILL BE PRINTED WITH A DIFFERENT WORD ON EACH LINE
        String separateLines = mystery.nextToken();
        String separateLines1 = mystery.nextToken();
        String separateLines2 = mystery.nextToken();
        String separateLines3 = mystery.nextToken();
        String separateLines4 = mystery.nextToken();
        
        // PRINTS OUT EACH WORD IN THE STRING ON A DIFFERENT LINE
        System.out.println(separateLines);
        System.out.println(separateLines1);
        System.out.println(separateLines2);
        System.out.println(separateLines3);
        System.out.println(separateLines4);
        
        
        
    }
}
