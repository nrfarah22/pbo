public class Karyawan {

    public int id_karyawan;
    public String nama_karyawan;
    private int nohp_karyawan;
    public int id_cust;
    public Karyawan()
    {

    }
    public Karyawan(int id_karyawan, String nama_karyawan, int nohp_karyawan) {
        this.id_karyawan = id_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.nohp_karyawan = nohp_karyawan;
    }

    public int getId_karyawan() {
        return id_karyawan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public int getNohp_karyawan() {
        return nohp_karyawan;
    }

    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public void setNohp_karyawan(int nohp_karyawan) {
        this.nohp_karyawan = nohp_karyawan;
    }

    public void insertData(int id_karyawan, String nama_karyawan, int nohp_karyawan)
    {
        this.id_karyawan = id_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.nohp_karyawan = nohp_karyawan;
    }

    public int getId_cust() {
        return id_cust;
    }
}
