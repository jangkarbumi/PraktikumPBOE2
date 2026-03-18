
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    //ATTRIBUT
    protected String NIP;
    protected String nama;
    protected LocalDate tanggallahir;
    protected LocalDate tmt;
    protected int gaji;

    //KONSTRUKTOR
    public Pegawai() {
        this.NIP = "";
        this.nama = "";
        this.tanggallahir = null;
        this.tmt = null;
        this.gaji = 0;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
        this.tmt = tmt;
        this.gaji = gaji;
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

    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id")));
    }
}
