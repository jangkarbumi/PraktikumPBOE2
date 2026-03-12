public class BangunDatar {
    //ATTRIBUT
    private int jumSisi;
    private String warna;
    private String border;

    public BangunDatar() {
        this.jumSisi = 0;
        this.warna = "";
        this.border = "";
    }

    public BangunDatar(int sisi, String warna, String border) {
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

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setBorder(String border) {
        this.border  = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJumSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }
}
