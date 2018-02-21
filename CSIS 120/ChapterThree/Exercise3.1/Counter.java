
/**
 * This class experiements with instance variables and creating custom methods
 * 
 * @author Matthew Pigliavento 
 * @version February 8, 2016
 */
public class Counter
{
    // CREATES INSTANCE VARIABLE value
    private int value;

    /**
     * GETS THE CURRENT VALUE OF THIS COUNTER
     * @RETURN THE CURRENT VALUE
     */
    public int getValue()
    {
        return value;
    }
   
    /**
     * ADVANCES THE VALUE OF THIS COUNTER BY 1
     */
    public void click()
    {
        value = value + 1;
    }
    
    /**
     * RESETS THE VALUE OF THIS COUNTER TO 0
     */
    public void reset()
    {
        value = 0;
    }
    
    /**
     * DECREMENTS THE VALUE OF THIS COUNTER BY 1
     */
    public void unclick()
    {
        value = value - 1;
    }
    
    public static void main(String[] args)
    {
        // CREATES A NEW COUNTER OBJECT
        Counter count = new Counter();
        
        // INCREMENTS THE COUNTER OBJECT BY FIVE, ONCE FOR EACH "click()"
        count.click();
        count.click();
        count.click();
        count.click();
        count.click();
        
        // PRINTS THE EXPECTED AND ACTUAL VALUES OF THE COUNTER OBJECT
        System.out.println("After 'clicking' the counter five times:" + "\n");		
        System.out.println("Expected value: 5" + "\n");
        System.out.println("Actual value: " + count.getValue() + "\n");
        
        // DECREMENTS THE COUNTER OBJECT BY ONE USING THE unclick() METHOD
        count.unclick();
        
        // PRINTS THE EXPECTED AND ACTUAL VALUES OF THE COUNTER OBJECT
        System.out.println("After 'unclicking' the counter once:" + "\n");
        System.out.println("Expected value: 4" + "\n");
        System.out.println("Actual value: " + count.getValue() + "\n");
        
        // RESETS THE COUNTER OBJECT VALUE TO ZERO
        count.reset();
        
        // PRINTS THE EXPECTED AND ACTUAL VALUES OF THE COUNTER OBJECT
        System.out.println("After resetting the counter:" + "\n");
        System.out.println("Expected value: 0" + "\n");
        System.out.println("Actual value: " + count.getValue() + "\n");
    }
}
