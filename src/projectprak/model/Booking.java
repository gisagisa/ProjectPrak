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
    private String kode;
    private int lama_tinggal;
    private int total_harga;
    private int status;

    public Booking(int id_orang, int id_kamar, int id, String tanggal, int lama_tinggal, int total_harga,int status, String kode) {
        this.id_orang = id_orang;
        this.id_kamar = id_kamar;
        this.id = id;
        this.tanggal = tanggal;
        this.lama_tinggal = lama_tinggal;
        this.total_harga = total_harga;
        this.status = status;
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getLama_tinggal() {
        return lama_tinggal;
    }

    public void setLama_tinggal(int lama_tinggal) {
        this.lama_tinggal = lama_tinggal;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    
    
    
}
