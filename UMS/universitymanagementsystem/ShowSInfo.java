
package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ShowSInfo extends JFrame implements ActionListener{
    
   // InterSID ob;
    JLabel SName,Sid,SMN,SFN,Dob,mobile,sB,sD;
    JButton back;
    ShowSInfo(String name,String id,String batch,String dept,String mn,String fn,String dob,String cell,String pass){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //new InterSID();
        SName= new JLabel("Student Name      : "+name);
        SName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SName.setForeground(Color.BLACK);
        SName.setBounds(20,40,700,30);      
        add(SName);
        
        Sid= new JLabel("Student ID        : "+id);
        Sid.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        Sid.setForeground(Color.BLACK);
        Sid.setBounds(20,80,700,30);      
        add(Sid);
        
        sB= new JLabel("Student Batch      : "+batch);
        sB.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sB.setForeground(Color.BLACK);
        sB.setBounds(20,120,700,30);      
        add(sB);
        
        
        sD= new JLabel("Student Department  : "+dept);
        sD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        sD.setForeground(Color.BLACK);
        sD.setBounds(20,160,700,30);      
        add(sD);
        
        SMN= new JLabel("Mother Name      : "+mn);
        SMN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SMN.setForeground(Color.BLACK);
        SMN.setBounds(20,200,700,30);      
        add(SMN);
        
        SFN= new JLabel("Father Name      : "+fn);
        SFN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        SFN.setForeground(Color.BLACK);
        SFN.setBounds(20,240,700,30);      
        add(SFN);
        
        
        Dob= new JLabel("Date of Birth     : "+dob);
        Dob.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        Dob.setForeground(Color.BLACK);
        Dob.setBounds(20,280,700,30);      
        add(Dob);
        
        mobile= new JLabel("Mobile           : "+cell);
        mobile.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
        mobile.setForeground(Color.BLACK);
        mobile.setBounds(20,320,700,30);      
        add(mobile);
        
         
        back=new JButton("Back");
        back.setBounds(20,360,80,30);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,700);
        setLocation(500,250);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==back){
           setVisible(false);
           //new Frame1(false);
           new UniversityServer();
        }
    }
   /* public static void main(String[] args) {
        new ShowSInfo();
    }*/
}
