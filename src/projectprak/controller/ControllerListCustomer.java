/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
