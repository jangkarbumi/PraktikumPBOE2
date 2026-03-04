// File: MTitik.java
// Deskripsi: Driver/Main class untuk menguji class Titik 
// Pembuat: Wahyu Aji Gumelar Tri Nugroho / 24060124140134
// Tanggal: 19 Februari 2026

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        
        T1.setAbsis(2);
        T1.setOrdinat(4);
        T2.setAbsis(4);
        T2.setOrdinat(8);

        System.out.println("=== Kondisi Awal ===");
        System.out.print("T1: "); T1.printTitik();
        System.out.print("T2: "); T2.printTitik();

        T1.geser(5, 6);
        System.out.println("\n=== Setelah T1 Digeser (5, 6) ===");
        T1.printTitik();

        System.out.println("\n=== Info T1 ===");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        System.out.println("\n=== Uji Refleksi (Void) ===");
        T1.refleksiX();
        System.out.print("T1 setelah refleksiX: "); T1.printTitik();
        T1.refleksiY();
        System.out.print("T1 setelah refleksiY: "); T1.printTitik();

        System.out.println("\n=== Uji Get Refleksi (Return Object) ===");
        T1.setAbsis(7);
        T1.setOrdinat(10);
        System.out.print("T1 Normal: "); T1.printTitik();

        Titik T3 = T1.getRefleksiX();
        System.out.print("T3 (Hasil getRefleksiX dari T1): "); T3.printTitik();
        
        Titik T4 = T1.getRefleksiY();
        System.out.print("T4 (Hasil getRefleksiY dari T1): "); T4.printTitik();

        System.out.print("T1 sekarang (Tetap): "); T1.printTitik();
    }
}