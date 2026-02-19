public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n");
        contohVariabelDanKondisional();
    }

    public static void contohVariabelDanKondisional() {
        String nama = "Jangkar";
        int umur = 19;
        double ipk = 3.2;
        boolean mhsAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        
        if (mhsAktif) System.out.println("Active");
        else System.out.println("Inactive");

        if (ipk >= 3.5) {
            System.out.println("Cum Laude\n");
        }
        else if (ipk >= 3.0 && ipk < 3.5) {
            System.out.println("Good\n");
        }
        else {
            System.out.println("Need Improvement\n");
        }
    }
}
