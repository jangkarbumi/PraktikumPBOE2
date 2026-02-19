// File: Titik.java
// Deskripsi: Sebuah main class dari class Titik 
// Pembuat: Wahyu Aji Gumelar Tri Nugroho / 24060124140134
// Tanggal: 19 Februari 2026

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(2);
        T1.setOrdinat(4);
        T1.getAbsis();
        T1.getOrdinat();
        T1.printTitik();
        T1.geser(5, 6);
        T1.getAbsis();
        T1.getOrdinat();
        T1.printTitik();
    }
}
