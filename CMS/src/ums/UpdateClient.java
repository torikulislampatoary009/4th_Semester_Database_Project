package cms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateClient extends JFrame implements ActionListener{

    JTextField ClientId;
    JButton search,back;

    UpdateClient(){


        JLabel clientId=new JLabel("Client ID:");
        setBounds(10,10,100,20);
        add(clientId);

        ClientId=new JTextField();
        setBounds(50,10,100,20);
        add(ClientId);

        search=new JButton("Search");
        setBounds(110,10,100,20);
        search.addActionListener(this);
        add(search);

        back=new JButton("Back");
        setBounds(160,10,100,20);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,800);
        setLocation(0,0);
        setVisible(true);
    }

    

}