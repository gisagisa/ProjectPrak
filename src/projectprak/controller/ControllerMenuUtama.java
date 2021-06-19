
package projectprak.controller;

import projectprak.model.*;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {


    public ViewCheckIn viewCheckIn(){
        return new ViewCheckIn();
    }
    public ViewCheckOut viewCheckOut(){
        return new ViewCheckOut();
    }
    public ViewBooking viewBooking(String kamar){
        ModelCustomer mk = new ModelCustomer();
        Customer[] result = mk.getAll();
        return new ViewBooking(result,kamar);
    }
    public ViewCancel viewCancel(){
        return new ViewCancel();
    }
    public ViewMenuUtama viewMenuUtama(){
        return new ViewMenuUtama();
    }
}
