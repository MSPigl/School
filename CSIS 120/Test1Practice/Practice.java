
/**
 * Write a description of class Practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Practice
{
    // instance variables - replace the example below with your own
    private int q;
    private int r;

    /**
     * Constructor for objects of class Practice
     */
    public Practice(int a, int b)
    {
        // initialise instance variables
        q = a / b;
        r = a % b;
    }

    public int getQ()
    {
        // put your code here
        return q;
    }

    public int getR()
    {
        return r;
    }

    public int crazy(int c)
    {
        return c * q + r;
    }

    public double average(int xIn, int yIn, int zIn, int qIn)
    {
        double av = (xIn + yIn + zIn + qIn);
        double avg = av/4;
        return avg;

    }

    public static void main(String[] args)
    {
        int x = 20;
        int y = 7;
        Practice m = new Practice(x,y);
        int z = m.getQ();
        //System.out.println(x + " is ");
        //System.out.print(y + " times " + z);
        //System.out.println(" plus " + m.getR());
        //System.out.println( m.crazy(y) );

        //System.out.println(m.average(2, 3, 4, 5));

        //double xX = 7.0/4.0;
        //System.out.println(xX);

        String tst = "1,000";
        int ts = tst.indexOf(",");
        //System.out.println(tst.substring(ts, 4));

        //System.out.println("x");
        //System.out.print(y + " is");
        //System.out.println("stupid");
        //System.out.println("blech");

        int num = 5%2;
        //System.out.println(num);

        double num1 = 5%2;
        //System.out.println(num1);
        
        //int num2 = 5.0/2;
        //System.out.println(num2);
        
        double num3 = 5%2.0;
        //System.out.println(num3);
        
        
        
        int sat;
        double nat = 1/2;
        for (sat = 2; sat <= 5; sat++)
        {
            System.out.println(nat);
            nat = nat + 1.0/sat;
            System.out.println(nat);
        }
        System.out.print(sat);
    }
}
