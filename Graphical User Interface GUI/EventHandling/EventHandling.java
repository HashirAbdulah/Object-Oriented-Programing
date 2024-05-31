import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling implements ActionListener{
    JFrame frame;
    Container C;
    JButton B,B1;
    JLabel L1;
    
    //fnc
    public void GUI(){
    frame = new JFrame("Event");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setBounds(20,20,400,600);
    C = frame.getContentPane();
    
    //label
    L1 = new JLabel("Event Handling");
    C.add(L1);
    L1.setBounds(30, 20, 100, 40);
    Font font = new Font("Arial", Font.BOLD, 12);
    L1.setFont(font);

    B = new JButton("Login");
    B1 = new JButton("Submit");
    C.add(B);
    C.add(B1);
    B.setBounds(50,100,70,50);
    B1.setBounds(130, 100, 90, 50);
    
    //link btn
    B.addActionListener(this);
    B1.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent e){
     if (e.getSource() == B){
         C.setBackground(Color.green);
         B.setForeground(Color.red);
    }
     else if (e.getSource() == B1){
         C.setBackground(Color.blue);
         B1.setForeground(Color.red);
    }
     }  
    
    public static void main(String[] args) {
      EventHandling obj = new EventHandling();
      obj.GUI();
    }
    
}