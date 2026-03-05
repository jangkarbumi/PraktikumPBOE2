public class MataKuliah {
    private String idMatkul;
    private String namaMatkul;
    private int sksMatkul;


    //KONSTRUKTOR
    public MataKuliah() {
        this.idMatkul = "0000";
        this.namaMatkul = "Object-Oriented Programming";
        this.sksMatkul = 3;
    }
    //WITH PARAMS
    public MataKuliah(String idMatkul, String namaMatkul, int sksMatkul) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sksMatkul = sksMatkul;
    }


    //SELEKTOR
    public String getidMatkul() {
        return this.idMatkul;
    }

    public String getNamaMatkul() {
        return this.namaMatkul;
    }

    public int getSKSMatkul() {
        return this.sksMatkul;
    }


    //MUTATOR
    public void setIdMatkul(String id) {
        this.idMatkul = id;
    }

    public void setNamaMatkul(String nama) {
        this.namaMatkul = nama;
    }
    
    public void setSKSMatkul(int sks) {
        this.sksMatkul = sks;
    }
}
