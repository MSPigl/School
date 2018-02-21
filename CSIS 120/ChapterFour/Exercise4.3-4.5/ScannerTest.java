import java.util.Scanner;

/**
 * This class tests the Scanner object type
 * 
 * @author Matthew Pigliavento 
 * @version February 29, 2016
 */
public class ScannerTest
{
    public static void main(String[] args)
    {
        // CREATES A NEW Scanner OBJECT
        Scanner in = new Scanner(System.in);
        
        // REQUESTS AN INTEGER INPUT FROM THE USER
        System.out.print("Please enter an integer (with four values) between 1000 and 999999: ");
        int num1 = in.nextInt();
        
        // CONVERTS THE INTEGER USER INPUT INTO A STRING
        String num1String = "" + num1;
        
        // CREATES TWO SUBSTRINGS FROM THE USER INPUT STRING
        String num1sub1 = num1String.substring(num1String.length()-3);
        String num1sub2 = num1String.substring(0, num1String.length()-3);
        
        // PRINTS THE USER INPUT WITH A COMMA 
        System.out.println("Your number: " + num1sub2 + "," + num1sub1 + "\n");
        
        // REQUESTS AN INTEGER INPUT FROM THE USER
        System.out.print("Please enter an integer (with five values) between 1000 and 999999: ");
        int num2 = in.nextInt();
        
        // CONVERTS THE INTEGER USER INPUT INTO A STRING
        String num2String = "" + num2;
        
        // CREATES TWO SUBSTRINGS FROM THE USER INPUT STRING
        String num2sub1 = num2String.substring(num2String.length()-3);
        String num2sub2 = num2String.substring(0, num2String.length()-3);
        
        // PRINTS THE USER INPUT WITH A COMMA 
        System.out.println("Your number: " + num2sub2 + "," + num2sub1 + "\n");
        
        // REQUESTS AN INTEGER INPUT FROM THE USER
        System.out.print("Please enter an integer (with six values) between 1000 and 999999: ");
        int num3 = in.nextInt();
        
        // CONVERTS THE INTEGER USER INPUT INTO A STRING
        String num3String = "" + num3;
        
        // CREATES TWO SUBSTRINGS FROM THE USER INPUT STRING
        String num3sub1 = num3String.substring(num3String.length()-3);
        String num3sub2 = num3String.substring(0, num3String.length()-3);
        
        // PRINTS THE USER INPUT WITH A COMMA 
        System.out.println("Your number: " + num3sub2 + "," + num3sub1 + "\n");
    }
}
