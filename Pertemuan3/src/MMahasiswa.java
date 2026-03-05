public class MMahasiswa {
    public static void main(String[] args) {
        //MAHASISWA
        Mahasiswa m1 = new Mahasiswa();
        m1.setNIM("24140134");
        m1.setNama("Hakuri Sazanami");
        m1.setProdi("Informatika");

        //DOSWAL
        Dosen d1 = new Dosen();
        d1.setNIP("19800101");
        d1.setNama("Mr. Samura");
        d1.setProdi("Informatika");

        m1.setDosenWali(d1);

        //MATKUL
        MataKuliah mk1 = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        MataKuliah mk2 = new MataKuliah("StrukDat", "Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);

        m1.addMatkul(mk1);
        m1.addMatkul(mk2);
        m1.addMatkul(mk3);

        //KENDARAAN
        Kendaraan k1 = new Kendaraan();
        k1.setJenis("Motor");

        m1.setKendaraan(k1);


        //PRINT
        m1.printMHS();

        System.out.println("Jumlah mata kuliah: " + m1.getJumlahMatkul());
        System.out.println("Jumlah SKS: " + m1.getJumlahSKS());
    }
}