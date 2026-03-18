
import java.time.LocalDate;

public class Dosen extends Pegawai {
    //ATTRIBUT
    private String fakultas;
    private String jabatan;

    //KONSTRUKTOR
    public Dosen(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, double tunjangan, String fakultas, String jabatan) {
        super(NIP, nama, tanggallahir, tmt, gaji, tunjangan, 65);
        this.fakultas = fakultas;
        this.jabatan = jabatan;
    }

    //SELEKTOR
    public String getFakultas() {
        return this.fakultas;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    //MUTATOR
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
