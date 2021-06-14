package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerMenuUtama;
/**
 *
 * @author user
 */
public class ViewBooking extends Wrapper implements ActionListener{
    
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("PESAN KAMAR");
    
    JLabel lnama = new JLabel("Nama");
    final JTextField fnama = new JTextField();
    JLabel lnoHP = new JLabel("No Telpon");
    final JTextField fnoHP = new JTextField();
    JLabel lhari = new JLabel("Hari");
    final JTextField fhari = new JTextField();
    JLabel lnoKTP = new JLabel("No KTP");
    final JTextField fnoKTP = new JTextField();
    JLabel lkamar = new JLabel("Kamar");
    final JTextField fkamar = new JTextField();
    JLabel lharga = new JLabel("Total Harga : 1.000.000.000");
    
    JButton bpesan = new JButton("PESAN");
    
    public ViewBooking(){
        super.setLayout(null);
        
        super.add(lhotel);
        super.add(ljudul);
        
        super.add(lnama);
        super.add(fnama);
        super.add(lnoHP);
        super.add(fnoHP);
        super.add(lhari);
        super.add(fhari);
        super.add(lnoKTP);
        super.add(fnoKTP);
        super.add(lkamar);
        super.add(fkamar);
        super.add(bpesan); 
        super.add(lharga);
        
        lhotel.setFont(new Font("Baskerville Old Face",Font.PLAIN,30));
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,20));
        lnama.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnama.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lnoHP.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnoHP.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lhari.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fhari.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lnoKTP.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnoKTP.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lkamar.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fkamar.setFont(new Font("Century Gothic",Font.PLAIN,18));
        bpesan.setFont(new Font("Century Gothic",Font.BOLD,18));
        lharga.setFont(new Font("Century Gothic",Font.BOLD,18));

        
        lhotel.setBounds(313,10, 400, 50);
        ljudul.setBounds(80, 80, 250, 30);
        lnama.setBounds(80, 130, 300, 40);
        fnama.setBounds(80, 170, 300, 40);
        lnoKTP.setBounds(80, 220, 300, 40);
        fnoKTP.setBounds(80, 260, 300, 40);
        lnoHP.setBounds(80, 310, 300, 40);
        fnoHP.setBounds(80, 350, 300, 40);
        lhari.setBounds(500, 130, 300, 40);
        fhari.setBounds(500, 170, 300, 40);
        lkamar.setBounds(500, 220, 300, 40);
        fkamar.setBounds(500, 260, 300, 40);
        lharga.setBounds(500, 320, 300, 40);
        bpesan.setBounds(700, 405, 100, 40);
        
        bpesan.addActionListener(this);
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bpesan){
            controllerMenuUtama.viewMenuUtama();
        }
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFnoHP() {
        return fnoHP;
    }

    public JTextField getFhari() {
        return fhari;
    }

    public JTextField getFnoKTP() {
        return fnoKTP;
    }

    public JTextField getFkamar() {
        return fkamar;
    }
    
    
}

