package cms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
public class SelectClient extends JFrame implements ActionListener{

    String cname,cid,cemail,ccontact,cpass;
    JTextField ClientId;
    JButton search,back;
    JTable table;
    SelectClient(String cname,String cid,String cemail,String ccontact,String cpass){


        this.cname=cname;this.cid=cid;this.cemail=cemail;this.ccontact=ccontact;this.cpass=cpass;


        JLabel clientId=new JLabel("Client ID:");
        clientId.setBounds(10,10,100,20);
        add(clientId);

        ClientId=new JTextField();
        ClientId.setBounds(50,10,100,20);
        add(ClientId);

        search=new JButton("Search");
        search.setBounds(110,10,100,20);
        search.addActionListener(this);
        add(search);

        back=new JButton("Back");
        back.setBounds(160,10,100,20);
        back.addActionListener(this);
        add(back);
        
        table = new JTable();

        JScrollPane jp=new JScrollPane(table);
        jp.setBounds(0,140,1200,580);
        add(jp);


        setSize(1000,800);
        setLocation(0,0);
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
              
            String query="select * from clients where id='"+ClientId.getText()+"'";
            try{
               JdbctoIT con=new JdbctoIT();
               ResultSet rs=con.s.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(rs));
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