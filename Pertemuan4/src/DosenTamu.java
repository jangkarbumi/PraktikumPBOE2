
import java.time.LocalDate;

public class DosenTamu extends Dosen {
    //ATRIBUT
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;
    private static final double PERSEN_TUNJANGAN_DOSEN_TAMU = 2.5;

    //KONSTRUKTOR
    public DosenTamu(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String fakultas, String jabatan, String NIDK, LocalDate tanggalBerakhirKontrak) {
        super(NIP, nama, tanggallahir, tmt, gaji, PERSEN_TUNJANGAN_DOSEN_TAMU, fakultas, jabatan);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    //SELEKTOR
    public String getNIDK() {
        return this.NIDK;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return this.tanggalBerakhirKontrak;
    }

    @Override
    public double countTunjangan() {
        return getTunjangan() / 100 * getMasaKerja().getYears();
    }

    //MUTATOR
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTanggalBerakhirKontrak(LocalDate TanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = TanggalBerakhirKontrak;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + getNIDK());
        System.out.println("Tanggal Berakhir Kontrak: " + getTanggalBerakhirKontrak());
    }
}
