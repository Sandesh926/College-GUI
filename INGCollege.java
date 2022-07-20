/** 
 * Created by Sandesh Bhurtyal
 * Computing Faulty C11
 * GUI of INGCollege
 */

import java.awt.*; //Using AWT layouts which contains GUI Component classes,such as Button,Text Field and Label Frame and Panel.
import javax.swing.*;//Using Swing components and containers
import java.awt.event.ActionEvent;//Using Action Event in package java.awt
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class INGCollege implements ActionListener
{
    private JFrame f,f1;
    private JPanel p,p1;

    // Declare a Button component
    private JButton ButtonofAdd,ButtonofRegister,ButtonofDisplay,ButtonofClear,ButtonNonAcademicCourse,
    ButtonofAdd1,ButtonofRemove2,ButtonofRegister2,ButtonofDisplay2,ButtonofClear2,ButtonofAC2;

    // Declare a TextField component
    private JTextField FieldofCourseID ,FieldofCourseName,FieldofDurations,FieldofNumberOfAssessment,FieldofLevel,FieldofCredit,
    FieldofCourseLeader,FieldofLecturerName,text_courseid,text_coursename,text_duration,text_prerequiste,text_courseleader,
    text_lecturer;

    // Declare a ComboBox component
    private JComboBox ComboBoxofCompletionDateYear,ComboBoxofCompletionDateMonth,ComboBoxofCompletionDateDay,
    ComboBoxofStartingDateYear,ComboBoxofStartingDateMonth,ComboBoxofStartingDateDay,
    ComboBoxofCompletionDateYear1,ComboBoxofCompletionDateday1,ComboBoxofCompletionDateMonth1,
    ComboboxofexamYear,Comboboxofexammonth,Comboboxofexamday,ComboBoxofStartingDateYear1,ComboBoxofStartingDateMonth1,
    ComboBoxofStartingDateDay1;

    //Declare a Label component
    private JLabel labelofacademiccourse,labelofCourseID,labelofCourseName,labelofDuration,labelofCredit,labelofNumberOfAssessment,
    labelofLevel,labelofStartingDate,labelofCourseLeader,labelofLecturerName,labelofCompletionDate,label_nonacademiccourse,
    label_courseid,label_coursename,label_duration,label_prerequiste,label_courseleader,label_lecturer,label_startingdate,
    label_date,label_exam;

    //Declare a Font Component
    private Font Font_academiccourse,Font_CourseID;

    static INGCollege sf= new INGCollege();

    //Declare a Array Componet
    ArrayList <Course> ArrayList1 = new ArrayList <Course>();

    public static AcademicCourse AcademicCourse;
    public static NonAcademicCourse NonAcademicCourse;
    //creating GUI of Academic Course
    public void Academic()
    {
        //Frame of Academic Course
        f= new JFrame();
        f.setTitle("Academic Course");
        f.setLayout(null);

        //Jpanel for Academic Course
        p = new JPanel();
        p.setBounds(0, 0,800 ,500);
        p.setLayout(null);
        p.setBackground(new Color(255,218,185));

        //JLabel of Academic Course
        labelofacademiccourse =new JLabel("Academic Course");
        labelofacademiccourse.setForeground(new Color(123,44,22));
        labelofacademiccourse.setBounds(260,20,950,40);
        p.add(labelofacademiccourse);//adding academic course label on panel

        //font of academic course
        Font_academiccourse= new Font("Plantagenet Cherokee",Font.BOLD,30);
        labelofacademiccourse.setFont(Font_academiccourse);
        f.add(labelofacademiccourse);//adding the font of academic course into the panel

        //JLabel of CourseID
        labelofCourseID=new JLabel("CourseID: ");
        labelofCourseID.setBounds(20,80,100,20);

        //Setting font of CourseID
        Font_CourseID = new Font("Arial",Font.PLAIN,15);
        labelofCourseID.setFont(Font_CourseID);
        p.add(labelofCourseID);

        //JTextfield of CourseID
        FieldofCourseID = new JTextField();
        FieldofCourseID .setBounds(190,80,130,25);
        FieldofCourseID .setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofCourseID );

        //Jlabel of Course Name
        labelofCourseName=new JLabel("Course Name: ");
        labelofCourseName.setBounds(20,120,130,20 );
        labelofCourseName.setFont(new Font("Arial,",Font.PLAIN,15));//setting font to the Course Name
        p.add(labelofCourseName);

        //Jtext field of Course Name
        FieldofCourseName = new JTextField();//making a textbox
        FieldofCourseName.setBounds(190,120,130,25);
        FieldofCourseName.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofCourseName);//adding it on to the panel

        //JLabel of Duration
        labelofDuration=new JLabel("Durations: ");
        labelofDuration.setBounds(20,160,130,20 );
        labelofDuration.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofDuration);

        //Jtext field of Duration
        FieldofDurations = new JTextField();
        FieldofDurations.setBounds(190,160,130,25);
        FieldofDurations.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofDurations);//adding it on to the panel

        //Jlabel of Level
        labelofLevel=new JLabel("Level: ");
        labelofLevel.setBounds(20,200,100,20 );
        labelofLevel.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofLevel);

        //Jtext field of Level 
        FieldofLevel = new JTextField();
        FieldofLevel.setBounds(190,200,130,25);
        FieldofLevel.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofLevel);//adding it on to the panel

        //Jlabel of Credit
        labelofCredit=new JLabel("Credit: ");
        labelofCredit.setBounds(20,240,130,20 );
        labelofCredit.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofCredit);

        //JText of Credit
        FieldofCredit = new JTextField();//making a textbox
        FieldofCredit.setBounds(190,240,130,25);
        FieldofCredit.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofCredit);//adding it on to the panel

        //Jlabel of No of Assessment
        labelofNumberOfAssessment=new JLabel("Number of Assessment: ");
        labelofNumberOfAssessment.setBounds(20,280,180,20 );
        labelofNumberOfAssessment.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofNumberOfAssessment);

        //JText of no of Assessment
        FieldofNumberOfAssessment = new JTextField();//making a textbox
        FieldofNumberOfAssessment.setBounds(190,280,130,25);
        FieldofNumberOfAssessment.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofNumberOfAssessment);//adding it on to the panel

        //JLabel of Course leader
        labelofCourseLeader=new JLabel("Course Leader: ");
        labelofCourseLeader.setBounds(380,140,140,20 );
        labelofCourseLeader.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofCourseLeader);

        //JText of Course Leader
        FieldofCourseLeader = new JTextField();//making a textbox
        FieldofCourseLeader.setBounds(510,140,130,25);
        FieldofCourseLeader.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofCourseLeader);//adding it on to the panel

        //JLAbel of Lecturer Name
        labelofLecturerName=new JLabel("Lecturer Name: ");
        labelofLecturerName.setBounds(380,190,140,20 );
        labelofLecturerName.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofLecturerName);

        //JText of Lecturer Name
        FieldofLecturerName = new JTextField();//making a textbox
        FieldofLecturerName.setBounds(510,190,130,25);
        FieldofLecturerName.setFont(new Font("Arial",Font.PLAIN,15));
        p.add(FieldofLecturerName);//adding it on to the panel

        //Jlabel of Starting DAte
        labelofStartingDate=new JLabel("Starting Date: ");
        labelofStartingDate.setBounds(380,240,140,20 );
        labelofStartingDate.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofStartingDate);

        //inserting value in combobox
        String[]year = {"YYYY","1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014", "2015", "2016", "2017",
                "2018", "2019", "2020"};
        //Making Combobox of year
        ComboBoxofStartingDateYear =new JComboBox(year);
        ComboBoxofStartingDateYear.setBounds(510,240,60,20);
        p.add(ComboBoxofStartingDateYear);

        //inserting value in jcombobox
        String[]month ={"MM","January","February","March","April","May","June","July","August","September","October",
                "November","December"};
        //Making Combobox of year
        ComboBoxofStartingDateMonth = new JComboBox(month);
        ComboBoxofStartingDateMonth.setBounds(580,240,80,20);
        p.add(ComboBoxofStartingDateMonth);

        //inserting value in jcombobox of day
        String[]day = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        //Making Combobox of day
        ComboBoxofStartingDateDay = new JComboBox(day);
        ComboBoxofStartingDateDay.setBounds(670,240,45,20);
        p.add(ComboBoxofStartingDateDay);

        //Jlable of Completion Date
        labelofCompletionDate=new JLabel("Completion Date: ");
        labelofCompletionDate.setBounds(380,290,250,20 );
        labelofCompletionDate.setFont(new Font("Arial,",Font.PLAIN,15));
        p.add(labelofCompletionDate);

        //inserting value in combobox
        String[]year1 = {"YYYY","1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014", "2015", "2016", "2017",
                "2018", "2019", "2020"};
        //Making Combobox of year
        ComboBoxofCompletionDateYear =new JComboBox(year);
        ComboBoxofCompletionDateYear.setBounds(510,290,60,20);
        p.add(ComboBoxofCompletionDateYear);

        //inserting value in jcombobox
        String[]month1 ={"MM","January","February","March","April","May","June","July","August","September","October","November",
                "December"};
        //Making Combobox of year
        ComboBoxofCompletionDateMonth = new JComboBox(month);
        ComboBoxofCompletionDateMonth.setBounds(580,290,80,20);
        p.add(ComboBoxofCompletionDateMonth);

        //inserting value in jcombobox of day
        String[]day1 = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        //Making Combobox of day
        ComboBoxofCompletionDateDay = new JComboBox(day);
        ComboBoxofCompletionDateDay.setBounds(670,290,45,20);
        p.add(ComboBoxofCompletionDateDay);

        //Jbutton for add
        ButtonofAdd = new JButton ("Add for Academic course");
        ButtonofAdd.setBounds(20,330,300,40);
        ButtonofAdd.setBackground(new Color(128, 179, 255));
        ButtonofAdd.setFont(new Font("Comic Sans",Font.BOLD,15));
        ButtonofAdd.addActionListener(this);
        ButtonofAdd.setFocusable(false);
        p.add(ButtonofAdd);

        //Jbutton for Register
        ButtonofRegister = new JButton("Register");
        ButtonofRegister.setBounds(380,330,335,40);
        ButtonofRegister.setFocusable(false);
        ButtonofRegister.setBackground( new Color(128, 179, 255));
        ButtonofRegister.addActionListener(this);
        ButtonofRegister.setFont(new Font("Comic Sans",Font.BOLD,15));
        p.add(ButtonofRegister);

        //Jbutton for NonAcademic Course
        ButtonNonAcademicCourse = new JButton("Go Non-Academic Course");
        ButtonNonAcademicCourse.setBounds(380,80,335,40);
        ButtonNonAcademicCourse.setFocusable(false);
        ButtonNonAcademicCourse.setBackground(new Color(128, 179, 255));
        ButtonNonAcademicCourse.addActionListener(this);
        ButtonNonAcademicCourse.setFont(new Font("Comic Sans",Font.BOLD,15));
        p.add(ButtonNonAcademicCourse);

        //Jbutton for Display
        ButtonofDisplay = new JButton("Display");
        ButtonofDisplay.setBounds(200,400,150,40);
        ButtonofDisplay.setFocusable(false);
        ButtonofDisplay.setBackground( new Color(128, 179, 255));
        ButtonofDisplay.addActionListener(this);
        ButtonofDisplay.setFont(new Font("Comic Sans",Font.BOLD,20));
        p.add(ButtonofDisplay);

        //Jbutton for Clear
        ButtonofClear = new JButton ("Clear");
        ButtonofClear.setBounds(350,400,150,40);
        ButtonofClear.setFocusable(false);
        ButtonofClear.setBackground(new Color(200,0,0));
        ButtonofClear.addActionListener(this);
        ButtonofClear.setFont(new Font("Comic Sans",Font.BOLD,20));
        ButtonofClear.setForeground(Color.WHITE);
        p.add(ButtonofClear);

        f.setBounds(200, 150, 750 ,500);
        f.setResizable(false);
        f.setVisible(true);
        f.add(p);
    }
    //GUI Of Non Academic Course
    public void NonAcademic()
    {
        //Jframe of Non Academic Courses
        f1= new JFrame();
        f1.setTitle("NonAcademic");
        f1.setLayout(null);  

        //Jpanel of Non Academic Course
        p1  = new JPanel();
        p1.setBounds(0, 0,770,520);
        p1.setLayout(null);
        p1.setBackground(new Color(255,218,185));

        //Jlabel of Non Academic Course
        label_nonacademiccourse =new JLabel("Non-Academic Course");
        label_nonacademiccourse.setForeground(new Color(123,44,22));
        label_nonacademiccourse.setBounds(210,20,950,40);//Giving its postion and size
        label_nonacademiccourse.setFont(new Font("Plantagenet Cherokee",Font.BOLD,30));
        p1.add(label_nonacademiccourse);//adding l1 on panel

        //JLabel of CourseID
        label_courseid=new JLabel("CourseID: ");
        label_courseid.setBounds(20,80,100,20 );
        label_courseid.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(label_courseid);

        //JTextfield of CourseID
        text_courseid = new JTextField();//making a textbox
        String str1 = text_courseid.getText();
        text_courseid.setBounds(205,80,150,25);
        text_courseid.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_courseid);//adding it on to the panel

        //JLabel of Course Name
        label_coursename=new JLabel("Course Name: ");
        label_coursename.setBounds(20,120,130,20 );
        label_coursename.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_coursename);

        //JText field of CourseName
        text_coursename = new JTextField();//making a textbox
        String duration = text_coursename.getText();
        text_coursename.setBounds(205,120,150,25);
        text_coursename.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_coursename);//adding it on to the p1anel

        //JLabel of Durations
        label_duration=new JLabel("Durations: ");
        label_duration.setBounds(20,160,130,20 );
        label_duration.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_duration);

        //Jtext of Durations
        text_duration= new JTextField();
        String InstructorName =text_duration.getText();
        text_duration.setBounds(205,160,150,25);
        text_duration.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_duration);//adding it on to the p1anel

        //Jlabel of prerequiste
        label_prerequiste=new JLabel("Prerequiste: ");
        label_prerequiste.setBounds(20,200,100,20 );
        label_prerequiste.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_prerequiste);

        //JText of prerequiste
        text_prerequiste = new JTextField();
        String Level= text_prerequiste.getText();
        text_prerequiste.setBounds(205,200,150,25);
        text_prerequiste.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_prerequiste);//adding it on to the p1anel

        //Jlabel of Courseleader
        label_courseleader=new JLabel("Course Leader: ");
        label_courseleader.setBounds(400,140,120,20 );
        label_courseleader.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_courseleader);

        //JText of CourseLeader
        text_courseleader= new JTextField();
        String Str9=text_courseleader.getText();
        text_courseleader.setBounds(530,140,130,25);
        text_courseleader.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_courseleader);//adding it on to the panel

        //Jlabel of LecturerName
        label_lecturer=new JLabel("Lecturer Name: ");
        label_lecturer.setBounds(400,190,120,20);
        label_lecturer.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_lecturer);

        //Jtext of lecturerName
        text_lecturer= new JTextField();//making a textbox
        String str10= text_lecturer.getText();
        text_lecturer.setBounds(530,190,130,25);
        text_lecturer.setFont(new Font("Arial",Font.PLAIN,15));
        p1.add(text_lecturer);//adding it on to the panel

        //Jlabel of Starting Date
        label_startingdate=new JLabel("Starting Date: ");
        label_startingdate.setBounds(400,240,120,20 );
        label_startingdate.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_startingdate);

        //inserting value in combobox
        String[]year = {"YYYY","1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014", "2015", "2016", "2017", "2018", "2019",
                "2020"};
        //Making Combobox of year
        ComboBoxofStartingDateYear1=new JComboBox(year);
        ComboBoxofStartingDateYear1.setBounds(530,240,60,20);
        p1.add(ComboBoxofStartingDateYear1);

        //inserting value in jcombobox
        String[]month ={"MM","January","February","March","April","May","June","July","August","September","October","November",
                "December"};
        //Making Combobox of year
        ComboBoxofStartingDateMonth1 = new JComboBox(month);
        ComboBoxofStartingDateMonth1.setBounds(600,240,80,20);
        p1.add(ComboBoxofStartingDateMonth1);

        //inserting value in jcombobox of day
        String[]day = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        //Making Combobox of day
        ComboBoxofStartingDateDay1 = new JComboBox(day);
        ComboBoxofStartingDateDay1.setBounds(690,240,45,20);
        p1.add(ComboBoxofStartingDateDay1);

        //Jlabel of Completion Date
        label_date=new JLabel("Completion Date: ");
        label_date.setBounds(400,290,140,20 );
        label_date.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_date);

        //inserting value in combobox
        String[]year1 = {"YYYY","1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014", "2015", "2016", "2017", 
                "2018", "2019", "2020"};
        //Making Combobox of year
        ComboBoxofCompletionDateYear1 =new JComboBox(year);
        ComboBoxofCompletionDateYear1.setBounds(530,290,60,20);
        p1.add(ComboBoxofCompletionDateYear1);

        //inserting value in jcombobox
        String[]month1 ={"MM","January","February","March","Ap1ril","May","June","July","August","September","October","November",
                "December"};
        //Making Combobox of Month
        ComboBoxofCompletionDateMonth1= new JComboBox(month);
        ComboBoxofCompletionDateMonth1.setBounds(600,290,80,20);
        p1.add(ComboBoxofCompletionDateMonth1);

        //inserting value in jcombobox of day
        String[]day1 = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        //Making Combobox of day
        ComboBoxofCompletionDateday1= new JComboBox(day);
        ComboBoxofCompletionDateday1.setBounds(690,290,45,20);
        p1.add(ComboBoxofCompletionDateday1);

        //Jlabel of Exam Date
        label_exam=new JLabel("Exam Date: ");
        label_exam.setBounds(400,340,120,20 );
        label_exam.setFont(new Font("Arial,",Font.PLAIN,15));
        p1.add(label_exam);

        //inserting value in combobox
        String[]year2 = {"YYYY","1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", 
                "2007", "2008", "2009", "2010", "2011", "2012", "2013","2014", "2015", "2016", "2017",
                "2018", "2019", "2020"};
        //Making Combobox of year
        ComboboxofexamYear =new JComboBox(year2);
        ComboboxofexamYear.setBounds(530,340,60,20);
        p1.add(ComboboxofexamYear);

        //inserting value in jcombobox
        String[]month2 ={"MM","January","February","March","April","May","June","July","August","September","October","November",
                "December"};
        //Making Combobox of year
        Comboboxofexammonth = new JComboBox(month);
        Comboboxofexammonth.setBounds(600,340,80,20);
        p1.add(Comboboxofexammonth);

        //inserting value in jcombobox of day
        String[]day2 = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16", "17", "18", "19", "20", "21",
                "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        //Making Combobox of day
        Comboboxofexamday = new JComboBox(day);
        Comboboxofexamday.setBounds(690,340,45,20);
        p1.add(Comboboxofexamday);

        //Jbutton for add
        ButtonofAdd1 = new JButton("ADD");
        ButtonofAdd1.setBounds(20,250,335,40);
        ButtonofAdd1.setBackground(new Color(128, 179, 255));
        ButtonofAdd1.addActionListener(this);
        ButtonofAdd1.setFont(new Font("Comic Sans",Font.BOLD,15));
        ButtonofAdd1.setFocusable(false);
        p1.add(ButtonofAdd1);

        //Jbutton for Remove
        ButtonofRemove2 = new JButton("Remove");
        ButtonofRemove2.setBounds(20,310,335,40);
        ButtonofRemove2.setBackground(new Color(128, 179, 255));
        ButtonofRemove2.addActionListener(this);
        ButtonofRemove2.setFont(new Font("Comic Sans",Font.BOLD,15));
        ButtonofRemove2.setFocusable(false);
        p1.add(ButtonofRemove2);

        //Jbutton for Register
        ButtonofRegister2 = new JButton("Register");
        ButtonofRegister2.setBounds(400,380,335,40);
        ButtonofRegister2.setFocusable(false);
        ButtonofRegister2.setBackground( new Color(128, 179, 255));
        ButtonofRegister2.addActionListener(this);
        ButtonofRegister2.setFont(new Font("Comic Sans",Font.BOLD,15));
        p1.add(ButtonofRegister2);

        //jbutton for Go to Academic course 
        ButtonofAC2 = new JButton("Go to Academic Course");
        ButtonofAC2.setBounds(400,80,335,40);
        ButtonofAC2.setFocusable(false);
        ButtonofAC2.setBackground(new Color(128, 179, 255));
        ButtonofAC2.addActionListener(this);
        ButtonofAC2.setFont(new Font("Comic Sans",Font.BOLD,15));
        p1.add(ButtonofAC2);

        //jbutton for Display        
        ButtonofDisplay2= new JButton("Display");
        ButtonofDisplay2.setBounds(240,440,150,40);
        ButtonofDisplay2.setFocusable(false);
        ButtonofDisplay2.setBackground(new Color(128, 179, 255));
        ButtonofDisplay2.addActionListener(this);
        ButtonofDisplay2.setFont(new Font("Comic Sans",Font.BOLD,20));
        p1.add(ButtonofDisplay2);

        //Jbutton for Clear
        ButtonofClear2 = new JButton("Clear");
        ButtonofClear2.setBounds(390,440,150,40);
        ButtonofClear2.setFocusable(false);
        ButtonofClear2.setBackground(new Color(200,0,0));
        ButtonofClear2.addActionListener(this);
        ButtonofClear2.setFont(new Font("Comic Sans",Font.BOLD,20));
        ButtonofClear2.setForeground(Color.WHITE);
        p1.add(ButtonofClear2);

        f1.setBounds(200,200,770,540);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.add(p1);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ButtonNonAcademicCourse)
        {
            f.dispose();
            NonAcademic();
        }
        else if(e.getSource()==ButtonofAC2)
        {
            f1.dispose();
            Academic();
        }
        else if(e.getSource()==ButtonofClear){
            FieldofCourseID.setText("");
            FieldofCourseLeader.setText("");
            FieldofCourseName.setText("");
            FieldofCredit.setText("");
            FieldofDurations.setText("");
            FieldofLecturerName.setText("");
            FieldofLevel.setText("");
            FieldofNumberOfAssessment.setText("");
            ComboBoxofStartingDateDay.setSelectedItem("DD");
            ComboBoxofStartingDateMonth.setSelectedItem("MM");
            ComboBoxofStartingDateYear.setSelectedItem("YYYY");
            ComboBoxofCompletionDateDay.setSelectedItem("DD");
            ComboBoxofCompletionDateYear.setSelectedItem("YYYY");
            ComboBoxofCompletionDateMonth.setSelectedItem("MM");
        }
        else if(e.getSource()==ButtonofClear2){
            text_courseid.setText("");
            text_courseleader.setText("");
            text_coursename.setText("");
            text_duration.setText("");
            text_lecturer.setText("");
            text_prerequiste.setText("");
            ComboBoxofStartingDateYear1.setSelectedItem("YYYY");
            ComboBoxofStartingDateMonth1.setSelectedItem("MM");
            ComboBoxofStartingDateDay1.setSelectedItem("DD");
            ComboBoxofCompletionDateYear1.setSelectedItem("YYYY");
            ComboBoxofCompletionDateMonth1.setSelectedItem("MM");
            ComboBoxofCompletionDateday1.setSelectedItem("DD");
            ComboboxofexamYear.setSelectedItem("YYYY");
            Comboboxofexamday.setSelectedItem("DD");
            Comboboxofexammonth.setSelectedItem("MM");
        }
        else if(e.getSource()==ButtonofAdd)
        {
            String courseID = FieldofCourseID.getText();
            String coursename = FieldofCourseName.getText();
            String duration = FieldofDurations.getText();
            String level = FieldofLevel.getText();
            String credit = FieldofCredit.getText();
            String numberofassessment = FieldofNumberOfAssessment.getText();
            if(courseID.isEmpty()|| coursename.isEmpty()|| duration.isEmpty()|| level.isEmpty()|| credit.isEmpty()||
            numberofassessment.isEmpty())
            {
                //Dialog box for empty field
                JOptionPane filldata = new JOptionPane();
                String message = "Please Fill Empty Space";
                filldata.showMessageDialog(f,message);
            }
            else
            {
                boolean samecourseid=false;
                boolean valid=true;
                for(Course obj: ArrayList1 )
                {
                    if(obj.getCourseID().equals(courseID)) 
                    {
                        //DialogBOx Course Already added
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "CourseID has been already Added";
                        alreadyadded.showMessageDialog(f,message);
                        samecourseid=true;
                        break;
                    }
                }
                if(samecourseid==false){
                    int intduration=0;
                    int intassessment=0;
                    try{
                        intduration=Integer.parseInt(FieldofDurations.getText());
                        intassessment=Integer.parseInt(FieldofNumberOfAssessment.getText());
                    }
                    catch(NumberFormatException exception){
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "Invaild Input";
                        alreadyadded.showMessageDialog(f,message);
                        valid=false;
                    }
                    if(valid==true){
                        AcademicCourse = new AcademicCourse(courseID,coursename,intduration,level,credit,intassessment);
                        ArrayList1.add(AcademicCourse);
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "Course Has Been Added";
                        alreadyadded.showMessageDialog(f,message);
                    }
                }
            }
        }
        else if(e.getSource()==ButtonofAdd1){
            String courseid = text_courseid.getText();
            String coursename = text_coursename.getText();
            String duration = text_duration.getText();
            String prerequisite = text_prerequiste.getText();
            if(courseid.isEmpty() ||coursename.isEmpty() ||duration.isEmpty() ||prerequisite.isEmpty()){
                //Dialoog box for empty field
                JOptionPane filldata = new JOptionPane();
                String message = "Please Fill Empty Space";
                filldata.showMessageDialog(f1,message);
            }
            else{
                boolean samecourseid = false;
                boolean valid = true;
                for(Course obj: ArrayList1){
                    if(obj.getCourseID().equals(courseid)){
                        //DialogBOx Course Already added
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "CourseID has been already Added";
                        alreadyadded.showMessageDialog(f1,message);
                        samecourseid=true;
                        break;
                    }
                }
                if(samecourseid==false){
                    int intduration=0;
                    try{
                        intduration=Integer.parseInt(text_duration.getText());
                    }
                    catch(NumberFormatException exception){
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "Invaild Input";
                        alreadyadded.showMessageDialog(f1,message);
                        valid=false;
                    }
                    if(valid==true){
                        NonAcademicCourse = new NonAcademicCourse(courseid,coursename,intduration,prerequisite);
                        ArrayList1.add(NonAcademicCourse);
                        JOptionPane alreadyadded = new JOptionPane();
                        String message = "Course Has Been Added";
                        alreadyadded.showMessageDialog(f1,message);
                    }
                }
            }
        }else if(e.getSource()==ButtonofRegister){
            String courseid = FieldofCourseID.getText();
            String courseleader = FieldofCourseLeader.getText();
            String lecturername = FieldofLecturerName.getText();
            String startingyear = (ComboBoxofStartingDateYear.getSelectedItem()).toString();
            String startingmonth = (ComboBoxofStartingDateMonth.getSelectedItem()).toString();
            String startingday = (ComboBoxofStartingDateDay.getSelectedItem()).toString();
            String completionyear = (ComboBoxofCompletionDateYear.getSelectedItem()).toString();
            String completionmonth = (ComboBoxofCompletionDateMonth.getSelectedItem()).toString();
            String completionday = (ComboBoxofCompletionDateDay.getSelectedItem()).toString();
            String startingdate = startingyear + startingmonth + startingday;
            String completiondate = completionyear + completionmonth + completionday;
            if(courseid.isEmpty()|| courseleader.isEmpty()|| lecturername.isEmpty()|| startingyear.equals("YYYY")|| 
            startingmonth.equals("MM")|| startingday.equals("DD")|| completionyear.equals("YYYY")|| completionmonth.equals("MM")
            || completiondate.equals("DD")){
                //Dialoog box for empty field
                JOptionPane filldata = new JOptionPane();
                String message = "Please Fill Empty Space";
                filldata.showMessageDialog(f,message);
            }
            else{
                boolean samecourseid = false;
                for(Course obj: ArrayList1){
                    if(obj.getCourseID().equals(courseid)){
                        if(obj instanceof AcademicCourse){
                            AcademicCourse = (AcademicCourse) obj;
                            samecourseid=true;
                            if(AcademicCourse.getIsRegistered()==false){
                                AcademicCourse.register(courseleader,lecturername,startingdate,completiondate);
                                JOptionPane filldata = new JOptionPane();
                                String message = "Academic Course Is Registered.";
                                filldata.showMessageDialog(f,message);
                                ArrayList1.add(AcademicCourse);
                                break;
                            }
                            else{
                                JOptionPane filldata = new JOptionPane();
                                String message = "Academic Course Is Already Registered.";
                                filldata.showMessageDialog(f,message); 
                                break;
                            }
                        }
                    }
                }
                if(samecourseid == false){
                    JOptionPane filldata = new JOptionPane();
                    String message = "The CourseID To Be Registered Is Empty";
                    filldata.showMessageDialog(f,message); 
                }
            }
        }
        else if(e.getSource()==ButtonofRegister2){
            String courseid = text_courseid.getText();
            String courseleader = text_courseleader.getText();
            String instructorname = text_lecturer.getText();
            String startingyear = (ComboBoxofStartingDateYear1.getSelectedItem()).toString();
            String startingmonth = (ComboBoxofStartingDateMonth1.getSelectedItem()).toString();
            String startingday = (ComboBoxofStartingDateDay1.getSelectedItem()).toString();
            String completionyear = (ComboBoxofCompletionDateYear1.getSelectedItem()).toString();
            String completionmonth = (ComboBoxofCompletionDateMonth1.getSelectedItem()).toString();
            String completionday = (ComboBoxofCompletionDateday1.getSelectedItem()).toString();
            String examyear = (ComboboxofexamYear.getSelectedItem()).toString();
            String exammonth = (Comboboxofexammonth.getSelectedItem()).toString();
            String examday = (Comboboxofexamday.getSelectedItem()).toString();
            String examdate = examyear + exammonth + examday;
            String startingdate = startingyear + startingmonth + startingday;
            String completiondate = completionyear + completionmonth + completionday;

            if(courseid.isEmpty()|| courseleader.isEmpty()|| instructorname.isEmpty()|| startingyear.equals("YYYY")|| 
            startingmonth.equals("MM")|| startingday.equals("DD")|| completionyear.equals("YYYY")|| completionmonth.equals("MM")
            || completiondate.equals("DD") || examyear.equals("YYYY")|| exammonth.equals("MM") || examdate.equals("DD") ){
                //Dialoog box for empty field
                JOptionPane filldata = new JOptionPane();
                String message = "Please Fill Empty Space";
                filldata.showMessageDialog(f1,message);
            }
            else{
                boolean samecourseid = false;
                for(Course obj: ArrayList1){
                    if(obj.getCourseID().equals(courseid)){
                        if(obj instanceof NonAcademicCourse){
                            NonAcademicCourse = (NonAcademicCourse) obj;
                            samecourseid=true;
                            if(NonAcademicCourse.getIsRegistered()==false){
                                NonAcademicCourse.register(courseleader,instructorname,startingdate,completiondate,examdate);
                                JOptionPane filldata = new JOptionPane();
                                String message = "NonAcademic Course Is Registered.";
                                filldata.showMessageDialog(f1,message);
                                ArrayList1.add(NonAcademicCourse);
                                break;
                            }
                            else{
                                JOptionPane filldata = new JOptionPane();
                                String message = "NonAcademic Course Is Already Registered.";
                                filldata.showMessageDialog(f1,message); 
                                break;
                            }
                        }
                    }
                }
                if(samecourseid == false){
                    JOptionPane filldata = new JOptionPane();
                    String message = "The CourseID To Be Registered Is Empty";
                    filldata.showMessageDialog(f1,message); 
                }
            }
        }
        else if(e.getSource()==ButtonofDisplay){
            boolean empty = true;
            boolean samecourseid = false;
            for(Course obj: ArrayList1){
                empty=false;
                if(obj.getCourseID().equals(FieldofCourseID.getText())){
                    samecourseid=true;
                    if(obj instanceof AcademicCourse)
                    {
                        AcademicCourse = (AcademicCourse) obj;
                        JOptionPane filldata = new JOptionPane();
                        String message = "\n The Course ID is "+AcademicCourse.getCourseID() +
                            "\n The Course Name is "+AcademicCourse.getCourseName() + 
                            "\n The Duration is "+AcademicCourse.getDuration() + 
                            "\n The Level is "+AcademicCourse.getLevel() +
                            "\n The Credit is "+AcademicCourse.getCredit() +
                            "\n The Number Of Asessments is "+AcademicCourse.getNumberOfAssessments() + 
                            "\n The Course Leader is "+AcademicCourse.getCourseLeader() + 
                            "\n The Lecturer Name is "+AcademicCourse.getLecturerName() + 
                            "\n The Starting Date is "+AcademicCourse.getStartingDate() + 
                            "\n The Completion Date is "+AcademicCourse.getCompletionDate();
                        filldata.showMessageDialog(f,message); 
                        break;
                    }
                }
            }
            if(empty==true){
                JOptionPane filldata = new JOptionPane();
                String message = "Course Must be Added Or Registered Before Displaying";
                filldata.showMessageDialog(f1,message); 
            }
            else if(samecourseid==false){
                JOptionPane filldata = new JOptionPane();
                String message = "No CourseID Was Found To Be Displayed.";
                filldata.showMessageDialog(f1,message); 
            }
        }
        else if(e.getSource()==ButtonofDisplay2){
            boolean empty = true;
            boolean samecourseid = false;
            for(Course obj: ArrayList1){
                empty=false;
                if(obj.getCourseID().equals(text_courseid.getText())){
                    samecourseid=true;
                    if(obj instanceof NonAcademicCourse)
                    {
                        NonAcademicCourse = (NonAcademicCourse) obj;
                        JOptionPane filldata = new JOptionPane();
                        String message = "\n The Course ID is "+NonAcademicCourse.getCourseID() +
                            "\n The Course Name is "+NonAcademicCourse.getCourseName() + 
                            "\n The Duration is "+NonAcademicCourse.getDuration() + 
                            "\n The Prerequisite is "+NonAcademicCourse.getPrerequisite() +
                            "\n The Course Leader is "+NonAcademicCourse.getCourseLeader() + 
                            "\n The Lecturer Name is "+NonAcademicCourse.getInstructorName() + 
                            "\n The Starting Date is "+NonAcademicCourse.getStartDate() + 
                            "\n The Completion Date is "+NonAcademicCourse.getCompletionDate() +
                            "\n The Exam Date is "+NonAcademicCourse.getExamDate() ;
                        filldata.showMessageDialog(f1,message);
                        break;
                    }
                }
            }
            if(empty==true){
                JOptionPane filldata = new JOptionPane();
                String message = "Course Must be Added Or Registered Before Displaying";
                filldata.showMessageDialog(f1,message); 
            }
            else if(samecourseid==false){
                JOptionPane filldata = new JOptionPane();
                String message = "No CourseID Was Found To Be Displayed.";
                filldata.showMessageDialog(f1,message); 
            }
        }
        else if(e.getSource()==ButtonofRemove2){
            boolean samecourseid=false;
            boolean alreadyremoved=false;
            if(ArrayList1.isEmpty()){
                JOptionPane filldata = new JOptionPane();
                String message = "Course Must be Added Or Registered Before Removing.";
                filldata.showMessageDialog(f1,message); 
            }
            else{
                for(Course obj: ArrayList1){
                    if(obj.getCourseID().equals(text_courseid.getText())){
                        samecourseid=true;
                        if(obj instanceof NonAcademicCourse){
                            NonAcademicCourse=(NonAcademicCourse) obj;
                            if(NonAcademicCourse.getIsRemoved()==false){
                                NonAcademicCourse.remove();
                                JOptionPane filldata = new JOptionPane();
                                String message = "Course Has Been Removed.";
                                filldata.showMessageDialog(f1,message); 
                                break;
                            }
                            else{
                                alreadyremoved=true;
                                break;
                            }
                        }
                    }
                }
                if(samecourseid==false){
                    JOptionPane filldata = new JOptionPane();
                    String message = "Course Doesn't Exist.";
                    filldata.showMessageDialog(f1,message); 
                }
                else if(alreadyremoved==true){
                    JOptionPane filldata = new JOptionPane();
                    String message = "Course Has Already Been Removed Cannot Be Removed Again.";
                    filldata.showMessageDialog(f1,message); 
                }
            }
        }
    }
    public static void main (String[] args){
        INGCollege obj = new INGCollege();
        obj.Academic();
    }
} 