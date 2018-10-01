import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * This class simulates a single-player game of Chutes and Ladders, 
 * while collecting and returning data gathered during the game (such as average number of chutes encountered)
 * 
 * @author Matthew Pigliavento 
 * @version 02/15/2017
 */
public class NewChutesAndLadders
{
    // instance variables
    private Space[] board;                // array of Space objects to represent the game board
    private Deck deal;                    // Deck object to represent cards
    private ArrayList<Integer> spinList;  // ArrayList to hold spins
    private ArrayList<Integer> chuteList; // ArrayList to hold chutes
    private ArrayList<Integer> ladList;   // ArrayList to hold ladders
    private int simCount;                 // number of times the simulation was run
    private int numSpins;                 // number of spins throughout the simulation(s)
    private int numChutes;                // number of chutes encountered 
    private int numLadders;               // number of ladders encountered
    private int boardSize;                // int to hold the size of the board

    /**
     * Constructor for objects of class NewChutesAndLadders
     * 
     * @param boardIn name of a text file 
     * @param cardIn name of a text file
     */
    public NewChutesAndLadders(String boardIn, String cardIn)
    {
        // attempt to open input files
        Scanner boardFile = null;
        Scanner cardFile = null;
        String boardFileName = boardIn;
        String cardFileName = cardIn;

        try
        {
            boardFile = new Scanner(new File(boardFileName));
            cardFile = new Scanner(new File(cardFileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot open file(s), check if they exist within the project directory");
            return;
        }

        // initialize int instance variables
        simCount = 0;
        numSpins = 0;
        numChutes = 0;
        numLadders = 0;

        // initialize lists
        spinList = new ArrayList<Integer>();
        chuteList = new ArrayList<Integer>();
        ladList = new ArrayList<Integer>();
        
        // initialize and fill array board with Space objects
        boardSize = boardFile.nextInt();
        board = new Space[boardSize + 1];
        for (int i = 1; i < board.length; i++)
        {
            Space newSpace = new Space(i);
            board[i] = newSpace;
        }

        // gets the chutes from the input file and assigns them to their Spaces
        int numChutes = boardFile.nextInt();
        boardFile.nextLine();
        for (int i = 0; i < numChutes; i++)
        {
            // stores line of input as a String array
            String[] line = (boardFile.nextLine()).split("\\s");

            // stores the two values in line into int variables
            int start = Integer.parseInt(line[0]);
            int end = Integer.parseInt(line[1]);
            //System.out.println("Chute from " + line[0] + " to " + line[1]);

            // points the Space at index start to the Space at index end (representing a chute)
            board[start].chuteDestination = board[end];
            board[start].hasChute = true;
        }

        // gets the ladders from the input file and assings them to their Spaces
        int numLadders = boardFile.nextInt();
        boardFile.nextLine();
        for (int i = 0; i < numLadders; i++)
        {
            // stores line of input as a String array
            String[] line = (boardFile.nextLine()).split("\\s");

            // stores the two values in line into int variables
            int start = Integer.parseInt(line[0]);
            int end = Integer.parseInt(line[1]);
            
            // points the Space at index start to the Space at index end (representing a ladder)
            board[start].ladderDestination = board[end];
            board[start].hasLadder = true;
        } 

        // gets the number of cards in the deck and creates an array to hold them
        int size = cardFile.nextInt();
        int[] input = new int[size];
        int index = 0;
        cardFile.nextLine();

        // loops through the input file while there are still lines remaining
        while(cardFile.hasNextLine())
        {
            // gets the number of cards of a certain type 
            String[] line = (cardFile.nextLine()).split("\\s");
            int numCards = Integer.parseInt(line[0]);
            int type = Integer.parseInt(line[1]);

            // fills array input up to numCards
            for (int i = 0; i < numCards; i++)
            {
                input[index] = type;
                index++;
            }
        }

        // initialise Deck deal with input as its argument 
        deal = new Deck(input);
    }

    /**
     * Runs a simulation of a single-player game of Chutes and Ladders
     * 
     * @param simulationCount the number of times to run the simulation
     */
    public void runSimulation(int simulationCount)
    {
        for (int i = 0; i < simulationCount; i++)
        {
            // reshuffles the deck
            deal.reShuffle();
            
            // tracks the player's position in the Space array
            int position = 0;

            // variables to hold number of spins, chutes, and ladders for each run
            int localSpins, localChutes, localLadders; 
            localSpins = 0;
            localChutes = 0;
            localLadders = 0;
            
            while (true)
            {
                //System.out.println("Position: " + position);
                int spin = deal.draw();
                numSpins++;
                localSpins++;

                if (position + spin > 1 && position + spin <= boardSize)
                {
                    if (board[position + spin].hasChute)
                    {
                        position = board[position + spin].chuteDestination.spaceNumber;
                        numChutes++;
                        localChutes++;
                    }
                    else if (board[position + spin].hasLadder)
                    {
                        position = board[position + spin].ladderDestination.spaceNumber;
                        numLadders++;
                        localLadders++;
                    }
                    else
                    {
                        position += spin;
                    }

                    if (position == boardSize)
                    {
                        break;
                    }
                    board[position].timesVisited++;
                }
            }
            
            // adds local counts to their respective lists
            spinList.add(localSpins);
            chuteList.add(localChutes);
            ladList.add(localLadders);
            
            simCount++;
        }
    }

    /**
     * Gets the average number of "spins" performed throughout the simulation
     * 
     * @return the average number of spins
     */
    public double getAverageSpins()
    {
        return (numSpins * 1.0)/simCount;
    }

    /**
     * Gets the average number of chutes encountered throughout the simulation
     * 
     * @return the average number of chutes
     */
    public double getAverageChutes()
    {
        return (numChutes * 1.0)/simCount;
    }

    /**
     * Gets the average number of ladders encountered throughout the simulation
     * 
     * @return the average number of ladders
     */
    public double getAverageLadders()
    {
        return (numLadders * 1.0)/simCount;
    }

    /**
     * Gets the indicies of the three most commonly visited Spaces
     * 
     * @return array holding the indicies of the three most commonly visited Spaces
     */
    public int[] getMostCommonSpaces()
    {
        // int variables to hold the indicies of the most commonly visited Spaces
        int first, second, third;
        first = second = third = 1;

        // loops through array board to find the indicies of the most commonly visited spaces
        for (int i = 0; i < 3; i++)
        {
            for (int j = 1; j < board.length; j++)
            {
                if (board[j].timesVisited > board[first].timesVisited)
                {
                    first = board[j].spaceNumber;
                }
                if ((board[j].timesVisited > board[second].timesVisited) && (board[j].timesVisited < board[first].timesVisited))
                {
                    second = board[j].spaceNumber;
                }
                if ((board[j].timesVisited > board[third].timesVisited) && (board[j].timesVisited < board[second].timesVisited))
                {
                    third = board[j].spaceNumber;
                }
            }
        }
       
        // stores the most commonly visited spaces in an array 
        int[] array = {first, second, third};

        return array;
    }

    /**
     * Gets the maximum number of spins
     * 
     * @return the maximum number of spins
     */
    public int getMaxSpins()
    {
        int max = 0;
        for (int i = 1; i < spinList.size(); i++)
        {
            if (spinList.get(i) > max)
            {
                max = spinList.get(i);
            }
        }
        return max;
    }

    /**
     * Gets the minimum number of spins
     * 
     * @return the minimum number of spins
     */
    public int getMinSpins()
    {
        int min = spinList.get(0);
        for (int i = 1; i < spinList.size(); i++)
        {
            if (spinList.get(i) < min)
            {
                min = spinList.get(i);
            }
        }
        return min;
    }

    /**
     * Gets the maximum number of chutes
     * 
     * @return the maximum number of chutes
     */
    public int getMaxChutes()
    {
        int max = 0;
        for (int i = 1; i < chuteList.size(); i++)
        {
            if (chuteList.get(i) > max)
            {
                max = chuteList.get(i);
            }
        }
        return max;
    }

    /**
     * Gets the minimum number of chutes
     * 
     * @return the minimum number of chutes
     */
    public int getMinChutes()
    {
        int min = chuteList.get(0);
        for (int i = 1; i < chuteList.size(); i++)
        {
            if (chuteList.get(i) < min)
            {
                min = chuteList.get(i);
            }
        }
        return min;
    }

    /**
     * Gets the maximum number of ladders
     * 
     * @return the maximum number of ladders
     */
    public int getMaxLadders()
    {
        int max = 0;
        for (int i = 1; i < ladList.size(); i++)
        {
            if (ladList.get(i) > max)
            {
                max = ladList.get(i);
            }
        }
        return max;
    }

    /**
     * Gets the minimum number of ladders
     * 
     * @return the minimum number of ladders
     */
    public int getMinLadders()
    {
        int min = ladList.get(0);
        for (int i = 1; i < ladList.size(); i++)
        {
            if (ladList.get(i) < min)
            {
                min = ladList.get(i);
            }
        }
        return min;
    }

    /**
     * This class represents a space on a Chutes and Ladders board
     */
    private class Space
    {
        // instance variables
        public int spaceNumber;         // holds the space's number
        public int timesVisited;        // number of times a space was visited
        public boolean hasChute;        // determines whether or not a space has a chute
        public boolean hasLadder;       // determines whether or not a space has a ladder
        public Space chuteDestination;  // points to where a chute leads
        public Space ladderDestination; // points to where a ladder leads

        /**
         * Constructor for objects of class Space
         * 
         * @param spaceNumIn int to assign as the space's number
         */
        public Space (int spaceNumIn)
        {
            // initialise instance variables
            spaceNumber = spaceNumIn;
            timesVisited = 0;
            hasChute = false;
            hasLadder = false;
            chuteDestination = null;
            ladderDestination = null;
        }

        /**
         * Sets the destination of a chute
         * 
         * @param destination a space that acts as the destination for a chute
         */
        public void setChute(Space destination)
        {
            chuteDestination = destination;
        }

        /**
         * Gets the destination of a Space's chute
         * 
         * @return space that acts as a chute's destination
         */
        public Space getChute()
        {
            return chuteDestination;
        }

        /**
         * Sets the destination of a ladder
         * 
         * @param destination a space that acts as the destination for a ladder
         */
        public void setLadder(Space destination)
        {
            ladderDestination = destination;
        }

        /**
         * Gets the destination of a Space's ladder
         * 
         * @return space that acts as a ladder's destination
         */
        public Space getLadder()
        {
            return ladderDestination;
        }
    }
}