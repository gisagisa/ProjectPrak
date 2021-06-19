
package projectprak.controller;

import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {
    public ViewAddNama viewAddNama(){
        return new ViewAddNama();
    }
    public ViewKamar viewKamar(){
        return new ViewKamar();
    }
    public ViewCheckIn viewCheckIn(){
        return new ViewCheckIn();
    }
    public ViewCheckOut viewCheckOut(){
        return new ViewCheckOut();
    }
    public ViewBooking viewBooking(){
        return new ViewBooking();
    }
    public ViewCancel viewCancel(){
        return new ViewCancel();
    }
    public ViewMenuUtama viewMenuUtama(){
        return new ViewMenuUtama();
    }
}
