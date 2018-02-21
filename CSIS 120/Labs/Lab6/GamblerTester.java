
/**
 * Write a description of class GamblerTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamblerTester
{
    public static void main(String[] args)
    {
        Gambler gam = new Gambler();

        gam.spinWheels();
        System.out.println("    Play 1:  Your wheels:          " + gam.getWheels());
        gam.computeWin();
        gam.currentBalance();
        System.out.println("             -----------------------------------------");
        gam.spinWheels();
        System.out.println("    Play 2:  Your wheels:          " + gam.getWheels());
        gam.computeWin();
        gam.currentBalance();
        System.out.println("             -----------------------------------------");
        gam.spinWheels();
        System.out.println("    Play 3:  Your wheels:          " + gam.getWheels());
        gam.computeWin();
        gam.currentBalance();
        System.out.println("             -----------------------------------------");
        gam.spinWheels();
        System.out.println("    Play 4:  Your wheels:          " + gam.getWheels());
        gam.computeWin();
        gam.currentBalance();
        System.out.println("             -----------------------------------------");
        gam.spinWheels();
        System.out.println("    Play 5:  Your wheels:          " + gam.getWheels());
        gam.computeWin();
        gam.currentBalance();
        System.out.println("             -----------------------------------------");
        

    }
}
