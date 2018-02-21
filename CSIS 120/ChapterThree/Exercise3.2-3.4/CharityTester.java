
/**
 * This class tests the Charity class
 * 
 * @author Matthew Pigliavento 
 * @version February 13, 2016
 */
public class CharityTester
{
    /**
     * Tests the methods of the Charity class.
     * @param args not used
     */
    public static void main(String[] args)
    {
        // CREATES THREE CHARITY OBJECTS
        Charity charity1 = new Charity("Extra Life", 1000534, 560000, true);
        Charity charity2 = new Charity("Child's Play", 1000607, 400567, true);
        Charity charity3 = new Charity("Kind Hearts", 706524, 708633, false);
        
        // GETS CHARITY NAME
        String name = charity1.getName();
        
        // GETS TOTAL DONATIONS 
        int donations = charity1.getTotalDonations();
        
        // GETS TOTAL EXPENSES
        int expenses = charity1.getTotalExpenses();
        
        // GETS ACTIVE STATUS
        boolean activity = charity1.getActiveStatus();
        
        // PRINTS THE CHARITY DATA
        System.out.println(name + " has total donations amounting to $" + donations + "\n");
        System.out.println(name + " has total expenses amounting to $" + expenses + "\n");
        System.out.println(name + " is active: " + activity + "\n");
        
        // CONVERTS charity2 AND charity3 TO A STRING USING THE toString() METHOD
        String formatCharity2 = charity2.toString();
        String formatCharity3 = charity3.toString();
        
        // PRINTS OUT charity2 AND charity3
        System.out.println(formatCharity2);
        System.out.println(formatCharity3);
        System.out.println("");
        
        // COMPUTES THE VALUE OF ALL THRE CHARITY OBJECTS USING THE computeValue() METHOD
        double charityValue1 = charity1.computeValue();
        double charityValue2 = charity2.computeValue();
        double charityValue3 = charity3.computeValue();
        
        // PRINTS THE VALUE OF THE THREE CHARITY OBJECTS
        System.out.println(charity1.getName() + "'s value: $" + charityValue1 + "\n");
        System.out.println(charity2.getName() + "'s value: $" + charityValue2 + "\n");
        System.out.println(charity3.getName() + "'s value: $" + charityValue3 + "\n");	
    }
}
