package projectprak.controller;

import projectprak.model.Booking;
import projectprak.model.ModelBooking;
import projectprak.view.ViewListTransaksi;
import projectprak.view.ViewMenuUtama;

/**
 *
 * @author user
 */
public class ControllerListTransaksi {

    public ViewListTransaksi viewListTransaksi(ViewMenuUtama menu) {
        menu.dispose();
        ModelBooking mb = new ModelBooking();
        Booking[] booking = mb.getAll();

        return new ViewListTransaksi(booking);
    }

}
