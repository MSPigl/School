
/**
 * This class tests the CollegeCost class
 * 
 * @author Matthew Pigliavento 
 * @version February 23, 2016
 */
public class CollegeCostTester
{
    public static void main(String[] args)
    {
        // CREATES THREE CollegeCost OBJECTS
        CollegeCost college1 = new CollegeCost("Clarkson University", 40000, 15000, 13000, false);
        CollegeCost college2 = new CollegeCost("George Mason University", 35000, 13000, 9000, false);
        CollegeCost college3 = new CollegeCost("Hudson Valley Community College", 3000, 0, 0, true);
        
        // CONVERTS THE CollegeCost DATA TO A FORMATED LAYOUT FOR EACH OBJECT
        String college1Data = college1.toString();
        String college2Data = college2.toString();
        String college3Data = college3.toString();
        
        // FINDS THE YEARLY TUITION FOR EACH CollegeCost OBJECT
        int college1Tuition = college1.costOfAttendance();
        int college2Tuition = college2.costOfAttendance();
        int college3Tuition = college3.costOfAttendance();
        
        // FINDS THE EARLY TUITION FOR EACH CollegeCost OBJECT AFTER FASFA
        int college1Fasfa = college1.fasfa(2500);
        int college2Fasfa = college2.fasfa(1300);
        int college3Fasfa = college3.fasfa(400);
        
        // PRINTS THE DATA FOR EACH CollegeCost OBJECT
        System.out.println(college1Data);
        System.out.println(college1.getName() + "'s tuition before FASFA: $" + college1Tuition);
        System.out.println(college1.getName() + "'s yearly tuition after FASFA: $" + college1Fasfa + "\n");
        System.out.println(college2Data);
        System.out.println(college2.getName() + "'s tuition before FASFA: $" + college2Tuition);
        System.out.println(college2.getName() + "'s yearly tuition after FASFA: $" + college2Fasfa + "\n");
        System.out.println(college3Data);
        System.out.println(college3.getName() + "'s tuition before FASFA: $" + college3Tuition);
        System.out.println(college3.getName() + "'s yearly tuition after FASFA: $" + college3Fasfa + "\n");
        
        // SETS A NEW ROOM AND BOARD AMOUNT FOR ONE OF THE CollegeCost OBJECTS AND PRINTS IT
        college3.setRoomAndBoard(500);
        
        // SETS A NEW SCHOLARSHIP AMOUNT
        college3.setScholarship(250);
        
        // PRINTS OUT THE UPDATED DATA FOR THE CollegeCost OBJECT
        System.out.println(college3.getName() + "'s new room and board and scholarship amounts: \n");
        System.out.println(college3.getName() + "'s new room and board cost: $" + college3.getRoomAndBoard());
        System.out.println(college3.getName() + "'s new scholarship amount: $" + college3.getScholarship());
    }
}
