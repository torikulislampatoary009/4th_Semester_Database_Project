package cms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu Business,Contact;
    JMenuItem SS,Hotel,IT,RealStated,Education;
    JButton Registration;
    Dashboard(){
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
        
       
       
       //setLocation()
       // for(int i=0;i<3;i++){
       /*ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("Image/bing.com.jpeg"));
        Image i4=image.getImage().getScaledInstance(160, 140, Image.SCALE_DEFAULT);
        ImageIcon i5=new ImageIcon(i4);
        JLabel label2=new JLabel(i5);
        label2.setBounds(1,1,160,140);
        add(label2);*/
        
        JLabel Name= new JLabel("Client Management System");
        Name.setFont(new Font("Monospaced",Font.BOLD+Font.PLAIN,40));
        Name.setForeground(Color.BLACK);
        Name.setBounds(170,0,950,100);      
        add(Name);
        
        mb=new JMenuBar();
        setJMenuBar(mb);
        
        Business=new JMenu("Business");
        mb.add(Business);

        SS=new JMenuItem("Supper Shop");
        Business.add(SS);
        
        Hotel=new JMenuItem("Hotel");
        Business.add(Hotel);

        IT =new JMenuItem("IT");
        IT.addActionListener(this);
        Business.add(IT);

        RealStated=new JMenuItem("Real Stated");
        Business.add(RealStated);

        Education=new JMenuItem("Education");
        Business.add(Education);

        Contact =new JMenu("Contact");
        mb.add(Contact);

        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("Image/me.jpg"));
        Image i2=image1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1=new JLabel(i3);
        label1.setBounds(0,500,200,200);
        add(label1);
       
        JLabel name=new JLabel("Torikul Islam Patoary");
        name.setBounds(280,600,1000,30);
        add(name);

        JLabel id=new JLabel("242031009");
        id.setBounds(280,650,200,30);
        add(id);

        /*ImageIcon masageC=new ImageIcon(ClassLoader.getSystemResource("Image/MFC.jpg"));
        Image last=masageC.getImage().getScaledInstance(300, 1100, Image.SCALE_DEFAULT);
        ImageIcon last1=new ImageIcon(last);
        JLabel label3=new JLabel(last1);
        label3.setBounds(1610,30,300,1200);
        add(label3);*/
        
        setSize(1000,800);
        setLocation(500,200);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==SS){
           setVisible(false);
           new SupperShop();
        }
        else if(e.getSource()==Hotel){
            setVisible(false);
           // new Hotel();     
        }
        else if(e.getSource()==IT){setVisible(false);new ITlogin();}
        else if(e.getSource()==RealStated){}
        else if(e.getSource()==Education){setVisible(false);new Education();}
        else{
            setVisible(false);
            new Registration();
        }
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}
