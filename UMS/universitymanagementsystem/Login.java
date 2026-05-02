
package universitymanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
public class Login extends JFrame implements ActionListener{
    JTextField inputUID,inputPas;
    JButton login,cancel;int id,pass;
   // JPasswordField inputPas;
    static int i=0;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        /*ImageIcon image6=new ImageIcon(ClassLoader.getSystemResource("Image/image6.jpeg"));
        Image i6=image6.getImage().getScaledInstance(2000, 1500, Image.SCALE_DEFAULT);
        ImageIcon i7=new ImageIcon(i6);
        JLabel label6=new JLabel(i7);
        label6.setBounds(0,0,2000,1500);
        add(label6);
        
        setLocation(0,0);
        setSize(2000,1500);
        setVisible(true);*/
        JLabel userID= new JLabel("User ID");
        userID.setBounds(60,240,100,20);      
        add(userID);
        
        inputUID=new JTextField();
        inputUID.setBounds(170,240,150, 20);
        add(inputUID);
        
        JLabel password= new JLabel("Password");
        password.setBounds(60,290,100,20);      
        add(password);
        
        inputPas=new JPasswordField();
        inputPas.setBounds(170,290,150, 20);
        add(inputPas);
        
        
        login=new JButton("Login");
        login.setBounds(60,340,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        cancel=new JButton("Back");
        cancel.setBounds(220,340,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        JLabel adminN= new JLabel("Developed by: ToRikul Islam Patoary");
        adminN.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,16));
        adminN.setForeground(Color.DARK_GRAY);
        adminN.setBounds(2,430,700,30);      
        add(adminN);
        
        JLabel adminD= new JLabel("Bsc in CSE");
        adminD.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,16));
        adminD.setForeground(Color.DARK_GRAY);
        adminD.setBounds(2,445,500,30);      
        add(adminD);
        
        JLabel adminU= new JLabel("Feni University,Feni");
        adminU.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,16));
        adminU.setForeground(Color.DARK_GRAY);
        adminU.setBounds(2,460,600,30);      
        add(adminU);
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i2=image.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(220,20,150,200);
        add(label1);
        
        ImageIcon image2=new ImageIcon(ClassLoader.getSystemResource("Image/login.jpg"));
        Image i4=image2.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel label2=new JLabel(i5);
        label2.setBounds(380,220,190,180);
        add(label2);
        if(i==1){
        JLabel invalid= new JLabel("User name or Password is invalid");
        invalid.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,16));
        invalid.setForeground(Color.RED);
        invalid.setBounds(50,380,650,30);      
        add(invalid); 
        }
        
        setSize(650,550);
        setLocation(500,250);
        setVisible(true);
        
        /*StudentList s1=new StudentList("Torikul Islam Patoary","242031009","Computer Science and Engineering","33th(UG)","01881809112",4243);
        map.put(242031009, s1);
        
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        pass=sc.nextInt();*/
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){  
         if(AddStudent.sList.get(inputUID.getText()).password.equals(inputPas.getText())){
          i=0;
          setVisible(false);
          new In_I_EMS(inputUID.getText());
         }
         else if(inputPas.getText().isEmpty()){
             
         }
         else{
             i=1;
             setVisible(false);
             new Login();
         }
       }
        else{
            setVisible(false);
            //new Frame1(false);
            new Main();
        }
    }
   /* public static void main(String[] args) {
       new Login();
    }*/
}
