/**
 * File : Manusia.java
 * deskripsi : Ahstract class dari manusia
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    protected Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    protected Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public abstract int hitungMasaKerja();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_Mulai_Kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public String getNama() {
        return this.nama;
    }

    public LocalDate getTgl_Mulai_Kerja() {
        return this.tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id")));
    }

    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal mulai kerja: " + formatTanggal(getTgl_Mulai_Kerja()));
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
    }
}
