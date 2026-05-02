
package universitymanagementsystem;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class UpdateStudent extends JFrame implements ActionListener{
    
    JLabel StudentID;
    JTextField inputUID;
    JButton name,batch,cell,pass,back;
    JTable table;
    UpdateStudent(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel update= new JLabel("What Information you Want to Update");
        update.setBounds(10,10,250,40);      
        add(update);
        
        /*name=new JButton("NAME");
        name.setBounds(10,50,100,30);
        name.setBackground(Color.BLACK);
        name.setForeground(Color.WHITE);
        name.addActionListener(this);
        add(name);*/
       
        batch=new JButton("Batch");
        batch.setBounds(10,90,100,30);
        batch.setBackground(Color.BLACK);
        batch.setForeground(Color.WHITE);
        batch.addActionListener(this);
        add(batch);
         
        cell=new JButton("CELL");
        cell.setBounds(10,120,100,30);
        cell.setBackground(Color.BLACK);
        cell.setForeground(Color.WHITE);
        cell.addActionListener(this);
        add(cell);
         
        pass=new JButton("Pass");
        pass.setBounds(10,160,100,30);
        pass.setBackground(Color.BLACK);
        pass.setForeground(Color.WHITE);
        pass.addActionListener(this);
        add(pass);
        
        back=new JButton("Back");
        back.setBounds(10,200,100,20);
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
        setSize(700,500);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==batch)
       {
           setVisible(false);
          // new UpdateFacultyBatch();
       }
       else if(ae.getSource()==cell)
       {
           setVisible(false);
          // new UpdateFacultyCell();
       }
       else if(ae.getSource()==pass)
       {
           setVisible(false);
           new UpdateStudentPass();
       }
       else
      {
          setVisible(false);new UniversityServer();
      }
    }
}
    

