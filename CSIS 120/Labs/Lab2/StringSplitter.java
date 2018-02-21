
/**
 * Write a description of class StringSplitter here.
 * 
 * @author Matthew Pigliavento, Sonja Vasovic 
 * @version February 3, 2016
 */
public class StringSplitter
{
   public static void main(String[] args)
   {
       // CREATES A STRING OBJECT
       String name = "West,Kanye";
       
       // SAVES THE LOCATIONS OF THE COMMA IN THE STRING OBJECT AS AN INTEGER
       int commaLocation = name.indexOf(",");
       
       // PRINTS OUT THE LOCATION OF THE COMMA AS AN INTEGER
       System.out.println("Comma location: " + commaLocation);
       System.out.println("");
       
       // SAVES LENGTH OF STRING AS AN INTEGER
       int length = name.length();
       
       // PRINTS OUT LENGTH OF STRING AS INTEGER
       System.out.println("Length: " + length);
       System.out.println("");
       
       // CREATES A SUBSTRING OF STRING OBJECT name
       String firstName = name.substring(commaLocation + 1, length);
       
       // PRINTS OUT THE FIRST NAME
       System.out.println("First name: " + firstName);
       System.out.println("");
       
       // CREATES A SUBSTRING OF STRING OBJECT name
       String lastName = name.substring(0, commaLocation);
       
       // PRINTS OUT THE LAST NAME
       System.out.println("Last name: " + lastName);
       
       
   }
}
