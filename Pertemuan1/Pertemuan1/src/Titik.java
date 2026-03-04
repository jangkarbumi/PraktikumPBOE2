// File: Titik.java
// Deskripsi: Sebuah class yang berisi absis dan ordinat
// Pembuat: Wahyu Aji Gumelar Tri Nugroho / 24060124140134
// Tanggal: 19 Februari 2026

public class Titik {
    //ATRIBUT
    private double absis;
    private double ordinat;

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }
    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }
    public void setOrdinat(double y) {
        ordinat = y;
    }

    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public int getKuadran() {
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

    public double getJarak(Titik T) {
        double x = Math.pow(T.absis - this.absis, 2);
        double y = Math.pow(T.ordinat - this.ordinat, 2);
        return Math.pow(x + y, 0.5);
    }

    public double getJarakPusat() {
        double x = Math.pow(this.absis, 2);
        double y  = Math.pow(this.ordinat, 2);

        return Math.pow(x + y, 0.5);
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public Titik getRefleksiY() {
        Titik tNew = new Titik();
        tNew.setAbsis(this.absis);
        tNew.setOrdinat(this.ordinat);

        tNew.refleksiY();
        return tNew;
    }

    public Titik getRefleksiX() {
        Titik tNew = new Titik();
        tNew.setAbsis(this.absis);
        tNew.setOrdinat(this.ordinat);

        tNew.refleksiX();
        return tNew;
    }
}
