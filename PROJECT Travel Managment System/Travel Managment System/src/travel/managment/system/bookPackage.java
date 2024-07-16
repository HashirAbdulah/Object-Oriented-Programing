package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class bookPackage extends JFrame implements ActionListener{
     JLabel text,lblUserName,labelUsername,lblsp,lblnop,labelUserId,idNumber,
            lbltp,lblphone,labeltp,lblPhone,image;
     Choice cp;
     JTextField nop;
     JButton back,bookpackage,checkprice;
     String username;
     
    bookPackage(String username){
    this.username = username;
    setBounds(280, 70, 870, 625);
    getContentPane().setBackground(Color.white);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(null);
        
        
    text = new JLabel("Book Packages");
    text.setBounds(300,10,200,30);
    text.setFont(new Font("Tahoma", Font.BOLD, 20));
    add(text);
        
    lblUserName = new JLabel("Username:");
    lblUserName.setBounds(30,50,150,25);
    add(lblUserName);
    
    //ftchd from database
    labelUsername = new JLabel();
    labelUsername.setBounds(220,50,150,25);
    add(labelUsername);
    
    
    lblsp = new JLabel("Select Packages:");
    lblsp.setBounds(30,100,150,25);
    add(lblsp);
    
   
    cp = new Choice();
    cp.setBounds(220,100,150,25);
    cp.add("PRESTIGE PASSAGE");
    cp.add("CLASSIC PACKAGE");
    cp.add("RUSTIC ROUTES");
    add(cp);
    
    
    lblnop = new JLabel("No of Persons:");
    lblnop.setBounds(30,150,150,25);
    add(lblnop);
    
    
    nop = new JTextField("1");
    nop.setBounds(220,150,150,25);
    add(nop);
    
    
    labelUserId = new JLabel("ID:");
    labelUserId.setBounds(30,200,150,25);
    add(labelUserId);
    
    //ftch from database
    idNumber = new JLabel();
    idNumber.setBounds(220,200,150,25);
    add(idNumber);
    
    
    lblphone = new JLabel("Phone:");
    lblphone.setBounds(30,250,150,25);
    add(lblphone);
    
    //ftch from database
    lblPhone = new JLabel();
    lblPhone.setBounds(220,250,150,25);
    add(lblPhone);
    
    lbltp = new JLabel("Total Price:");
    lbltp.setBounds(30,300,150,25);
    add(lbltp);
    
    //fetch form database
    labeltp = new JLabel();
    labeltp.setBounds(220,300,150,25);
    add(labeltp);
    
    back = new JButton("Return");
    back.setBounds(30,380,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    add(back);
    
    bookpackage = new JButton("Book Package");
    bookpackage.setBounds(270,380,100,30);
    bookpackage.setForeground(Color.white);
    bookpackage.setBackground(new Color(71,207,255));
    bookpackage.setBorder(BorderFactory.createEmptyBorder());
    bookpackage.addActionListener(this);
    add(bookpackage);
    
    
    checkprice = new JButton("Check Price");
    checkprice.setBounds(150,380,100,30);
    checkprice.setForeground(Color.white);
    checkprice.setBackground(new Color(71,207,255));
    checkprice.setBorder(BorderFactory.createEmptyBorder());
    checkprice.addActionListener(this);
    add(checkprice);
    
     try{
        Connect c = new Connect();
        ResultSet rs =c.s.executeQuery("select * from customer where username = '"+username+"'");
        while (rs.next()){
        labelUsername.setText(rs.getString("username"));
        labelUserId.setText(rs.getString("id"));
        idNumber.setText(rs.getString("number"));
        lblPhone.setText(rs.getString("phone"));
        
        }
    }
    catch(Exception e){
     System.out.println(e);
    }
     
     
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
    Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    image = new JLabel(i3);
    image.setBounds(400, 70, 450, 400);
    add(image);
    
    
    setVisible(true);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == back ){
            setVisible(false);
        }
        
        else if(e.getSource()== bookpackage){
             try{
        Connect c = new Connect();
        c.s.executeUpdate("INSERT INTO bookPackage (username, package, NoOfPersons, idtype, idNumber, Phone, packagePrice) VALUES ('"+labelUsername.getText()+"','"+cp.getSelectedItem()+"','"+nop.getText()+"','"+ labelUserId.getText()+"','"+idNumber.getText()+"','"+lblPhone.getText()+"','"+labeltp.getText()+"')");
        JOptionPane.showMessageDialog(null,"Bakra Phass Gya!");
        setVisible(false);
                }
        catch(Exception a){
        System.out.println(a);
        }
        
   }
        
        else if(e.getSource()== checkprice){
            String spackage = cp.getSelectedItem(); 
            int cost = 0;
            if(spackage=="PRESTIGE PASSAGE"){
                cost += 30000;
            }
            else if (spackage=="CLASSIC PACKAGE"){
                cost += 25000;
            }
            else if (spackage=="RUSTIC ROUTES"){
                cost += 22000;
            }
            int persons = Integer.parseInt(nop.getText());
            cost *= persons;
            labeltp.setText("Rs: "+cost);
        }
   
    }
    
    
//    public static void main(String[] args){
//        bookPackage bp = new bookPackage("hashir");   
//    } 
}
