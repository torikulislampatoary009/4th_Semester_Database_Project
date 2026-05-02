package cms;
import java.awt.Color;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
public class ITlogin extends JFrame implements ActionListener
{

    static int f=0;
    JTextField companyid,pass;
    JButton login,back,register;
    ITlogin()
    {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel Heading=new JLabel("Login Into IT Company");
        Heading.setBounds(20,50,200,30);
        add(Heading);

        JLabel CompanyID=new JLabel("Enter Company ID:");
        CompanyID.setBounds(20,100,150,20);
        add(CompanyID);

        companyid=new JPasswordField();
        companyid.setBounds(180,100,100,20);
        add(companyid);

        JLabel Pass=new JLabel("Enter Password:");
        Pass.setBounds(20,150,80,20);
        add(Pass);

        pass=new JPasswordField();
        pass.setBounds(180,150,100,20);
        add(pass);

        login=new JButton("Login");
        login.setBounds(30,200,80,30);
        login.addActionListener(this);
        add(login);

        back=new JButton("Back");
        back.setBounds(100,200,80,30);
        back.addActionListener(this);
        add(back);

        if(f==1)
        {
           JLabel wrong=new JLabel("May Company Id or Password is Invalid");
           wrong.setBounds(0,250,500,30);
           add(wrong);
        }

        
        JLabel Register=new JLabel("If your Company is not registered yet, Please Register first");
        Register.setBounds(5,300,500,30);
        add(Register);

        register=new JButton("Register");
        register.setBounds(240,350,80,30);
        register.addActionListener(this);
        add(register);



        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
    }

     public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
            
            String query="select * from company where id='"+companyid.getText()+"' and pass='"+pass.getText()+"'";
            try{
            JdbctoIT con=new JdbctoIT();
            ResultSet rs=con.s.executeQuery(query);
           // JOptionPane.showMessageDialog(null,"Successfully login");
            if(!rs.next())
            {
                f=1;
                setVisible(false);
                new ITlogin();
            }
            setVisible(false);
            new ITCompany(rs.getString("name"),rs.getString("id"),rs.getString("email"),rs.getString("contact"),rs.getString("pass"));
           } catch (Exception ae) {
              ae.printStackTrace();
           }
          // setVisible(false);
          // new ITCompany();
        }
        else if(e.getSource()==back){
            setVisible(false);
            new Dashboard();     
        }
        else{
            setVisible(false);
            new Registration();
        }
    }

}