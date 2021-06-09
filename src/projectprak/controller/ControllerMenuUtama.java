
package projectprak.controller;

import projectprak.view.Booking;
import projectprak.view.Cancel;
import projectprak.view.CheckIn;
import projectprak.view.CheckOut;
import projectprak.view.MenuUtama;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {
    public CheckIn viewCheckIn(){
        return new CheckIn();
    }
    public CheckOut viewCheckOut(){
        return new CheckOut();
    }
    public Booking viewBooking(){
        return new Booking();
    }
    public Cancel viewCancel(){
        return new Cancel();
    }
    public MenuUtama viewMenuUtama(){
        return new MenuUtama();
    }
}
