package projectprak.model;

/**
 *
 * @author user
 */
public class Kamar {
    private int status;
    private String tipe;
    private int kapasitas;
    private String nomor;
    private int harga;
    private int id;

    public Kamar(int status, String tipe, int kapasitas, String nomor, int harga, int id) {
        this.status = status;
        this.tipe = tipe;
        this.kapasitas = kapasitas;
        this.nomor = nomor;
        this.harga = harga;
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int Kapasitas) {
        this.kapasitas = Kapasitas;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
