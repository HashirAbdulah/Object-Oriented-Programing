import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandle  implements ActionListener{
    JFrame frame;
    JLabel L1,l2,l3;
    
    Container C;
    JButton B,B1,B2;
    
    //fnc
    EventHandle(){
    frame = new JFrame("Event");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setBounds(20,20,400,600);
    C = frame.getContentPane();
    
    //label
        L1 = new JLabel();
        C.add(L1);
        L1.setBounds(30, 20, 100, 40);
        Font font = new Font("Arial", Font.BOLD, 12);
        L1.setFont(font);
        
        l2 = new JLabel();
        C.add(l2);
        l2.setBounds(150, 20, 100, 40);
        l2.setFont(font);
        
        l3 = new JLabel();
        C.add(l3);
        l3.setBounds(260, 20, 100, 40);
        l3.setFont(font);
        
     //button
     B = new JButton("First Name");
     B1 = new JButton("Last Name ");
     B2 = new JButton("Program");
     C.add(B);
     C.add(B1);
     C.add(B2);
     B.setBounds(30,100,100,50);
     B1.setBounds(150, 100, 100, 50);
     B2.setBounds(280,100,100,50);
     
     //link btn
     B.addActionListener(this);
     B1.addActionListener(this);
     B2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
     if (e.getSource() == B){
         L1.setText("Hashir");
         

    }
     else if (e.getSource() == B1){
          l2.setText("Abdullah");

    }
     else if (e.getSource() == B2){
          l3.setText("Bscs 3A");
    }
    
    }
    public static void main(String[] args) {
       EventHandle obj = new EventHandle();
 
    }
    
}

