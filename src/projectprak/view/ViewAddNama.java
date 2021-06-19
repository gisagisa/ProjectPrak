/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class ViewAddNama extends Wrapper implements ActionListener{
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("TAMBAH NAMA");
    
    
    JLabel lnamaBaru = new JLabel("Nama Baru");
    final JTextField fnamaBaru = new JTextField();
    
    JButton badd = new JButton("TAMBAH");
    
    public ViewAddNama(){
        super.setLayout(null);
        
        super.add(lhotel);
        super.add(ljudul);
        
        super.add(lnamaBaru);
        super.add(fnamaBaru);
        super.add(badd); 
        
        lhotel.setFont(new Font("Baskerville Old Face",Font.PLAIN,30));
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,20));
        lnamaBaru.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnamaBaru.setFont(new Font("Century Gothic",Font.PLAIN,18));

        
        lhotel.setBounds(313,10, 400, 50);
        ljudul.setBounds(100, 120, 250, 30);
        lnamaBaru.setBounds(100, 170, 300, 40);
        fnamaBaru.setBounds(100, 220, 300, 40);
        badd.setBounds(600, 300, 100, 40);
        
        badd.addActionListener(this);
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == badd){
            controllerMenuUtama.viewBooking("");
        }
    }
}
