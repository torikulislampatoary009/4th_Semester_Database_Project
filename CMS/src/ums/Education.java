package cms;

import java.awt.*;
import javax.swing.*;
public class Education extends JFrame{
    
    Education()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
         
       
        JLabel slogan=new JLabel("EDUCATION OR BUSINESS...BUSINESS!BUSINESS!");
        slogan.setForeground(Color.BLACK);
        slogan.setFont(new Font("MONOSPACED",Font.BOLD,20));
        slogan.setBounds(30,30,600,20);
        add(slogan);

        setLocation(0,0);
        setSize(1000,800);
        setVisible(true);
    }
   /* public static void main(String args[])
    {
        new Education();
    }*/
}
