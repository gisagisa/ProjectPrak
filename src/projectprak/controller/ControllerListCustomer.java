package projectprak.controller;

import projectprak.model.Customer;
import projectprak.model.ModelCustomer;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerListCustomer {
    
    public ViewListCustomer viewCustomer(ViewMenuUtama menu){
        menu.dispose();
       ModelCustomer mc = new ModelCustomer();
       Customer[] customers = mc.getAll();

       return new ViewListCustomer(customers);
    }
    
}
