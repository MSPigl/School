import java.util.Random;

/**
 * Write a description of class Gambler here.
 * 
 * @author Joe Dorrian, Matthew Pigliavento
 * @version march 16, 2016
 */
public class Gambler
{
    // instance variables - replace the example below with your own
    private int balance;
    private int wheel1;
    private int wheel2;
    private int wheel3;
    private int wheel4;

    /**
     * Constructor for objects of class Gambler
     */
    public Gambler()
    {
        Random balanceIn = new Random();
        balance = balanceIn.nextInt(101) + 100;
        System.out.println("Your starting balance is $" + balance + "--Good Luck! \n");
    }

    public void spinWheels()
    {
        Random ran = new Random();
        wheel1 = ran.nextInt(10);

        wheel2 = ran.nextInt(10);

        wheel3 = ran.nextInt(10);

        wheel4 = ran.nextInt(10);

    }

    public String getWheels()
    {
        String wheels = wheel1 + "   " + wheel2 + "   " + wheel3 + "   " + wheel4;
        return wheels;
    }

    public void computeWin()
    {
        String win = null;

        if (wheel1 == wheel2 & wheel2 == wheel3 & wheel3 == wheel4)
        {
            win = "             Four of a kind. \t   You win $498.";
        }

        else if ((wheel1 == wheel2 & wheel2 == wheel3 & wheel3 != wheel4)
        || (wheel2 == wheel3 & wheel3 == wheel4 & wheel4 != wheel1)
        || (wheel3 == wheel4 & wheel4 == wheel1 & wheel1 != wheel2)
        || (wheel4 == wheel1 & wheel1 == wheel2 & wheel2 != wheel3) 
        || (wheel1 == wheel3 & wheel3 == wheel4 & wheel4 != wheel2)
        || (wheel1 == wheel4 & wheel4 == wheel2 & wheel2 != wheel3)
        || (wheel2 == wheel4 & wheel4 == wheel1 & wheel1 != wheel3)){
            win = "             Three of a kind. \t   You win $8.";
        }

        else if ((wheel1 == wheel2 & wheel2 != wheel3 & wheel3 != wheel4)
        || (wheel2 == wheel3 & wheel3 != wheel1 & wheel1 != wheel4)
        || (wheel3 == wheel4 & wheel4 != wheel2 & wheel2 != wheel1)
        || (wheel1 == wheel3 & wheel3 != wheel2 & wheel2 != wheel4)
        || (wheel1 == wheel4 & wheel4 != wheel2 & wheel2 != wheel3)
        || (wheel2 == wheel4 & wheel4 != wheel3 & wheel3 != wheel1)){
            win ="             Two of a kind. \t   You broke even.";
        }

        else if ((wheel1 == wheel2 & wheel2 != wheel3 & wheel3 == wheel4)
        || (wheel1 == wheel3 & wheel3 != wheel2 & wheel2 == wheel4)
        || (wheel1 == wheel4 & wheel4 != wheel2 & wheel2 == wheel3)){
            win ="             Two pair. \t   You win $3.";
        }

        else 
        {
            win = "             None of a kind. \t   You lose $2.";
        }

        System.out.println(win);
    }

    public void currentBalance()
    {
        

        if (wheel1 == wheel2 & wheel2 == wheel3 & wheel3 == wheel4)
        {
            System.out.println("           Your new balance went up to " + (balance + 498));
        }

        else if ((wheel1 == wheel2 & wheel2 == wheel3 & wheel3 != wheel4)
        || (wheel2 == wheel3 & wheel3 == wheel4 & wheel4 != wheel1)
        || (wheel3 == wheel4 & wheel4 == wheel1 & wheel1 != wheel2)
        || (wheel4 == wheel1 & wheel1 == wheel2 & wheel2 != wheel3) 
        || (wheel1 == wheel3 & wheel3 == wheel4 & wheel4 != wheel2)
        || (wheel1 == wheel4 & wheel4 == wheel2 & wheel2 != wheel3)
        || (wheel2 == wheel4 & wheel4 == wheel1 & wheel1 != wheel3)){
            System.out.println("             Your new balance went up to $" + (balance + 8));
        }

        else if ((wheel1 == wheel2 & wheel2 != wheel3 & wheel3 != wheel4)
        || (wheel2 == wheel3 & wheel3 != wheel1 & wheel1 != wheel4)
        || (wheel3 == wheel4 & wheel4 != wheel2 & wheel2 != wheel1)
        || (wheel1 == wheel3 & wheel3 != wheel2 & wheel2 != wheel4)
        || (wheel1 == wheel4 & wheel4 != wheel2 & wheel2 != wheel3)
        || (wheel2 == wheel4 & wheel4 != wheel3 & wheel3 != wheel1)){
            System.out.println("             Your balance stays at $" + balance); 
        }

        else if ((wheel1 == wheel2 & wheel2 != wheel3 & wheel3 == wheel4)
        || (wheel1 == wheel3 & wheel3 != wheel2 & wheel2 == wheel4)
        || (wheel1 == wheel4 & wheel4 != wheel2 & wheel2 == wheel3)){
            System.out.println("             Your balance went up to $" + (balance + 3));
        }

        else 
        {
            System.out.println("             Your new balance went down to $" + (balance - 2));
        }
    }
}
