
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    //ATRIBUT
    private String NIDN;
    private static final double  PERSEN_TUNJANGAN_DOSEN_TETAP = 2.0;

    //KONSTRUKTOR
    public DosenTetap(String NIP, String nama, LocalDate tanggallahir, LocalDate tmt, int gaji, String fakultas, String jabatan, String NIDN) {
        super(NIP, nama, tanggallahir, tmt, gaji, PERSEN_TUNJANGAN_DOSEN_TETAP, fakultas, jabatan);
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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + getNIDN());
    }
}   
