package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class viewCustomer extends JFrame implements ActionListener{
      
    JLabel lblUserName,labelUsername,lbluserid,labelUserId,lblnumber,labelUserNumber,lblname,
            labelName,lblGender,labelGender,image,lblcountry,labelcountry,lbladress,labeladress,lblemail,labelEmail,lblphone,labelPhone;
    JButton back;
    
    
    viewCustomer(String username){
    setBounds(280,70,870,625);
    setLayout(null);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    
    lblUserName = new JLabel("Username:");
    lblUserName.setBounds(30,50,150,25);
    add(lblUserName);
    
    //ftchd from database
    labelUsername = new JLabel();
    labelUsername.setBounds(220,50,150,25);
    add(labelUsername);
    
    
    lbluserid = new JLabel("ID:");
    lbluserid.setBounds(30,100,150,25);
    add(lbluserid);
    
    //ftch from database
    labelUserId = new JLabel();
    labelUserId.setBounds(220,100,150,25);
    add(labelUserId);
    
    
    lblnumber = new JLabel("Number:");
    lblnumber.setBounds(30,150,150,25);
    add(lblnumber);
    
    //ftch from database
    labelUserNumber = new JLabel();
    labelUserNumber.setBounds(220,150,150,25);
    add(labelUserNumber);
    
    
    lblname = new JLabel("Name:");
    lblname.setBounds(30,200,150,25);
    add(lblname);
    
    //ftch from database
    labelName = new JLabel();
    labelName.setBounds(220,200,150,25);
    add(labelName);
    
    
    lblGender = new JLabel("Gender:");
    lblGender.setBounds(30,250,150,25);
    add(lblGender);
    
    //ftch from database
    labelGender = new JLabel();
    labelGender.setBounds(220,250,150,25);
    add(labelGender);
    
    
    lblcountry = new JLabel("Country:");
    lblcountry.setBounds(430,50,150,25);
    add(lblcountry);
    
    //ftch from database
    labelcountry = new JLabel();
    labelcountry.setBounds(630,50,150,25);
    add(labelcountry);
    
    lbladress = new JLabel("Address:");
    lbladress.setBounds(430,100,150,25);
    add(lbladress);
    
    //ftch from database
    labeladress = new JLabel();
    labeladress.setBounds(630,100,150,25);
    add(labeladress);
    
    lblphone = new JLabel("Phone:");
    lblphone.setBounds(430,150,150,25);
    add(lblphone);
    
    //ftch from database
    labelPhone = new JLabel();
    labelPhone.setBounds(630,150,150,25);
    add(labelPhone);
    
    lblemail = new JLabel("Email:");
    lblemail.setBounds(430,200,150,25);
    add(lblemail);
    
    //fetch form database
    labelEmail = new JLabel();
    labelEmail.setBounds(630,200,150,25);
    add(labelEmail);
    
    back = new JButton("Return");
    back.setBounds(350,320,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    add(back);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
    Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    image = new JLabel(i3);
    image.setBounds(100,360,600,200);
    add(image); 
    
    try{
        Connect c = new Connect();
       String query = "select * from customer where username = '"+username+"'";
       ResultSet rs =c.s.executeQuery(query);
       while (rs.next()){
           labelUsername.setText(rs.getString("username"));
           labelUserId.setText(rs.getString("id"));
           labelUserNumber.setText(rs.getString("number"));
           labelName.setText(rs.getString("name"));
           labelGender.setText(rs.getString("gender"));
           labelcountry.setText(rs.getString("country"));
           labeladress.setText(rs.getString("adress"));     
           labelPhone.setText(rs.getString("phone"));   
           labelEmail.setText(rs.getString("email"));
       }
    }
        catch(Exception e){
            System.out.println(e);
    }
    
    
    setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == back ){
            setVisible(false);
        }
   
    }
    
    
    
//     public static void main(String[] args){
//        viewCustomer vc = new viewCustomer("");
//
// }    
}
