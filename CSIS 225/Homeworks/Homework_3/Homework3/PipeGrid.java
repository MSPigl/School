import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * Models the Big City Adventure minigame using recursion
 * 
 * @author Matthew Pigliavento
 * @version March 11, 2016
 */
public class PipeGrid
{
    public Pipe[][] board;         // 2D array of Pipe objects to represent the game board
    public ArrayList<Pipe> list;   // ArrayList of Pipe objects to store the visited grid locations
    public boolean targetReached;  // boolean to check if the bottom corner was reached

    /**
     * Main method for class PipeGrid
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args)
    {
        // prompts user for filename
        Scanner prompt = new Scanner(System.in);
        System.out.print("Please type in your filename => ");
        String filename = prompt.next();
        
        // creates new PipeGrid object and attempts to find a path
        PipeGrid go = new PipeGrid(filename);
        go.findSolution();
        
        prompt.close();
    }

    /**
     * Constructor for objects of type PipeGrid
     */
    public PipeGrid(String filename)
    {
        // attempt to open input files
        Scanner boardFile = null;
        String boardFileName = filename;

        try
        {
            boardFile = new Scanner(new File(boardFileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot open file(s), check if they exist within the project directory");
            return;
        }
        
        //initialize instance variables
        list = new ArrayList<>();
        board = new Pipe[5][9];
        targetReached = false;
        
        // fill the game board
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                board[i][j] = new Pipe(boardFile.next(), i, j);
            }
        }

        boardFile.close();
    }

    /**
     * Attempts to find a path through a grid
     */
    public void findSolution()
    {
        // checks if the top left corner is passable, if so, rotate to either EW or SW
        if (!board[0][0].type.equals("X"))
        {
            board[0][0].visited = true;
            while (!board[0][0].type.equals("EW") && !board[0][0].type.equals("SW"))
            {
                board[0][0].rotate();
            }
            
            // recurse
            move(0, 0);
            
            // if a path was found, print Yes, print path
            if (targetReached)
            {
                System.out.println("Yes\n");
                for (int i = 0; i < list.size(); i++)
                {
                    System.out.println("(" + list.get(i).row + ", " + list.get(i).col + ")\n");
                }
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println("No");
        }
    }
    
    /**
     * Moves through the grid recursively
     * 
     * @param currRow the current row
     * @param currCol the current column
     * 
     * @return true if a path was found, false if not
     */
    public boolean move(int currRow, int currCol)
    {
        // base case
        if ((currRow == 4 && currCol == 8) && (board[currRow][currCol].type.equals("EW") || board[currRow][currCol].type.equals("NE")))
        {
            targetReached = true;
            return targetReached;
        }

        // search down
        if (currRow != 4)
        {
            if (!board[currRow + 1][currCol].visited)
            {
                int rotateCounter = 0;
                if ((currRow == 3 && currCol == 8) && board[currRow + 1][currCol].type.equals("NW"))
                {
                    board[currRow + 1][currCol].rotate();
                    rotateCounter++;
                }
                
                // rotate until connected, or four rotations were made
                while (!board[currRow][currCol].canMoveDown(board[currRow + 1][currCol]))
                {
                    board[currRow + 1][currCol].rotate();
                    rotateCounter++;
                    if (currCol == 0 && board[currRow + 1][currCol].type.equals("NW"))
                    {
                        board[currRow + 1][currCol].rotate();
                        rotateCounter++;
                    }
                    else if (currRow == 3 && board[currRow + 1][currCol].type.equals("NW"))
                    {
                        board[currRow + 1][currCol].rotate();
                        rotateCounter++;
                    }
                    else if (currCol == 1 && board[currRow + 1][currCol].type.equals("NW"))
                    {
                        board[currRow + 1][currCol].rotate();
                        rotateCounter++;
                    }
                    else if ((currRow == 3 && currCol == 8) && board[currRow + 1][currCol].type.equals("NW"))
                    {
                        board[currRow + 1][currCol].rotate();
                        rotateCounter++;
                    }
                    if (rotateCounter >= 4)
                    {
                        break;
                    }
                }
                
                // if a connection was found, mark pipe as visited, add it to path, recurse
                if (rotateCounter < 4 )
                {
                    board[currRow + 1][currCol].visited = true;
                    list.add(board[currRow + 1][currCol]);
                    return move(currRow + 1, currCol);
                }
            }
        }

        // search right
        if (currCol != 8)
        {
            if (!board[currRow][currCol + 1].visited)
            {
                int rotateCounter = 0;
                if (board[currRow][currCol + 1].type.equals("NW") && currRow == 0)
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                }
                else if (currRow == 4 && board[currRow][currCol + 1].type.equals("SW"))
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                }
                else if ((currRow == 2 && board[currRow][currCol + 1].type.equals("SW")) && (board[currRow + 1][currCol + 1].type.equals("NS") && 
                    board[currRow + 2][currCol + 1].type.equals("NS")))
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                }
                else if (board[currRow][currCol + 1].type.equals("NW") &&  board[currRow - 1][currCol + 1].type.equals("X"))
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                }
                else if (board[currRow][currCol + 1].type.equals("SW") && board[currRow + 1][currCol + 1].visited)
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                }
                
                // rotate until connected, or four rotations were made
                while (!board[currRow][currCol].canMoveRight(board[currRow][currCol + 1]))
                {
                    board[currRow][currCol + 1].rotate();
                    rotateCounter++;
                    if (board[currRow][currCol + 1].type.equals("NE") && currRow != 4)
                    {
                        board[currRow][currCol + 1].rotate();
                        rotateCounter++;
                    }
                    else if (currRow == 4 && board[currRow][currCol + 1].type.equals("SW"))
                    {
                        board[currRow][currCol + 1].rotate();
                        rotateCounter++;
                    }
                    else if ((currRow == 3 && board[currRow][currCol + 1].type.equals("SW")) && board[currRow + 1][currCol + 1].type.equals("NS"))
                    {
                        board[currRow][currCol + 1].rotate();
                        rotateCounter++;
                    }
                    if (rotateCounter >= 4)
                    {
                        break;
                    }
                }
                
                // if a connection was found, mark pipe as visited, add it to path, recurse
                if (rotateCounter < 4)
                {
                    board[currRow][currCol + 1].visited = true;
                    list.add(board[currRow][currCol + 1]);
                    return move(currRow, currCol + 1);
                }
            }
        }

        // search left
        if (currCol != 0)
        {
            if (!board[currRow][currCol - 1].visited)
            {
                int rotateCounter = 0;
                if (board[currRow][currCol - 1].type.equals("SE") && board[currRow + 1][currCol - 1].visited)
                {
                    board[currRow][currCol - 1].rotate();
                    rotateCounter++;
                }
                
                // rotate until connected, or four rotations were made
                while (!board[currRow][currCol].canMoveLeft(board[currRow][currCol - 1]))
                {
                    board[currRow][currCol - 1].rotate();
                    rotateCounter++;
                    if (board[currRow][currCol - 1].type.equals("EW") && currCol == 1)
                    {
                        board[currRow][currCol - 1].rotate();
                        rotateCounter++;
                    }
                    else if (board[currRow][currCol - 1].type.equals("NE") && currCol == 1)
                    {
                        board[currRow][currCol - 1].rotate();
                        rotateCounter++;
                    }
                    if (rotateCounter >= 4)
                    {
                        break;
                    }
                }
                
                // if a connection was found, mark pipe as visited, add it to path, recurse
                if (rotateCounter < 4)
                {
                    board[currRow][currCol - 1].visited = true;
                    list.add(board[currRow][currCol - 1]);
                    return move(currRow, currCol - 1);
                }
            }
        }

        // search up
        if (currRow != 0)
        {
            if (!board[currRow - 1][currCol].visited)
            {
                int rotateCounter = 0;
                if (board[currRow - 1][currCol].type.equals("SW") && board[currRow - 1][currCol - 1].type.equals("X"))
                {
                    board[currRow - 1][currCol].rotate();
                    rotateCounter++;
                }
                else if (currCol == 5 && (board[currRow - 1][currCol].type.equals("SE") && board[currRow - 1][8].type.equals("NS")))
                {
                    board[currRow - 1][currCol].rotate();
                    rotateCounter++;
                }
                
                // rotate until connected, or four rotations were made
                while (!board[currRow][currCol].canMoveUp(board[currRow - 1][currCol]))
                {
                    board[currRow - 1][currCol].rotate();
                    rotateCounter++;
                    if (board[currRow - 1][currCol].type.equals("NS") && currRow == 1)
                    {
                        board[currRow - 1][currCol].rotate();
                        rotateCounter++;
                    }
                    else if ((currCol == 7 && board[currRow - 1][currCol].type.equals("SE")) && (board[currRow - 1][currCol + 1].type.equals("NS")
                        || board[currRow - 1][currCol + 1].type.equals("EW")))
                    {
                        board[currRow - 1][currCol].rotate();
                        rotateCounter++;
                    }
                    if (rotateCounter >= 4)
                    {
                        break;
                    }
                }
                
                // if a connection was found, mark pipe as visited, add it to path, recurse
                if (rotateCounter < 4)
                {
                    board[currRow - 1][currCol].visited = true;
                    list.add(board[currRow - 1][currCol]);
                    return move(currRow - 1, currCol);
                }
            }
        }
        
        return targetReached;
    }
    
    /**
     * Models a rotatable pipe
     * 
     * @author Matthew Pigliavento
     * @version March 8, 2016
     */
    private class Pipe
    {
        public String type;      // String to hold the type of Pipe object
        public int row, col;     // the Pipe object's row/column index
        public boolean visited;  // whether or not the Pipe object was visited

        /**
         * Constructor for objects of type Pipe
         * 
         * @param typeIn the type of Pipe
         * @param rowIn the row index
         * @param colIn the column index
         */
        public Pipe(String typeIn, int rowIn, int colIn)
        {
            type = typeIn;
            row = rowIn;
            col = colIn;
            visited = false;
        }

        /**
         * Rotates the Pipe object ninety degrees to the right
         */
        public void rotate()
        {
            if (type.equals("NS"))
            {
                type = "EW";
            }
            else if (type.equals("EW"))
            {
                type = "NS";
            }
            else if (type.equals("NE"))
            {
                type = "SE";
            }
            else if (type.equals("SE"))
            {
                type = "SW";
            }
            else if (type.equals("SW"))
            {
                type = "NW";
            }
            else if (type.equals("NW"))
            {
                type = "NE";
            }
        }
        
        /**
         * Check if a Pipe is connected downwards
         * 
         * @param pipe a Pipe object to compare
         */
        public boolean canMoveDown(Pipe pipe)
        {
            if (type.equals("EW") || type.equals("NE") || type.equals("NW"))
            {
                return false;
            }
            else if ((type.equals("NS") && pipe.type.equals("NS")))
            {
                return true;
            }
            else if (type.equals("NS") && pipe.type.equals("NE"))
            {
                return true;
            }
            else if (type.equals("NS") && pipe.type.equals("NW"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("NS"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("NE"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("NW"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("NS"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("NE"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("NW"))
            {
                return true;
            }
            return false;
        }

        /**
         * Check if a Pipe is connected to the right
         * 
         * @param pipe a Pipe object to compare
         */
        public boolean canMoveRight(Pipe pipe)
        {
            if (type.equals("NS") || type.equals("NW") || type.equals("SW"))
            {
                return false;
            }
            else if (type.equals("EW") && pipe.type.equals("EW"))
            {
                return true;
            }
            else if (type.equals("EW") && pipe.type.equals("NW"))
            {
                return true;
            }
            else if (type.equals("EW") && pipe.type.equals("SW"))
            {
                return true;
            }
            else if (type.equals("NE") && pipe.type.equals("EW"))
            {
                return true;
            }
            else if (type.equals("NE") && pipe.type.equals("NW"))
            {
                return true;
            }
            else if (type.equals("NE") && pipe.type.equals("SW"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("SW"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("NW"))
            {
                return true;
            }
            else if (type.equals("SE") && pipe.type.equals("EW"))
            {
                return true;
            }
            return false;
        }

        /**
         * Check if a Pipe is connected upwards
         * 
         * @param pipe a Pipe object to compare
         */
        public boolean canMoveUp(Pipe pipe)
        {
            if (type.equals("EW") || type.equals("SE") || type.equals("SW"))
            {
                return false;
            }
            else if ((type.equals("NS") && pipe.type.equals("NS")))
            {
                return true;
            }
            else if ((type.equals("NS") && pipe.type.equals("SE")))
            {
                return true;
            }
            else if ((type.equals("NS") && pipe.type.equals("SW")))
            {
                return true;
            }
            else if ((type.equals("NE") && pipe.type.equals("NS")))
            {
                return true;
            }
            else if ((type.equals("NE") && pipe.type.equals("SE")))
            {
                return true;
            }
            else if ((type.equals("NE") && pipe.type.equals("SW")))
            {
                return true;
            }
            else if ((type.equals("NW") && pipe.type.equals("NS")))
            {
                return true;
            }
            else if ((type.equals("NW") && pipe.type.equals("SE")))
            {
                return true;
            }
            else if ((type.equals("NW") && pipe.type.equals("SW")))
            {
                return true;
            }
            return false;
        }

        /**
         * Check if a Pipe is connected on the left
         * 
         * @param pipe a Pipe object to compare
         */
        public boolean canMoveLeft(Pipe pipe)
        {
            if (type.equals("NS") || type.equals("NE") || type.equals("SE"))
            {
                return false;
            }
            else if (type.equals("EW") && pipe.type.equals("EW"))
            {
                return true;
            }
            else if (type.equals("EW") && pipe.type.equals("NE"))
            {
                return true;
            }
            else if (type.equals("EW") && pipe.type.equals("SE"))
            {
                return true;
            }
            else if (type.equals("NW") && pipe.type.equals("EW"))
            {
                return true;
            }
            else if (type.equals("NW") && pipe.type.equals("NE"))
            {
                return true;
            }
            else if (type.equals("NW") && pipe.type.equals("SE"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("EW"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("SE"))
            {
                return true;
            }
            else if (type.equals("SW") && pipe.type.equals("NE"))
            {
                return true;
            }
            return false;
        }
    }
}