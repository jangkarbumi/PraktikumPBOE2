/**
 * File : BangunDatar.java
 * deskripsi : File main
 * nama : Wahyu Aji Gumelar Tri Nugroho
 * tanggal : 24 Maret 2026
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatar C1 = new Lingkaran(5.0, "Biru", "Light");
        BangunDatar S1 = new Persegi(6.0, "Ungu", "Light");

       Lingkaran C2 = new Lingkaran();
       Persegi S2 = new Persegi();

       C2.setRadius(10.0);
       S2.setPanjangSisi(12.0);

       System.out.println("Luas dari lingkaran C1 adalah " + C1.getLuas());
       System.out.println("Luas dari persegi S1 adalah " + S1.getLuas());
       System.out.println("Keliling dari lingkaran C1 adalah " + C1.getKeliling());
       System.out.println("Keliling dari persegi S1 adalah " + S1.getKeliling());

       double luasC2 = C2.getLuas();
       double luasS2 = S2.getLuas();
       double kelilingC2 = C2.getKeliling();
       double kelilingS2 = S2.getKeliling();

       System.out.println("Luas dari lingkaran C2 adalah " + luasC2);
       System.out.println("Luas dari persegi S2 adalah " + luasS2);
       System.out.println("Keliling dari lingkaran C2 adalah " + kelilingC2);
       System.out.println("Keliling dari persegi S2 adalah " + kelilingS2);
    }
}
