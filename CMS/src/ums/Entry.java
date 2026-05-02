
package cms;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Entry extends JFrame implements ActionListener{
    static String pass="group2";
    
    JLabel password,wrong,welcome;
    JTextField Password;
    JButton next;
    static int f=0;
    Entry()
    {
        setLayout(null);
        
        welcome=new JLabel("Welcome To Client Management System");
        welcome.setForeground(Color.green);
        welcome.setFont(new Font("Arial",Font.BOLD,20));
        welcome.setBounds(10,20,500,30);
        add(welcome);
        
        password=new JLabel("Enter Password");
        password.setBounds(20,180,100,30);
        add(password);
        
        Password=new JPasswordField();
        Password.setBounds(120,180,100,30);
        add(Password);
        
        next=new JButton("Next=>");
        next.setBounds(120,220,100,20);
        next.addActionListener(this);
        add(next);
        
        
        if(f==1)
        {
            wrong=new JLabel("Wrong Password");
            wrong.setForeground(Color.RED);
            wrong.setFont(new Font("Arial",Font.BOLD,25));
            wrong.setBounds(50,250,300,30);
            add(wrong);
        }
        setSize(500,400);
        setLocation(500,250);       
        setVisible(true);
    }
    
    
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==next)
        {
            
            if(Password.getText().equals(pass))
            {
                setVisible(false);
                new Dashboard();
            }
            else 
            {
                f=1;
                setVisible(false);
                new Entry();
            }
        }
     } 
     
  /* public static void main(String args[])
    {
        new Entry();
    }*/
    
}
