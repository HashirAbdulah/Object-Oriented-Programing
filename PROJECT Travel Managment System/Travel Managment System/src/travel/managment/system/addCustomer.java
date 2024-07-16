package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class addCustomer extends JFrame implements ActionListener{
    JLabel image,customerName,idNumber,number,name,lblname,gender,country,adress,email,phone;
    JComboBox id;
    JTextField tfNumber,tfcountry,tfadress,tfemail,tfphone;
    JRadioButton maleRadio,femaleRadio;
    JButton add,back;
    
    addCustomer(String username){
    setBounds(300,100,850,550);
    setLayout(null);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    
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
    
    
    id = new JComboBox(new String[] {"Passport","National Id Card","Other Documents"});
    id.setBounds(220,90,150,25);
    Font font2 = new Font("Arial",Font.PLAIN,13);
    id.setBackground(Color.white);
    id.setFont(font2);
    add(id);
    
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
    
    maleRadio = new JRadioButton("MALE");
    maleRadio.setBounds(220,210,70,25);
    maleRadio.setBackground(Color.white);
    add(maleRadio);
    
    femaleRadio = new JRadioButton("FEMALE");
    femaleRadio.setBounds(300,210,70,25);
    femaleRadio.setBackground(Color.white);
    add(femaleRadio);
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(maleRadio );
    bg.add(femaleRadio);
   
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
    
    add = new JButton("Add");
    add.setBounds(170,420,100,30);
    add.setForeground(Color.white);
    add.setBackground(new Color(71,207,255));
    add.setBorder(BorderFactory.createEmptyBorder());
    add.addActionListener(this);
    add(add);
    
    back = new JButton("Return");
    back.setBounds(300,420,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    add(back);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
    Image i2 = i1.getImage().getScaledInstance(400, 520, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    image = new JLabel(i3);
    image.setBounds(400,40,400,500);
    add(image);
    
    
    try{
        Connect c = new Connect();
        ResultSet rs =c.s.executeQuery("select * from account where username = '"+username+"'");
        while (rs.next()){
        customerName.setText(rs.getString("username"));
        name.setText(rs.getString("name"));
        }
    }
    catch(Exception e){
     System.out.println(e);
    }
    setVisible(true);
    
}
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== add){
            String username = customerName.getText();
            String givenId = (String) id.getSelectedItem();
            String number = tfNumber.getText();
            String name = lblname.getText();
            String gender = null;
            if(maleRadio.isSelected()){
                gender = "Male";
            }
            else {
                gender = "Female";
            }
            String country = tfcountry.getText();
            String adress = tfadress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                Connect c = new Connect();
                String query = "Insert into customer values('"+username+"','"+givenId+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+adress+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Added!");
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
//    addCustomer ac = new addCustomer("");
//    }    
}
