
/**
 * This class simulates the inflation of a balloon
 * Page 127 of textbook, P3.3 
 * @author Matthew Pigliavento
 * @version February 18, 2016
 */
public class Balloon
{
    // INSTANCE VARIABLES
    private double radius;
    
    // CLASS LEVEL CONSTANTS
    public static final double PI = 3.14;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        // INITISALISE INSTANCE VARIABLES
        radius = 0;
    }

    /**
     * Inflates a Balloon object by a given amount
     * @param amount the amount to inflate the Balloon object by
     */
    public void inflate(double amount)
    {
        radius = radius + amount;
    }
    
    /**
     * Gets the volume of a Balloon object using a class-level constant
     * @return volume the volume of the Balloon object
     */
    public double getVolumeGood()
    {
        double volume = (4*(PI*(8.5*8.5*8.5)))/3;
        return volume;
    }
    
    /**
     * Gets the volume of a Balloon object using Math.PI
     * @return volume the volume of the Balloon object
     */
    public double getVolumeBetter()
    {
        double volume = (4*(Math.PI*(8.5*8.5*8.5)))/3;
        return volume;
    }
}
