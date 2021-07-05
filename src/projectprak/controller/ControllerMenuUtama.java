package projectprak.controller;

import projectprak.view.*;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {

    public ViewMenuUtama viewMenuUtama() {
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(TabelList tabel) {
        tabel.dispose();
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(ViewAddNama nama) {
        nama.dispose();
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(ViewBooking book) {
        book.dispose();
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(ViewCancel cancel) {
        cancel.dispose();
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(ViewCheckIn in) {
        in.dispose();
        return new ViewMenuUtama();
    }

    public ViewMenuUtama viewMenuUtama(ViewCheckOut out) {
        out.dispose();
        return new ViewMenuUtama();
    }
    public ViewMenuUtama viewMenuUtama(ViewKamar kamar) {
        kamar.dispose();
        return new ViewMenuUtama();
    }


}
