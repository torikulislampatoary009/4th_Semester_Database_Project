
package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static universitymanagementsystem.Login.i;
public class Cverify extends JFrame implements ActionListener{
    
    JLabel process;
    JButton back;
    
    Cverify(){
        
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
     process= new JLabel("WOW! Something is wrong! for a while the server is");
     process.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     process.setForeground(Color.BLACK);
     process.setBounds(1,200,800,30);      
     add(process);  
     
     process= new JLabel("will be down sorry for this inconvenience. Retry");
     process.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     process.setForeground(Color.BLACK);
     process.setBounds(1,230,800,30);      
     add(process); 
     
     process= new JLabel("after one hour.Thank You....");
     process.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,25));
     process.setForeground(Color.BLACK);
     process.setBounds(1,260,800,30);      
     add(process); 
     
      back=new JButton("Back");
      back.setBounds(300,320,120,35);
      back.setFont(new Font("Arial",Font.BOLD,20));
     //  ems.setBackground(Color.BLUE);
     //ems.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
     
    setLocation(500,250);
    setSize(800,600);
    setVisible(true);
    }
    
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){  
          setVisible(false);
          new Main();
         }
      }
    /*public static void main(String[] args) {
        new Cverify();
    }*/
}
