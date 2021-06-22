/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;


import javax.swing.JOptionPane;
import projectprak.model.*;
import projectprak.view.ViewBooking;
import projectprak.view.ViewKamar;

/**
 *
 * @author user
 */
public class ControllerBooking {
    
    public ViewBooking viewBooking(String no){
        ModelKamar mk = new ModelKamar(); //kurang event handling kalo kosong nanti annas benerin
        Kamar kamar = mk.getOne(no);
        ModelCustomer mc = new ModelCustomer();
        Customer[] customers = mc.getAll();

        return new ViewBooking(customers,kamar);
    }

    public void storeBooking(String nama, int id_kamar, int hari, int total_harga, ViewBooking view) {
        ModelCustomer mc = new ModelCustomer();
        ModelBooking mb = new ModelBooking();
        ModelKamar mk = new ModelKamar();
        Customer cust = mc.getOne(nama);
        Booking book = new Booking(cust.getId(),id_kamar,0,"",hari,total_harga,0,"");
        String msg = mk.update_status(book.getId_kamar(), 0);
        msg = mb.create(book);
        
        JOptionPane.showMessageDialog(view, msg);
        
    }
}
