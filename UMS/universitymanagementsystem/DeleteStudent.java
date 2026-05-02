
package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DeleteStudent extends JFrame implements ActionListener{
    
    JLabel studentID;
    JTextField inputUID;
    JButton next,back;
    DeleteStudent(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        studentID= new JLabel("Student ID");
        studentID.setBounds(40,40,100,20);      
        add(studentID);
        
        inputUID=new JTextField();
        inputUID.setBounds(110,40,150, 20);
        add(inputUID);
        
        next=new JButton("next");
        next.setBounds(270,40,100,20);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
       
         
        back=new JButton("Back");
        back.setBounds(400,40,100,20);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
       
        setLocation(500,250);
        setSize(700,500);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
          /*setVisible(false);
          new ShowSInfo(inputUID.getText());*/
          String query="delete from student where id='"+inputUID.getText()+"'";
          try{
            Conn c=new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Delete");
            new DeleteFaculty();
          }catch(Exception e){
            e.printStackTrace();
          }
      }
       else
      {
          setVisible(false);
          new UniversityServer();
      }
    }
}
    

