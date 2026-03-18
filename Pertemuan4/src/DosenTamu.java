
import java.time.LocalDate;

public class DosenTamu extends Dosen {
    //ATRIBUT
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;
    private static double tunjangan = 2.5;

    //KONSTRUKTOR
    public DosenTamu(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String fakultas, String jabatan, String NIDK, LocalDate tanggalBerakhirKontrak, double tunjangan) {
        super(NIP, nama, tanggallahir, tmt, gaji, fakultas, jabatan);
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

    //MUTATOR
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTanggalBerakhirKontrak(LocalDate TanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = TanggalBerakhirKontrak;
    }


    //FUNGSI TAMBAHAN
    private double countTunjangan(double tunjangan) {
        return tunjangan / 100 * getMasaKerja().getYears() * getGaji();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDK: " + getNIDK());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + formatTanggal(getTMT()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + "Tahun" + getMasaKerja().getMonths() + "Bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + getTanggalBerakhirKontrak());
        System.out.println("Gaji Pokok: " + "Rp." +  getGaji());
        System.out.println("Tunjangan: " + tunjangan + "%" + " x " + getMasaKerja().getYears() + " x " + " Rp" + getGaji() + " = " + countTunjangan(tunjangan));
    }
}
