
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    //ATRIBUT
    protected String NIDN;
    protected static int bup = 65;
    protected static int tunjangan = 2;

    //KONSTRUKTOR
    public DosenTetap(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String fakultas, String jabatan, String NIDN) {
        super(NIP, nama, tanggallahir, tmt, gaji, fakultas, jabatan);
        this.NIDN = NIDN;
    }

    //METHOD

    //SELEKTOR
    public String getNIDN() {
        return this.NIDN;
    }

    //MUTATOR
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    //FUNGSI TAMBAHAN
    private double countTujangan(int tunjangan) {
        return tunjangan / 100 * getMasaKerja().getYears() * getGaji();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + getNIDN());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + formatTanggal(getTMT()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + "Tahun" + getMasaKerja().getMonths() + "Bulan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun(bup)));
        System.out.println("Gaji Pokok: " + "Rp." +  getGaji());
        System.out.println("Tunjangan: " + tunjangan + "%" + " x " + getMasaKerja().getYears() + " x " + " Rp" + getGaji() + " = " + countTujangan(tunjangan));
    }
}   
