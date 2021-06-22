/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;

import projectprak.model.Booking;
import projectprak.model.ModelBooking;
import projectprak.view.ViewListTransaksi;

/**
 *
 * @author user
 */
public class ControllerListTransaksi {

    public ViewListTransaksi viewListTransaksi() {
        ModelBooking mb = new ModelBooking();
        Booking[] booking = mb.getAll();

        return new ViewListTransaksi(booking);
    }

}
