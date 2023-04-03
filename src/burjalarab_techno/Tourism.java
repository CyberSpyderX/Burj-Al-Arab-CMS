/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burjalarab_techno;

/**
 *
 * @author Sony
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Tourism extends javax.swing.JFrame {

    /**
     * Creates new form Tourism
     */
    public Tourism() {
        initComponents();
    }
    static int ch;
    static int red = 0,green =0,blue=0;
    static int n = 0;
    static int n1 = 0;
    static int n2 = 0;
    static int n3 = 0;
    static int n4 = 0;
    static int n5 = 0;
    static int n6 = 0; 
    static int n7 = 0;
    Timer timer1 = new Timer(1000,new techno1());
    Timer timer2 = new Timer(1000,new techno2());
    Timer timer3 = new Timer(1000,new techno3());
    Timer timer4 = new Timer(1000,new techno4());
    Timer timer5 = new Timer(1000,new techno5());
    Timer timer6 = new Timer(1000,new techno6());
    Timer timer7 = new Timer(1000,new techno7());
    Timer timer8 = new Timer(1000,new techno8());
    Timer panel  = new Timer(50,new Panel());
    public class Panel implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        Color();
        if(red == 255 && green == 255 && blue == 255)
            ch = 1;
        if(red == 0 && green == 0 && blue == 0)
            ch = 0;
        jPanel1.setBackground(new java.awt.Color(red, green, blue));
    }
    }
    public void Color(){
        if(ch == 0)
            if(red == 255)
        {
           if(red==255 && green ==255)
           {
           red =255;
           green=255;
           blue++;          
           }
           else
           {   
            red = 255;
           green++;
           }
        }
        else
            red++;
        if(ch == 1)
            if(green == 0)
        {
           if(green==0 && red ==0)
           {
           red =0;
           green=0;
           blue--;          
           }
           else
           {   
            green = 0;
           red--;
           }
        }
        else
            green--;
        
    }
    public class techno1 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n++;
        switch(n)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/Image 4.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/burjalarab.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/palmisland.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/theworld.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/emiratestowers.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 6 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/dolphinarium.PNG")));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 7 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sheikroad.PNG")));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 8 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight7.PNG")));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;    
        }
        if(n==8)
                n=0;
        
         }
    }
    public class techno2 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n1++;
        switch(n1)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 6 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight6.PNG")));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 7 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sight8.PNG")));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
        }
        if(n1==7)
                n1=0;
        
     }
    }
    public class techno3 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n2++;
        switch(n2)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 6 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall6.PNG")));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 7 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/mall7.PNG")));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
        }
        if(n2==7)
                n2=0;
        
     }
    }
    public class techno4 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n3++;
        switch(n3)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 6 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort6.PNG")));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 7 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/resort7.PNG")));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
        }
        if(n3==7)
                n3=0;
        
     }
    }
    public class techno5 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n4++;
        switch(n4)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 6 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids6.PNG")));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 7 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids7.PNG")));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 8 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/kids8.PNG")));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;    
        }
        if(n4==8)
                n4=0;
        
     }
    }
    public class techno6 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n5++;
        switch(n5)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/worship1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/worship2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/worship3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/worship4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/worship5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
         }
        if(n5==5)
                n5=0;
        
         }
    }
    public class techno7 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n6++;
        switch(n6)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/comm1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/comm2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/comm3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/comm4.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/comm5.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
         }
        if(n6==5)
                n6=0;
        
         }
    }
    public class techno8 implements ActionListener{
    public void actionPerformed(ActionEvent evt) {
        n7++;
        switch(n7)
        {
            case 1 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sport1.png")));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 2 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sport2.PNG")));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 3 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sport3.PNG")));    
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 4 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sport5.PNG")));    
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
            case 5 : main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burjalarab_techno/sport6.PNG")));
                     jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
                     jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
                     break;
         }
        if(n7==5)
                n7=0;
        
         }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        main = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame1WindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("CordiaUPC", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Burj Al Arab Travel Lounge");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("CordiaUPC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dubai Tourism And Points Of Interests !");

        jButton1.setFont(new java.awt.Font("CordiaUPC", 1, 48)); // NOI18N
        jButton1.setText("Book Your Ride!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton2.setText("World Famous Landmarks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("CordiaUPC", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categories : ");

        jButton3.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton3.setText("Sightseeing Spots");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton4.setText("Malls");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton5.setText("Resorts");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton6.setText("Fun For Kids");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton7.setText("Worship Places");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton8.setText("Commercial Centres");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jButton9.setText("Sports");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("CordiaUPC", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        timerStop();
        timer2.start();
        clearBorder();
        jLabel3.setText("Al Fahidi Fort");
        jLabel4.setText("Dubai Aquarium");
        jLabel5.setText("Ras Al Khor Sanctuary");
        jLabel6.setText("Al Mamzar Beach");
        jLabel7.setText("Miracle Garden");
        jLabel8.setText("Hatta Rock Pools");
        jLabel9.setText("Dubai Fountains");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        timerStop();
        timer3.start();
        clearBorder();
        jLabel3.setText("The Dubai Mall");
        jLabel4.setText("Mall Of The Emirates");
        jLabel5.setText("Bur Jaman");
        jLabel6.setText("City Centre Deira");
        jLabel7.setText("Ibn Battuta Mall");
        jLabel8.setText("Festival City Mall");
        jLabel9.setText("Mercato Shopping Mall");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        timerStop();
        timer4.start();
        clearBorder();
        jLabel3.setText("Atlantis, The Palm");
        jLabel4.setText("Manidnat Jumeriah");
        jLabel5.setText("JW Mariott Hotel");
        jLabel6.setText("Le Royal Méridien");
        jLabel7.setText("Rose Tower Hotel");
        jLabel8.setText("The Grand Hyatt");
        jLabel9.setText("Shangri La Resort");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        timerStop();
        timer8.start();
        clearBorder();
        jLabel3.setText("Dubai Autodrome");
        jLabel4.setText("Arabian Golf Club");
        jLabel5.setText("Dubai Creek Yacht Club");
        jLabel6.setText("Dubai Polo Academy");
        jLabel7.setText("Meydan Racecourse");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        timerStop();
        timer1.start();
        clearBorder();
        jLabel3.setText("Burj Khalifa");
        jLabel4.setText("Burj Al Arab");
        jLabel5.setText("Palm Jumeriah");
        jLabel6.setText("The World");
        jLabel7.setText("Emirates Tower");
        jLabel8.setText("Dubai Dolphinarium");
        jLabel9.setText("Sheikh Zayed Road");
        jLabel10.setText("Dubai Creek");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        timerStop();
        timer5.start();
        clearBorder();
        jLabel3.setText("SEGA Republic");
        jLabel4.setText("The Lego Land");
        jLabel5.setText("Ski Dubai");
        jLabel6.setText("iFLY Dubai");
        jLabel7.setText("Aquaventure Waterpark");
        jLabel8.setText("Wild Wadi Waterpark");
        jLabel9.setText("KidZania");
        jLabel10.setText("Ferrari World");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        timerStop();
        timer6.start();
        clearBorder();
        jLabel3.setText("Jumeriah Mosque");
        jLabel4.setText("Dubai Evangelical Church Centre");
        jLabel5.setText("Grand Mosque");
        jLabel6.setText("Hindu Temple");
        jLabel7.setText("Shiekh Zayed Grand Mosque");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        timerStop();
        timer7.start();
        clearBorder();
        jLabel3.setText("Dubai World Trade Centre");
        jLabel4.setText("Sentinel Business Centre");
        jLabel5.setText("Regus Dubai");
        jLabel6.setText("Austria Business Centre");
        jLabel7.setText("Tucson Business Centre");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel10.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFrame1.setVisible(true);
        jFrame1.setSize(700,525);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFrame1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowOpened
        panel.start();
    }//GEN-LAST:event_jFrame1WindowOpened
    public void timerStop(){
        timer1.stop();
        timer2.stop();
        timer3.stop();
        timer4.stop();
        timer5.stop();
        timer6.stop();
        timer7.stop();
        timer8.stop();
    
    }
    public void clearBorder(){
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tourism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tourism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tourism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tourism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tourism().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main;
    // End of variables declaration//GEN-END:variables
}
