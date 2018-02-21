import java.util.Scanner;

/**
 * This class calculates a GPA
 * 
 * @author Mathew Pigliavento 
 * @version March 8, 2016
 */
public class BetterGPACalculator
{
    // INSTANCE VARIABLES REPRESENTING FIVE COURSE CREDIT VALUES AND FIVE COURSE GRADE VALUES
    private double class1Credit;
    private double class2Credit;
    private double class3Credit;
    private double class4Credit;
    private double class5Credit;
    
    private double class1GradeValue;
    private double class2GradeValue;
    private double class3GradeValue;
    private double class4GradeValue;
    private double class5GradeValue;

    /**
     * Constructor for objects of class BetterGPACalculator
     */
    public BetterGPACalculator()
    {
        
    }

    /**
     * Requests input data (credit value and received letter grade) from the user for five academic
     * classes, and then stores that information in their respective instance variables
     */
    public void getData()
    {
        // CREATES FIVE Scanner OBJECTS
        Scanner i = new Scanner(System.in);
        Scanner i1 = new Scanner(System.in);
        Scanner i2 = new Scanner(System.in);
        Scanner i3 = new Scanner(System.in);
        Scanner i4 = new Scanner(System.in);
        
        // REQUESTS CREDIT VALUE AND RECEIVED GRADE
        System.out.print("Please enter Class 1's credit value: ");
        double credit1 = i.nextDouble();
        class1Credit = credit1;
        System.out.print("Please enter your letter grade for Class 1: ");
        String grade1 = i.next();
        class1GradeValue = convertLetter(grade1);
        
        // REQUESTS CREDIT VALUE AND RECEIVED GRADE
        System.out.print("Please enter Class 2's credit value: ");
        double credit2 = i1.nextDouble();
        class2Credit = credit2;
        System.out.print("Please enter your letter grade for Class 2: ");
        String grade2 = i1.next();
        class2GradeValue = convertLetter(grade2);
        
        // REQUESTS CREDIT VALUE AND RECEIVED GRADE
        System.out.print("Please enter Class 3's credit value: ");
        double credit3 = i2.nextDouble();
        class3Credit = credit3;
        System.out.print("Please enter your letter grade for Class 3: ");
        String grade3 = i2.next();
        class3GradeValue = convertLetter(grade3);
        
        // REQUESTS CREDIT VALUE AND RECEIVED GRADE
        System.out.print("Please enter Class 4's credit value: ");
        double credit4 = i3.nextDouble();
        class4Credit = credit4;
        System.out.print("Please enter your letter grade for Class 4: ");
        String grade4 = i3.next();
        class4GradeValue = convertLetter(grade4);
        
        // REQUESTS CREDIT VALUE AND RECEIVED GRADE
        System.out.print("Please enter Class 5's credit value: ");
        double credit5 = i4.nextDouble();
        class5Credit = credit5;
        System.out.print("Please enter your letter grade for Class 5: ");
        String grade5 = i4.next();
        class5GradeValue = convertLetter(grade5);
    }
    
    /**
     * Converts letter grades to a float value
     * @param grade the String letter grade input
     * @return returnGrade the float value of the String input
     */
    public double convertLetter(String grade)
    {
        double returnGrade = 0;
        
        if (grade.equals("A"))
        {
            returnGrade = 4.0;
        }
        
        if (grade.equals("A-"))
        {
            returnGrade = 3.7;
        }
        
        if (grade.equals("B+"))
        {
            returnGrade = 3.3;
        }
        
        if (grade.equals("B"))
        {
            returnGrade = 3.0;
        }
        
        if (grade.equals("B-"))
        {
            returnGrade = 2.7;
        }
        
        if (grade.equals("C+"))
        {
            returnGrade = 2.3;
        }
        
        if (grade.equals("C"))
        {
            returnGrade = 2.0;
        }
        
        if (grade.equals("C-"))
        {
            returnGrade = 1.7;
        }
        
        if (grade.equals("D+"))
        {
            returnGrade = 1.3;
        }
        
        if (grade.equals("D"))
        {
            returnGrade = 1.0;
        }
    
        if (grade.equals("D-"))
        {
            returnGrade = 0.7;
        }
        
        if (grade.equals("F"))
        {
            returnGrade = 0.0;
        }
        
        return returnGrade;
    }
      
    /**
     * Computes a grade point average using the ten defined instance variables of Class BetterGPACalculator
     * @return gpa grade point average
     */
    public double computeGPA()
    { 
        double line1 = (class1Credit * class1GradeValue);
        double line2 = (class2Credit * class2GradeValue);
        double line3 = (class3Credit * class3GradeValue);
        double line4 = (class4Credit * class4GradeValue);
        double line5 = (class5Credit * class5GradeValue);
        
        double gradePoints = (line1 + line2 + line3 + line4 + line5);
        double hours = (class1Credit + class2Credit + class3Credit + class4Credit + class5Credit);
        
        double gpa = gradePoints/hours;
        
        return gpa;
    }
    
    /**
     * Executes BetterGPACalculator methods by taking user inputs and outputting a grade point average
     */
    public static void main(String[] args)
    {
        // CREATES A BetterGPACalculator OBJECT
        BetterGPACalculator gpa = new BetterGPACalculator();
        
        // PROMPTS USER FOR BetterGPACalculator DATA INPUT
        gpa.getData();
        
        // PRINTS THE GRADE POINT AVERAGE
        System.out.printf("Your GPA: " + "%.2f", gpa.computeGPA());
    }
}