
/**
 *  This class creates Car objects 
 * 
 * @author Matthew Pigliavento
 * @version February 15, 2016
 */
public class Car
{
    // INSTANCE VARIABLES
    private int fuelEfficiency;
    private double gas;

    /**
     * Constructor for objects of class Car.
     * @param fuelEfficiencyIn the fuel efficiency of the Car object
     */
    public Car(int fuelEfficiencyIn)
    {
        // INITIALISE INSTANCE VARIABLES
        fuelEfficiency = fuelEfficiencyIn;
        gas = 0;
    }

    /**
     * Reduces the amount of fuel in tank.
     * @param distance amount traveled in miles
     * @return amount of gas removed from tank
     */
    public double drive(int distance)
    {
        gas = gas - (distance/fuelEfficiency);
        
        return gas;
    }
    
    /**
     * Adds gas to tank.
     * @param plusGas amount of gas to add
     * @return amount of gas added to tank
     */
    public double addGas(int plusGas)
    {
        gas = gas + plusGas;
        
        return gas;
    }
    
    /**
     * Gets amount of gass in tank.
     * @return amount of gas in tank
     */
    public double getGas()
    {
        return gas;
    }
}
