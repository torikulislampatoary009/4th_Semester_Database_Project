
package cms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Registration extends JFrame implements ActionListener{
    JButton register,back;
    //JPasswordField inputPas;
    JTextField name,id,email,contact,pass;
    Registration(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading= new JLabel("Register Your Company");
        heading.setBounds(100,20,200,30);      
        add(heading);
        

        JLabel Name= new JLabel("Company Name:");
        Name.setBounds(50,60,100,20);      
        add(Name);
        
        name=new JTextField();
        name.setBounds(150,60,150,20);
        add(name);
       
        JLabel ID= new JLabel("Company ID:");
        ID.setBounds(50,90,100,20);      
        add(ID);

        id=new JPasswordField();
        id.setBounds(150,90,100,20);
        add(id);
          
        JLabel Email= new JLabel("Company Email:");
        Email.setBounds(50,120,100,20);      
        add(Email);

        email=new JTextField();
        email.setBounds(150,120,150,20);
        add(email);

         JLabel Contact= new JLabel("Contact:");
        Contact.setBounds(50,150,100,20);      
        add(Contact);
        
        contact=new JTextField();
        contact.setBounds(150,150,100,20);
        add(contact);
        
        JLabel Pass= new JLabel("Company Pass:");
        Pass.setBounds(50,180,100,20);      
        add(Pass);

        pass=new JPasswordField();
        pass.setBounds(150,180,100,20);
        add(pass);
       

        register=new JButton("Register");
        register.setBounds(60,230,80,30);
        register.addActionListener(this);
        add(register);
        
         
        back=new JButton("Back");
        back.setBounds(150,230,80,30);
       // back.setBackground(Color.BLACK);
        //cancel.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setLocation(0,0);
        setSize(700,500);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==register){
              try {
              
            String query="insert into company values('"+name.getText()+"','"+id.getText()+"','"+email.getText()+"','"+contact.getText()+"','"+pass.getText()+"')";
            
            JdbctoIT con=new JdbctoIT();
            con.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Registered");
            setVisible(false);
             new Registration();
           } catch (Exception e) {
              e.printStackTrace();
           }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new ITlogin();
        }
     }
    
    /*public static void main(String[] args) {
        new Registration();
    }*/
    
}
