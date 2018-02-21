
/**
 * This class tests the Balloon class
 * 
 * @author Matthew Pigliavento 
 * @version February 18, 2016
 */
public class BalloonTester
{
    public static void main(String[] args)
    {
        // CREATS A NEW Balloon OBJECT
        Balloon balloon1 = new Balloon();
        
        // INFLATES THE BALLON TO 8.5 RADIUS
        balloon1.inflate(8.5);
        
        // APPLIES BOTH VOLUME METHODS TO THE Balloon OBJECT
        double volumeGood = balloon1.getVolumeGood();
        double volumeBetter = balloon1.getVolumeBetter();
        
        // PRINTS OUT BOTH VOLUMES OF THE Balloon OBJECT
        System.out.println("Good volume of balloon: " + volumeGood + "\n");
        System.out.println("Better volume of balloon: " + volumeBetter);
    }
}
