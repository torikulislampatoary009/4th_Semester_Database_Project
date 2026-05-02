package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
public class AddFaculty extends JFrame implements ActionListener{
    static HashMap<String,StudentTamplate> sList=new HashMap<>();
    JLabel StudentName,StudentID,MotherName,FatherName,DOB,Mobile,password,StudentFrom,StudentB,StudentD;
    JTextField studentName,studentID,iMN,iFN,Dob,mobile,Password,studentB,studentD;
    //JPasswordField Password;
    JButton Add,back;
    AddFaculty(){
    
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     StudentFrom= new JLabel("Faculty Form");
     StudentFrom.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,35));
     StudentFrom.setForeground(Color.BLACK);
     StudentFrom.setBounds(335,10,300,30);      
     add(StudentFrom);
     
        
     StudentName= new JLabel("Faculty Name  :");
     StudentName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     StudentName.setForeground(Color.BLACK);
     StudentName.setBounds(30,60,300,20);      
     add(StudentName);
     
     studentName=new JTextField();    
     studentName.setBounds(340,60,250, 20);
     add(studentName);
        
     StudentID= new JLabel("Faculty ID    :");
     StudentID.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     StudentID.setForeground(Color.BLACK);
     StudentID.setBounds(30,100,300,20);      
     add(StudentID);
     
     studentID=new JTextField();
     studentID.setBounds(340,100,250, 20);
     add(studentID);
     
     StudentB= new JLabel("Faculty Department :");
     StudentB.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     StudentB.setForeground(Color.BLACK);
     StudentB.setBounds(30,140,300,20);      
     add(StudentB);
     
     studentB=new JTextField();
     studentB.setBounds(340,140,250, 20);
     add(studentB);
     
     StudentD= new JLabel("Faculty Nid    :");
     StudentD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     StudentD.setForeground(Color.BLACK);
     StudentD.setBounds(30,180,300,20);      
     add(StudentD);
     
     
     studentD=new JTextField();
     studentD.setBounds(340,180,250, 20);
     add(studentD);
     
     
     MotherName= new JLabel("cell   :");
     MotherName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     MotherName.setForeground(Color.BLACK);
     MotherName.setBounds(30,220,300,20);      
     add(MotherName);
     
     iMN=new JTextField();
     iMN.setBounds(340,220,250, 20);
     add(iMN);
     
     FatherName= new JLabel("Date of Birth   :");
     FatherName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     FatherName.setForeground(Color.BLACK);
     FatherName.setBounds(30,260,300,20);      
     add(FatherName);
     
     iFN=new JTextField();
     iFN.setBounds(340,260,250, 20);
     add(iFN);
     
      
     DOB= new JLabel("Pass :");
     DOB.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     DOB.setForeground(Color.BLACK);
     DOB.setBounds(30,300,300,20);      
     add(DOB);
     
     Dob=new JTextField();
     Dob.setBounds(340,300,250, 20);
     add(Dob);
     
     /*Mobile= new JLabel("Contact No    :");
     Mobile.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     Mobile.setForeground(Color.BLACK);
     Mobile.setBounds(30,340,300,20);      
     add(Mobile);
     
     mobile=new JTextField();
     mobile.setBounds(340,340,250, 20);
     add(mobile);
     
     password= new JLabel("Password      :");
     password.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     password.setForeground(Color.BLACK);
     password.setBounds(30,380,300,20);      
     add(password);
     
     Password=new JPasswordField();
     Password.setBounds(340,380,250, 20);
     add(Password);*/
     
     Add=new JButton("add");
     Add.setBounds(340,420,120,35);
     Add.setFont(new Font("Arial",Font.BOLD,20));
     //  ems.setBackground(Color.BLUE);
     //ems.setForeground(Color.WHITE);
     Add.addActionListener(this);
     add(Add);
     
     back=new JButton("Back");
     back.setBounds(480,420,120,35);
     back.setFont(new Font("Arial",Font.BOLD,20));
     //  ems.setBackground(Color.BLUE);
     //ems.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);
     
     
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
              
            String query="insert into faculty values('"+studentName.getText()+"','"+studentID.getText()+"','"+studentB.getText()+"','"+studentD.getText()+"','"+iMN.getText()+"','"+iFN.getText()+"','"+Dob.getText()+"')";
            
            Conn con=new Conn();
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully added");
            setVisible(false);
             new AddFaculty();
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

