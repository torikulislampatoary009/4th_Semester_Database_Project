package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener{
    Thread t;
    JButton cVeri,ems,Registration;
    Main(){
        getContentPane().setBackground(Color.PINK);
         setLayout(null);
         
        
       
       
       //setLocation()
       // for(int i=0;i<3;i++){
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i4=image.getImage().getScaledInstance(160, 140, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel label2=new JLabel(i5);
        label2.setBounds(1,1,160,140);
        add(label2);
        
        JLabel VersityName= new JLabel("FENI UNIVERSITY");
        VersityName.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,70));
        VersityName.setForeground(Color.BLACK);
        VersityName.setBounds(170,1,950,100);      
        add(VersityName);
        
        ems=new JButton("i-EMS");
        ems.setBounds(170,100,80,30);
        ems.setFont(new Font("Arial",Font.BOLD,15));
        ems.setBackground(Color.BLUE);
        ems.setForeground(Color.WHITE);
        ems.addActionListener(this);
        add(ems);
       // if(i==0)
            
       // }
    // public void display1(){
     
        cVeri=new JButton("Certificate Verification");
        cVeri.setBounds(260,100,195,30);
        cVeri.setFont(new Font("Arial",Font.BOLD,14));
        cVeri.setBackground(Color.BLUE);
        cVeri.setForeground(Color.WHITE);
        cVeri.addActionListener(this);
        add(cVeri);
        
        Registration=new JButton("Server");
        Registration.setBounds(470,100,150,30);
        Registration.setFont(new Font("Arial",Font.BOLD,14));
        Registration.setBackground(Color.BLUE);
        Registration.setForeground(Color.WHITE);
        Registration.addActionListener(this);
        add(Registration);
        
        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("Image/image2.jpg"));
        Image i2=image1.getImage().getScaledInstance(1600, 1200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(1,140,1600,1200);
        add(label1);
       
        /*ImageIcon masageC=new ImageIcon(ClassLoader.getSystemResource("Image/MFC.jpg"));
        Image last=masageC.getImage().getScaledInstance(300, 1100, Image.SCALE_DEFAULT);
        ImageIcon last1=new ImageIcon(last);
        JLabel label3=new JLabel(last1);
        label3.setBounds(1610,30,300,1200);
        add(label3);*/
        
        setSize(1000,800);
        setLocation(500,200);
        setVisible(true);
    /* @Override
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
           // new Login(); 
        }catch (Exception e){}
    }
}*/
        
       /* t=new Thread(this);
        t.start();*/
      /* int x=1;
        for(int i=2;i<=600;i+=4,x+=1){
        setLocation(700-((i+x)/2),500-(i/2));
        setSize(i+4*x,i+x/2);
        try{
            Thread.sleep(10);
        }catch(Exception e){}
        }*/
         
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==ems){
           setVisible(false);
           //new Frame1(false);
           new Login();
        }
        else if(e.getSource()==cVeri){
            setVisible(false);
            new CertificateVerification();     
        }
        else{
            setVisible(false);
            new Registration();
        }
    }
   /*public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login(); 
        }catch (Exception e){}
    }*/
    /*public static void main(String[] args) {
        new Main();
    }*/
}
