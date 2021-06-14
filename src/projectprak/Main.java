package projectprak;

import projectprak.model.*;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Connector connector = new Connector();
        ModelCustomer mk = new ModelCustomer();
        Customer result = new Customer("Janson", "3322190034", "082123232323", 34, 0);
        String message = mk.create(result);
//        Booking result =  mk.getOne(1);
        System.out.print(message);
        
    }
    
}
