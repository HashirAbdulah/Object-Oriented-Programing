package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfanswer;
    Choice csecurity;
    JLabel username,name,password,security,answer;
    JPanel p1;
    
    Signup(){
       
    setBounds(250,150,900,360);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //panel 
    p1 = new JPanel();
     p1.setBackground(new Color(104,196,249));
     p1.setLayout(null);
     p1.setBounds(0,0,500,400);
     p1.setLayout(null);
     add(p1);
    //
    
    //username section
    //Jlabel username
    username = new JLabel("Username:");
    username.setBounds(50,20,125,30);
    Font font = new Font("Arial",Font.BOLD,15);
    username.setFont(font);
    p1.add(username);
    //
    
    //textfield username
    tfusername = new JTextField();
    tfusername.setBounds(145,20,180,30);
    tfusername.setFont(font);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfusername);
    
    //
    
    //name section
    //Jlabel rname
    name = new JLabel("Enter Name:");
    name.setBounds(50,60,125,30);
    name.setFont(font);
    p1.add(name);
    //
    
    //textfield name
    tfname = new JTextField();
    tfname.setBounds(145,60,180,30);
    tfname.setFont(font);
    tfname.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfname);
    //
    
    
    //password section
    //Jlabel password
    password = new JLabel("Password:");
    password.setBounds(50,100,125,30);
    password.setFont(font);
    p1.add(password);
    
    
    //textfield password
    tfpassword = new JTextField();
    tfpassword.setBounds(145,100,180,30);
    tfpassword.setFont(font);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfpassword);

    
    //Question section
    //Jlabel security
    security = new JLabel("Question:");
    security.setBounds(50, 140, 90, 30);
    security.setFont(font);
    p1.add(security);
    
    //
    
    //Choice security
    csecurity = new Choice();
    csecurity.add("Your Childhood Name?");
    csecurity.add("Your Birthplace?");
    csecurity.add("Your Friend Name?");
    csecurity.setBounds(145, 140, 180, 30);
    p1.add(csecurity);
    
    //
    
    //label answer
    answer = new JLabel("Answer:");
    answer.setBounds(50,180,125,30);
    answer.setFont(font);
    p1.add(answer);
    
    //textfield answer
    tfanswer = new JTextField();
    tfanswer.setBounds(145,180,180,30);
    tfanswer.setFont(font);
    tfanswer.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfanswer);
    //

    //create button
    create = new JButton("Create");
    create.setBounds(80,250,100,30);
    create.setBackground(Color.white);
    create.setForeground(new Color(71,207,255));
    create.setBorder(BorderFactory.createEmptyBorder());
    create.addActionListener(this);
    p1.add(create);
    
    
    //return button
    back = new JButton("Return");
    back.setBounds(250,250,100,30);
    back.setBackground(Color.white);
    back.setForeground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    p1.add(back);
    //
    
    //image for signup
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
    Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    //again converting it to imageicon for placing it in jlabel
    ImageIcon i3 = new ImageIcon(i2); 
    JLabel image = new JLabel(i3);
    image.setBounds(580,50,250,250);
    add(image);

    
    setResizable(false);
    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent e){
        
    if(e.getSource()== create){
        String username = tfusername.getText();
        String name = tfname.getText();
        String password = tfpassword.getText();
        String security = csecurity.getSelectedItem();
        String answer = tfanswer.getText();  
        
        //query
        String query = "Insert Account Values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
        try{
            Connect c = new Connect();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Account Created Successfully");
            setVisible(false);
           Login login = new Login();
        }
        catch(Exception e2){
        System.out.println(e2);
        
        }
        //
        
    }
    
    else if (e.getSource()== back){
        setVisible(false);
        Login login = new Login();
    }
    
    }
    
    
//     public static void main(String[] args){
//        Signup s1 = new Signup();
//        
//    }
}
