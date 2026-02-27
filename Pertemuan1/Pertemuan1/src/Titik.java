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

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) return 4;
        else return -1;
    }

    double getJarak(Titik T) {
        double x = Math.pow(T.absis - this.absis, 2);
        double y = Math.pow(T.ordinat - this.ordinat, 2);
        return Math.pow(x + y, 0.5);
    }
}
