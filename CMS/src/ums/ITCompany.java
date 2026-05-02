
package cms;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class ITCompany extends JFrame implements ActionListener{
    
   String name,id,contact,email,pass;
   JMenuBar mb;
   JMenu Profile,client,transition,duePayment;
   JMenuItem cname,cid,cemail,ccell,cpass,addClient,selectClient,updateClient,deleteClient,firstTransition,service,pay,DuePayment;
   JButton back;
    ITCompany(String name,String id,String email,String contact,String pass)
    {
       this.name=name;this.id=id;this.contact=contact;this.email=email;this.pass=pass;
       
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
        
       

       mb=new JMenuBar();
       setJMenuBar(mb);

       Profile=new JMenu("Profile");
       mb.add(Profile);

       cname=new JMenuItem("Company Name :"+name);
       Profile.add(cname);

       cid=new JMenuItem("Company ID :"+id);
       Profile.add(cid);

       cemail=new JMenuItem("Company Email :"+email);
       Profile.add(cemail);

       ccell=new JMenuItem("Company Cell :"+contact);
       Profile.add(ccell);

       cpass=new JMenuItem("Company Pass :"+pass);
       Profile.add(cpass);

       client=new JMenu("Client");
       mb.add(client);

       addClient =new JMenuItem("Add");
       addClient.addActionListener(this);
       client.add(addClient);

       selectClient=new JMenuItem("Info");
       selectClient.addActionListener(this);
       client.add(selectClient);

       updateClient =new JMenuItem("Update");
       client.add(updateClient);

       deleteClient =new JMenuItem("Delete");
       deleteClient.addActionListener(this);
       client.add(deleteClient);
       
       transition =new JMenu("Transition");
       mb.add(transition);

       firstTransition=new JMenuItem("1st Transition");
       firstTransition.addActionListener(this);
       transition.add(firstTransition);

       service =new JMenuItem("Service");
       service.addActionListener(this);
       transition.add(service);

       pay =new JMenuItem("Pay");
       pay.addActionListener(this);
       transition.add(pay);

       duePayment=new JMenu("DUE & PAYMENT");
       mb.add(duePayment);

       DuePayment=new JMenuItem("Due&Payment");
       DuePayment.addActionListener(this);
       duePayment.add(DuePayment);

       back=new JButton("Back");
       back.addActionListener(this);
       mb.add(back);

       setSize(800,600);
       setLocation(0,0);
       setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addClient){
             setVisible(false);new AddClient(name,id,email,contact,pass);
        }
        else if(ae.getSource()==selectClient)
         {
            setVisible(false);
            new SelectClient(name,id,email,contact,pass);
         }
          else if(ae.getSource()==deleteClient)
         {
            setVisible(false);
            new DeleteClient(name,id,email,contact,pass);
         }
           else if(ae.getSource()==firstTransition)
         {
            setVisible(false);
            new FirstTransition(name,id,email,contact,pass);
         }
           else if(ae.getSource()==service)
         {
            setVisible(false);
            new Service(name,id,email,contact,pass);
         }
           else if(ae.getSource()==pay)
         {
            setVisible(false);
            new Pay(name,id,email,contact,pass);
         }
          else if(ae.getSource()==DuePayment)
         {
            setVisible(false);
            new DUEPayment(name,id,email,contact,pass);
         }
            else
         {
            setVisible(false);
            new ITlogin();
         }

     }

    /*public static void main(String args[])
     {
        new ITCompany();
     }*/

}
