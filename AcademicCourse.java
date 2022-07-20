/**
 * Creating AcademicCourse class.
 * Here AcademicCourse is sub class of Course.
 * @Sandesh Bhurtyal
 */
import java.awt.*;//importing all the package of java.awt
import javax.swing.*;//importing all the package of java.swing
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;


public class AcademicCourse extends Course
{
    public static void main(String[] Args){
        
    }
    // instance variable.
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    /**
     * Parameterized Constructor.
     * @parameter courseID, courseName, duration, level, credit, numberOfAssessments.
     * Call super class constructor.
     * Initialise the instance variable.
     */
    AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments)
    {
        super(courseID, courseName, duration);
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
    }
    
    // getter method for lecturerName.
    public String getLecturerName()
    {
        return lecturerName;
    }
    
    // getter method for level.
    public String getLevel()
    {
        return level;
    }
    
    // getter method for credit.
    public String getCredit()
    {
        return credit;
    }
    
    // getter method for startingDate.
    public String getStartingDate()
    {
        return startingDate;
    }
    
    // getter method for completionDate.
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    // getter method for numberOfAssessments.
    public int getNumberOfAssessments()
    {
        return numberOfAssessments;
    }
    
    // getter method for IsRegistered.
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    // setter method for lecturerName.
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    
    // setter method for numberOfAssements.
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
    /*
     * Parameterized register method.
     * @parameter courseLeader, lecturerName, startingDate, completionDate.
     */
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        /*
         * if the course is already register then print the course is registered.
         * Else call setter method of courseLeader of super class and assign value.
         * Pass isRegister to true.
         */
        if(isRegistered == true)
        {
            System.out.println("The Course leader name, Lecturer name, Starting date and Completion date is already registered");
        }
        
        else
        {
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    // display method.
    public void display()
    {
        super.display(); // display method of super class.
        
        // if the course is register then print the values.
        if(isRegistered == true)
        {
            System.out.println("The lecturer name is " + lecturerName);
            System.out.println("The level is " + level);
            System.out.println("The credit is " + credit);
            System.out.println("The starting date is " + startingDate);
            System.out.println("The completion date is " + completionDate);
            System.out.println("The number of assessments is " + numberOfAssessments);
        }
    }
}
        
    