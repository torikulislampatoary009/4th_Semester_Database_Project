
package universitymanagementsystem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Profile extends JFrame implements ActionListener{
    JLabel SName,Sid,SMN,SFN,dob,mobile,sB,sD;
    JButton back;
    Profile(String id){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        SName= new JLabel("Student Name        : "+AddStudent.sList.get(id).name);
        SName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SName.setForeground(Color.BLACK);
        SName.setBounds(20,40,700,30);      
        add(SName);
        
        Sid= new JLabel("Student ID          : "+AddStudent.sList.get(id).id);
        Sid.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        Sid.setForeground(Color.BLACK);
        Sid.setBounds(20,80,600,30);      
        add(Sid);
        
        sB= new JLabel("Student Batch       : "+AddStudent.sList.get(id).batch);
        sB.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sB.setForeground(Color.BLACK);
        sB.setBounds(20,120,600,30);      
        add(sB);
        
        sD= new JLabel("Student Department  : "+AddStudent.sList.get(id).dep);
        sD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sD.setForeground(Color.BLACK);
        sD.setBounds(20,160,600,30);      
        add(sD);
        
        SMN= new JLabel("Student Mother Name : "+AddStudent.sList.get(id).MotherName);
        SMN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SMN.setForeground(Color.BLACK);
        SMN.setBounds(20,200,700,30);      
        add(SMN);
        
        SFN= new JLabel("Student Father Name : "+AddStudent.sList.get(id).FatherName);
        SFN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SFN.setForeground(Color.BLACK);
        SFN.setBounds(20,240,700,30);      
        add(SFN);
        
        
        dob= new JLabel("Date of Birth       : "+AddStudent.sList.get(id).dob);
        dob.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        dob.setForeground(Color.BLACK);
        dob.setBounds(20,280,700,30);      
        add(dob);
        
        mobile= new JLabel("Mobile              : "+AddStudent.sList.get(id).mobile);
        mobile.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        mobile.setForeground(Color.BLACK);
        mobile.setBounds(20,320,700,30);      
        add(mobile);
        
        back=new JButton("Back");
        back.setBounds(30,380,80,30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setLocation(500,250);
        setSize(1000,700);
        setVisible(true);
    }
    
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==back){
           setVisible(false);
           //new Frame1(false);
           new Main();
        }
    }
     /* public static void main(String[] args) {
        new Profile();
    }*/
}
