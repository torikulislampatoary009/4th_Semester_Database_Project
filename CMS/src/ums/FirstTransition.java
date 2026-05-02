package cms;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FirstTransition extends JFrame implements ActionListener
{


    String name,ID,email,cell,pass;
    JTextField id,SAmount,PAmount,Due;
    JButton add,back;
    FirstTransition(String name,String ID,String email,String cell,String pass)
    {
     
    this.name=name;this.ID=ID;this.email=email;this.cell=cell;this.pass=pass;
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
        

     JLabel Id=new JLabel("Client ID");
     Id.setBounds(20,20,100,20);
     add(Id);
     
     id=new JTextField();
     id.setBounds(60,20,100,20);
     add(id);

     JLabel sAmount=new JLabel("Service Amount");
     sAmount.setBounds(20,50,100,20);
     add(sAmount);

     SAmount=new JTextField();
     SAmount.setBounds(60,50,100,20);
     add(SAmount);

     JLabel pAmount=new JLabel("Pay Amount");
     pAmount.setBounds(20,80,100,20);
     add(pAmount);

     PAmount=new JTextField();
     PAmount.setBounds(60,80,100,20);
     add(PAmount);

     JLabel due=new JLabel("Due");
     due.setBounds(20,110,100,20);
     add(due);

     Due=new JTextField();
     Due.setBounds(60,110,100,20);
     add(Due);

     add=new JButton("ADD");
     add.setBounds(20,140,100,20);
     add.addActionListener(this);
     add(add);

     back=new JButton("Back");
     back.setBounds(60,140,100,20);
     back.addActionListener(this);
     add(back);

     setSize(1000,800);
     setLocation(0,0);
     setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
              
            String query="insert into transition values('"+id.getText()+"','"+SAmount.getText()+"','"+PAmount.getText()+"','"+Due.getText()+"')";
            try{
               JdbctoIT con=new JdbctoIT();
               con.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Transition Successfull");
               setVisible(false);
               new FirstTransition(name,ID,email,cell,pass);
           } catch (Exception e) {
              e.printStackTrace();
           }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new ITCompany(name,ID,email,cell,pass);
        }
     }

}