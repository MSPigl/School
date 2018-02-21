
/**
 * This is a test for Lab 3
 * 
 * @author Matthew Pigliavento 
 * @version February 9, 2016
 */
public class SuperHero
{
    // instance variables - replace the example below with your own
    private String heroName;
    private String identity;
    private String suitColor;
    private boolean canFly;
    private int numberSaved;
    private int debutYear;
    

    /**
     * Constructor for objects of class SuperHero
     */
    public SuperHero(String heroNameIn, String identityIn, String suitColorIn, boolean canFlyIn, int numberSavedIn, int debutYearIn)
    {
        // initialise instance variables
        heroName = heroNameIn;
        identity = identityIn;
        suitColor = suitColorIn;
        canFly = canFlyIn;
        numberSaved = numberSavedIn;
        debutYear = debutYearIn;
        
    }
    
    public String getHeroName()
    {
        return heroName;
    }
    
    public String getIdentity()
    {
        return identity;
    }
    
    public String getSuitColor()
    {
        return suitColor;
    }
    
    public boolean getCanFly()
    {
        return canFly;
    }
    
    public int getNumberSaved()
    {
        return numberSaved;
    }
    
    public int getDebutYear()
    {
        return debutYear;
    }
    
    public void setHeroName(String heroNameIn)
    {
        heroName = heroNameIn;
    }
    
    public void setIdentity(String identityIn)
    {
        identity = identityIn;
    }
    
    public void setSuitColor(String suitColorIn)
    {
        suitColor = suitColorIn;
    }
    
    public void setCanFly(boolean canFlyIn)
    {
        canFly = canFlyIn;
    }
    
    public void setNumberSaved(int numberSavedIn)
    {
        numberSaved = numberSavedIn;
    }
    
    public void setDebutYear(int debutYearIn)
    {
        debutYear = debutYearIn;
    }
    
    public String toString()
    {
        String formatString = "SuperHero data: \n";
        formatString = formatString + "Hero name: " + heroName + "\n";
        formatString = formatString + "Secret identity: " + identity + "\n";
        formatString = formatString + "Costume color(s): " + suitColor + "\n";
        formatString = formatString + "Hero can fly: " + canFly + "\n";
        formatString = formatString + "Hero has saved " + numberSaved + " people \n";
        formatString = formatString + "Hero debuted in " + debutYear + "\n";
        return formatString;
    }
    
    public double computeAverageSaved(int numberSavedIn, int debutYearIn)
    {
        double averageSaved = (debutYearIn/numberSavedIn);
        return averageSaved;  
    }
    
    public static void main(String[] args)
    {
        SuperHero hero1 = new SuperHero("Spider Man", "Peter Parker", "Red, white, and blue", false, 203, 1962);
        //SuperHero hero2 = new SuperHero("Spider Man", "Peter Parker", false, 203, 1962);
        //SuperHero hero3 = new SuperHero("Spider Man", "Peter Parker", false, 203, 1962);
        String hero1Stats = hero1.toString();
        System.out.println(hero1Stats);
        System.out.println("");
        System.out.println("Total people saved: " + hero1.getNumberSaved());
        System.out.println("");
        System.out.println("On average, " + hero1.getHeroName() + " has saved " + hero1.computeAverageSaved(hero1.getNumberSaved(), hero1.getDebutYear()) + " people yearly.");
        
        
    }
}    
