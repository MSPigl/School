import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/**
 * This class models a Tile in a Roll the Ball grid
 * 
 * @author Grant Boughton, Jonathan Pratico, Matthew Pigliavento, Sara Lopez, Serene Medina
 * @version Spring 2017
 */
public class Tile extends Rectangle
{
    //keeps track of a Tile's coordinates
    public int lowX, highX;
    public int lowY, highY;
    public int row, column;
    
    //used to assign the Tile an image
    public BufferedImage image;
    public String type;
    
    public boolean visited;
    public boolean movable; 
    public boolean hasStar;
    
    /**
     * Constructor for objects of type Tile
     * 
     * @param type String to hold the type of pipe
     * @param lowX the leftmost location on the Tile
     * @param lowY the uppermost location on the Tile
     * @param highX the rightmost location on the Tile
     * @param highY the bottommost location on the Tile
     */
    public Tile(String type, int lowX, int lowY, int highX, int highY)
    {
        hasStar = false;
        
        //attempts to read in PNGs to assign to the Tile
        try
        {
            this.type = type;
            if (type.equals("X"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Blank.png"));
            }
            else if (type.equals("XX"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Full.png"));
            }
            else if (type.equals("SE"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Southeast.png"));
            }
            else if (type.equals("SE*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Southeast_Star.png"));
            }
            else if (type.equals("SW"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Southwest.png"));
            }
            else if (type.equals("SW*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Southwest_Star.png"));
            }
            else if (type.equals("NE"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Northeast.png"));
            }
            else if (type.equals("NE*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Northeast_Star.png"));
            }
            else if (type.equals("NW"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Northwest.png"));
            }
            else if (type.equals("NW*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Northwest_Star.png"));
            }
            else if (type.equals("NS"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/North_South.png"));
            }
            else if (type.equals("NS*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/North_South_Star.png"));
            }
            else if (type.equals("WE"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/West_East.png"));
            }
            else if (type.equals("WE*"))
            {
                hasStar = true;
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/West_East_Star.png"));
            }
            else if (type.equals("startE"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Start_East.png"));
            }
            else if (type.equals("startW"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Start_West.png"));
            }
            else if (type.equals("startN"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Start_North.png"));
            }
            else if (type.equals("startS"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/Start_South.png"));
            }
            else if (type.equals("endE"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/End_East.png"));
            }
            else if (type.equals("endW"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/End_West.png"));
            }
            else if (type.equals("endN"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/End_North.png"));
            }
            else if (type.equals("endS"))
            {
                image = ImageIO.read(getClass().getResourceAsStream("./Assets/End_South.png"));
            }
        }
        catch (IOException e)
        {
            System.err.println("File not found");
        }
        
        //initialize instance variables
        this.lowX = lowX;
        this.lowY = lowY;
        this.highX = highX;
        this.highY = highY;
        
        
        movable = true;
        visited = false;
        
        row = column = 0;
    }
    
    /**
     * Sets a Tile's location in a grid
     * 
     * @param row the Tile's row designation
     * @param column the Tile's column designation
     */
    public void setLocation(int row, int column)
    {
        this.row = row;
        this.column = column;
    }
    
    /**
     * Determines if a Tile is next to another Tile
     * 
     * @param t a Tile object
     * @return true if the Tile is next to another Tile, false otherwise
     */
    public boolean isNextTo(Tile t)
    {
        if((t.row == this.row + 1 && t.column == this.column) ||
        (t.row == this.row - 1 && t.column == this.column) ||
        (t.row == this.row  && t.column == this.column + 1) ||
        (t.row == this.row  && t.column == this.column - 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Determines if a Tile's row and column position are equal to another's
     * 
     * @param t a Tile object
     */
    public boolean equals(Tile t)
    {
        if (this.row == t.row && this.column == t.column)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}