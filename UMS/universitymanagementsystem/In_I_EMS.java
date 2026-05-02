
package universitymanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class In_I_EMS extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu DashBoard,Profile,menue;
    JButton CDP,AC,SE,SuR,SR,RC,OR,OP,back;
    JMenuItem profile;
   static String id;
    In_I_EMS(String id){
        this.id=id;
       new In_I_EMS();
    }
    In_I_EMS(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        mb=new JMenuBar();
        
       /* menue =new JMenu("=");
        DashBoard.setForeground(Color.BLACK);
        DashBoard.setSize(200,50);
        DashBoard.addActionListener(this);
        mb.add(DashBoard);*/
        
        DashBoard =new JMenu("DashBoard");
        DashBoard.setForeground(Color.BLACK);
        DashBoard.setSize(200,50);
        DashBoard.addActionListener(this);
        mb.add(DashBoard);
        
        CDP=new JButton("Check Due & Payments");
        CDP.setBounds(10,20,400,40);
        CDP.setFont(new Font("Arial",Font.BOLD,30));
        CDP.setBackground(Color.BLUE);
        CDP.setForeground(Color.WHITE);
        CDP.addActionListener(this);
        add(CDP);
        
        AC=new JButton("ADMIT CARD");
        AC.setBounds(440,22,300,40);
        AC.setFont(new Font("Arial",Font.BOLD,30));
        AC.setBackground(Color.YELLOW);
        AC.setForeground(Color.BLACK);
        AC.addActionListener(this);
        add(AC);
        
        SE=new JButton("Supplementary Exam");
        SE.setBounds(780,22,350,40);
        SE.setFont(new Font("Arial",Font.BOLD,30));
        SE.setBackground(Color.LIGHT_GRAY);
        SE.setForeground(Color.WHITE);
        SE.addActionListener(this);
        add(SE);
        
        SuR=new JButton("Supplementary result");
        SuR.setBounds(1160,22,350,40);
        SuR.setFont(new Font("Arial",Font.BOLD,30));
        SuR.setBackground(Color.PINK);
        SuR.setForeground(Color.WHITE);
        SuR.addActionListener(this);
        add(SuR);
        
        SR=new JButton("Semester Result");
        SR.setBounds(1540,22,340,40);
        SR.setFont(new Font("Arial",Font.BOLD,30));
        SR.setBackground(Color.BLACK);
        SR.setForeground(Color.WHITE);
        SR.addActionListener(this);
        add(SR);
        
         
        RC=new JButton("Registered Courses");
        RC.setBounds(10,70,340,40);
        RC.setFont(new Font("Arial",Font.BOLD,30));
        RC.setBackground(Color.LIGHT_GRAY);
        RC.setForeground(Color.BLUE);
        RC.addActionListener(this);
        add(RC);
        
        OR=new JButton("Online Registration");
        OR.setBounds(380,70,340,40);
        OR.setFont(new Font("Arial",Font.BOLD,30));
        OR.setBackground(Color.CYAN);
        OR.setForeground(Color.BLACK);
        OR.addActionListener(this);
        add(OR);
        
        OP=new JButton("Online Payment");
        OP.setBounds(750,70,300,40);
        OP.setFont(new Font("Arial",Font.BOLD,30));
        OP.setBackground(Color.DARK_GRAY);
        OP.setForeground(Color.WHITE);
        OP.addActionListener(this);
        add(OP);
        
        Profile =new JMenu("Profile");
        Profile.setForeground(Color.BLACK);
        Profile.setSize(150,50);  
        Profile.addActionListener(this);
        mb.add(Profile);
        
        profile=new JMenuItem("Profile");
        profile.setBackground(Color.WHITE);
        profile.addActionListener(this);
        Profile.add(profile);
        
        back=new JButton("back");
        //back.setBounds(1800,1,140,20);
       // back.setFont(new Font("Arial",Font.BOLD,20));
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        mb.add(back);
        
       // this.id=id;
        setJMenuBar(mb);
        setSize(1950,1100);
        setVisible(true);
    }
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==DashBoard){
          new In_I_EMS();
        }
        else if(ae.getSource()==profile){
            setVisible(false);
            new Profile(id);
        }
        else if(ae.getSource()==CDP){
            setVisible(false);
            new ChDP();
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }  
     }
        
   /* public static void main(String[] args) {
        new In_I_EMS();
    }*/
}
