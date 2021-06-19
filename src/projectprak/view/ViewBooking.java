package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerBooking;

import projectprak.controller.ControllerMenuUtama;
import projectprak.model.*;

/**
 *
 * @author user
 */
public class ViewBooking extends Wrapper implements ActionListener {

    ControllerBooking controllerBooking = new ControllerBooking();
    Customer[] customers;
    String kamar;
    
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("PESAN KAMAR");

    JPanel panel = new JPanel();
    JComboBox<String> cbnama = new JComboBox<>();

    JLabel lnama = new JLabel("Nama");
    final JTextField fnama = new JTextField();
    JLabel lhari = new JLabel("Hari");
    final JTextField fhari = new JTextField();
    JLabel lharga = new JLabel("Total Harga : 1.000.000.000");
    
    JLabel lkamar;

    JButton bpesan = new JButton("PESAN");
    JButton bkamar = new JButton("Pilih Kamar");
    JButton baddNama = new JButton("+");

    public ViewBooking(Customer[] customers,String kamar) {
        this.customers = customers;
        this.kamar =kamar;
        
        this.lkamar = new JLabel(kamar);
        
        super.setLayout(null);
        super.add(lhotel);
        super.add(ljudul);
        super.add(lnama);
        super.add(fnama);
        super.add(lhari);
        super.add(fhari);
        super.add(bkamar);
        super.add(bpesan);
        super.add(lharga);
        super.add(cbnama);
        super.add(baddNama);
        super.add(lkamar);

        this.setComboBox(this.customers, cbnama);

        lhotel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
        ljudul.setFont(new Font("Century Gothic", Font.BOLD, 20));
        lnama.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        cbnama.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        baddNama.setFont(new Font("Century Gothic", Font.BOLD, 18));
        //fnama.setFont(new Font("Century Gothic",Font.PLAIN,18));
        lhari.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fhari.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        bkamar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        bpesan.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lkamar.setFont(new Font("Century Gothic", Font.BOLD, 18));
        lharga.setFont(new Font("Century Gothic", Font.BOLD, 18));

        lhotel.setBounds(313, 10, 400, 50);
        ljudul.setBounds(80, 80, 250, 30);
        lnama.setBounds(80, 130, 300, 40);
        //fnama.setBounds(80, 170, 300, 40);
        baddNama.setBounds(330, 170, 50, 40);
        cbnama.setBounds(80, 170, 240, 40);
        lhari.setBounds(80, 240, 300, 40);
        fhari.setBounds(80, 280, 300, 40);
        bkamar.setBounds(500, 170, 200, 40);
        lkamar.setBounds(750, 230, 75, 40);
        lharga.setBounds(500, 280, 300, 40);
        bpesan.setBounds(650, 375, 100, 40);

        bpesan.addActionListener(this);
        bkamar.addActionListener(this);
        baddNama.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bpesan) {
//           controllerBooking.St();
        }
        if (e.getSource() == bkamar) {
            controllerBooking.viewKamar();
        }
        if (e.getSource() == baddNama) {
            controllerBooking.viewAddNama();
        }
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFhari() {
        return fhari;
    }


    public void setComboBox(Customer[] customers,JComboBox<String> cb) {
        for (Customer customer : customers) {
            try{
            cb.addItem(customer.getNama());
            }catch(Exception e){
               }   
        }
    }

//    public JTextField getFkamar() {
//        //return fkamar;
//    }
}
