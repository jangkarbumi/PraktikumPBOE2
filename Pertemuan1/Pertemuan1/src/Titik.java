// File: Titik.java
// Deskripsi: Sebuah class yang berisi absis dan ordinat
// Pembuat: Wahyu Aji Gumelar Tri Nugroho / 24060124140134
// Tanggal: 19 Februari 2026

public class Titik {
    //ATRIBUT
    double absis;
    double ordinat;

    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis() {
        return absis;
    }
    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }
    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
