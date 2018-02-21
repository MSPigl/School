
/**
 * This class tests the Car class
 * 
 * @author Matthew Pigliavento 
 * @version February 15, 2016
 */
public class CarTester
{
    public static void main(String[] args)
    {
        // CREATES NEW CAR OBJECT
        Car car1 = new Car(50);
        
        // ADDS 20 GALLONS TO THE TANK
        car1.addGas(20);
        
        // DRIVES THE CAR FOR 100 MILES
        car1.drive(100);
        
        // PRINTS THE EXPECTED AMOUNT OF GAS AND THE ACTUAL AMOUNT OF GAS LEFT IN THE TANK
        System.out.println("Expected amount left in tank: 18 gallons \n");
        System.out.println("Actual amount left in tank: " + car1.getGas() + " gallons");
    }
}
