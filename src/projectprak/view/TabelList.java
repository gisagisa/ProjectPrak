package projectprak.view;

/**
 *
 * @author user
 */

import javax.swing.*;	 
import java.awt.*;              
import javax.swing.table.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


import projectprak.controller.ControllerMenuUtama;

public class TabelList extends Wrapper{
    JLabel lhotel = new JLabel("HOTEL DEL LUNA");
    JLabel ljudul = new JLabel();
    protected String judul;
    
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    JTable tabel;
    DefaultTableModel model;
    
    Object[] opt ;
    
    public TabelList(String judul, Object[] opt){
      
        setLayout(null);
        
        this.judul = judul;
        this.opt = opt;
        
        ljudul.setText(this.judul);
        
        super.add(ljudul);
        super.add(lhotel);
        
        lhotel.setFont(new Font("Baskerville Old Face",Font.PLAIN,30));
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,18));
        
        lhotel.setBounds(313,10, 400, 50);
        ljudul.setBounds(90, 80, 250, 30);
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(opt);
        tabel = new JTable(model);
        					
        TableColumn column;
        tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = tabel.getColumnModel().getColumn(0); 
        column.setPreferredWidth(50);
        column = tabel.getColumnModel().getColumn(1); 
        column.setPreferredWidth(250); 
        column = tabel.getColumnModel().getColumn(2); 
        column.setPreferredWidth(50); 
        column = tabel.getColumnModel().getColumn(3); 
        column.setPreferredWidth(200); 
        column = tabel.getColumnModel().getColumn(4); 
        column.setPreferredWidth(150);
        
        
        tabel.setSelectionBackground(Color.gray);
        tabel.setSelectionForeground(Color.white);
        tabel.setRowSelectionAllowed(true);
        tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        tabel.setFont(new Font("Century Gothic",Font.PLAIN,14));
        
        JScrollPane scroll = new JScrollPane(tabel);
       
        super.add(scroll);
        scroll.setBounds(90,130,700,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ViewListTransaksi obj = new ViewListTransaksi();
    }
}

