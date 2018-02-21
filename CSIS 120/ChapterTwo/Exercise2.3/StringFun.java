
/**
 * Write a description of class StringFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringFun
{
  public static void main (String[] args)
  {
      // Saves the Gettysburg Address under a variable and then prints it. "\n"s added to aid formatting
      String gettysburgAddress = "Four score and seven years ago our fathers brought forth on this continent,\n a new nation, conceived in Liberty, and dedicated to the proposition\n that all men are created equal. Now we are engaged in a great civil war, testing whether that nation, or any nation\n so conceived and dedicated, can long endure. We are met on a great battle-field of that war.\n We have come to dedicate a portion of that field, as a final resting\n place for those who here gave their lives that that nation might live.\n It is altogether fitting and proper that we should do this. But, in a larger sense,\n we can not dedicate -- we can not consecrate -- we can not hallow -- this ground.";
      System.out.println(gettysburgAddress);
      System.out.println("");
      
      // Prints out the number of characters in string gettysburgAddress
      int numberOfCharacters = gettysburgAddress.length();
      System.out.println("The Gettysburg Adress contains " + numberOfCharacters + " characters.");
      System.out.println("");
      
      // Changes all the characters in string gettysburgAddress to uppercase and prints the edited string
      String uppercase = gettysburgAddress.toUpperCase();
      System.out.println(uppercase);
      System.out.println("");
      
      // Changes every occurence of the letter s in string gettsyburgAddress to the letter z and then prints the edited string
      String swapped = gettysburgAddress.replace("s", "z");
      System.out.println(swapped);
      
      
  }
}
