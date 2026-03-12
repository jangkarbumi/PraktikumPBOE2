public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        Persegi persegi2 = new Persegi(5.5, 4, "Pink", "Normal");
        Lingkaran lingkaran1 = new Lingkaran();
        Lingkaran lingkaran2 = new Lingkaran(7.2, 0, "Lime", "Bold");

        lingkaran1.setRadius(12.4);
        persegi1.setPanjangSisi(3);
        
        lingkaran1.printInfo();
        lingkaran2.printInfo();
        persegi1.printInfo();
        persegi2.printInfo();
    }
}
