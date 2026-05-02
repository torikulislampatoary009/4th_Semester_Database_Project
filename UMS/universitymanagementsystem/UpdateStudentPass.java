package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UpdateStudentPass extends JFrame implements ActionListener{
    JLabel StudentName,FacultyID,MotherName,FatherName,DOB,Mobile,Password,la,StudentFrom,StudentB,StudentD;
    JTextField studentName,facultyID,iMN,iFN,Dob,mobile,password,studentB,studentD;
    //JPasswordField Password;
    JButton Add,back;
    static int F=0;
    UpdateStudentPass(){
    
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     StudentFrom= new JLabel("Give These Information");
     StudentFrom.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,35));
     StudentFrom.setForeground(Color.BLACK);
     StudentFrom.setBounds(10,10,300,30);      
     add(StudentFrom);
     
        
     FacultyID= new JLabel("Student ID  :");
     FacultyID.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     FacultyID.setForeground(Color.BLACK);
     FacultyID.setBounds(30,60,300,20);      
     add(FacultyID);
     
     facultyID=new JTextField();    
     facultyID.setBounds(340,60,250, 20);
     add(facultyID);
        
     Password= new JLabel("New Password    :");
     Password.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     Password.setForeground(Color.BLACK);
     Password.setBounds(30,100,300,20);      
     add(Password);
     
     password=new JTextField();
     password.setBounds(340,100,250, 20);
     add(password);
     
     
     Add=new JButton("Next");
     Add.setBounds(340,140,120,35);
     Add.setFont(new Font("Arial",Font.BOLD,20));
     //  ems.setBackground(Color.BLUE);
     //ems.setForeground(Color.WHITE);
     Add.addActionListener(this);
     add(Add);
     
     back=new JButton("Back");
     back.setBounds(480,140,120,35);
     back.setFont(new Font("Arial",Font.BOLD,20));
     //  ems.setBackground(Color.BLUE);
     //ems.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);
     
     if(F==1){
         la=new JLabel("Succesfully Done");
        // la.setForeground(Color.PINK);
        // la.setFont(new Font("Arial",Font.BOLD,25));
         setBounds(270,350,200,20);
         add(la);       
       }
     
    setLocation(500,250);
    setSize(1000,700);
    setVisible(true);
   }
    
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Add){
          /* StudentTamplate s= new StudentTamplate(studentName.getText(),studentID.getText(),studentB.getText(),studentD.getText(),iMN.getText(),iFN.getText(),Dob.getText(),mobile.getText(),Password.getText());
           sList.put(studentID.getText(), s);  
           setVisible(false);
           F=1;*/
           try {
              
            String query="update student set pass='"+password.getText()+"' where id='"+facultyID.getText()+"'";
            
            Conn con=new Conn();
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
             new UpdateStudentPass();
           } catch (Exception e) {
              e.printStackTrace();
           }
           
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new UniversityServer();
        }
      }
     /* public static void main(String[] args) {
        new AddStudent();
    }*/
}



