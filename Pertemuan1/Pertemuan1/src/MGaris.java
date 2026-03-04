// File: MGaris.java
// Deskripsi: Main class untuk menguji class Garis
// Pembuat: Wahyu Aji Gumelar Tri Nugroho / 24060124140134
// Tanggal: 26 Februari 2026

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        System.out.println("=== Garis G1 (Default) ===");
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());

        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(4, 6);
        Garis G2 = new Garis(T1, T2);
        
        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Persamaan Garis G2: " + G2.getPersamaanGaris());
        
        Titik tengah = G2.getTitikTengah();
        System.out.print("Titik Tengah G2: ");
        tengah.printTitik();

        Titik T3 = new Titik(0, 0);
        Titik T4 = new Titik(3, 4);
        Garis G3 = new Garis(T3, T4);

        System.out.println("\n=== Uji Relasi Garis ===");
        System.out.print("Garis G3: "); G3.printGaris();
        System.out.println("Apakah G2 sejajar G3? " + G2.isSejajar(G3));

        Garis G4 = new Garis(new Titik(0, 5), new Titik(5, 0)); 
        System.out.print("Garis G4: "); G4.printGaris();
        System.out.println("Gradien G4: " + G4.getGradien());
        
        System.out.println("Apakah G1 tegak lurus G4? " + G1.isTegakLurus(G4));

        System.out.println("\nJumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}