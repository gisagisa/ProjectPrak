package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import projectprak.controller.ControllerBooking;
import projectprak.controller.ControllerMenuUtama;
import projectprak.model.Kamar;

/**
 *
 * @author user
 */
public class ViewKamar extends Wrapper implements ActionListener {

    ControllerBooking controllerBooking = new ControllerBooking();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();

    Kamar[] kamars;
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel("KAMAR");
    JButton[] buttonKamar = new JButton[20];
    JButton bback = new JButton("KEMBALI");

    JLabel llobby = new JLabel("LOBBY");

    public ViewKamar(Kamar[] kamars) {
        this.kamars = kamars;
        super.setLayout(null);

        super.add(lhotel);
        super.add(ljudul);
        super.add(llobby);

        super.add(bback);
        bback.setBounds(750, 70, 100, 30);
        bback.addActionListener(this);

        lhotel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 30));
        ljudul.setFont(new Font("Century Gothic", Font.BOLD, 20));
        llobby.setFont(new Font("Century Gothic", Font.PLAIN, 26));

        lhotel.setBounds(313, 10, 400, 50);
        ljudul.setBounds(80, 70, 250, 30);
        llobby.setBounds(405, 350, 250, 30);

        this.setJButton(kamars, buttonKamar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
            return;
        }
        controllerBooking.viewBooking(e.getActionCommand(), this);
    }

    public void setJButton(Kamar[] kamars, JButton[] buttons) {

        for (int i = 0; i < kamars.length; i++) {
            try {
                String nomorKamar = kamars[i].getNomor();
                buttons[i] = new JButton();
                buttons[i].setText(nomorKamar);
                buttons[i].setFont(new Font("Century Gothic", Font.PLAIN, 12));
                buttons[i].addActionListener(this);
                super.add(buttons[i]);
                if (kamars[i].getStatus() == 0) {
                    buttons[i].setEnabled(false);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //atas
        buttons[0].setBounds(80, 120, 55, 50);
        buttons[1].setBounds(750, 120, 55, 50);
        buttons[2].setBounds(200, 120, 80, 50);
        buttons[3].setBounds(605, 120, 80, 50);

        //bawah
        buttons[4].setBounds(80, 390, 80, 50);
        buttons[5].setBounds(200, 390, 80, 50);
        buttons[6].setBounds(325, 390, 80, 50);
        buttons[7].setBounds(475, 390, 80, 50);
        buttons[8].setBounds(605, 390, 80, 50);
        buttons[9].setBounds(725, 390, 80, 50);

        //kanan
        buttons[10].setBounds(750, 210, 55, 50);
        buttons[11].setBounds(750, 300, 55, 50);

        //kiri
        buttons[12].setBounds(80, 210, 55, 50);
        buttons[13].setBounds(80, 300, 55, 50);

        //tengah
        buttons[14].setBounds(220, 300, 55, 50);
        buttons[15].setBounds(355, 300, 55, 50);
        buttons[16].setBounds(475, 300, 55, 50);
        buttons[17].setBounds(605, 300, 57, 50);
        buttons[18].setBounds(200, 210, 80, 50);
        buttons[19].setBounds(605, 210, 80, 50);
    }
}
