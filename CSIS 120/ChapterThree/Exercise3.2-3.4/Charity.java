
/**
 * This class represents the real world object Charity
 * 
 * @author Matthew Pigliavento 
 * @version February 11, 2016
 */
public class Charity
{
    // INSTANCE VARIABLES REPRESENTING A CHARITY'S NAME, DONATIONS, EXPENSES, AND ACTIVE STATUS
    private String charityName;
    private int totalDonations;
    private int totalExpenses;
    private boolean active;

    /**
     * Constructor for objects of class Charity.
     */
    public Charity(String charityNameIn, int totalDonationsIn, int totalExpensesIn, boolean activeIn)
    {
        // INITIALISE INSTANCE VARIABLES
       charityName = charityNameIn;
       totalDonations = totalDonationsIn;
       totalExpenses = totalExpensesIn;
       active = activeIn;
    }

    /**
     * Gets the name of the Charity object.
     * @return the current name
     */
    public String getName()
    {
        return charityName;
    }
    
    /**
     * Gets the total donations for the Charity object.
     * @return the total donations
     */
    public int getTotalDonations()
    {
        return totalDonations;
    }
    
    /**
     * Gets the total expenses for the Charity object.
     * @return the total expenses
     */
    public int getTotalExpenses()
    {
        return totalExpenses;
    }
    
    /**
     * Determines whether or not the Charity object is active.
     * @return active status
     */
    public boolean getActiveStatus()
    {
        return active;
    }
    
    /**
     * Sets the name for the Charity object.
     * @param charityNameIn the name of the Charity object
     */
    public void setName(String charityNameIn)
    {
        charityName = charityNameIn;
    }
    
    /**
     * Sets the total donations for the Charity object.
     * @param totalDonationsIn the amount of donations
     */
    public void setDonations(int totalDonationsIn)
    {
        totalDonations = totalDonationsIn;
    }
    
    /**
     * Sets the total expenses for the Charity object.
     * @param totalExpensesIn the amount of expenses
     */
    public void setExpenses(int totalExpensesIn)
    {
        totalExpenses = totalExpensesIn;
    }
    
    /**
     * Sets whether or not the Charity object is active.
     * @param activeIn the active status 
     */
    public void setActiveStatus(boolean activeIn)
    {
        active = activeIn;
    }
    
    /**
     * Converts the Charity data into an easy to read format.
     * @return the formatted data as a string
     */
    public String toString()
    {
        String formString = "Charity data: \n";
        formString = formString + "Charity name: " + charityName + "\n";
        formString = formString + "Total donations: $" + totalDonations + "\n";
        formString = formString + "Total expenses: $" + totalExpenses + "\n";
        formString = formString + "Charity is still active: " + active + "\n";
        
        return formString;
    }
    
    /**
     * Finds a Charity object's value.
     * @return the Charity object's value
     */
    public double computeValue()
    {
        double value = (40000 + (totalDonations*2)) - (totalExpenses*1.5);
        return value;
    }
}
    
    
    
    
    
    
    
    
    