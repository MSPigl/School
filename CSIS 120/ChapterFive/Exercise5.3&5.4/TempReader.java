import java.util.Scanner;

/**
 * This program reads user temperature input and responds relative to the matter-state of water at
 * that temperature
 * Page 228, E5.10
 * @author Matthew Pigliavento 
 * @version March 10, 2016
 */
public class TempReader
{
    /**
     * Takes two user inputs (temperature in either Farenheit or Celcius) and returns whether water
     * would be a solid, liquid, or gas at that temperature (at sea level)
     */
    public static void main(String[] args)
    {
        // CREATES TWO Scanner OBJECTS AND AN EMPTY VARIABLE
        Scanner i = new Scanner(System.in);
        Scanner i1 = new Scanner(System.in);
        
        // REQUESTS TWO INPUTS FROM THE USER
        System.out.print("Please enter a temperature: ");
        double temp = i.nextDouble();
        System.out.print("Celsius or Farenheit (C/F)?: ");
        String type = i1.next();
        
        // ESTABLISHES BOUNDS FOR USER INPUTS AND RESPONDS ACCORDINGLY
        if (temp > 32.0 & temp < 212.0)
        {
            if (type.equals("F"))
            {
                System.out.println("Water is a liquid at this temperature");
            }
        }
        
        if (temp <= 32.0)
        {
            if (type.equals("F"))
            {
                System.out.println("Water is a solid at this temperature");
            }
        }
        
        if (temp >= 212.0)
        {
            if (type.equals("F"))
            {
                System.out.println("Water is a gas at this temperature");
            }
        }
        
        if (temp > 0.0 & temp < 100.0)
        {
            if (type.equals("C"))
            {
                System.out.println("Water is a liquid at this temperature");
            }
        }
        
        if (temp <= 0.0)
        {
            if (type.equals("C"))
            {
                System.out.println("Water is a solid at this temperature");
            }
        }
        
        if (temp >= 100.0)
        {
            if (type.equals("C"))
            {
                System.out.println("Water is a gas at this temperature");
            }
        }
    }
}