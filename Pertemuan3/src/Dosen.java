public class Dosen {
    private String NIP;
    private String nama;
    private String prodi;

    //KONSTRUKTOR
    public Dosen() {
        this.NIP = "0000000";
        this.nama = "Azami";
        this.prodi = "Informatika";
    }
    //WITH PARAMS
    public Dosen(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }


    //SELEKTOR
    public String getNIP() {
        return this.NIP; 
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }


    //MUTATOR
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
