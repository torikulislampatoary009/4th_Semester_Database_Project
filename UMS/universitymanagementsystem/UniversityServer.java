package universitymanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UniversityServer extends JFrame implements ActionListener{
    JButton Back;
    JMenuBar mb;
    JMenu info,add,leave,update,debit,credit,fee;
    JMenuItem facultyInfo,StudentInfo,staupInfo,addFaculty,addStudent,addStaup,leaveFaculty,leaveStudent,leaveStaup,updateFaculty,updateStudent,updateStaup,SemesterFee,AdmissionFee,Semesterfee,Admissionfee,Salary,Equipment,Other;
    UniversityServer(){
    
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        mb=new JMenuBar();
        setJMenuBar(mb);
        
        info=new JMenu("Information");
        info.setForeground(Color.RED);
        info.setBackground(Color.RED);
        mb.add(info);
        
        facultyInfo=new JMenuItem("Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        info.add(facultyInfo);
        
        StudentInfo=new JMenuItem("Student Information");
        StudentInfo.setBackground(Color.WHITE);
        StudentInfo.addActionListener(this);
        info.add(StudentInfo);
        
        staupInfo=new JMenuItem("Staup Information");
        staupInfo.setBackground(Color.WHITE);
        staupInfo.addActionListener(this);
        info.add(staupInfo);
        

        add=new JMenu("Add");
        add.setForeground(Color.RED);
        add.setBackground(Color.RED);
        mb.add(add);
        
        addFaculty=new JMenuItem("Add New Faculty");
        addFaculty.setBackground(Color.WHITE);
        addFaculty.addActionListener(this);
        add.add(addFaculty);
        
        addStudent=new JMenuItem("Add New Student");
        addStudent.setBackground(Color.WHITE);
        addStudent.addActionListener(this);
        add.add(addStudent);
        
        addStaup=new JMenuItem("Add New Staup");
        addStaup.setBackground(Color.WHITE);
        addStaup.addActionListener(this);
        add.add(addStaup);

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i4=image.getImage().getScaledInstance(160, 140, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel label2=new JLabel(i5);
        label2.setBounds(1,1,160,140);
        add(label2);
        
        JLabel username= new JLabel("FENI UNIVERSITY SERVER");
        username.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,70));
        username.setForeground(Color.BLACK);
        username.setBounds(170,1,950,100);      
        add(username);
        
        JLabel name= new JLabel("Developed And Maintainend By"
                + " Torikul Islam Patoary"
                + " ID:242031009(33th_UG");
        name.setForeground(Color.BLACK);
        name.setBounds(170,50,800,100);      
        add(name);
        
        leave=new JMenu("Leave");
        leave.setForeground(Color.RED);
        leave.setBackground(Color.RED);
        mb.add(leave);
        
        leaveFaculty=new JMenuItem("Faculty");
        leaveFaculty.setBackground(Color.WHITE);
        leaveFaculty.addActionListener(this);
        leave.add(leaveFaculty);
        
        leaveStudent=new JMenuItem("Student");
        leaveStudent.setBackground(Color.WHITE);
        leaveStudent.addActionListener(this);
        leave.add(leaveStudent);
        
        leaveStaup=new JMenuItem("Staup");
        leaveStaup.setBackground(Color.WHITE);
        leaveStaup.addActionListener(this);
        leave.add(leaveStaup);

        update=new JMenu("update");
        update.setForeground(Color.RED);
        update.setBackground(Color.RED);
        mb.add(update);
        
        updateFaculty=new JMenuItem("Faculty");
        updateFaculty.setBackground(Color.WHITE);
        updateFaculty.addActionListener(this);
        update.add(updateFaculty);
        
        updateStudent=new JMenuItem("Student");
        updateStudent.setBackground(Color.WHITE);
        updateStudent.addActionListener(this);
        update.add(updateStudent);
        
        updateStaup=new JMenuItem("Staup");
        updateStaup.setBackground(Color.WHITE);
        updateStaup.addActionListener(this);
        update.add(updateStaup);

        
        fee=new JMenu("fee");
        mb.add(fee);
        
        AdmissionFee=new JMenuItem("Admission Fee");
        AdmissionFee.addActionListener(this);
        fee.add(AdmissionFee);
        
        SemesterFee=new JMenuItem("Semester Fee");
        SemesterFee.addActionListener(this);
        fee.add(SemesterFee);
        
        debit=new JMenu("Debit");
        mb.add(debit);
        
        Admissionfee=new JMenuItem("Admission Fee");
        Admissionfee.addActionListener(this);
        debit.add(Admissionfee);
        
        Semesterfee=new JMenuItem("Semester Fee");
        Semesterfee.addActionListener(this);
        debit.add(Semesterfee);
        
        credit=new JMenu("Credit");
        mb.add(credit);
        
        Salary=new JMenuItem("Salary Expense");
        Salary.addActionListener(this);
        credit.add(Salary);
        
        Equipment=new JMenuItem("Equipment Expense");
        Equipment.addActionListener(this);
        credit.add(Equipment);
        
        Other=new JMenuItem("Other Expense");
        Other.addActionListener(this);
        credit.add(Other);
       /* StudentInfo=new JButton("Student Information");
        StudentInfo.setBounds(1330,13,180,30);
        StudentInfo.setFont(new Font("Arial",Font.BOLD,14));
        StudentInfo.setBackground(Color.BLUE);
        StudentInfo.setForeground(Color.WHITE);
        StudentInfo.addActionListener(this);
        add(StudentInfo);
        
        FacultyInfo=new JButton("Faculty Information");
        FacultyInfo.setBounds(1130,13,180,30);
        FacultyInfo.setFont(new Font("Arial",Font.BOLD,14));
        FacultyInfo.setBackground(Color.BLUE);
        FacultyInfo.setForeground(Color.WHITE);
        FacultyInfo.addActionListener(this);
        add(FacultyInfo);
        
        addNewFaculty=new JButton("Add New Faculty");
        addNewFaculty.setBounds(1530,13,170,30);
        addNewFaculty.setFont(new Font("Arial",Font.BOLD,14));
        addNewFaculty.setBackground(Color.BLUE);
        addNewFaculty.setForeground(Color.WHITE);
        addNewFaculty.addActionListener(this);
        add(addNewFaculty);
     
        
        addNewStudent=new JButton("Add New Student");
        addNewStudent.setBounds(1730,13,170,30);
        addNewStudent.setFont(new Font("Arial",Font.BOLD,14));
        addNewStudent.setBackground(Color.BLUE);
        addNewStudent.setForeground(Color.WHITE);
        addNewStudent.addActionListener(this);
        add(addNewStudent);*/
        
        Back=new JButton("Back");
       // cancel.setBounds(1780,50,120,30);
        Back.setBackground(Color.LIGHT_GRAY);
        Back.setForeground(Color.RED);
        Back.addActionListener(this);
        mb.add(Back);
     
        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("Image/image2.jpg"));
        Image i2=image1.getImage().getScaledInstance(1600, 1200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(1,140,1600,1200);
        add(label1);
        
        setSize(1000,800);
        setLocation(500,200);
        setVisible(true);
   }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==Back) {
           setVisible(false);
           new Main();
       }
       else if(ae.getSource()==StudentInfo){
           setVisible(false);
           new StudentInfo();
       }
       else if(ae.getSource()==facultyInfo)
       {
           setVisible(false);
           new FacultyInfo();
       }
        else if(ae.getSource()==staupInfo)
       {
           setVisible(false);
           //new StaupInfo();
       }
       else if(ae.getSource()==addFaculty)
       {
           setVisible(false);
           new AddFaculty();
       }
       else if(ae.getSource()==addStudent){
           setVisible(false);
           new AddStudent();
       }
        else if(ae.getSource()==addStaup){
           setVisible(false);
          // new AddStaup();
       }
       else if(ae.getSource()==leaveFaculty)
       {
           setVisible(false);
           new DeleteFaculty();
       }
       else if(ae.getSource()==leaveStudent){
           setVisible(false);
           new DeleteStudent();
       }
        else if(ae.getSource()==leaveStaup){
           setVisible(false);
          // new LeaveStaup();
       }
        else if(ae.getSource()==updateFaculty)
       {
           setVisible(false);
           new UpdateFaculty();
       }
       else if(ae.getSource()==updateStudent){
           setVisible(false);
           new UpdateStudent();
       }
        else if(ae.getSource()==updateStaup){
           setVisible(false);
          // new UpdateStaup();
       }
     }
    
    public static void main(String[] args) {
        new UniversityServer();
    }
    
}
