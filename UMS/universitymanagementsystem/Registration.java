
package universitymanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Registration extends JFrame implements ActionListener{
    JButton login,cancel;
    static  String pas="group1";
    static int f=0;
    //JPasswordField inputPas;
    JTextField inputPas;
    Registration(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i2=image.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(220,20,150,200);
        add(label1);
        
        JLabel password= new JLabel("Password");
        password.setBounds(150,290,100,20);      
        add(password);
        
        inputPas=new JPasswordField();
        inputPas.setBounds(220,290,150, 20);
        add(inputPas);
       
        login=new JButton("Login");
        login.setBounds(170,340,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         
        cancel=new JButton("Back");
        cancel.setBounds(300,340,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        if(f!=0){
            JLabel lab=new JLabel("Password is Incorrect");
            lab.setForeground(Color.RED);
            lab.setFont(new Font("Arial",Font.BOLD,25));
            lab.setBounds(170,380,450,20);
            add(lab);
        }
        setLocation(500,250);
        setSize(650,550);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            if(inputPas.getText().equals(pas)){
             setVisible(false);
             new UniversityServer();
            }
            else{
                f=1;
                setVisible(false);
                new Registration();
            }
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Main();
        }
     }
    
   /* public static void main(String[] args) {
        new Registration();
    }*/
    
}
