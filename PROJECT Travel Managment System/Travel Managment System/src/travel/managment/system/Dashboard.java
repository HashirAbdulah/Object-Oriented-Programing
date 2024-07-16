package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton pDetails,updateDetails,viewDetails,calculator,packages,bookpackage,viewPackage,AboutUs;
    JLabel text1,text2,img2;
    ImageIcon icon;
    
    String username;
    Dashboard(String username){
        this.username = username;
        setBounds(230,100,1000,500);
        setLayout(null);
        setResizable(false);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(250 ,162 ,0));
        p1.setBounds(0,0,1600,65);
        add(p1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        JLabel text = new JLabel("DASHBOARD");
        text.setBounds(50,20,250,30);
        Font font = new Font("Tahoma",Font.BOLD,30);
        text.setFont(font);
        text.setForeground(Color.white);
        p1.add(text);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.BLACK);
        p2.setBounds(0,65,300,900);
        add(p2);
        
        pDetails = new JButton("Add Personal Details");
        pDetails.setBounds(0, 0, 300, 50);
        pDetails.setBackground(Color.white);
        pDetails.setForeground(Color.BLACK);
        pDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        pDetails.addActionListener(this);
        p2.add(pDetails);
        
        
        updateDetails = new JButton("Update Personal Details");
        updateDetails.setBounds(0, 50, 300, 50);
        updateDetails.setBackground(Color.white);
        updateDetails.setForeground(Color.BLACK);
        updateDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        updateDetails.addActionListener(this);
        p2.add(updateDetails);
        
        
        viewDetails = new JButton("View Personal Details");
        viewDetails.setBounds(0, 100, 300, 50);
        viewDetails.setBackground(Color.white);
        viewDetails.setForeground(Color.BLACK);
        viewDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewDetails.addActionListener(this);
        p2.add(viewDetails);
        
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 150, 300, 50);
        calculator.setBackground(Color.white);
        calculator.setForeground(Color.BLACK);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,15));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        packages = new JButton("Packages");
        packages.setBounds(0, 200, 300, 50);
        packages.setBackground(Color.white);
        packages.setForeground(Color.BLACK);
        packages.setFont(new Font("Tahoma",Font.PLAIN,15));
        packages.addActionListener(this);
        p2.add(packages);
        
        
        bookpackage = new JButton("Book Packages");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setBackground(Color.white);
        bookpackage.setForeground(Color.BLACK);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewPackage = new JButton("View Packages");
        viewPackage.setBounds(0, 300, 300, 50);
        viewPackage.setBackground(Color.white);
        viewPackage.setForeground(Color.BLACK);
        viewPackage.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);
        
        
        text1 = new JLabel("H&Y Travel Agency");
        text1.setBounds(450,70,1000,70);
        text1.setFont(new Font("Tahoma",Font.PLAIN,50));
        text1.setForeground(Color.BLACK);
        add(text1);
        
        text2 = new JLabel("Chaly Chand Tak Warna Sham Tak!");
        text2.setBounds(650,110,1000,70);
        text2.setFont(new Font("Tahoma",Font.PLAIN,14));
        text2.setForeground(Color.BLACK);
        add(text2);
        
        AboutUs = new JButton("About Us");
        AboutUs.setBounds(0, 350, 300, 50);
        AboutUs.setBackground(Color.white);
        AboutUs.setForeground(Color.BLACK);
        AboutUs.setFont(new Font("Tahoma",Font.PLAIN,15));
        AboutUs.addActionListener(this);
        p2.add(AboutUs);
        
        
        setVisible(true);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== pDetails){
//            new addCustomer(username);
            addCustomer ac = new addCustomer(username);
        }
        else if(e.getSource()== updateDetails){
//            new updateCustomer(username);
            updateCustomer uc = new updateCustomer(username);
        }
        else if(e.getSource()== viewDetails){
//            new viewCustomer(username);
            viewCustomer vc = new viewCustomer(username);
        }
        
        else if(e.getSource()== packages){
              Packages p = new Packages();
        }
        
        else if(e.getSource()== bookpackage){
             bookPackage bp = new bookPackage(username);
        }
        else if(e.getSource()== viewPackage){
             viewPackage vp = new viewPackage(username);   
        }
        else if(e.getSource()== calculator){
             try{
                 Runtime.getRuntime().exec("calc.exe");
             }
             catch(Exception a){
             System.out.println(a);
             }
        }
        else if(e.getSource()== AboutUs){
              AboutUs au = new AboutUs(); 
        }
    }
    
    public static void main(String[] args){
        Dashboard d = new Dashboard("");   
    }
}
