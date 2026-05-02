package universitymanagementsystem;

import java.awt.Color;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class FacultyInfo extends JFrame implements ActionListener{
    
    JLabel StudentID;
    JTextField inputUID;
    JButton next,back;
    JTable table;
    FacultyInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        StudentID= new JLabel("Faculty ID");
        StudentID.setBounds(40,40,100,20);      
        add(StudentID);
        
        inputUID=new JTextField();
        inputUID.setBounds(110,40,150, 20);
        add(inputUID);
        
        next=new JButton("search");
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
       
        /*delete=new JButton("Delete");
        delete.setBounds(530,40,100,20);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);*/

        table = new JTable();

        JScrollPane jp=new JScrollPane(table);
        jp.setBounds(0,140,1200,580);
        add(jp);

        setLocation(500,250);
        setSize(1200,700);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
          /*setVisible(false);
          new ShowSInfo(inputUID.getText());*/
          String query="select * from faculty where id='"+inputUID.getText()+"'";
          try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
          }catch(Exception e){
            e.printStackTrace();
          }
      }
       else
      {
          setVisible(false);new UniversityServer();
      }
    }
}
    
