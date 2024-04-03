import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program penghitungan nilai");
        System.out.println("==========================");
        System.out.print("Masukkan nilai tugas (0-100)  : ");
        int nilaiTugas = scanner.nextInt();

        // Mendapatkan nilai kuis
        System.out.print("Masukkan nilai kuis (0-100)   : ");
        int nilaiKuis = scanner.nextInt();

        // Mendapatkan nilai UTS
        System.out.print("Masukkan nilai UTS (0-100)    : ");
        int nilaiUTS = scanner.nextInt();

        // Mendapatkan nilai UAS
        System.out.print("Masukkan nilai UAS (0-100)    : ");
        int nilaiUAS = scanner.nextInt();

        // Menentukan apakah semua nilai valid
        boolean isAllValid = true;
        if (nilaiTugas > 100) {
            isAllValid = false;
        }
        if (nilaiKuis > 100) {
            isAllValid = false;
        }
        if (nilaiUTS > 100) {
            isAllValid = false;
        }
        if (nilaiUAS > 100) {
            isAllValid = false;
        }

        // Menampilkan pesan error
        if (!isAllValid) {
            System.out.println("==================================");
            System.out.println("==================================");
            System.out.println("       Nilai tidak valid!"         );
            System.out.println("==================================");
            System.out.println("==================================");
            return;
        }

        // Menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Menentukan nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Menentukan kualifikasi
        String kualifikasi;
        switch (nilaiHuruf) {
            case "A":
            case "B+":
            case "B":
            case "C+":
            case "C":
                kualifikasi = "Selamat anda lulus";
                break;
            default:
                kualifikasi = "Selamat anda gagal";
                break;
        }

        // Menampilkan output
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println(" Nilai Akhir     : " + nilaiAkhir);
        System.out.println(" Nilai Huruf     : " + nilaiHuruf);
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println(kualifikasi);
    }
}
