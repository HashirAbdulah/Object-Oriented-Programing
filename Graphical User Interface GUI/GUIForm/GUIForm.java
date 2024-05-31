import javax.swing.*;
import java.awt.*;

public class GUIForm {
    public static void main(String[] args){
    JFrame frame = new JFrame("CS Dept");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setBounds(100, 50, 400, 600);
    Container C = frame.getContentPane();
    C.setBackground(Color.blue);
    ButtonGroup bg = new ButtonGroup();
    
    // label 1
    JLabel L1 = new JLabel("Enter Name:");
    C.add(L1);
    L1.setBounds(10, 20, 70, 30);
    Font font = new Font("Arial", Font.BOLD, 12);
    L1.setFont(font);
    
    // textfield 1
    JTextField T1 = new JTextField();
    C.add(T1);
    T1.setFont(font);
    T1.setBounds(90, 20, 100, 30);
    
    // label 2
    JLabel L2 = new JLabel("Enter Roll No:");
    C.add(L2);
    L2.setBounds(10, 60, 80, 30);
    L2.setFont(font);
    
    // textfield 2
    JTextField T2 = new JTextField();
    C.add(T2);
    T2.setFont(font);
    T2.setBounds(90, 60, 100, 30);
    
    // label 3
    JLabel L3 = new JLabel("Programs:");
    C.add(L3);
    L3.setBounds(10, 100, 70, 30);
    L3.setFont(font);
    
    // textfield 3
    JTextField T3 = new JTextField();
    C.add(T3);
    T3.setFont(font);
    T3.setBounds(90, 100, 100, 30);
    
    // label 4
    JLabel L4 = new JLabel("Email:");
    C.add(L4);
    L4.setBounds(10, 140, 70, 30);
    L4.setFont(font);
    
    // textfield 4
    JTextField T4 = new JTextField();
    C.add(T4);
    T4.setFont(font);
    T4.setBounds(90, 140, 100, 30);
    
    // label 5
    JLabel L5 = new JLabel("Password:");
    C.add(L5);
    L5.setBounds(10, 180, 70, 30);
    L5.setFont(font);
    
    // textfield 5
    JTextField T5 = new JTextField();
    C.add(T5);
    T5.setFont(font);
    T5.setBounds(90, 180, 100, 30);
    
    // label 6
    JLabel L6 = new JLabel("Gender");
    C.add(L6);
    L6.setBounds(10, 220, 70, 30);
    L6.setFont(font);
    
    // Radiobutton 1
    JRadioButton R1 = new JRadioButton("Male");
    C.add(R1);
    R1.setBounds(90, 220, 60, 30);
    R1.setFont(font);
    
    // Radiobutton 2
    JRadioButton R2 = new JRadioButton("Female");
    C.add(R2);
    R2.setBounds(160, 220, 80, 30);
    R2.setFont(font);
   
    //buttnGrouping
    bg.add(R1);
    bg.add(R2);
    
    
    //label 7
    JLabel L7 = new JLabel("DOB:");
    C.add(L7);
    L7.setBounds(10, 250, 70, 30);
    L7.setFont(font);
    
    //combo-box
    JComboBox cb = new JComboBox();
    C.add(cb);
    cb.setBounds(85,255,100,30);
    
    // button
    JButton B = new JButton("Submit");
    C.add(B);
    B.setBounds(95, 290, 80, 30);
    B.setFont(font);
  }
}