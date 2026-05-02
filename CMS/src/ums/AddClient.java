package cms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddClient extends JFrame implements ActionListener{

    String cname,cid,cemail,ccontact,cpass;
    JTextField Name,Id,Add,Email,Cell,Pass;
    JButton ADD,back;
    AddClient(String cname,String cid,String cemail,String ccontact,String cpass)
    {

        this.cname=cname;this.cid=cid;this.cemail=cemail;this.ccontact=ccontact;this.cpass=cpass;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel form=new JLabel("Client Form");
        form.setBounds(390,10,200,30);
        add(form);


        JLabel name=new JLabel("Name");
        name.setBounds(20,50,100,20);
        add(name);

        Name=new JTextField();
        Name.setBounds(50,50,100,20);
        add(Name);

        JLabel id=new JLabel("ID");
        id.setBounds(20,80,100,20);
        add(id);

        Id=new JTextField();
        Id.setBounds(50,80,100,20);
        add(Id);

        JLabel add=new JLabel("Address");
        add.setBounds(20,110,100,20);
        add(add);

        Add=new JTextField();
        Add.setBounds(50,110,100,20);
        add(Add);

        JLabel email=new JLabel("Email");
        email.setBounds(20,140,100,20);
        add(email);

        Email=new JTextField();
        Email.setBounds(50,140,100,20);
        add(Email);

        JLabel cell=new JLabel("Cell");
        cell.setBounds(20,170,100,20);
        add(cell);

        Cell=new JTextField();
        Cell.setBounds(50,170,100,20);
        add(Cell);
        
         JLabel pass=new JLabel("Password");
        pass.setBounds(20,200,100,20);
        add(pass);

        Pass=new JTextField();
        Pass.setBounds(50,200,100,20);
        add(Pass);
        
        ADD=new JButton("ADD");
        ADD.setBounds(20,250,100,30);
        ADD.addActionListener(this);
        add(ADD);

        back=new JButton("Back");
        back.setBounds(60,250,100,30);
        back.addActionListener(this);
        add(back);

        setSize(1000,800);
        setLocation(0,0);
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==ADD){
              
            String query="insert into clients values('"+Name.getText()+"','"+Id.getText()+"','"+Add.getText()+"','"+Email.getText()+"','"+Cell.getText()+"','"+Pass.getText()+"')";
            try{
               JdbctoIT con=new JdbctoIT();
               con.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Successfully Added");
               setVisible(false);
               new AddClient(cname,cid,cemail,ccontact,cpass);
           } catch (Exception e) {
              e.printStackTrace();
           }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new ITCompany(cname,cid,cemail,ccontact,cpass);
        }
     }
    

}
