package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Splash extends JFrame implements Runnable{
   Thread t1;
   
   //constructor
   Splash(){
   setSize(1000,600);
   setLocation(150,100);
   
   //image icon for background
   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
   //image scaling
   Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
   //converting it to imageicon for placing it in jlabel
   ImageIcon i3 = new ImageIcon(i2); 
   JLabel image = new JLabel(i3);
   add(image);
   setVisible(true);
   
   //thread obj
   t1 = new Thread(this);
   t1.start();
   }
   
   public void run(){
       try{
       Thread.sleep(5000);
       setVisible(false);
       }
       catch(Exception e){
       System.out.println(e);
       }
   }
   
   public static void main(String[] args){
       new Splash();
   }
}
