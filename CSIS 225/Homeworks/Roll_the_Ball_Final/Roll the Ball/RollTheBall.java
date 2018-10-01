import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.awt.*;    
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.geom.Line2D;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * Models the sliding-puzzle game Roll the Ball
 * 
 * @author Grant Boughton, Jonathan Pratico
 * @author Matthew Pigliavento, Sara Lopez, Serene Medina
 * @version Spring 2017
 */
public class RollTheBall extends JFrame implements MouseListener
{
    //point to log the position of a mouse click
    public Point position = new Point(); 

    //Tile objects
    public Tile tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8;
    public Tile tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16;

    //Tile objects used for swapping and win-path finding
    public Tile current;
    public Tile start, end;
    public Tile selection1, selection2;

    //Two-dimensional array of Tiles to represent the game grid
    public Tile[][] grid = new Tile[4][4];

    public boolean firstClick; 
    public boolean hasWon;
    public static boolean firstPlay = true;

    //ArrayList to hold the winning path
    public ArrayList<Point> pointList;

    int moveCount, starCount;
    
    /**
     * Main method for class RollTheBall
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args)
    {
        //starts the game
        levelSelect(); 
    }

    /**
     * Prompts the user to select a level, and then creates 
     * a JFrame to represent the level
     */
    public static void levelSelect()
    {
        //Array of strings to serve as options
        String[] levelList = {"Level 1","Level 2","Level 3","Level 4","Level 5", "Quit"};

        //logs the users choice from a JOptionPane
        int choice = JOptionPane.showOptionDialog(null, "Select a level to play:", 
        "Main Menu", 0, JOptionPane.INFORMATION_MESSAGE, null, levelList, null);
        

        //creates an instance of a RollTheBall object based on the user's choice of level
        RollTheBall frame = null;
        if (choice == 0)
        {
            frame = new RollTheBall("./Levels/level1.txt");
        }
        else if (choice == 1)
        {
            frame = new RollTheBall("./Levels/level2.txt");
        }
        else if (choice == 2)
        {
            frame = new RollTheBall("./Levels/level3.txt");
        }
        else if (choice == 3)
        {
            frame = new RollTheBall("./Levels/level4.txt");
        }
        else if (choice == 4)
        {
            frame = new RollTheBall("./Levels/level5.txt");
        }
        else
        {
            System.exit(1);
        }
        
        //set up the JFrame
        frame.setTitle(levelList[choice]);
        frame.setSize(500, 520);
        frame.setMinimumSize(new java.awt.Dimension(500, 520));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
        //gameplay instructions
        if (firstPlay)
        {
            JOptionPane.showMessageDialog(null, 
            "How to play:\nThe goal of the game is to make a connected " 
            + "path from the START tile to the END tile.\n"
            + "Move tiles by clicking on the tile you want to move, "
            + "and then clicking on the space you want to move to.\n"
            + "The desired space must be blank, or the tile won't move. "
            + "Obviously, you can't move the START or END tile.\n"
            + "Try to solve the puzzle in as few moves as possible, "
            + "and try to include as many STAR tiles as you can in your path.\nGood luck!");
            
            firstPlay = false;
        }
    }

    /**
     * Constructor for objects of type RollTheBall
     * 
     * @param filename the name of a level text file to open
     */
    public RollTheBall(String filename)
    {
        addMouseListener(this);

        //attempt to open file
        Scanner sc = null;
        try
        {
            sc = new Scanner(new File(filename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //read the types of tiles from the input file
        String type1 = sc.next();
        String type2 = sc.next();
        String type3 = sc.next();
        String type4 = sc.next();
        String type5 = sc.next();
        String type6 = sc.next();
        String type7 = sc.next();
        String type8 = sc.next();
        String type9 = sc.next();
        String type10 = sc.next();
        String type11 = sc.next();
        String type12 = sc.next();
        String type13 = sc.next();
        String type14 = sc.next();
        String type15 = sc.next();
        String type16 = sc.next();

        //initialize Tiles
        // first row
        tile1 = new Tile(type1, 0, 20, 125, 145);
        tile2 = new Tile(type2, 127, 20, 252, 145);
        tile3 = new Tile(type3, 254, 20, 379, 145);
        tile4 = new Tile(type4, 381, 20, 506, 145);

        // second row
        tile5 = new Tile(type5,0, 147, 125, 272);
        tile6 = new Tile(type6,127, 147, 252, 272);
        tile7 = new Tile(type7,254, 147, 379, 272);
        tile8 = new Tile(type8,381, 147, 506, 272);

        // third row
        tile9 = new Tile(type9, 0, 274, 125, 399);
        tile10 = new Tile(type10, 127, 274, 252, 399);
        tile11 = new Tile(type11, 254, 274, 379, 399);
        tile12 = new Tile(type12, 381, 274, 506, 399);

        // fourth row
        tile13 = new Tile(type13,0, 401, 125, 526);
        tile14 = new Tile(type14,127, 401, 252, 526);
        tile15 = new Tile(type15,254, 401, 379, 526);
        tile16 = new Tile(type16,381, 401, 506, 526);

        // fill grid with Tile objects and assign tiles a location
        grid[0][0] = tile1;
        tile1.setLocation(0, 0);
        grid[0][1] = tile2;
        tile2.setLocation(0, 1);
        grid[0][2] = tile3;
        tile3.setLocation(0, 2);
        grid[0][3] = tile4;
        tile4.setLocation(0, 3);
        grid[1][0] = tile5;
        tile5.setLocation(1, 0);
        grid[1][1] = tile6;
        tile6.setLocation(1, 1);
        grid[1][2] = tile7;
        tile7.setLocation(1, 2);
        grid[1][3] = tile8;
        tile8.setLocation(1, 3);
        grid[2][0] = tile9;
        tile9.setLocation(2, 0);
        grid[2][1] = tile10;
        tile10.setLocation(2, 1);
        grid[2][2] = tile11;
        tile11.setLocation(2, 2);
        grid[2][3] = tile12;
        tile12.setLocation(2, 3);
        grid[3][0] = tile13;
        tile13.setLocation(3, 0);
        grid[3][1] = tile14;
        tile14.setLocation(3, 1);
        grid[3][2] = tile15;
        tile15.setLocation(3, 2);
        grid[3][3] = tile16;
        tile16.setLocation(3, 3);
        
        //locates the start and end tiles
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Tile temp = grid[i][j];
                if (temp.type.equals("startN") || temp.type.equals("startS") 
                || temp.type.equals("startE") || temp.type.equals("startW"))
                {
                    start = temp;
                }
                else if (temp.type.equals("endN") || temp.type.equals("endS")
                || temp.type.equals("endE") || temp.type.equals("endW"))
                {
                    end = temp;
                }
            }
        }

        //initialize remaining instance variables
        current = null;

        moveCount = 0;

        start.movable = false;
        end.movable = false;
        hasWon = false;
        firstClick = true;

        pointList = new ArrayList<Point>();

        repaint();
    }

    /**
     * Paints the JFrame
     * 
     * @param g a Graphics object
     */
    public void paint(Graphics g)
    {
        //cast paramater to Graphics2D
        Graphics2D g2 = (Graphics2D) g; 

        //draws the grid
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Tile temp = grid[i][j];
                g2.drawImage(temp.image, temp.lowX, temp.lowY, null);
            }
        }

        //draws a line to represent the winning path
        if (hasWon)
        {
            g2.setColor(Color.GREEN);
            g2.setStroke(new BasicStroke(15));
            for (int i = 0; i < pointList.size() - 1; i++)
            {
                g2.draw(new Line2D.Float(pointList.get(i).x, pointList.get(i).y, 
                pointList.get(i + 1).x, pointList.get(i + 1).y));
            }
        }
    }
    
    /**
     * Checks if a mouse click was in a specified range
     * 
     * @param lowX leftmost point to check
     * @param lowY uppermost point to check
     * @param highX rightmost point to check
     * @param highY lowest point to check
     * 
     * @return true if the click was in the specified range, false if not
     */
    public boolean checkRange(int lowX, int lowY, int highX, int highY)
    {
        if (position.x >= lowX && position.x <= highX)
        {
            if (position.y >= lowY && position.y <= highY)
            {
                return true; 
            }
        }

        return false;
    }

    /**
     * Attempts to swap the positions of two Tile objects
     * 
     * @param t1 a Tile object
     * @param t2 a Tile object
     */
    public void swapTiles(Tile t1, Tile t2)
    {
        //only swap if both tiles are swappable and next to each other and one of them is empty
        if(t1.movable && t2.movable && t1.isNextTo(t2)&&(t1.type.equals("X") 
        || t2.type.equals("X")))
        {
            //saves the Tile's type, hasStar, and image into temporary variables
            String tempType = t1.type;
            BufferedImage tempImage = t1.image;
            boolean tempStar = t1.hasStar;
            
            //swap the Tiles
            t1.type = t2.type;
            t1.image = t2.image;
            t1.hasStar = t2.hasStar;
            t2.type = tempType;
            t2.image = tempImage;
            t2.hasStar = tempStar;
            
            moveCount++;

            repaint();
            
            //check if the most recent move solved the puzzle
            canWin();
        }
    }

    /**
     * Invoked when the mouse button has been clicked (pressed and released) on a component
     * 
     * @param e a MouseEvent object
     */
    public void mousePressed(MouseEvent e)
    {
        // establish the x-y coordinate of the mouse's click
        position.x = e.getX();
        position.y = e.getY();

        //first row
        if (checkRange(tile1.lowX, tile1.lowY, tile1.highX, tile1.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile1;
                firstClick = false;
            }
            else
            {
                selection2 = tile1;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile2.lowX, tile2.lowY, tile2.highX, tile2.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile2;
                firstClick = false;
            }
            else
            {
                selection2 = tile2;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile3.lowX, tile3.lowY, tile3.highX, tile3.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile3;
                firstClick = false;
            }
            else
            {
                selection2 = tile3;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile4.lowX, tile4.lowY, tile4.highX, tile4.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile4;
                firstClick = false;
            }
            else
            {
                selection2 = tile4;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        //second row
        else if (checkRange(tile5.lowX, tile5.lowY, tile5.highX, tile5.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile5;
                firstClick = false;
            }
            else
            {
                selection2 = tile5;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile6.lowX, tile6.lowY, tile6.highX, tile6.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile6;
                firstClick = false;
            }
            else
            {
                selection2 = tile6;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile7.lowX, tile7.lowY, tile7.highX, tile7.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile7;
                firstClick = false;
            }
            else
            {
                selection2 = tile7;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile8.lowX, tile8.lowY, tile8.highX, tile8.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile8;
                firstClick = false;
            }
            else
            {
                selection2 = tile8;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        //third row
        else if (checkRange(tile9.lowX, tile9.lowY, tile9.highX, tile9.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile9;
                firstClick = false;
            }
            else
            {
                selection2 = tile9;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile10.lowX, tile10.lowY, tile10.highX, tile10.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile10;
                firstClick = false;
            }
            else
            {
                selection2 = tile10;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile11.lowX, tile11.lowY, tile11.highX, tile11.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile11;
                firstClick = false;
            }
            else
            {
                selection2 = tile11;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile12.lowX, tile12.lowY, tile12.highX, tile12.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile12;
                firstClick = false;
            }
            else
            {
                selection2 = tile12;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        //fourth row
        else if (checkRange(tile13.lowX, tile13.lowY, tile13.highX, tile13.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile13;
                firstClick = false;
            }
            else
            {
                selection2 = tile13;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile14.lowX, tile14.lowY, tile14.highX, tile14.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile14;
                firstClick = false;
            }
            else
            {
                selection2 = tile14;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile15.lowX, tile15.lowY, tile15.highX, tile15.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile15;
                firstClick = false;
            }
            else
            {
                selection2 = tile15;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
        else if (checkRange(tile16.lowX, tile16.lowY, tile16.highX, tile16.highY))
        {
            if(firstClick == true)
            {
                selection1 = tile16;
                firstClick = false;
            }
            else
            {
                selection2 = tile16;
                if(!(selection1.equals(selection2)))
                {
                    swapTiles(selection1,selection2);
                }
                selection1 = null;
                selection2 = null;
                firstClick = true;
            }
        }
    }

    /**
     * Checks if the puzzle has been solved
     */
    public void canWin()
    {
        //sets the current Tile equal to the start Tile
        current = start;
        
        //establishes a Point at the start Tile and adds it to pointList
        Point temp = new Point();
        temp.x = (current.lowX + 62);
        temp.y = (current.lowY + 62);
        pointList.add(temp);
        
        //while a legal move can still be made
        while (canMove())
        {
            //establish a point at the current Tile and add it to pointList
            temp = new Point();
            temp.x = (current.lowX + 62);
            temp.y = (current.lowY + 62);
            pointList.add(temp);
            
            if (current.hasStar)
            {
                starCount++;
            }
            
            //if a path has been made, make all Tiles immovable
            if (current.type.equals(end.type))
            {
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        grid[i][j].movable = false;
                    }
                }

                hasWon = true;

                //display player score
                JOptionPane.showMessageDialog(null, "You solved the puzzle with " + starCount
                + " star(s) in " + moveCount + " move(s)!");
                
                //go to another level or quit
                levelSelect();
            }
        }

        //if a winning path was not found, mark all Tiles as unvisited
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                grid[i][j].visited = false;
            }
        }

        starCount = 0;
        
        pointList.clear();
    }

    /**
     * Checks if a move can be made upwards, downwards, left, or right
     * 
     * @return true if a move can be made, false if not
     */
    public boolean canMove()
    {
        if (canMoveUp() || canMoveDown() || canMoveLeft() || canMoveRight())
        {
            return true;
        }

        return false;
    }

    /**
     * Checks if a upward move can be made
     * 
     * @return true if an upward move can be made, false if not
     */
    public boolean canMoveUp()
    {
        if (current.row != 0)
        {
            Tile pos = grid[current.row - 1][current.column];
            if (current.type.equals("startN"))
            {
                if ((pos.type.equals("NS") || pos.type.equals("NS*") 
                || pos.type.equals("SW") || pos.type.equals("SW*") || pos.type.equals("SE")
                || pos.type.equals("SE*") || pos.type.equals("endS")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true; 
                }
            }
            else if (current.type.equals("NS") || current.type.equals("NS*"))
            {
                if ((pos.type.equals("endS") || pos.type.equals("NS")
                || pos.type.equals("NS*") || pos.type.equals("SW") || pos.type.equals("SW*")
                || pos.type.equals("SE") || pos.type.equals("SE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("NW") || current.type.equals("NW*"))
            {
                if ((pos.type.equals("endS") || pos.type.equals("SW") 
                || pos.type.equals("SW*") || pos.type.equals("SE") || pos.type.equals("SE*") 
                || pos.type.equals("NS") || pos.type.equals("NS*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("NE") || current.type.equals("NE*"))
            {
                if ((pos.type.equals("endS") || pos.type.equals("SW") 
                || pos.type.equals("SW*") || pos.type.equals("SE") || pos.type.equals("SE*") 
                || pos.type.equals("NS") || pos.type.equals("NS*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
        }
        
        return false;
    }

    /**
     * Checks if a a downward move can be made
     * 
     * @return true if a downward move can be made, false if not
     */
    public boolean canMoveDown()
    {
        if (current.row != 3)
        {
            Tile pos = grid[current.row + 1][current.column];
            if (current.type.equals("startS"))
            {
                if ((pos.type.equals("NS") || pos.type.equals("NS*") 
                || pos.type.equals("NW") || pos.type.equals("NW*") || pos.type.equals("NE") 
                ||  pos.type.equals("NE*") || pos.type.equals("endN")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("NS") || current.type.equals("NS*"))
            {
                if ((pos.type.equals("endN") || pos.type.equals("NS") 
                || pos.type.equals("NS*") || pos.type.equals("NW") || pos.type.equals("NW*") 
                || pos.type.equals("NE") || pos.type.equals("NE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("SW") || current.type.equals("SW*"))
            {
                if ((pos.type.equals("endN") || pos.type.equals("NS") 
                || pos.type.equals("NS*") || pos.type.equals("NW") || pos.type.equals("NW*") 
                || pos.type.equals("NE") || pos.type.equals("NE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("SE") || current.type.equals("SE*"))
            {
                if ((pos.type.equals("endN") || pos.type.equals("NS") 
                || pos.type.equals("NS*") || pos.type.equals("NW") || pos.type.equals("NW*") 
                || pos.type.equals("NE") || pos.type.equals("NE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if a a leftward move can be made
     * 
     * @return true if an leftward move can be made, false if not
     */
    public boolean canMoveLeft()
    {
        if (current.column != 0)
        {
            Tile pos = grid[current.row][current.column - 1];
            if (current.type.equals("startW"))
            {
                if ((pos.type.equals("WE") || pos.type.equals("WE*") 
                || pos.type.equals("SE") || pos.type.equals("SE*") || pos.type.equals("NE") 
                || pos.type.equals("NE*") || pos.type.equals("endE")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("WE") || current.type.equals("WE*"))
            {
                if ((pos.type.equals("endE") || pos.type.equals("WE")
                || pos.type.equals("WE*") || pos.type.equals("NE") || pos.type.equals("NE*") 
                || pos.type.equals("SE") || pos.type.equals("SE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("SW") || current.type.equals("SW*"))
            {
                if ((pos.type.equals("endE") || pos.type.equals("WE") 
                || pos.type.equals("WE*") || pos.type.equals("NE") || pos.type.equals("NE*") 
                || pos.type.equals("SE") || pos.type.equals("SE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("NW") || current.type.equals("NW*"))
            {
                if ((pos.type.equals("endE") || pos.type.equals("WE") 
                || pos.type.equals("WE*") || pos.type.equals("NE") || pos.type.equals("NE*") 
                || pos.type.equals("SE") || pos.type.equals("SE*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if a rightward move can be made
     * 
     * @return true if a rightward move can be made, false if not
     */
    public boolean canMoveRight()
    {
        if (current.column != 3)
        {
            Tile pos = grid[current.row][current.column + 1];
            if (current.type.equals("startE"))
            {
                if ((pos.type.equals("WE") || pos.type.equals("WE*") 
                || pos.type.equals("SW") || pos.type.equals("SW*") || pos.type.equals("NW") 
                || pos.type.equals("NW*") || pos.type.equals("endW")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("WE") || current.type.equals("WE*"))
            {
                if ((pos.type.equals("endW") || pos.type.equals("WE")
                || pos.type.equals("WE*") || pos.type.equals("SW") || pos.type.equals("SW*") 
                || pos.type.equals("NW") || pos.type.equals("NW*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("SE") || current.type.equals("SE*"))
            {
                if ((pos.type.equals("endW") || pos.type.equals("WE") 
                || pos.type.equals("WE*") || pos.type.equals("SW") || pos.type.equals("SW*") 
                || pos.type.equals("NW") || pos.type.equals("NW*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
            else if (current.type.equals("NE") || current.type.equals("NE*"))
            {
                if ((pos.type.equals("endW") || pos.type.equals("WE") 
                || pos.type.equals("WE*") || pos.type.equals("SW") || pos.type.equals("SW*") 
                || pos.type.equals("NW") || pos.type.equals("NW*")) && !pos.visited)
                {
                    current = pos;
                    current.visited = true;
                    return true;
                }
            }
        }
        
        return false;
    }

    /**
     * Invoked when a mouse button has been released on a component
     * 
     * @param e a MouseEvent object
     */
    public void mouseReleased(MouseEvent e)
    {
    }

    /**
     * Invoked when a mouse button has been pressed on a component
     * 
     * @param e a MouseEvent object
     */
    public void mouseClicked(MouseEvent e)
    {
    }
        
    /**
     * Invoked when the mouse enters a component
     * 
     * @param e a MouseEvent object
     */
    public void mouseEntered(MouseEvent e)
    {
    }

    /**
     * Invoked when the mouse exits a component
     * 
     * @param e a MouseEvent object
     */
    public void mouseExited(MouseEvent e)
    {
    }
}