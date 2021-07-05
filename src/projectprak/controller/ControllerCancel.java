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
public class ControllerCancel {
    public ViewCancel viewCancel(ViewMenuUtama menu){
        menu.dispose();
        return new ViewCancel();
    }
    public void delete(String kode, ViewCancel view) {
        ModelKamar mk = new ModelKamar();
        ModelBooking mb = new ModelBooking();
        Booking book = mb.getOne(kode);
        String msg = mk.update_status(book.getId_kamar(), 0);
        msg = mb.delete(kode);
        
        JOptionPane.showMessageDialog(view, msg);
        
    }
}
