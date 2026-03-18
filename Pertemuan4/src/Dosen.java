
import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;
    protected String jabatan;

    public Dosen(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String fakultas, String jabatan) {
        super(NIP, nama, tanggallahir, tmt, gaji);
        this.fakultas = fakultas;
        this.jabatan = jabatan;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public String getJabatan() {
        return this.jabatan;
    }
}
