import java.util.Scanner;

/**
 * Write a description of class ScannerPlay here.
 * 
 * @author Matthew Pigliavento, Tyler Brady
 * @version 27 January 2016
 */
public class ScannerPlay
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter grade 1: ");
        double grade1 = in.nextInt();
        System.out.print("Please enter grade 2: ");
        double grade2 = in.nextInt();
        System.out.print("Please enter grade 3: ");
        double grade3 = in.nextInt();
        System.out.print("Please enter grade 4: ");
        double grade4 = in.nextInt();
        System.out.print("Please enter grade 5: ");
        double grade5 = in.nextInt();
        
        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5 ;
        System.out.println("Your average is " + average);
    }
}
