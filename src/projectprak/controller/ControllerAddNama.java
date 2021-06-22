/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.controller;

import javax.swing.JOptionPane;
import projectprak.model.Customer;
import projectprak.model.ModelCustomer;
import projectprak.view.ViewAddNama;

/**
 *
 * @author user
 */
public class ControllerAddNama {

    public ViewAddNama viewAddNama() {
        return new ViewAddNama();
    }

    public void AddNewCust(String nama, String noKTP, String noTelp, int umur, int id, ViewAddNama view) {
        Customer newCust = new Customer(nama, noKTP, noTelp, umur, 0);
        ModelCustomer mc = new ModelCustomer();
        String msg = mc.create(newCust);

        JOptionPane.showMessageDialog(view, msg);

    }

}
