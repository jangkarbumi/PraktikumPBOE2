
import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;

    private static final double PERSEN_TUNJANGAN_TENDIK = 1.0;

    public Tendik(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String bidang) {
        super(NIP, nama, tanggallahir, tmt, gaji, PERSEN_TUNJANGAN_TENDIK, 55);
        this.bidang = bidang;
    }

    public String getBidang() {
        return this.bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + getBidang());
    }
}
