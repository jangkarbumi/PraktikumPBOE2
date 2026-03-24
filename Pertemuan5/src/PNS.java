/**
 * File : PNS.java
 * deskripsi : Subclass PNS yang menerapkan abstract class Manusia dan Pajak
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        setNama("");
        setTgl_Mulai_Kerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        this.nip = "";
        counterMns++;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterMns++;
        counterPNS++;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getNIP() {
        return this.nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }
    //24060124140134
    @Override
    public int hitungMasaKerja() {
        LocalDate dateNow = LocalDate.now();
        LocalDate mulaiKerja = getTgl_Mulai_Kerja();

        return dateNow.getYear() - mulaiKerja.getYear() + 4;
    }

    @Override
    public double hitungPajak() {
        return (10.0/100.0) * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + getNIP());
    }
}
