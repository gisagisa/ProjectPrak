package projectprak.view;

import java.sql.Date;

/**
 *
 * @author user
 */
public class ViewListTransaksi extends TabelList{
    public ViewListTransaksi(){
        
        super("List Transaksi", new Object[]{"ID", "Customer", "Kamar", "Tanggal","Total Harga","No Kamar"}); 

        model.addRow(new Object[]{"Akira", "Hiroshima",
            Date.valueOf("1995-10-16"), 2600000});
        model.addRow(new Object[]{"Hikaru", "Tokyo", 
            Date.valueOf("1990-09-23"), 2500000});
        model.addRow(new Object[]{"Natsuki", "Akihabara", 
            Date.valueOf("1987-12-05"), 3750000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        model.addRow(new Object[]{"Akira", "Hiroshima",
            Date.valueOf("1995-10-16"), 2600000});
        model.addRow(new Object[]{"Hikaru", "Tokyo", 
            Date.valueOf("1990-09-23"), 2500000});
        model.addRow(new Object[]{"Natsuki", "Akihabara", 
            Date.valueOf("1987-12-05"), 3750000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        model.addRow(new Object[]{"Akira", "Hiroshima",
            Date.valueOf("1995-10-16"), 2600000});
        model.addRow(new Object[]{"Hikaru", "Tokyo", 
            Date.valueOf("1990-09-23"), 2500000});
        model.addRow(new Object[]{"Natsuki", "Akihabara", 
            Date.valueOf("1987-12-05"), 3750000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        model.addRow(new Object[]{"Asoka", "Kyoto", 
            Date.valueOf("1989-01-15"), 5730000});
        
    }
}

