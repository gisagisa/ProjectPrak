package projectprak;

import projectprak.model.*;
import projectprak.view.*;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
//       
        Connector connector = new Connector();
        ModelCustomer mk = new ModelCustomer();
        Customer[] result = mk.getAll();
        new ViewMenuUtama();
        //new ViewBooking(result,"");
//        String message = mk.create(result);
////        Booking result =  mk.getOne(1);
        System.out.print(result[0].getNo_ktp());
//        
    }
    
}
