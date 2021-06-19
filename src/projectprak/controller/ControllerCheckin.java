/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;

import javax.swing.JOptionPane;
import projectprak.model.*;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerCheckin {
    public void checkIn(String kode, ViewCheckIn view) {
        ModelKamar mk = new ModelKamar();
        ModelBooking mb = new ModelBooking();
        Booking book = mb.getOne(kode);
        String msg = mk.update_status(book.getId_kamar(), 0);
        msg = mb.update_status(kode,1);
        
        JOptionPane.showMessageDialog(view, msg);
        
    }
}
