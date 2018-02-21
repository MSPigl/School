import java.util.Random;
import java.util.Scanner;

/**
 * This class places herbs, two wolves, and a wiccan in a "grid" that is kept track of by class ItemLocation. The wiccan then moves through the NxN grid until 
 * she either finds the herbs or encounters a wolf
 * 
 * @author Matthew Pigliavento 
 * @version April 11, 2016
 */
public class Wiccan
{
    // INSTANCE VARIABLES
    private ItemLocation herbLocation = new ItemLocation();
    private ItemLocation wiccanLocation = new ItemLocation();
    private ItemLocation wolfLocation = new ItemLocation();
    private ItemLocation wolfLocation2 = new ItemLocation();
    private static int GRID_SIZE = 5;

    /**
     * Constructor for objects of class Wiccan
     */
    public Wiccan()
    {
        // CREATES A RANDOM OBJECT
        Random ran = new Random();

        // INITIALISE INSTANCE VARIABLES
        herbLocation.setX(ran.nextInt(GRID_SIZE) + 1);
        herbLocation.setY(ran.nextInt(GRID_SIZE) + 1);

        wolfLocation.setX(ran.nextInt(GRID_SIZE) + 1);
        wolfLocation.setY(ran.nextInt(GRID_SIZE) + 1);

        while (wolfLocation.equalTo(herbLocation))
        {
            wolfLocation.setX(ran.nextInt(GRID_SIZE) + 1);
            wolfLocation.setY(ran.nextInt(GRID_SIZE) + 1);
        }

        wolfLocation2.setX(ran.nextInt(GRID_SIZE) + 1);
        wolfLocation2.setY(ran.nextInt(GRID_SIZE) + 1);

        while (wolfLocation2.equalTo(herbLocation) || wolfLocation2.equalTo(wolfLocation))
        {
            wolfLocation2.setX(ran.nextInt(GRID_SIZE) + 1);
            wolfLocation2.setY(ran.nextInt(GRID_SIZE) + 1);
        }

        wiccanLocation.setX(ran.nextInt(GRID_SIZE) + 1);
        wiccanLocation.setY(ran.nextInt(GRID_SIZE) + 1);

        while (wiccanLocation.equalTo(herbLocation) || wiccanLocation.equalTo(wolfLocation) || wiccanLocation.equalTo(wolfLocation2))
        {
            wiccanLocation.setX(ran.nextInt(GRID_SIZE) + 1);
            wiccanLocation.setY(ran.nextInt(GRID_SIZE) + 1);
        }
    }

    /**
     * Prints the grid location of the herbs, both wolves, and the wiccan
     */
    public void printLocations()
    {
        System.out.println("The grid has been set:");
        System.out.println("The herbs are at x: " + herbLocation.getX() + " and y: " + herbLocation.getY());
        System.out.println("Wolf one is at x: " + wolfLocation.getX() + " and y: " + wolfLocation.getY());
        System.out.println("Wolf two is at x: " + wolfLocation2.getX() + " and y: " + wolfLocation2.getY());
        System.out.println("The Wiccan is at x: " + wiccanLocation.getX() + " and y: " + wiccanLocation.getY());
    }

    /**
     * Randomly moves the wiccan until she either encounters a wolf or finds her herbs
     */
    public void moveWitch()
    {
        Random ran = new Random();
        Scanner enter = new Scanner(System.in);
        boolean found = false;
        while (!found)
        {
            wiccanLocation.setX(ran.nextInt(GRID_SIZE) + 1);
            wiccanLocation.setY(ran.nextInt(GRID_SIZE) + 1);
            if (wiccanLocation.equalTo(herbLocation))
            {
                System.out.println("The Wiccan survived the wild and found her herbs!");
                found = true;
            }
            else if (wiccanLocation.equalTo(wolfLocation) || wiccanLocation.equalTo(wolfLocation2))
            {
                System.out.println("Regrettably, a pack of wolves found the Wiccan.");
                found = true;
            }
            if (!found)
            {
                if (wiccanLocation.getX() == wolfLocation.getX() + 1 || wiccanLocation.getX() == wolfLocation.getX() + 2 || wiccanLocation.getX() == wolfLocation.getX() + 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getY() == wolfLocation.getY() + 1 || wiccanLocation.getY() == wolfLocation.getY() + 2 || wiccanLocation.getY() == wolfLocation.getY() + 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getX() == wolfLocation2.getX() + 1 || wiccanLocation.getX() == wolfLocation2.getX() + 2 || wiccanLocation.getX() == wolfLocation2.getX() + 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getY() == wolfLocation2.getY() + 1 || wiccanLocation.getY() == wolfLocation2.getY() + 2 || wiccanLocation.getY() == wolfLocation2.getY() + 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if(wiccanLocation.getX() == wolfLocation.getX() - 1 || wiccanLocation.getX() == wolfLocation.getX() - 2 || wiccanLocation.getX() == wolfLocation.getX() - 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getY() == wolfLocation.getY() - 1 || wiccanLocation.getY() == wolfLocation.getY() - 2 || wiccanLocation.getY() == wolfLocation.getY() - 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getX() == wolfLocation2.getX() - 1 || wiccanLocation.getX() == wolfLocation2.getX() - 2 || wiccanLocation.getX() == wolfLocation2.getX() - 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getY() == wolfLocation2.getY() - 1 || wiccanLocation.getY() == wolfLocation2.getY() - 2 || wiccanLocation.getY() == wolfLocation2.getY() - 3)
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getX() == wolfLocation.getX() || wiccanLocation.getY() == wolfLocation.getY())
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                else if (wiccanLocation.getX() == wolfLocation2.getX() || wiccanLocation.getY() == wolfLocation2.getY())
                {
                    System.out.println("WATCH OUT: A WOLF IS NEAR");
                }
                if (wiccanLocation.getX() == herbLocation.getX() + 1 || wiccanLocation.getX() == herbLocation.getX() + 2 || wiccanLocation.getX() == herbLocation.getX() + 3)
                {
                    System.out.println("HERBS ARE NEAR; THE WICCAN CAN SENSE THEM");
                }
                else if (wiccanLocation.getY() == herbLocation.getY() + 1 || wiccanLocation.getY() == herbLocation.getY() + 2 || wiccanLocation.getY() == herbLocation.getY() + 3)
                {
                    System.out.println("HERBS ARE NEAR; THE WICCAN CAN SENSE THEM");
                }
                else if (wiccanLocation.getX() == herbLocation.getX() - 1 || wiccanLocation.getX() == herbLocation.getX() - 2 || wiccanLocation.getX() == herbLocation.getX() - 3)
                {
                    System.out.println("HERBS ARE NEAR; THE WICCAN CAN SENSE THEM");
                }
                else if (wiccanLocation.getY() == herbLocation.getY() - 1 || wiccanLocation.getY() == herbLocation.getY() - 2 || wiccanLocation.getY() == herbLocation.getY() - 3)
                {
                    System.out.println("HERBS ARE NEAR; THE WICCAN CAN SENSE THEM");
                }
                else if (wiccanLocation.getX() == herbLocation.getX() || wiccanLocation.getY() == herbLocation.getY())
                {
                    System.out.println("HERBS ARE NEAR; THE WICCAN CAN SENSE THEM");
                }
                System.out.println("The Wiccan is at x: " + wiccanLocation.getX() + " y: " + wiccanLocation.getY() + ", she continues to search");
                System.out.println("The herbs are at x: " + herbLocation.getX() + " and y: " + herbLocation.getY());
                System.out.println("Wolf one is at x: " + wolfLocation.getX() + " and y: " + wolfLocation.getY());
                System.out.println("Wolf two is at x: " + wolfLocation2.getX() + " and y: " + wolfLocation2.getY());
                System.out.println("Press ENTER to continue...");
                enter.nextLine();
            }
        }
    }

    /**
     * Main method for class Wiccan
     */
    public static void main(String[] args)
    {
        // CREATES A Wiccan OBJECT
        Wiccan witch = new Wiccan();

        // CREATES A Scanner OBJECT
        Scanner enter = new Scanner(System.in);

        // PRINTS THE STARTING COORDINATES OF THE HERBS, WOLVES, AND WICCAN
        witch.printLocations();
        System.out.println();

        // PRINTS A STARTING MESSAGE
        System.out.println("The Wiccan is searching for her herbs...Good Luck!");
        
        // PROMPTS FOR A USER INPUT
        System.out.println("Press ENTER to send the Wiccan on her quest...");
        enter.nextLine();
        
        // CALLS THE moveWitch METHOD
        witch.moveWitch();
    }
}