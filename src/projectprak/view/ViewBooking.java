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
    
    JPanel panel = new JPanel();
    JComboBox<String> cbnama = new JComboBox <>();
    
    JLabel lnama = new JLabel("Nama");
    final JTextField fnama = new JTextField();
    JLabel lnoHP = new JLabel("No Telpon");
    final JTextField fnoHP = new JTextField();
    JLabel lhari = new JLabel("Hari");
    final JTextField fhari = new JTextField();
    JLabel lnoKTP = new JLabel("No KTP");
    final JTextField fnoKTP = new JTextField();
    JLabel lharga = new JLabel("Total Harga : 1.000.000.000");
    
    JButton bpesan = new JButton("PESAN");
    JButton bkamar = new JButton("Pilih Kamar");
    JButton baddNama = new JButton("+");
    
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
        super.add(bkamar);
        super.add(bpesan); 
        super.add(lharga);
        super.add(cbnama);
        super.add(baddNama);
        
        cbnama.addItem("Saha");
        cbnama.addItem("Annas Adharuqudni");
        cbnama.addItem("Friska Eka");
        cbnama.addItem("Gisani Miftahul Rahma");
        
        lhotel.setFont(new Font("Baskerville Old Face",Font.PLAIN,30));
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,20));
        lnama.setFont(new Font("Century Gothic",Font.PLAIN,20));
        cbnama.setFont(new Font("Century Gothic",Font.PLAIN,18));
        baddNama.setFont(new Font("Century Gothic",Font.BOLD,18));
        //fnama.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lnoHP.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnoHP.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lhari.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fhari.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lnoKTP.setFont(new Font("Century Gothic",Font.PLAIN,20));
        fnoKTP.setFont(new Font("Century Gothic",Font.PLAIN,18));
        bkamar.setFont(new Font("Century Gothic",Font.PLAIN,18));
        bpesan.setFont(new Font("Century Gothic",Font.BOLD,18));
        lharga.setFont(new Font("Century Gothic",Font.BOLD,18));

        
        lhotel.setBounds(313,10, 400, 50);
        ljudul.setBounds(80, 80, 250, 30);
        lnama.setBounds(80, 130, 300, 40);
        //fnama.setBounds(80, 170, 300, 40);
        baddNama.setBounds(330, 170, 50, 40);
        cbnama.setBounds(80, 170, 240, 40);
        lnoKTP.setBounds(80, 220, 300, 40);
        fnoKTP.setBounds(80, 260, 300, 40);
        lnoHP.setBounds(80, 310, 300, 40);
        fnoHP.setBounds(80, 350, 300, 40);
        lhari.setBounds(500, 130, 300, 40);
        fhari.setBounds(500, 170, 300, 40);
        bkamar.setBounds(500, 260, 200, 40);
        lharga.setBounds(500, 320, 300, 40);
        bpesan.setBounds(700, 405, 100, 40);
        
        bpesan.addActionListener(this);
        bkamar.addActionListener(this);
        baddNama.addActionListener(this);
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bpesan){
            controllerMenuUtama.viewMenuUtama();
        }
        if (e.getSource() == bkamar){
            controllerMenuUtama.viewKamar();
        }
        if (e.getSource() == baddNama){
            controllerMenuUtama.viewAddNama();
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

//    public JTextField getFkamar() {
//        //return fkamar;
//    }
    
    
}

