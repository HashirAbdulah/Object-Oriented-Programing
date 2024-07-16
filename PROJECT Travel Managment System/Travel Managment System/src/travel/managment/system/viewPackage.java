package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class viewPackage extends JFrame implements ActionListener {
    
    JLabel heading,lblUserName,labelUsername,lbluserpackage,labelUserpackage,lblnop,labelnop,lbluserid,
            labelUserId,lblnumber,labelUserNumber,lblphone,labelPhone,lbltp,labeltp;
    JButton back;
    
    viewPackage(String username){
//    this.username = username;
    setBounds(280,70,870,625);
    setLayout(null);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    
    
    heading = new JLabel ("Booked Package Details");
    heading.setBounds(300,10,300,30);
    heading.setFont(new Font("Tahoma", Font.BOLD, 20));
    add(heading);
    
    lblUserName = new JLabel("Username:");
    lblUserName.setBounds(30,50,150,25);
    add(lblUserName);
    
    //ftchd from database
    labelUsername = new JLabel();
    labelUsername.setBounds(220,50,150,25);
    add(labelUsername);
    
    
    lbluserpackage = new JLabel("Package:");
    lbluserpackage.setBounds(30,100,150,25);
    add(lbluserpackage);
    
    //ftch from database
    labelUserpackage = new JLabel();
    labelUserpackage.setBounds(220,100,150,25);
    add(labelUserpackage);
    
    
    lblnop = new JLabel("Total Persons:");
    lblnop.setBounds(30,150,150,25);
    add(lblnop);
    
    //ftch from database
    labelnop = new JLabel();
    labelnop.setBounds(220,150,150,25);
    add(labelnop);
    
    lbluserid = new JLabel("ID:");
    lbluserid.setBounds(30,200,150,25);
    add(lbluserid);
    
    //ftch from database
    labelUserId = new JLabel();
    labelUserId.setBounds(220,200,150,25);
    add(labelUserId);
    
    
    //idnumber
    lblnumber = new JLabel("Number:");
    lblnumber.setBounds(30,250,150,25);
    add(lblnumber);
    
    //ftch from database
    labelUserNumber = new JLabel();
    labelUserNumber.setBounds(220,250,150,25);
    add(labelUserNumber);
    
    lblphone = new JLabel("Phone:");
    lblphone.setBounds(30,300,150,25);
    add(lblphone);
    
    //ftch from database
    labelPhone = new JLabel();
    labelPhone.setBounds(220,300,150,25);
    add(labelPhone);
    
    
    lbltp = new JLabel("Total Price:");
    lbltp.setBounds(30,350,150,25);
    add(lbltp);
    
    //fetch form database
    labeltp = new JLabel();
    labeltp.setBounds(220,350,150,25);
    add(labeltp);
    
    
    back = new JButton("Return");
    back.setBounds(300,420,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    add(back);
    
    try{
        Connect c = new Connect();
       String query = "select * from bookPackage where username = '"+username+"'";
       ResultSet rs =c.s.executeQuery(query);
       while (rs.next()){
           labelUsername.setText(rs.getString("username"));
           labelUserpackage.setText(rs.getString("package"));
           labelnop.setText(rs.getString("NoOfPersons"));
           labelUserId.setText(rs.getString("id"));
           labelUserNumber.setText(rs.getString("number"));  
           labelPhone.setText(rs.getString("phone"));   
           labeltp.setText(rs.getString("packagePrice"));
       }
    }
        catch(Exception e){
            System.out.println(e);
    }

    
    setVisible(true);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
        }
    }
    
    
//    public static void main(String[] args){
//        viewPackage vp = new viewPackage("");   
//    } 
    
}
