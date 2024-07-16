package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class Loading extends JFrame implements Runnable{
    JLabel text,loading,lusername;
    JProgressBar pb;
    String username;
    Thread t;
    
    public void run() {
            try {
              for (int i = 0; i <= 100; i++) {
                    int max = pb.getMaximum();
                    int value = pb.getValue();
                    if (value < max) {
                        pb.setValue(pb.getValue() + 1);
                    } else {
                        setVisible(false);
                        new Dashboard(username);
                    }
                    Thread.sleep(50);
              }
            }     
            catch (Exception e) {
		System.out.println(e);
            }
	}
    
    
    Loading(String username){
    this.username = username;    
    t = new Thread(this);   
    setBounds(500,200,650,400);
    setLocation(350,180);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    setResizable(false);
    
    text = new JLabel("Travel Agency ");
    text.setBounds(50,20,600,40);
    Font font = new Font ("Tahoma",Font.BOLD,35);
    text.setFont(font);
    add(text);
    
    pb = new JProgressBar();
    pb.setBounds(150,80,300,30);
    pb.setStringPainted(true);
    add(pb);
    
    //loading text
    loading = new JLabel("Loading....");
    loading.setBounds(350,120,150,30);
    Font f = new Font ("Tahoma",Font.BOLD,15);
    loading.setFont(f);
    add(loading);
    
    lusername = new JLabel("Welcome "+ username);
    lusername.setBounds(20,310,400,40);
    lusername.setFont(f);
    add(lusername);
    
    t.start();
    setVisible(true);
    
    }
    
    public static void main(String[] args){
        Loading l = new Loading("");
    }
}
