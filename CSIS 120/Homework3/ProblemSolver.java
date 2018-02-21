import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * This class accepts user inputted math problems and asks for the correct answer
 * 
 * @author Matthew, Pigliavento 
 * @version March 21, 2016
 */
public class ProblemSolver
{
    // INSTANCE VARIABLES
    private int userAnswer;
    private int correctAnswer;

    /**
     * Constructor for objects of class ProblemSolver
     */
    public ProblemSolver()
    {
        System.out.println("Welcome to the Problem Solver! Type 'Q' to quit");
    }

    /**
     * Requests a math problem from the user; establishes Q as a sentinel value
     */
    public boolean getProblem()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter a math problem: ");
        String in = i.nextLine();
        if (in.equals("Q"))
        {
            System.out.println("Thanks for using the Problem Solver! Goodbye!");
            return false;
        }
        else
        {
            computeProblem(in);
            return true;
        }

    }

    /**
     * Solves a user-inputted math problem and stroes it in instance variable correctAnswer
     * @param input the user inputted math problem
     */
    public void computeProblem(String input)
    {
        StringTokenizer inToken = new StringTokenizer(input);
        String tok1 = inToken.nextToken();
        String op = inToken.nextToken();
        String tok2 = inToken.nextToken();

        int num1 = new Integer(tok1);
        int num2 = new Integer(tok2);

        if (op.equals("+"))
        {
            correctAnswer = num1 + num2;
        }
        else if (op.equals("-"))
        {
            correctAnswer = num1 - num2;
        }
        else if (op.equals("*"))
        {
            correctAnswer = num1 * num2;
        }
        else if (op.equals("/"))
        {
            correctAnswer = num1 / num2;
        }
        else if (op.equals("%"))
        {
            correctAnswer = num1 % num2;
        }
    }

    /**
     * Requests an answer to the math problem from the user
     */
    public void getAnswer()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the answer: ");
        userAnswer = in.nextInt();
    }

    /**
     * Determines whether the user correctly answered the math problem or not, and responds accordingly
     */
    public void displayResponse()
    {
        if (userAnswer == correctAnswer)
        {
            Random r = new Random();
            String correct[] = new String[4];
            correct[0] = "Good job!";
            correct[1] = "Awesome!";
            correct[2] = "Nice work!!";
            correct[3] = "You got it!";
            int index = r.nextInt(4);
            System.out.println(correct[index]);
        }

        if (userAnswer != correctAnswer)
        {
            Random r = new Random();
            String incorrect[] = new String[4];
            incorrect[0] = "That's not it!";
            incorrect[1] = "Whoops, try again!";
            incorrect[2] = "Incorrect!";
            incorrect[3] = "Nope, give it another try!";
            int index = r.nextInt(4);
            System.out.println(incorrect[index]);
            getAnswer();
            displayResponse();
        }
    }

    /**
     * Accepts the user inputted math problem, solves it, then displays whether or not the
     * user answer is correct or not
     */
    public void runCalculator()
    {
        while (getProblem()== true)
        {
            while (userAnswer != correctAnswer)
            {
                getAnswer();
                displayResponse();
            }
        }
    }

    /**
     * Main method for class ProblemSolver
     */
    public static void main(String[] args)
    {
        // CREATES A ProblemSolver OBJECT
        ProblemSolver test = new ProblemSolver();

        // CALLS THE runCalculator METHOD
        test.runCalculator();
    }
}