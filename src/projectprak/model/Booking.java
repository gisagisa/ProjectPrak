/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.model;

/**
 *
 * @author user
 */
public class Booking {
    private int id_orang;
    private int id_kamar;
    private int id;
    private String tanggal;
    private int jumlah_kamar;
    private int total_harga;

    public Booking(int id_orang, int id_kamar, int id, String tanggal, int jumlah_kamar, int total_harga) {
        this.id_orang = id_orang;
        this.id_kamar = id_kamar;
        this.id = id;
        this.tanggal = tanggal;
        this.jumlah_kamar = jumlah_kamar;
        this.total_harga = total_harga;
    }

    public int getId_orang() {
        return id_orang;
    }

    public void setId_orang(int id_orang) {
        this.id_orang = id_orang;
    }

    public int getId_kamar() {
        return id_kamar;
    }

    public void setId_kamar(int id_kamar) {
        this.id_kamar = id_kamar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah_kamar() {
        return jumlah_kamar;
    }

    public void setJumlah_kamar(int jumlah_kamar) {
        this.jumlah_kamar = jumlah_kamar;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    
    
    
}
