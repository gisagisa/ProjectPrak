/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;


import projectprak.model.*;
import projectprak.view.ViewBooking;
import projectprak.view.ViewKamar;

/**
 *
 * @author user
 */
public class ControllerBooking {

    public ViewKamar viewKamar() {
        ModelKamar mk = new ModelKamar();
        Kamar[] result = mk.getAll();
        return new ViewKamar(result);
    }

    public void storeBooking(String nama, int id_kamar, int hari, int total_harga, ViewBooking view) {
        ModelCustomer mc = new ModelCustomer();
        Customer cust = mc.getOne(nama);
        Booking book = new Booking(cust.getId(),id_kamar,0,"",hari,total_harga,0,"");
        ModelBooking mb = new ModelBooking();
        String msg = mb.create(book);
        
        
        
    }
}
