/**
 * File : Pengusaha.java
 * deskripsi : Subclass Pengusaha yang menerapkan abstract class Manusia dan Pajak
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        setNama("");
        setTgl_Mulai_Kerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        this.npwp = "";
        counterMns++;
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterMns++;
        counterPengusaha++;
    }

    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    public String getNPWP() {
        return this.npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - getTgl_Mulai_Kerja().getYear() + 3;
    }

    @Override
    public double hitungPajak() {
        return (15.0/100.0) * getPendapatan();
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + getNPWP());
    }
}
