import javax.swing.*;
import java.awt.*;

public class Gui {
        public static void main(String[] args) {
    JFrame frame = new JFrame("First Gui");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setBounds(100,50,400,600);
    Container C = frame.getContentPane();
    C.setBackground(Color.lightGray);
    
//    label
    JLabel L1 = new JLabel("Name:");
    C.add(L1);
    L1.setBounds(10,20,70,30);
    Font font = new Font("Arial",Font.BOLD,20);
    L1.setFont(font);
    
//textfield
    JTextField T1  = new JTextField();
    C.add(T1);
    T1.setBounds(90,20,200,30);  
    T1.setFont(font);
    
//    button
    JButton B = new JButton("Submit");
    C.add(B);
    B.setBounds(95,70,80,30);
    }
    
}
