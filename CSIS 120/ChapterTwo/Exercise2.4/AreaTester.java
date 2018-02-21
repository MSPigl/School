import java.awt.Rectangle;

/**
 * Constructs a rectangle object, and then displays the area by multiplaying the height times the width
 * Page 74, E2.1
 * @author Matthew Pigliavento
 * @version January 27, 2016
 */
public class AreaTester
{
    public static void main(String[] args)
    {
        // ASSIGNS THE DIMENSIONS TO THE RECTANGLE
        Rectangle testBox = new Rectangle(10, 10, 30, 30);
        
        // GETS THE HEIGHT AND WIDTH OF RECTANGLE testBox 
        double height = testBox.getHeight();
        double width = testBox.getWidth();
        
        // FINDS THE AREA BY MULTIPLYING THE HEIGHT BY THE WIDTH
        double area = height * width;
        
        // PRINTS THE RECTANGLE OBJECT AND ITS AREA ALONG WITH ITS EXPECTED AREA
        System.out.println("My rectangle: " + testBox);
        System.out.println("Expected rectangle area: 900 ");
        System.out.println("Calculated rectangle area: " + area);
        System.out.println();
        
        
        
        
        
    }
}
