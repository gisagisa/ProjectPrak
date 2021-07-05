package projectprak.view;

import projectprak.model.Customer;


/**
 *
 * @author user
 */
public class ViewListCustomer extends TabelList{
    Customer[] customers;
    
    public ViewListCustomer(Customer[] customers){
        super("List Pelanggan", new Object[]{"ID", "Nama", "Umur", "No KTP","No Telpon"}); 
        this.customers = customers;
        
        for (Customer customer : customers) {//type value : values
            try{
            model.addRow(new Object[]{customer.getId(), customer.getNama(),
            customer.getUmur(),customer.getNo_ktp(),customer.getNo_telp()});
            }catch(Exception e){
               
            }   
        }
    }
}

