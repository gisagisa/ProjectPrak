
package projectprak.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class MenuUtama extends Wrapper implements ActionListener{
    
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    JLabel ljudul = new JLabel("HOTEL DEL LUNA");
    
    //button
    JButton bpesan = new JButton("PESAN");
    JButton bcin = new JButton("CHECK IN");
    JButton bcout = new JButton("CHECK OUT");
    JButton bbatal = new JButton("BATAL");

    public MenuUtama(){
        super.setLayout(null);
        super.add(ljudul);
        super.add(bpesan);
        super.add(bcin);
        super.add(bcout); 
        super.add(bbatal); 
        
        ljudul.setFont(new Font("serif",Font.BOLD,30));
        bpesan.setFont(new Font("serif",Font.BOLD,20));
        bbatal.setFont(new Font("serif",Font.BOLD,20));
        bcin.setFont(new Font("serif",Font.BOLD,20));
        bcout.setFont(new Font("serif",Font.BOLD,20));
        
        ljudul.setBounds(313, 0, 400, 50);
        bpesan.setBounds(40, 80, 350, 150);
        bbatal.setBounds(490, 80, 350, 150);
        bcin.setBounds(40, 280, 350, 150);
        bcout.setBounds(490, 280, 350, 150);
        
        bpesan.addActionListener(this);
        bbatal.addActionListener(this);
        bcout.addActionListener(this);
        bcin.addActionListener(this);
       

    }
    
    public void actionPerformed(ActionEvent e){
        System.out.print(e);
        if (e.getSource() == bcin){
            controllerMenuUtama.viewCheckIn();
        }
    
    }
}
