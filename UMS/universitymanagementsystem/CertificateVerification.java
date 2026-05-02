
package universitymanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class CertificateVerification extends JFrame implements ActionListener{
  JButton cVeri,back;
  JTextField inputsID;
 // HashMap<String,Student> map=new HashMap<>();
    CertificateVerification(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i2=image.getImage().getScaledInstance(180, 160, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(150,20,150,200);
        add(label1);
        
        JLabel username= new JLabel("FENI UNIVERSITY");
        username.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,60));
        username.setForeground(Color.BLACK);
        username.setBounds(320,70,850,150);      
        add(username);
        
        JLabel username3= new JLabel("___________________________________________");
        username3.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
        username3.setForeground(Color.BLACK);
        username3.setBounds(130,150,950,100);      
        add(username3);
        
        JLabel username2= new JLabel("Student Certificate/Graduation Verification");
        username2.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
        username2.setForeground(Color.BLACK);
        username2.setBounds(130,200,950,100);      
        add(username2);
        
        JLabel username4= new JLabel("Student ID");
        username4.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
        username4.setForeground(Color.BLACK);
        username4.setBounds(400,300,200,40);      
        add(username4);
        
        inputsID=new JTextField();
        inputsID.setBounds(370,350,250, 20);
        add(inputsID);
        
        JLabel username5= new JLabel("Date of Birth");
        username5.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,30));
        username5.setForeground(Color.BLACK);
        username5.setBounds(380,390,250,40);      
        add(username5);
        
        JTextField inputDoB=new JTextField();
        inputDoB.setBounds(370,440,250, 20);
        add(inputDoB);
        
        JLabel adminN= new JLabel("Developed by: ToRikul Islam Patoary");
        adminN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,18));
        adminN.setForeground(Color.DARK_GRAY);
        adminN.setBounds(10,570,700,30);      
        add(adminN);
        
        JLabel adminD= new JLabel("Bsc in CSE");
        adminD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,18));
        adminD.setForeground(Color.DARK_GRAY);
        adminD.setBounds(10,585,500,30);      
        add(adminD);
        
        JLabel adminU= new JLabel("Feni University,Feni");
        adminU.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,18));
        adminU.setForeground(Color.DARK_GRAY);
        adminU.setBounds(10,600,600,30);      
        add(adminU);
        
        cVeri=new JButton("Verify");
        cVeri.setBounds(370,490,100,30);
        cVeri.setBackground(Color.BLUE);
        cVeri.setForeground(Color.WHITE);
        cVeri.addActionListener(this);
        add(cVeri);
        
        JButton back=new JButton("Back");
        back.setBounds(520,490,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setLocation(500,250);
        setSize(1000,700);
        setVisible(true);
    }
        
    @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==cVeri){
             setVisible(false);
             new Cverify();
          }
          else{
              setVisible(false);
              new Main();
      }
    }
    /*public static void main(String[] args) {
        new CertificateVerification();
    }*/
}
