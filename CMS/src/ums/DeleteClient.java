package cms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
public class DeleteClient extends JFrame implements ActionListener{

    String cname,cid,cemail,ccontact,cpass;
    JTextField ClientId;
    JButton delete,back;
    DeleteClient(String cname,String cid,String cemail,String ccontact,String cpass){


        this.cname=cname;this.cid=cid;this.cemail=cemail;this.ccontact=ccontact;this.cpass=cpass;


        JLabel clientId=new JLabel("Client ID:");
        clientId.setBounds(10,10,100,20);
        add(clientId);

        ClientId=new JTextField();
        ClientId.setBounds(50,10,100,20);
        add(ClientId);

        delete=new JButton("Delete");
        delete.setBounds(110,10,100,20);
        delete.addActionListener(this);
        add(delete);

        back=new JButton("Back");
        back.setBounds(160,10,100,20);
        back.addActionListener(this);
        add(back);

        setSize(1000,800);
        setLocation(0,0);
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==delete){
              
            String query="delete * from clients where id='"+ClientId.getText()+"'";
            try{
               JdbctoIT con=new JdbctoIT();
               con.s.executeQuery(query);
               JOptionPane.showMessageDialog(null,"Successfully Delete");
               setVisible(false);
               new DeleteClient(cname,cid,cemail,ccontact,cpass);
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