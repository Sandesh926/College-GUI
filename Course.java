/**
 * Creating Course class
 * @Sandesh Bhurtyal
 */
public class Course
{
    //instance variables
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;

    /**
     * Parameterized Constructor.
     * @parameter courseID, courseName, duration.
     * Initialise instance variable..
     */
    public Course(String courseID, String courseName, int duration)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }

    // getter method for courseID.
    public String getCourseID()
    {
        return courseID;
    }

    // getter method for courseName.
    public String getCourseName()
    {
        return courseName;
    }

    // getter method for duration.
    public int getDuration()
    {
        return duration;
    }

    // getter method for courseLeader.
    public String getCourseLeader()
    {
        return courseLeader;
    }

    // setter method for courseLeader.
    public void setCourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }

    // display method.
    public void display()
    {
        System.out.println("The CourseId is " + courseID);
        System.out.println("The Course name is " + courseName);
        System.out.println("The Course time period  is " + duration);

        /*
         * if courseLeader value is not empty then print the value.
         */
        if(courseLeader != "")
        {
            System.out.println("The Course leader is " + this.getCourseLeader());
        }
    }
}

