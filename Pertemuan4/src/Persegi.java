
public class Persegi extends BangunDatar {
    private double panjangSisi;

    public Persegi() {
        setJumSisi(4);
        setWarna("Biru");
        setBorder("Normal");
        this.panjangSisi = 0;
    }

    public Persegi(double panjangSisi, int sisi, String warna, String border) {
        super(sisi, warna, border);
        this.panjangSisi = panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }

    public void setPanjangSisi(double sisi) {
        this.panjangSisi = sisi;
    }

    public double getLuasPersegi() {
        return panjangSisi * panjangSisi;
    }

    public double getKelilingPersegi() {
        return 4*panjangSisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Panjang sisi persegi: " + getPanjangSisi());
        System.out.println("Jumlah sisi persegi: " + getJumSisi());
        System.out.println("Luas Persegi = " + getLuasPersegi());
        System.out.println("Keliling persegi =  " + getKelilingPersegi());
    }
}
