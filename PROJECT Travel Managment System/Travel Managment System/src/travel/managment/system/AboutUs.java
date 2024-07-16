
package travel.managment.system;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class AboutUs extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
    Font  f1, f2;
    TextArea t1;
    String s;
    Container contentPane;
    
    AboutUs(){
         setBounds(400, 100, 500, 550);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(71,207,255));
        b1.addActionListener(this);
        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                    About Projects          \n  "
                + "\nThis Project of the Travel and Tourism Management System developed by Yahya & Hashir"
                + ",project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;

        t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        contentPane = this.getContentPane();
        t1 = new TextArea();

        l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        
        setVisible(true);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         dispose();
    }
        
    public static void main(String[] args){
        AboutUs au = new AboutUs();
    }
}
