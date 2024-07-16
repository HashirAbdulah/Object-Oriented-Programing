package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class updateCustomer extends JFrame implements ActionListener{
    JLabel image,customerName,idNumber,number,name,lblname,gender,country,adress,email,phone,text;
    JTextField tfNumber,tfcountry,tfadress,tfemail,tfphone,tfid,tfgender;
    JButton update,back;
    
    updateCustomer(String username){
    setBounds(300,100,850,550);
    setLayout(null);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    
    text = new JLabel("Update Customer Details");
    text.setBounds(250,5,300,25);
    text.setFont(new Font("Arial", Font.PLAIN, 20));
    add(text);
    
    customerName = new JLabel("Customer Name:");
    customerName.setBounds(30,50,150,25);
//    Font font = new Font("Arial",Font.PLAIN,20);
//    customerName.setFont(font);
    add(customerName);
    
    
    //label for database
    customerName = new JLabel();
    customerName.setBounds(220,50,150,25);
//    customerName.setFont(font);
    add(customerName);
    
    idNumber = new JLabel("ID Type:");
    idNumber.setBounds(30,90,150,25);
//    idNumber.setFont(font);
    add(idNumber);
    
    
    tfid = new JTextField();
    tfid.setBounds(220,90,150,25);
    add(tfid);
    
    //lbl for id number
    number = new JLabel("ID Number:");
    number.setBounds(30,130,150,25);
//    number.setFont(font);
    add(number);
    
    tfNumber = new JTextField();
    tfNumber.setBounds(220,130,150,25);
    add(tfNumber);
    
    idNumber = new JLabel("ID Type:");
    idNumber.setBounds(30,90,150,25);
//    idNumber.setFont(font);
    add(idNumber);
    
    
    name = new JLabel("Name:");
    name.setBounds(30,170,150,25);
//    name.setFont(font);
    add(name);
    
    //lbl for database
    name = new JLabel();
    name.setBounds(220,170,150,25);
//    name.setFont(font);
    add(name);
    
    lblname = new JLabel();
    lblname.setBounds(220,170,150,25);
//    lblname.setFont(font);
    add(lblname);
    
    
    gender = new JLabel("Gender:");
    gender.setBounds(30,210,150,25);
//    gender.setFont(font);
    add(gender);
    
    tfgender = new JTextField();
    tfgender.setBounds(220,210,150,25);
    add(tfgender);
    
  
    country = new JLabel("Country:");
    country.setBounds(30,250,150,25);
//    country.setFont(font);
    add(country);
    
    tfcountry = new JTextField();
    tfcountry.setBounds(220,250,150,25);
    add(tfcountry);
    
    adress = new JLabel("Adress:");
    adress.setBounds(30,290,150,25);
//    adress.setFont(font);
    add(adress);
    
    tfadress = new JTextField();
    tfadress.setBounds(220,290,250,25);
    add(tfadress);
    
    email= new JLabel("Enter Email:");
    email.setBounds(30,330,150,25);
//    email.setFont(font);
    add(email);
    
    tfemail = new JTextField();
    tfemail.setBounds(220,330,200,25);
    add(tfemail);
    
    
    phone= new JLabel("Phone Number:");
    phone.setBounds(30,370,150,25);
//    phone.setFont(font);
    add(phone);
    
    tfphone = new JTextField();
    tfphone.setBounds(220,370,150,25);
    add(tfphone);
    
    update = new JButton("Update");
    update.setBounds(170,420,100,30);
    update.setForeground(Color.white);
    update.setBackground(new Color(71,207,255));
    update.setBorder(BorderFactory.createEmptyBorder());
    update.addActionListener(this);
    add(update);
    
    back = new JButton("Return");
    back.setBounds(300,420,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    add(back);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
    Image i2 = i1.getImage().getScaledInstance(280, 250, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    image = new JLabel(i3);
    image.setBounds(500,100,280,250);
    add(image);
    
    
   try {
    Connect c = new Connect();
    ResultSet rs = c.s.executeQuery("select * from customer where username = '" + username + "'");
    while (rs.next()) {
        customerName.setText(rs.getString("username"));
        tfid.setText(rs.getString("id"));
        name.setText(rs.getString("name"));
        tfNumber.setText(rs.getString("number"));
        tfgender.setText(rs.getString("gender"));
        tfcountry.setText(rs.getString("country"));
        tfadress.setText(rs.getString("adress"));
        tfphone.setText(rs.getString("phone"));
        tfemail.setText(rs.getString("email"));
    }
    } 
        catch (Exception e) {
        System.out.println(e);
    }

    setVisible(true);
}
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== update){
            String username = customerName.getText();
            String givenId = tfid.getText();
            String number1 = tfNumber.getText();
            String clientname = lblname.getText();
            String gender1= tfgender.getText();
            String country1 = tfcountry.getText();
            String adress1 = tfadress.getText();
            String phone1 = tfphone.getText();
            String email1 = tfemail.getText();
            
            try{
                Connect c = new Connect();
                String query = "update customer set username = '"+username+"',id = '"+givenId+"',number = '"+number1+"',name = '"+clientname+"',gender = '"+gender1+"',"
                        + "country = '"+country1+"',adress = '"+adress1+"',phone = '"+phone1+"',email = '"+email1+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Updated!");
                setVisible(false);
            }
            catch(Exception a){
                System.out.println(a);
            }
        }
        
        else if(e.getSource()== back){
            setVisible(false);
        }
    }

//    public static void main(String[] args){
//        updateCustomer uc = new updateCustomer("");
//    }    
}

