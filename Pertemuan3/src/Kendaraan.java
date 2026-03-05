public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan() {
        this.noPlat = "0000";
        this.Jenis = "Mobil";
    }

    public Kendaraan(String plat, String jenis) {
        this.noPlat = plat;
        this.Jenis = jenis;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.Jenis;
    }

    public void setNoPlat(String plat) {
        this.noPlat = plat;
    }

    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }
}
