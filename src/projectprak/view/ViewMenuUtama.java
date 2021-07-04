package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.*;

/**
 *
 * @author user
 */
public class ViewMenuUtama extends Wrapper implements ActionListener {

    ControllerCheckin controllerCheckin = new ControllerCheckin();
    ControllerCheckout controllerCheckout = new ControllerCheckout();
    ControllerBooking controllerBooking = new ControllerBooking();
    ControllerCancel controllerCancel = new ControllerCancel();
    ControllerListCustomer controllerListCustomer = new ControllerListCustomer();
    ControllerListTransaksi controllerListTransaksi = new ControllerListTransaksi();
    JLabel ljudul = new JLabel("HOTEL DEL LUNA");

    //button
    JButton bpesan = new JButton("PESAN");
    JButton bcin = new JButton("CHECK IN");
    JButton bcout = new JButton("CHECK OUT");
    JButton bbatal = new JButton("BATAL");
    JButton blistCustomer = new JButton("LIST CUSTOMER");
    JButton blistTransaksi = new JButton("LIST TRANSAKSI");

    public ViewMenuUtama() {
        super.setLayout(null);

        super.add(ljudul);
        super.add(bpesan);
        super.add(bcin);
        super.add(bcout);
        super.add(bbatal);
        super.add(blistCustomer);
        super.add(blistTransaksi);

        ljudul.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
        bpesan.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        bbatal.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        bcin.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        bcout.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        blistCustomer.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        blistTransaksi.setFont(new Font("Century Gothic", Font.PLAIN, 20));

        ljudul.setBounds(313, 10, 400, 50);
        bpesan.setBounds(40, 90, 250, 150);
        bbatal.setBounds(40, 280, 250, 150);
        bcin.setBounds(320, 90, 250, 150);
        bcout.setBounds(320, 280, 250, 150);
        blistCustomer.setBounds(600, 90, 250, 150);
        blistTransaksi.setBounds(600, 280, 250, 150);

        bpesan.addActionListener(this);
        bbatal.addActionListener(this);
        bcout.addActionListener(this);
        bcin.addActionListener(this);
        blistCustomer.addActionListener(this);
        blistTransaksi.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bcin) {
            controllerCheckin.viewCheckIn(this);
        }
        if (e.getSource() == bcout) {
            controllerCheckout.viewCheckOut(this);
        }
        if (e.getSource() == bpesan) {
            controllerBooking.viewBooking("F3",this);
        }
        if (e.getSource() == bbatal) {
            controllerCancel.viewCancel(this);
        }
        if (e.getSource() == blistCustomer) {
            controllerListCustomer.viewCustomer(this);
        }
        if (e.getSource() == blistTransaksi) {
            controllerListTransaksi.viewListTransaksi(this);
        }
    }
}
