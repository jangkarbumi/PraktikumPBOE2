/**
 * File : Lingkaran.java
 * deskripsi : Impelementasi Abstract Class bangun datar Lingkaran
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize {
    private double radius;
    private static double PI = 3.14;

    public Lingkaran() {
        setJumSisi(0);
        setWarna("Merah");
        setBorder("Bold");
        this.radius = 0;
    }

    public Lingkaran(double radius, String warna, String border) {
        super(0, warna, border);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getLuas() {
        return PI * (radius * radius);
    }

    @Override
    public double getKeliling() {
        return 2 * PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void zoomIn() {
        radius *= 1.1;
    }

    @Override
    public void zoomOut() {
        radius *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        radius *= percent / 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius = " + getRadius());
        System.out.println("Diameter = " + getDiameter());
        System.out.println("Luas = " + getLuas());
        System.out.println("Keliling = " + getKeliling());
    }
}
