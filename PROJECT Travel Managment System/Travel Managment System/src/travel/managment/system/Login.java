package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
     
    JPanel p1,p2;
    JLabel usern,password;
    JButton login,signup,forget;
    JTextField tfusername,tfpassword;
    
    Login(){
     setSize(900,400);
     setLocation(250,150);
     setLayout(null);
     getContentPane().setBackground(Color.white);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     //panel 1 
     p1 = new JPanel();
     p1.setBackground(new Color(104,196,249));
     p1.setLayout(null);
     p1.setBounds(0,0,400,400);
     add(p1);
     
     //panel 2
      p2 = new JPanel();
      p2.setLayout(null);
      p2.setBounds(400,30,450,300);
      add(p2);
      
    //image icon for panel 1
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    //converting it to imageicon for placing it in jlabel
    ImageIcon i3 = new ImageIcon(i2); 
    JLabel image = new JLabel(i3);
    image.setBounds(100,100,200,200);
    p1.add(image);
     
    //username section
    //Jlabel username
    usern = new JLabel("Username");
    usern.setBounds(60,20,100,25);
    Font font = new Font("Arial",Font.PLAIN,15);
    usern.setFont(font);
    p2.add(usern);
    
    //textfield username
    tfusername = new JTextField();
    tfusername.setBounds(60,60,300,30);
    tfusername.setFont(font);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfusername);
    
    //passwrod section
    //Jlabel password
    password = new JLabel("Password");
    password.setBounds(60,110,100,25);
    password.setFont(font);
    p2.add(password);
    
    //textfield password
    tfpassword = new JTextField();
    tfpassword.setBounds(60,150,300,30);
    tfpassword.setFont(font);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfpassword);
    
    //
    
    //login button
    login = new JButton("Login");
    login.setBounds(60,200,130,30);
    login.setBackground(new Color(71,207,255));
    login.setForeground(Color.white);
    login.setBorder(BorderFactory.createEmptyBorder());
    login.addActionListener(this);
    p2.add(login);
    
    //
    
    
    //Signup button
    signup = new JButton("SignUp");
    signup.setBounds(230,200,130,30);
    signup.setBackground(new Color(71,207,255));
    signup.setForeground(Color.white);
    signup.setBorder(BorderFactory.createEmptyBorder());
    signup.addActionListener(this);
    p2.add(signup);

    //forget button
    forget = new JButton("Forget Password");
    forget.setBounds(130,250,130,30);
    forget.setBackground(new Color(71,207,255));
    forget.setForeground(Color.white);
    forget.setBorder(BorderFactory.createEmptyBorder());
    forget.addActionListener(this);
    p2.add(forget);
    
    //
    setResizable(false);
    setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== login){
            try{
                String username = tfusername.getText();
                 String pass= tfpassword.getText();                
                 String query = "Select * From account where username = '"+username+"'AND password = '"+pass+"'";
                 Connect c = new Connect();
                 ResultSet rs = c.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     Loading l = new Loading(username);
                 }
                 
                 else{
                     JOptionPane.showMessageDialog(null,"Incorrect username and Password");
                 }

               
            }
            catch(Exception e1){
               System.out.println(e1);
            }
        }
        
        else if(e.getSource()== signup){
            setVisible(false);
            Signup s1 = new Signup();
        }
        
        else {
            setVisible(false);
            ForgetPassword fp = new ForgetPassword();
        }
    }
    

     public static void main(String[] args){
        Login l1 = new Login();
        
    }
}
