
/**
 * This class keeps track of x and y values and tests if two ItemLocation objects are equal or not
 * 
 * @author Matthew Pigliavento
 * @version April 11, 2016
 */
public class ItemLocation
{
    // INSTANCE VARIABLES
    private int xPosition;
    private int yPosition;

    /**
     * Constructor for objects of class ItemLocation
     */
    public ItemLocation()
    {
    }

    /**
     * Getter for instance variable xPosition
     * @return xPosition the x-coordinate of an ItemPosition object
     */
    public int getX()
    {
        return xPosition;
    }

    /**
     * Getter for instance variable yPosition
     * @return yPosition the y-coordinate of an ItemPosition object
     */
    public int getY()
    {
        return yPosition;
    }

    /**
     * Setter for instance variable xPosition
     * @param xIn the new xPosition
     * @return xPosition the updated xPosition
     */
    public int setX(int xIn)
    {
        xPosition = xIn;
        return xPosition;
    }

    /**
     * Setter for instance variable yPosition
     * @param yIn the new yPosition
     * @return yPosition the updated yPosition
     */
    public int setY(int yIn)
    {
        yPosition = yIn;
        return yPosition;
    }

    /**
     * Tests if two ItemLocation objects equal each other
     * @return true the objects are equal
     * @return false the objects are not equal
     */
    public boolean equalTo(ItemLocation itemIn)
    {
        if (xPosition == itemIn.getX() && yPosition == itemIn.getY())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Tests if two ItemLocation objects are not equal to each other
     * @return false the objects are not equal
     * @return true the objects are equal
     */
    public boolean notEqualTo(ItemLocation itemIn)
    {
        if (xPosition != itemIn.getX() && yPosition != itemIn.getY())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
