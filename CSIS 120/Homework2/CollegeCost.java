
/**
 * This class represents the monetary cost of attending college
 * 
 * @author Matthew Pigliavento
 * @version February 23, 2016
 */
public class CollegeCost
{
    // instance variables - replace the example below with your own
    private String collegeName;
    private int baseTuition;
    private int roomAndBoard;
    private int scholarship;
    private boolean commute;

    /**
     * Constructor for objects of class CollegeTuition
     */
    public CollegeCost(String collegeNameIn, int baseTuitionIn, int roomAndBoardIn, int scholarshipIn, boolean commuteIn)
    {
        // initialise instance variables
        collegeName = collegeNameIn;
        baseTuition = baseTuitionIn;
        roomAndBoard = roomAndBoardIn;
        scholarship = scholarshipIn;
        commute = commuteIn;
    }

    /**
     * Gets the name of a CollegeCost object
     * @return collegeName the name of the college
     */
    public String getName()
    {
        return collegeName;
    }
    
    /**
     * Gets the basic tuition of a CollegeCost object
     * @return baseTuition the basic tuition
     */
    public int getTuition()
    {
        return baseTuition;
    }
    
    /**
     * Gets the cost of room and board for a CollegeCost object
     * @return roomAndBoard the cost of room and board
     */
    public int getRoomAndBoard()
    {
        return roomAndBoard;
    }
    
    /**
     * Gets the awarded scholarship amount (if any) for a CollegeCost object
     * @return scholarchip the amount of scholarship money
     */
    public int getScholarship()
    {
        return scholarship;
    }
    
    /**
     * Determines whether the user of a CollegeCost object is a commuter or not
     * @return commute commuter status
     */
    public boolean getCommuterStatus()
    {
        return commute;
    }
    
    /**
     * Sets the name of a CollegeCost object
     * @param collegeNameIn the name of the CollegeCost object
     */
    public void setName(String collegeNameIn)
    {
        collegeName = collegeNameIn;
    }
    
    /**
     * Sets the basic tuition of a CollegeCost object
     * @param baseTuitionIn cost of base tuition
     */
    public void setTuition(int baseTuitionIn)
    {
        baseTuition = baseTuition;
    }
    
    /**
     * Sets the cost of room and board for a CollegeCost object
     * @param roomAndBoardIn cost of room and board
     */
    public void setRoomAndBoard(int roomAndBoardIn)
    {
        roomAndBoard = roomAndBoardIn;
    }
    
    /**
     * Sets the amount of scholarships for a CollegeCost object
     * @param scholarshipIn the scholarship amount awarded
     */
    public void setScholarship(int scholarshipIn)
    {
        scholarship = scholarshipIn;
    }
    
    /**
     * Sets the commuter status of a CollegeCost object
     * @param commuteIn commuter status
     */
    public void setCommute(boolean commuteIn)
    {
        commute = commuteIn;
    }
    
    /**
     * Organizes the CollegeCost instance variables into an easy-to-read format
     * @return formatString the formatted data
     */
    public String toString()
    {
        String formatString = "CollegeCost data: \n";
        formatString = formatString + "College name: " + collegeName  + "\n";
        formatString = formatString + "Base tuition: $" + baseTuition + "\n";
        formatString = formatString + "Cost of room and board: $" + roomAndBoard + "\n";
        formatString = formatString + "Scholarship amount: $" + scholarship + "\n";
        formatString = formatString + "Commuter: " + commute;
        
        return formatString;
    }
    
    /**
     * Finds the yearly cost of attendance for a CollegeCost object
     * @return actualCost the yearly cost of attendance
     */
    public int costOfAttendance()
    {
        int actualCost = (baseTuition + roomAndBoard) - scholarship;
        
        return actualCost;
    }
        
    /**
     * Finds the yearly tuition after FASFA is taken into account
     * @param fasfaAmount amount of FASFA money awarded
     * @return afterFasfa yearly tuition after FASFA
     */
    public int fasfa(int fasfaAmount)
    {
        int afterFasfa = costOfAttendance();
        
        if (fasfaAmount > 0){
            afterFasfa = costOfAttendance() - fasfaAmount;
        }
            
        return afterFasfa;
    }   
    }
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

