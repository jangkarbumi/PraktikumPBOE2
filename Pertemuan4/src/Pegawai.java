
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    //ATTRIBUT
    private String NIP;
    private String nama;
    private LocalDate tanggallahir;
    private LocalDate tmt;
    private int gaji;
    private double tunjangan;
    private int bup;

    //KONSTRUKTOR
    public Pegawai() { 
        this.NIP = "";
        this.nama = "";
        this.tanggallahir = null;
        this.tmt = null;
        this.gaji = 0;
        this.tunjangan = 0;
        this.bup = 0;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, double tunjangan, int bup) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
        this.tmt = tmt;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.bup = bup;
    }

    //METHOD

    //SELEKTOR
    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.nama;
    }

    public LocalDate getTanggalLahir() {
        return this.tanggallahir;
    }

    public LocalDate getTMT() {
        return this.tmt;
    }

    public int getGaji() {
        return this.gaji;
    }

    public Period getMasaKerja() {
        return Period.between(getTMT(), LocalDate.now());
    }

    public LocalDate getTanggalPensiun(int bup) {
        return getTanggalLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        return this.tunjangan;
    }

    public int getBUP() {
        return this.bup;
    }

    //MUTATOR
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public void setTMT(LocalDate TMT) {
        this.tmt = TMT;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setBUP(int bup) {
        this.bup = bup;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    //FUNGSI TAMBAHAN/PEMBANTU
    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id")));
    }

    public double countTunjangan() {
        return getTunjangan() / 100 * getMasaKerja().getYears() * getGaji();
    }

    //printInfo
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + formatTanggal(getTMT()));
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + " Tahun " + getMasaKerja().getMonths() + " Bulan");
        System.out.println("Gaji Pokok: " + "Rp." +  getGaji());
        System.out.println("Tunjangan: " + getTunjangan() + "%" + " x " + getMasaKerja().getYears() + " x " + " Rp" + getGaji() + " = " + countTunjangan());
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun(getBUP())));
    }
}
