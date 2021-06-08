package projectprak.view;

/**
 *
 * @author user
 */

import java.awt.Font;
import javax.swing.*;


public class CekKode extends Wrapper{
    protected String judul;
    protected String msgBerhasil;
    
    final JTextField fkode = new JTextField();
    JLabel ljudul = new JLabel("");
    JLabel lmsg = new JLabel("");
    JButton buttonOke = new JButton("oke");

    
    public CekKode(String judul, String msgBerhasil) {
        super.getContentPane().removeAll();
        super.repaint();

        this.judul = judul;
        this.msgBerhasil = msgBerhasil;
        
        ljudul.setText(this.judul);
        lmsg.setText(this.msgBerhasil);
        
        super.setLayout(null);
        super.add(fkode);
        super.add(ljudul);
        super.add(lmsg);
        super.add(buttonOke);
        
        ljudul.setBounds(40, 40, 250, 10);
        lmsg.setBounds(500, 80, 250, 80);
        fkode.setBounds(40, 80, 250, 80);
        buttonOke.setBounds(500, 250, 100, 80);
        
        
    }

}
