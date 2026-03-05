
import java.util.ArrayList;


public class Mahasiswa {
    //DATA PRIBADI
    private String NIM;
    private String Nama;
    private String prodi;
    //TAMBAHAN
    private Dosen dosenWali;
    private ArrayList<MataKuliah> listMatkul;
    private Kendaraan kendaraan;


    //KONSTRUKTOR
    public Mahasiswa() {
        this.NIM = "";
        this.Nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //SELEKTOR
    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return this.listMatkul;
    }


    //MUTATOR
    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen doswal) {
        this.dosenWali = doswal;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void setListMatkul(ArrayList<MataKuliah> matkul) {
        this.listMatkul = matkul;
    }

    //METHOD
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int sks = 0;
        for(int i = 0; i < this.listMatkul.size(); i++) {
            sks += this.listMatkul.get(i).getSKSMatkul();
        }

        return sks;
    }

    public int getJumlahMatkul() {
        return this.listMatkul.size();
    }

    public void printMHS() {
        System.out.println("Nim: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Program Studi: " + this.prodi);
    }

    public void printDetailMHS() {
        System.out.println("Nim: " + this.NIM);
        System.out.println("Nama: " + this.Nama);
        System.out.println("Program Studi: " + this.prodi);
        
        System.out.println("Data dosen wali:");
        System.out.println(this.dosenWali.getNIP());
        System.out.println(this.dosenWali.getNama());
        System.out.println(this.dosenWali.getProdi());

        System.out.println("Daftar mata kuliah yang diambil:");
        for(int i = 0; i < this.listMatkul.size(); i++) {
            System.out.println(this.listMatkul.get(i).getNamaMatkul());
            System.out.println(this.listMatkul.get(i).getidMatkul());
            System.out.println(this.listMatkul.get(i).getSKSMatkul());
        }

        System.out.println("Kendaraan mahasiswa:");
        System.out.println(this.kendaraan.getJenis());
    }
}
