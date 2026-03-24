/**
 * File : Persegi.java
 * deskripsi : Implementasi Abstact Class bangun datar persegi
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
public class Persegi extends BangunDatar implements IResize {
    private double panjangSisi;

    public Persegi() {
        setJumSisi(4);
        setWarna("Biru");
        setBorder("Normal");
        this.panjangSisi = 0;
    }

    public Persegi(double panjangSisi, String warna, String border) {
        super(4, warna, border);
        this.panjangSisi = panjangSisi;
    }

    public void setPanjangSisi(double sisi) {
        this.panjangSisi = sisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }

    @Override
    public double getLuas() {
        return panjangSisi * panjangSisi;
    }

    @Override
    public double getKeliling() {
        return 4 * panjangSisi;
    }

    @Override
    public void zoomIn() {
        panjangSisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        panjangSisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        panjangSisi *= percent / 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang sisi persegi: " + getPanjangSisi());
        System.out.println("Jumlah sisi persegi: " + getJumSisi());
        System.out.println("Luas Persegi = " + getLuas());
        System.out.println("Keliling persegi =  " + getKeliling());
    }
}
