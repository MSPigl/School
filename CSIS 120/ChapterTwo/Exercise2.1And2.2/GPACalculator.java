
/**
 * This program calculates a grade point average bu using four different courses and their respective grades.
 * 
 * Matthew Pigliavento 
 * January 23 2016
 */
public class GPACalculator
{
    public static void main (String[] args)
    {
        // Four selected courses: Intro to CS, First Year Seminar, Intro to Music, and Calculus I - Part 1
        String course1 = "CSIS110";
        String course2 = "FYSM100";
        String course3 = "CREA103";
        String course4 = "MATH110";
        
        // Grades for the four selected courses - Part 2
        double course1Grade = 3.7;
        double course2Grade = 3.3;
        double course3Grade = 4.0;
        double course4Grade = 3.0;
        
        // Number of credits each class is worth - Part 3
        int course1Credits = 3;
        int course2Credits = 3;
        int course3Credits = 3;
        int course4Credits = 4;
        
        // Total credits for the four courses - Part 4
        int totalCredits = course1Credits + course2Credits + course3Credits + course4Credits;
        
        // Computes the GPA - Part 5
        double gradePointAverage = ((course1Grade* course1Credits) + (course2Grade* course2Credits) + (course3Grade* course3Credits) + (course4Grade* course4Credits))/ totalCredits;
        
        // Prints each course with its respective grade, then the calculated GPA - Part 6
        System.out.println(course1 + " " + course1Grade);
        System.out.println("");
        System.out.println(course2 + " " + course2Grade);
        System.out.println("");
        System.out.println(course3 + " " + course3Grade);
        System.out.println("");
        System.out.println(course4 + " " + course4Grade);
        System.out.println("");
        System.out.println("Your GPA for this semester: " + gradePointAverage);
    }
}