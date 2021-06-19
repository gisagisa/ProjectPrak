
package projectprak.controller;

import projectprak.model.*;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {
    public ViewAddNama viewAddNama(){
        return new ViewAddNama();
    }

    public ViewCheckIn viewCheckIn(){
        return new ViewCheckIn();
    }
    public ViewCheckOut viewCheckOut(){
        return new ViewCheckOut();
    }
    public ViewBooking viewBooking(String no){
        ModelKamar mk = new ModelKamar();
        Kamar kamar = mk.getOne(no);
        ModelCustomer mc = new ModelCustomer();
        Customer[] customers = mc.getAll();

        return new ViewBooking(customers,kamar);
    }
    public ViewCancel viewCancel(){
        return new ViewCancel();
    }
    public ViewMenuUtama viewMenuUtama(){
        return new ViewMenuUtama();
    }
}
