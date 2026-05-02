
package cms;
import javax.swing.*;
public class SupperShop extends JFrame
{
 
    JButton next;
    JTextField Userid;
    SupperShop()
    {
       
        JLabel Login=new JLabel("Login");
        setBounds(230,100,100,30);
        add(Login);

        JLabel userid=new JLabel("Enter User Id:");
        setBounds(200,150,150,20);
        add(userid);

        JTextField UserId=new JPasswordField();
        setBounds(350,150,100,20);
        add(Userid);

        next=new JButton("Next=>");
        //next.addActionListener(this);
        add(next);


        JLabel clarify=new JLabel("If You Don't Registered Please Registered first=>");


        setSize(500,300);
        setLocation(500,250);
        setVisible(true);
    }


}