package projectprak.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import projectprak.controller.ControllerAddNama;
import projectprak.controller.ControllerBooking;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class ViewAddNama extends Wrapper implements ActionListener {

    ControllerBooking controllerBooking = new ControllerBooking();
    ControllerAddNama controllerAddNama = new ControllerAddNama();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("TAMBAH NAMA");

    JLabel lnamaBaru = new JLabel("Nama Baru");
    final JTextField fnamaBaru = new JTextField();
    JLabel lumur = new JLabel("Umur");
    final JTextField fumur = new JTextField();
    JLabel lnoKTP = new JLabel("No KTP");
    final JTextField fnoKTP = new JTextField();
    JLabel lnoTelp = new JLabel("No Telpon");
    final JTextField fnoTelp = new JTextField();

    JButton badd = new JButton("TAMBAH");
    JButton bback = new JButton("KEMBALI");

    public ViewAddNama() {
        super.setLayout(null);

        super.add(lhotel);
        super.add(ljudul);

        super.add(lnamaBaru);
        super.add(fnamaBaru);
        super.add(lumur);
        super.add(fumur);
        super.add(lnoKTP);
        super.add(fnoKTP);
        super.add(lnoTelp);
        super.add(fnoTelp);

        super.add(badd);
        super.add(bback);

        lhotel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
        ljudul.setFont(new Font("Century Gothic", Font.BOLD, 20));
        lnamaBaru.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fnamaBaru.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        lumur.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fumur.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        lnoKTP.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fnoKTP.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        lnoTelp.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fnoTelp.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        badd.setFont(new Font("Century Gothic", Font.BOLD, 18));
        bback.setFont(new Font("Century Gothic", Font.BOLD, 18));

        lhotel.setBounds(313, 10, 400, 50);
        ljudul.setBounds(130, 90, 250, 30);
        lnamaBaru.setBounds(130, 150, 300, 40);
        fnamaBaru.setBounds(130, 190, 240, 40);
        lumur.setBounds(130, 255, 300, 40);
        fumur.setBounds(130, 295, 240, 40);
        lnoKTP.setBounds(500, 150, 300, 40);
        fnoKTP.setBounds(500, 190, 240, 40);
        lnoTelp.setBounds(500, 255, 300, 40);
        fnoTelp.setBounds(500, 295, 240, 40);
        badd.setBounds(620, 390, 120, 40);
        bback.setBounds(130, 390, 120, 40);
        
        badd.setBackground(Color.gray);
        badd.setForeground(Color.white);
        bback.setBackground(Color.DARK_GRAY);
        bback.setForeground(Color.white);

        badd.addActionListener(this);
        bback.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == badd) {
            String nama = this.fnamaBaru.getText();
            String noKTP = this.fnoKTP.getText();
            String noTelp = this.fnoTelp.getText();
            int umur = Integer.parseInt(this.fumur.getText());
            controllerAddNama.AddNewCust(nama, noKTP, noTelp, umur, 0, this);
        }
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
        }
    }
}
