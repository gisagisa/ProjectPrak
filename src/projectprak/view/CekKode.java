package projectprak.view;

/**
 *
 * @author user
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerMenuUtama;

public class CekKode extends Wrapper implements ActionListener {

    protected String judul;
    protected String msgBerhasil;

    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();

    final JTextField fkode = new JTextField();
    JLabel ljudul = new JLabel("");
    JLabel lmsg = new JLabel("");
    JButton buttonOk = new JButton("OK");
    JButton bback = new JButton("KEMBALI");

    JLabel lhotel = new JLabel("HOTEL DEL LUNA");

    public CekKode(String judul, String msgBerhasil) {

        this.judul = judul;
        this.msgBerhasil = msgBerhasil;

        ljudul.setText(this.judul);

        super.setLayout(null);
        super.add(fkode);
        super.add(ljudul);
        super.add(lmsg);
        super.add(buttonOk);
        super.add(bback);
        super.add(lhotel);

        lhotel.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
        ljudul.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        fkode.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        lmsg.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        buttonOk.setFont(new Font("Century Gothic", Font.BOLD, 18));
        bback.setFont(new Font("Century Gothic", Font.BOLD, 18));
        
        bback.setBackground(Color.DARK_GRAY);
        bback.setForeground(Color.white);

        ljudul.setBounds(80, 120, 250, 30);
        fkode.setBounds(80, 180, 250, 40);
        lmsg.setBounds(600, 95, 250, 80);
        buttonOk.setBounds(700, 350, 80, 40);
        lhotel.setBounds(313, 10, 400, 50);
        bback.setBounds(80, 350, 120, 40);

        buttonOk.addActionListener(this);
        bback.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JTextField getFkode() {
        return fkode;
    }

    public void actionPerformed(ActionEvent e) {

    }

}
