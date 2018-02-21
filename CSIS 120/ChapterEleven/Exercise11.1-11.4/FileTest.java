import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class reads a text file by line and prints the lines in reverse order
 * 
 * @author Matthew Pigliavento 
 * @version April 23, 2016
 */
public class FileTest
{
    public static void main(String[] args)
    {
        try
        {
            // PROMPTS FOR THE INPUT AND OUTPUT FILE NAMES
            Scanner console = new Scanner(System.in);
            System.out.print("Input file: ");
            String inputFileName = console.next();
            System.out.print("Output file: ");
            String outputFileName = console.next();

            // CREATES THE Scanner AND PrintWriter OBJECTS FOR READING AND WRITING
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFileName);

            // READ THE INPUT AND WRITES THE OUTPUT
            String[] data = new String[4];
            for (int i = 0; i < data.length; i++)
            {
                String line = in.nextLine();
                data[i] = line;
            }

            for (int i = data.length - 1; i >= 0; i--)
            {
                out.println(data[i]);
            }
            in.close();
            out.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("There was a FileNotFoundException, check your input file name");
        }
        catch(IOException exception)
        {
            System.out.println("There was an IOException from the input");
        }
    }
}