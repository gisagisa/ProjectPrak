package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerAddNama;
import projectprak.controller.ControllerBooking;
import projectprak.controller.ControllerMenuUtama;
import projectprak.controller.ControllerViewKamar;
import projectprak.model.*;

/**
 *
 * @author user
 */
public class ViewBooking extends Wrapper implements ActionListener, KeyListener {

    ControllerViewKamar controllerViewKamar = new ControllerViewKamar();
    ControllerAddNama controllerAddNama = new ControllerAddNama();
    ControllerBooking controllerBooking = new ControllerBooking();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    Customer[] customers;
    Kamar kamar;
    int total;
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("PESAN KAMAR");

    JPanel panel = new JPanel();
    JComboBox<String> cbnama = new JComboBox<>();

    JLabel lnama = new JLabel("Nama");
    final JTextField fnama = new JTextField();
    JLabel lhari = new JLabel("Jumlah Hari");
    final JTextField fhari = new JTextField();
    JLabel ljudulharga = new JLabel("Total Harga :");
    JLabel lharga = new JLabel();
    JLabel ljudulkamar = new JLabel("Kamar :");
    JLabel lkamar;

    JButton bpesan = new JButton("PESAN");
    JButton bkamar = new JButton("Pilih Kamar");
    JButton baddNama = new JButton("+");
    JButton bback = new JButton("KEMBALI");

    public ViewBooking(Customer[] customers, Kamar kamar) {
        this.customers = customers;
        this.kamar = kamar;

        this.lkamar = new JLabel(kamar.getNomor());

        super.setLayout(null);
        super.add(lhotel);
        super.add(ljudul);
        super.add(lnama);
        super.add(fnama);
        super.add(lhari);
        super.add(fhari);
        super.add(bkamar);
        super.add(bpesan);
        super.add(cbnama);
        super.add(baddNama);
        super.add(ljudulkamar);
        super.add(lkamar);
        super.add(lharga);
        super.add(ljudulharga);
        
        super.add(bback);
        bback.setBounds(80, 350, 100, 50);
        bback.addActionListener(this);
        
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
        lkamar.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        ljudulkamar.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        lharga.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        ljudulharga.setFont(new Font("Century Gothic", Font.PLAIN, 20));

        lhotel.setBounds(313, 10, 400, 50);
        ljudul.setBounds(80, 80, 250, 30);
        lnama.setBounds(80, 120, 300, 40);
        //fnama.setBounds(80, 170, 300, 40);
        baddNama.setBounds(330, 170, 50, 40);
        cbnama.setBounds(80, 170, 240, 40);
        lhari.setBounds(80, 250, 300, 40);
        fhari.setBounds(80, 290, 300, 40);
        bkamar.setBounds(500, 170, 200, 40);
        ljudulkamar.setBounds(715, 170, 75, 40);
        lkamar.setBounds(800, 170, 75, 40);
        ljudulharga.setBounds(500, 290, 150, 40);
        lharga.setBounds(650, 290, 300, 40);
        bpesan.setBounds(390, 390, 100, 40);

        bpesan.addActionListener(this);
        bkamar.addActionListener(this);
        baddNama.addActionListener(this);

        fhari.addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bpesan) {
            String nama = this.cbnama.getSelectedItem().toString();
            int hari = Integer.parseInt(this.fhari.getText());
            int total = Integer.parseInt(this.lharga.getText());
            int id_kamar = kamar.getId();
            System.out.println(nama);
            controllerBooking.storeBooking(nama, id_kamar, hari, total, this);
        }
        if (e.getSource() == bkamar) {
            controllerViewKamar.viewKamar();
        }
        if (e.getSource() == baddNama) {
            controllerAddNama.viewAddNama();
        }
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
        }
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFhari() {
        return fhari;
    }

    public void setComboBox(Customer[] customers, JComboBox<String> cb) {
        for (Customer customer : customers) {
            try {
                cb.addItem(customer.getNama());
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int hari = Integer.parseInt(fhari.getText());
        this.total = hari * this.kamar.getHarga();
        this.lharga.setText(String.valueOf(this.total));
    }
}
