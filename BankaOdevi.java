package bankaodevi;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BankaOdevi extends JFrame implements ActionListener {

    JButton b, c, d, e,b1,b2,b3,b4;
    JTextField text1, text2, text3, text4, text5,tf1,tf2,tf3,tf4,tf5;
    JLabel label;

    Test t1=new Test();
    BankaOdevi() {

       
        JLabel l1, l2,l3,l4,l5,l6;
        l1 = new JLabel("Name :");
        l1.setBounds(90, 50, 120, 60);
        l2 = new JLabel("Last Name :");
        l2.setBounds(90, 100, 100, 30);
        l3 = new JLabel("Mail  :");
        l3.setBounds(90, 150, 100, 30);
        l4 = new JLabel("Tel Number :");
        l4.setBounds(90, 200, 100, 30);
        
        
        l5 = new JLabel("Name and Last name :  Sefa Enes ERGİN");
        l5.setBounds(370, 400, 500, 60);
        l6 = new JLabel("My student number :  19360859013");
        l6.setBounds(370, 460, 500, 60);
        
        JFrame f= new JFrame("Sefa Enes Ergin");  
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(200,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(200,150,150,20);    
        tf4=new JTextField();  
        tf4.setBounds(200,200,150,20);  
        
        
        b1=new JButton("Add Customer");  
        b1.setBounds(200,300,180,50);  //x y weight height
        b2=new JButton("Show Customer Info ");  
        b2.setBounds(30,350,180,50);  
        b3=new JButton("Account Info");  
        b3.setBounds(200,350,180,50); 
        b4=new JButton("Card Info");  
        b4.setBounds(370,350,180,50); 
        
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  f.add(b3);f.add(b4);f.add(tf4);
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);f.add(l6);
        
        f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        
    }

    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        String s3=tf3.getText();  
        String s4=tf4.getText(); 

        
        if(e.getSource()==b1){  //showmessage dialog
           
           JOptionPane.showMessageDialog(null, "Congrats, Customer added." );
           
        }else if(e.getSource()==b2){  
            
            JOptionPane.showMessageDialog(null, "Name:" + s1+" \n" + "Las Name:"+ s2 +" \n"+"E-Mail:" + s3 +" \n"+"Tel. Number: "+s4 );
        }  

        
    }

    public static void main(String[] args) {
        // TODO code application logic here

        new BankaOdevi();
        
        //Musteri m1=new Musteri("sefa", "ergin", "sefanınMaili@gmail.com", 532065, 259);
        //BankaPersoneli b1=new BankaPersoneli("ahmet", "ergin", "ahmetinmaili@gmail", 53212, 123);
        //Test t1=new Test();
        //t1.addKisi(m1); //musteri eklendi.
        //t1.addKisi(b1);
        //t1.show();
        //System.out.println("**********************");
        //t1.showKisi();
        
    
      

    }
    
}
