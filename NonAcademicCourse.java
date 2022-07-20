/**
* Creating NonAcademicCourse class.
* NonAcademicCourse is subclass of Course class.
* @Sandesh Bhurtyal.
*/
public class NonAcademicCourse extends Course
{
     //instance variable.
     private String instructorName;
     private String startDate;
     private String completionDate;
     private String examDate;
     private String prerequisite;
     private boolean isRegistered;
     private boolean isRemoved;
        
     /**
      * Parameterized Constructor.
      * @parameter courseID, courseName, duration, prerequisite.
      * Call super class constructor.
      * Initialise the instance variable.
     */
         
     public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
     {
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate =  "";
        this.isRegistered = false;
        this.isRemoved = false;
     }
        
     // getter method for instructor name.
     public String getInstructorName()
     {
          return instructorName;
     }
        
     
     // getter method for startDate.
     public String getStartDate()
     {
          return startDate;
     }
        
     // getter method for completionDate.
     public String getCompletionDate()
     {
          return completionDate;
     }
        
      // getter method for examDate.
     public String getExamDate()
     {
          return examDate;
     }
        
      // getter method for isRegistered.
     public boolean getIsRegistered()
     {
          return isRegistered;
     }
        
     // getter method for isRemoved.
     public boolean getIsRemoved()
     {
          return isRemoved;
     }
     
     //getter method for Prerequisite
     public String getPrerequisite()
     {
         return prerequisite;
    }
     
     // setter method for instructorName. 
     public void setInstructorName(String instructorName)
     {
         /*
          * if the course is not register then assign the value in instructorName.
          * else print the course is already registered.
          */
         if(isRegistered == false)
         {
            this.instructorName = instructorName;
         }
         else
         {
            System.out.println("The Non academic course is already registered");
         }
     }
        
     // Parameterized register method
     public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate)
     {
         /*
          * Register the course if the course is not register.
          * call the setter method of instructorName.
          * call the setter method of courseLeader from super class.
          * Assign the parameter value.
          * Assign isRegistered to true.
          * if the cousre is already registerd print the course is registered.
         */
         if(isRegistered == false)
         {
             setInstructorName(instructorName);
             setCourseLeader(courseLeader);
             this.startDate = startDate;
             this.completionDate = completionDate;
             this.examDate = examDate;
             this.isRegistered = true;
             this.isRemoved = false;
         }
          else
          {
             System.out.println("The course is already registered.");
          }
        }
        
     // remove method.
     public void remove()
     {
         /*
          * if the course is removed then print the course is already removed.
          * else assign the values.
         */
         if(isRemoved == true)
         {
             System.out.println("The course is already removed");
         }
         else
         {
             super.setCourseLeader("");
             this.instructorName = "";
             this.startDate = "";
             this.completionDate = "";
             this.examDate = "";
             this.isRegistered = false;
             this.isRemoved = true;
            }
        }
        
     // diplay method.
     public void display()
     {
        super.display();
        if(isRegistered == true)
        {
            System.out.println("The name instructor is " + instructorName);
            System.out.println("The starting date is " + startDate);
            System.out.println("The completion date is " + completionDate);
            System.out.println("The xam date is " + examDate);
        }
     }
}