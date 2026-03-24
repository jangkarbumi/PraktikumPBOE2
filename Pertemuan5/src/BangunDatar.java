/**
 * File : BangunDatar.java
 * deskripsi : Abstract class dari bangun datar
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
public abstract  class BangunDatar {
    //ATTRIBUT
    private int jumSisi;
    private String warna;
    private String border;

    protected BangunDatar() {
        this.jumSisi = 0;
        this.warna = "";
        this.border = "";
    }

    protected BangunDatar(int sisi, String warna, String border) {
        this.jumSisi = sisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJumSisi() {
        return this.jumSisi;
    }

    public void setJumSisi(int sisi) {
        this.jumSisi = sisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setBorder(String border) {
        this.border  = border;
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJumSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }
}
