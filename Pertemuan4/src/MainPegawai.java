/**
 * File : MainPegawai.java
 * deskripsi : Main dari aplikasi pegawai
 * nama : Wahyu Aji Gumemlar Tri Nugroho
 * tanggal : 18 Maret 2026
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dosen1 = new DosenTetap(
            "19800101", 
            "Dr. Budi Utomo", 
            LocalDate.of(1980, 1, 1), 
            LocalDate.of(2010, 5, 10), 
            5000000, 
            "Informatika", 
            "Lektor Kepala", 
            "00112233"
        );

        DosenTamu dosen2 = new DosenTamu(
            "19900202", 
            "Siti Aminah, M.Kom", 
            LocalDate.of(1990, 2, 2), 
            LocalDate.of(2023, 1, 1), 
            4000000, 
            "Sains dan Matematika", 
            "Asisten Ahli", 
            "998877", 
            LocalDate.of(2026, 12, 31)
        );

        Tendik tendik1 = new Tendik(
            "19950303", 
            "Agus Setiawan", 
            LocalDate.of(1995, 3, 3), 
            LocalDate.of(2020, 8, 15), 
            3500000, 
            "Akademik"
        );

        List<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);

        System.out.println("========== DATA PEGAWAI UNIVERSITAS ==========\n");

        for (Pegawai p : daftarPegawai) {
            p.printInfo();
            System.out.println("----------------------------------------------");
        }
    }
}