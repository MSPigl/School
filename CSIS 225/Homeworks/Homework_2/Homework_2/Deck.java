import java.util.Stack;
import java.util.Random;

/**
 * This class simulates a deck with a discard pile
 * 
 * @author Matthew Pigliavento
 * @version 02/15/2017
 */
public class Deck
{
    // instance variables
    private Stack<Integer> cards; // stack to simulate a draw
    private int[] discard;        // array to hold discarded cards
    private int discardIndex;     // int to track position of discard array    

    /**
     * Constructor for objects of class Deck
     * 
     * @param input an array of ints
     */
    public Deck(int[] input)
    {       
        // initialize array discard to length of the input array
        discard = new int[input.length];
        discardIndex = 0;
        
        // shuffle the input
        shuffle(input);     
    }

    /**
     * Pops the stack and adds the popped Integer to the discard array
     * 
     * @return the popped value as an int
     */
    public int draw()
    {
        // if the stack is empty, shuffle and refill the stack
        if (cards.empty())
        {
            shuffle(discard);
            discardIndex = 0;
        }
        
        // pops the stack and places the returned value in array discard
        int temp = cards.pop();
        discard[discardIndex] = temp;
        discardIndex++;
        
        return temp;
    }

    /**
     * Shuffles an input array than pushes its contents onto a stack
     * 
     * @param input an array of ints
     */
    public void shuffle(int[] input)
    {
        Random ran = new Random();
        cards = new Stack<Integer>();
        
        // shuffles the input array
        for (int i = input.length - 1; i > 0; i--)
        {
            int index = ran.nextInt(i + 1);
            int temp = input[index];
            input[index] = input[i];
            input[i] = temp;
        }
        
        // pushes the contents of the shuffled array onto the stack
        for (int i = 0; i < input.length; i++)
        {
            cards.push(new Integer(input[i]));
        }
    }
    
    /**
     * Re-shuffles a non-empty deck
     */
    public void reShuffle()
    {
        // empties the stack (draw method will refill the stack when the stack is emptied)
        for (int i = discardIndex; i <= discard.length; i++)
        {
            draw();
        }
        cards.push(discard[0]);
        discardIndex = 0;
    }
}