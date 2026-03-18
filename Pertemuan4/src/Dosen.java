/**
 * File : Dosen.java
 * deskripsi : Class dosen
 * nama : Wahyu Aji Gumemlar Tri Nugroho
 * tanggal : 18 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    //ATTRIBUT
    private String jabatan;
    private String fakultas;

    //KONSTRUKTOR
    public Dosen(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, double tunjangan, String jabatan, String fakultas) {
        super(NIP, nama, tanggallahir, tmt, gaji, tunjangan, 65);
        this.jabatan = jabatan;
        this.fakultas = fakultas;
    }

    //SELEKTOR
    public String getJabatan() {
        return this.jabatan;
    }
    public String getFakultas() {
        return this.fakultas;
    }

    //MUTATOR
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Jabatan: " + getJabatan());
    }
}
