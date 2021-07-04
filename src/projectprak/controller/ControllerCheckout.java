/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;

import javax.swing.JOptionPane;
import projectprak.model.Booking;
import projectprak.model.ModelBooking;
import projectprak.model.ModelKamar;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerCheckout {

    public ViewCheckOut viewCheckOut(ViewMenuUtama menu) {
        menu.dispose();
        return new ViewCheckOut();
    }

    public void checkOut(String kode, ViewCheckOut view) {
        ModelKamar mk = new ModelKamar();
        ModelBooking mb = new ModelBooking();
        Booking book = mb.getOne(kode);
        String msg = mk.update_status(book.getId_kamar(), 1);
        msg = mb.update_status(kode, 2);

        JOptionPane.showMessageDialog(view, msg);

    }
}
