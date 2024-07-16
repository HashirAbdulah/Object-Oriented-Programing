package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JTextField tfusername,tfquestion,tfname,tfanswer,tfpassword;
    JButton search,retrive,back;
    JLabel username,name,question,answer,password;
    
    ForgetPassword(){
    setBounds(350,200,800,380);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
    Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    //converting it to imageicon for placing it in jlabel
    ImageIcon i3 = new ImageIcon(i2); 
    JLabel image = new JLabel(i3);
    image.setBounds(570,70,200,200);
    add(image);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(30,30,500,280);
    add(p1);
    
    username = new JLabel("Username:");
    username.setBounds(40,20,100,25);
    Font font = new Font("Arial",Font.BOLD,15);
    username.setFont(font);
    p1.add(username);
    
    tfusername = new JTextField();
    tfusername.setBounds(220,20,150,25);
    tfusername.setFont(font);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfusername);
    
    search = new JButton("Search");
    search.setBounds(380,20,100,25);
    search.setBackground(new Color(71,207,255));
    search.setForeground(Color.white);
    search.addActionListener(this);
    p1.add(search);
    
    
    name = new JLabel("Name:");
    name.setBounds(40,60,100,25);
    name.setFont(font);
    p1.add(name);
    
    tfname = new JTextField();
    tfname.setBounds(220,60,150,25);
    tfname.setFont(font);
    tfname.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfname);
    
    question = new JLabel("Security Question:");
    question.setBounds(40,100,150,25);
    question.setFont(font);
    p1.add(question);
    
    
    tfquestion = new JTextField();
    tfquestion.setBounds(220,100,150,25);
    tfquestion.setFont(font);
    tfquestion.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfquestion);
    
    
    answer = new JLabel("Answer:");
    answer.setBounds(40,140,150,25);
    answer.setFont(font);
    p1.add(answer);
    
    
    tfanswer = new JTextField();
    tfanswer.setBounds(220,140,150,25);
    tfanswer.setFont(font);
    tfanswer.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfanswer);
    
    
    retrive = new JButton("Retrive!");
    retrive.setBounds(380,140,100,25);
    retrive.setBackground(new Color(71,207,255));
    retrive.setForeground(Color.white);
    retrive.addActionListener(this);
    p1.add(retrive);
    
    password = new JLabel("Password:");
    password.setBounds(40,180,150,25);
    password.setFont(font);
    p1.add(password);
    
    
    tfpassword = new JTextField();
    tfpassword.setBounds(220,180,150,25);
    tfpassword.setFont(font);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfpassword);
    
    
    back = new JButton("Return");
    back.setBounds(230,220,100,25);
    back.setBackground(new Color(71,207,255));
    back.setForeground(Color.white);
    back.addActionListener(this);
    p1.add(back);
    
    
    setResizable(false);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e3){
        
    if(e3.getSource()== search){
        try{
         String query = ("select * from account where username = '"+tfusername.getText()+"'");
         Connect c = new Connect();
         ResultSet rs = c.s.executeQuery(query);
         while (rs.next()){
             tfname.setText(rs.getString("name"));
             tfquestion.setText(rs.getString("security"));
                    }
        }
        catch(Exception e){
        System.out.println(e);        
        }
       
     }
    
    else if (e3.getSource()== retrive){
         try{
         String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'";
         Connect c = new Connect();
         ResultSet rs = c.s.executeQuery(query);
         while (rs.next()){
             tfpassword.setText(rs.getString("password"));
           }
        }
        catch(Exception e){
        System.out.println(e);        
        }
        
    
        }
    
    else {
        setVisible(false);
        Login login = new Login();
        }
    
    }
   
    
//    public static void main(String[] args){
//        ForgetPassword fp = new ForgetPassword();
//    }
}
