
/**
 * This class tests various mathematical expressions
 * Page 165, R4.5
 * @author Matthew Pigliavento 
 * @version February 28, 2016
 */
public class MathFun
{
    /**
     * Method for the first expression of R4.5
     * @param s0 variable 
     * @param v0 variable
     * @param t variable
     * @param g variable 
     * @return s the result of the math expression
     */
    public double sMethod(double s0, double v0, double t, double g)
    {
        double s = s0 + v0*t + ((g*(t*t))/2);
        
        return s;
    }
    
    /**
     * Method for the second expression of R4.5
     * @param a variable
     * @param p variable
     * @param m1 variable
     * @param m2 variable
     * @return g the result of the math expression
     */
    public double gMethod(double a, double p, double m1, double m2)
    {
        double denom = ((p*p)*(m1 + m2));
        double g = (4*(Math.PI*Math.PI))*((Math.pow(a, 3))/denom);
        
        return g;
    }
    
    /**
     * Method for the third expression of R4.5
     * @param PV variable
     * @param INT variable
     * @param YRS variable power
     * @return fv the result of the math expression
     */
    public double fvMethod(double PV, double INT, double YRS)
    {
        double x = (1 + (INT/100));
        double fv = PV*(Math.pow(x, YRS));
        
        return fv;
    }
    
    /**
     * Method for the fourth expression of R4.5
     * @param a variable
     * @param b variable
     * @param gamma variable
     * @return c the result of the math expression
     */
    public double cMethod(double a, double b, double gamma)
    {
        double x = (a*a) + (b*b) - (2*((a*b)*Math.cos(gamma)));
        double c = Math.sqrt(x);
        
        return c;
    }
    /**
     * Main method for class MathFun
     */
    public static void main(String[] args)
    {
        // CREATES A NEW MathFun OBJECT
        MathFun tester = new MathFun();
        
        // CALLS THE sMethod METHOD
        double s = tester.sMethod(2, 2, 2, 2);
        
        // CALLS THE gMethod METHOD
        double g = tester.gMethod(2, 2, 2, 2);
        
        // CALLS THE fvMethod METHOD
        double fv = tester.fvMethod(2, 2, 2);
        
        // CALLS THE cMethod METHOD
        double c = tester.cMethod(2, 2, 2);
        
        // PRINTS OUT THE RESULTS OF THE FOUR METHODS
        System.out.println("R4.5 Expressions: \n");
        System.out.println("First expression: s = " + s + "\n");
        System.out.println("Second expression: G = " + g + "\n");
        System.out.println("Third expression: FV = " + fv + "\n");
        System.out.println("Fourth expression: c = " + c); 
    }
}
