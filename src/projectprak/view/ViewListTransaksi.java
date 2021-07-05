package projectprak.view;

import projectprak.model.Booking;

/**
 *
 * @author user
 */
public class ViewListTransaksi extends TabelList {

    Booking[] booking;
    private String status;

    public ViewListTransaksi(Booking[] booking) {

        super("List Transaksi", new Object[]{"ID", "Customer", "Kamar", "Tanggal", "Total Harga","Lama Tinggal","Status", "Kode"});

        this.booking = booking;

        for (Booking book : booking) {//type value : values
            try {
                int kodeStatus = book.getStatus();
                if (kodeStatus == 0) {
                    status = "booking";
                }
                if (kodeStatus == 1) {
                    status = "check in";
                }
                if (kodeStatus == 2) {
                    status = "check out";
                }
                model.addRow(new Object[]{book.getId(), book.getId_orang(),
                    book.getId_kamar(), book.getTanggal(), book.getTotal_harga(), book.getLama_tinggal(), status, book.getKode()});
            } catch (Exception e) {

            }
        }

    }
}
