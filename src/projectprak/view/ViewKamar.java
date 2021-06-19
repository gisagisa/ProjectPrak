package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerMenuUtama;
/**
 *
 * @author user
 */
public class ViewKamar extends Wrapper implements ActionListener{
    
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("KAMAR");
    
    //atas
    JButton bSingleF1 = new JButton("F1");
    JButton bSingleF2 = new JButton("F2");
    JButton bDoubleF3 = new JButton("F3");
    JButton bDoubleF4 = new JButton("F4");
    
    //bawah
    JButton bDoubleB1 = new JButton("B1");
    JButton bDoubleB2 = new JButton("B2");
    JButton bDoubleB3 = new JButton("B3");
    JButton bDoubleB4 = new JButton("B4");
    JButton bDoubleB5 = new JButton("B5");
    JButton bDoubleB6 = new JButton("B6");
    
    
    //kanan
    JButton bSingleR1 = new JButton("R1");
    JButton bSingleR2 = new JButton("R2");
    
    
    //kiri
    JButton bSingleL1 = new JButton("L1");
    JButton bSingleL2 = new JButton("L2");
    
    //tengah
    JButton bSingleM1 = new JButton("M1");
    JButton bSingleM2 = new JButton("M2");
    JButton bSingleM3 = new JButton("M3");
    JButton bSingleM4 = new JButton("M4");
    JButton bDoubleM5 = new JButton("M5");
    JButton bDoubleM6 = new JButton("M6");
    
    
    
    JLabel llobby = new JLabel("LOBBY");
    
    public ViewKamar(){
        super.setLayout(null);
        
        super.add(lhotel);
        super.add(ljudul);
        super.add(llobby);
        
        
        //atas
        super.add(bSingleF1); 
        super.add(bSingleF2);
        super.add(bDoubleF3);
        super.add(bDoubleF4);
        
        //bawah
        super.add(bDoubleB1);
        super.add(bDoubleB2);
        super.add(bDoubleB3);
        super.add(bDoubleB4);
        super.add(bDoubleB5);
        super.add(bDoubleB6);
        
        //kanan
        super.add(bSingleR1);
        super.add(bSingleR2);
        
        //kiri
        super.add(bSingleL1);
        super.add(bSingleL2);
        
        
        //tengah
        super.add(bSingleM1);
        super.add(bSingleM2);
        super.add(bSingleM3);
        super.add(bSingleM4);
        super.add(bDoubleM5);
        super.add(bDoubleM6);

        lhotel.setFont(new Font("Baskerville Old Face",Font.PLAIN,30));
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,20));
        llobby.setFont(new Font("Century Gothic",Font.PLAIN,26));
        
        //atas
        bSingleF1.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleF2.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleF3.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleF4.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        //bawah
        bDoubleB1.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleB2.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleB3.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleB4.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleB5.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleB6.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        
        //kanan
        bSingleR1.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleR2.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        //kiri
        bSingleL1.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleL2.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        //tengah
        bSingleM1.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleM2.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleM3.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bSingleM4.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleM5.setFont(new Font("Century Gothic",Font.PLAIN,12));
        bDoubleM6.setFont(new Font("Century Gothic",Font.PLAIN,12));
        
        
        
        lhotel.setBounds(313,10, 400, 50);
        ljudul.setBounds(80, 70, 250, 30);
        llobby.setBounds(405, 170, 250, 30);
        
        
        //atas
        bSingleF1.setBounds(80, 120, 55, 50);
        bSingleF2.setBounds(750, 120, 55, 50);
        bDoubleF3.setBounds(200, 120, 80, 50);
        bDoubleF4.setBounds(605, 120, 80, 50);
        
        //bawah
        bDoubleB1.setBounds(80, 390, 80, 50);
        bDoubleB2.setBounds(200, 390, 80, 50);
        bDoubleB3.setBounds(325, 390, 80, 50);
        bDoubleB4.setBounds(475, 390, 80, 50);
        bDoubleB5.setBounds(605, 390, 80, 50);
        bDoubleB6.setBounds(725, 390, 80, 50);
        
        //kanan
        bSingleR1.setBounds(750, 210, 55, 50);
        bSingleR2.setBounds(750, 300, 55, 50);
        
        //kiri
        bSingleL1.setBounds(80, 210, 55, 50);
        bSingleL2.setBounds(80, 300, 55, 50);
        
        //tengah
        bSingleM1.setBounds(220, 300, 55, 50);
        bSingleM2.setBounds(355, 300, 55, 50);
        bSingleM3.setBounds(475, 300, 55, 50);
        bSingleM4.setBounds(605, 300, 57, 50);
        bDoubleM5.setBounds(200, 210, 80, 50);
        bDoubleM6.setBounds(605, 210, 80, 50);

        bSingleF1.addActionListener(this);
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bSingleF1){
            controllerMenuUtama.viewMenuUtama();
        }
    }
    
    
}

