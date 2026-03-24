/**
 * File : Petani.java
 * deskripsi : Subclass Petani yang menerapkan abstract class Manusia dan Pajak
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        setNama("");
        setTgl_Mulai_Kerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        this.asal_kota = "";
        counterMns++;
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterMns++;
        counterPetani++;
    }

    public void setAsal_Kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public String getAsal_Kota() {
        return this.asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - getTgl_Mulai_Kerja().getYear() + 1;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + getAsal_Kota());
    }
}
