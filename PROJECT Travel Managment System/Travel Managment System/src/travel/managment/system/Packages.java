package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Packages extends JFrame implements ActionListener{
    JPanel p1,p2,p3;
    JButton back;
   
    Packages(){
        setBounds(280, 70, 870, 625);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        String[] package1 = {"PRESTIGE PASSAGE", "5 Days and 6 Nights", "Assistance/Guide", "Luxury Accommodation",
                "Personalized Concierge Service", "Exclusive Experiences", "24/7 Support", "Special Amenities",
                "Adventure Activities", "BOOK NOW", "RS: 30000/-", "package1.jpg"};

        String[] package2 = {"CLASSIC PACKAGE", "3 Days and 4 Nights", "Comfortable Accommodation",
                "Shared Transportation", "Standard Support", "Optional Upgrades", "Casual Dining", "Local Insights","Local Insights",
                "BOOK NOW", "RS: 25000/-", "package2.jpg"};

        String[] package3 = {"RUSTIC ROUTES", "2 Days and 1 Nights", "$-Friendly Accommodation",
                "Public Transportation", "Self-Service", "Essential Services", "Value-added Services","Basic Relaxation",
                "Standard Itineraries", "BOOK NOW", "RS: 22000/-", "package3.jpg"};

        JTabbedPane tab1 = new JTabbedPane();

        p1 = createPackage(package1);
        tab1.addTab("Package 1", null, p1);

        p2 = createPackage(package2);
        tab1.addTab("Package 2", null, p2);

        p3 = createPackage(package3);
        tab1.addTab("Package 3", null, p3);

        add(tab1);
        
        
        
        
        setVisible(true);
    }
    
   
    public JPanel createPackage(String[] pack){
     
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(Color.WHITE);

    JLabel l1 = new JLabel(pack[0]);
    l1.setBounds(40, 10, 300, 35);
    l1.setFont(new Font("Tahoma", Font.BOLD, 25));
    l1.setForeground(new Color(247, 211, 0));
    p1.add(l1);

    JLabel l2 = new JLabel(pack[1]);
    l2.setBounds(30, 70, 300, 40);
    l2.setFont(new Font("", Font.BOLD, 20));
    l2.setForeground(new Color(3,247, 255));
    p1.add(l2);

    JLabel l3 = new JLabel(pack[2]);
    l3.setBounds(30, 110, 300, 40);
    l3.setFont(new Font("", Font.BOLD, 20));
    l3.setForeground(new Color(0, 0, 0));
    p1.add(l3);

    JLabel l4 = new JLabel(pack[3]);
    l4.setBounds(30, 150, 300, 40);
    l4.setFont(new Font("", Font.BOLD, 20));
    l4.setForeground(new Color(0, 0, 0));
    p1.add(l4);

    JLabel l5 = new JLabel( pack[4]);
    l5.setBounds(30, 190, 300, 40);
    l5.setFont(new Font("", Font.BOLD, 20));
    l5.setForeground(new Color(0, 0, 0));
    p1.add(l5);

    JLabel l6 = new JLabel(pack[5]);
    l6.setBounds(30, 235, 300, 40);
    l6.setFont(new Font("", Font.BOLD, 20));
    l6.setForeground(new Color(0, 0, 0));
    p1.add(l6);

    JLabel l7 = new JLabel(pack[6]);
    l7.setBounds(30, 280, 300, 40);
    l7.setFont(new Font("", Font.BOLD, 20));
    l7.setForeground(new Color(0, 0, 0));
    p1.add(l7);

    JLabel l8 = new JLabel(pack[7]);
    l8.setBounds(30, 325, 300, 40);
    l8.setFont(new Font("", Font.BOLD, 20));
    l8.setForeground(new Color(0, 0, 0));
    p1.add(l8);

    JLabel l9 = new JLabel(pack[8]);
    l9.setBounds(30, 370, 300, 40);
    l9.setFont(new Font("", Font.BOLD, 20));
    l9.setForeground(new Color(0, 0, 0));
    p1.add(l9);

    JLabel l10 = new JLabel(pack[9]);
    l10.setBounds(30, 430, 300, 40);
    l10.setFont(new Font("", Font.BOLD, 20));
    l10.setForeground(Color.BLACK);
    p1.add(l10);

    JLabel l11 = new JLabel(pack[10]);
    l11.setBounds(60, 470, 300, 40);
    l11.setFont(new Font("", Font.BOLD, 30));
   l11.setForeground(new Color(26, 250, 0));
    p1.add(l11);

    // Image icon for package
    ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
    Image image = icon.getImage().getScaledInstance(500, 550, Image.SCALE_DEFAULT);
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel imgLabel = new JLabel(imageIcon);
    imgLabel.setBounds(340, 20, 500, 500);
    p1.add(imgLabel);
    
    
    back = new JButton("Return");
    back.setBounds(235,520,100,30);
    back.setForeground(Color.white);
    back.setBackground(new Color(71,207,255));
    back.setBorder(BorderFactory.createEmptyBorder());
    back.addActionListener(this);
    p1.add(back);

    
    return p1;
    
  }
     
     @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
        }
    }
     
//    
//    public static void main(String[] args){
//        Packages p = new Packages();
//    } 
}
