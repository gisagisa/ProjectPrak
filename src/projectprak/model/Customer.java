package projectprak.model;

/**
 *
 * @author user
 */
public class Customer {
    private String nama;
    private String no_ktp;
    private String no_telp;
    private int umur;
    private int id;

    public Customer(String nama, String no_ktp, String no_telp, int umur, int id) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.no_telp = no_telp;
        this.umur = umur;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
