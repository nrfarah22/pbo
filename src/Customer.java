import org.w3c.dom.ls.LSOutput;

public class Customer {
    public int id_cust;
    public String nama_cust;
    public int nohp_cust;
    protected String alamat_cust;
    public int lama_jam;

    public Customer(){

    }

    public Customer(int id_cust, String nama_cust, int nohp_cust, String alamat_cust, int lama_jam) {
        this.id_cust = id_cust;
        this.nama_cust = nama_cust;
        this.nohp_cust = nohp_cust;
        this.alamat_cust = alamat_cust;
        this.lama_jam = lama_jam;
    }

    //getter
    public int getId_cust() {
        return id_cust;
    }
    public String getNama_cust() {
        return nama_cust;
    }
    public int getNohp_cust() {
        return nohp_cust;
    }
    public String getAlamat_cust() {
        return alamat_cust;
    }
    public int getLama_jam() {
        return lama_jam;
    }

    //setter
    public void setId_cust(int id_cust) {
        this.id_cust = id_cust;
    }
    public void setNama_cust(String nama_cust) {
        this.nama_cust = nama_cust;
    }
    public void setNohp_cust(int nohp_cust) {
        this.nohp_cust = nohp_cust;
    }
    public void setAlamat_cust(String alamat_cust) {
        this.alamat_cust = alamat_cust;
    }

    public void setLama_jam(int lama_jam) {
        this.lama_jam = lama_jam;
    }

    //output
    public String outputNama (String nama_cust){
        return "nama = "+nama_cust;
    }

    //ambil transaksi
    Transaksi transaksi = new Transaksi();
    public Transaksi getTransaksi() {
        return transaksi;
    }


    public int biayaawalAnjing(int lama_jam){
        int biaya_awal= transaksi.biayaAnjing(lama_jam)/2;
        return biaya_awal;
    }


}
