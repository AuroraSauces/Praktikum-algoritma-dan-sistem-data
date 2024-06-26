import java.util.Scanner;

public class BayarPajak {
    static Scanner scanner = new Scanner(System.in);
    static TransaksiPajak[] daftarTransaksi; 
    static int count = 0; 

    public BayarPajak(TransaksiPajak[] daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi; // Inisialisasi array transaksi dari parameter konstruktor
    }

    public void bayarPajak() {
        System.out.print("Masukkan Nomor TNBK: ");
        String noTNKB = scanner.nextLine().toUpperCase(); // Input nomor TNBK, diubah ke uppercase
        System.out.print("Bulan Bayar: ");
        int bulanBayar = scanner.nextInt(); // Input bulan bayar pajak
        scanner.nextLine(); 

        Kendaraan kendaraan = cariKendaraan(noTNKB); // Mencari kendaraan berdasarkan TNBK
        if (kendaraan != null) {
            long nominalBayar = hitungNominal(kendaraan); // Menghitung nominal pajak
            long denda = hitungDenda(kendaraan, bulanBayar); // Menghitung denda
            TransaksiPajak transaksi = new TransaksiPajak(nominalBayar, denda, bulanBayar, kendaraan); 
            tambahkanTransaksi(transaksi); // Menambahkan transaksi ke dalam array

            // Menampilkan informasi transaksi dengan format tabel
            System.out.println("===========================================");
            System.out.println("Detail Transaksi Pembayaran Pajak");
            System.out.println("===========================================");
            System.out.printf("%-10s | %-10s | %-15s | %-15s | %-10s\n", "Kode", "TNBK", "Nama", "Nominal", "Denda");
            System.out.printf("%-10s | %-10s | %-15s | Rp %,10d | Rp %,5d\n", "1", kendaraan.noTNKB, kendaraan.nama, nominalBayar, denda);
        } else {
            System.out.println("Kendaraan dengan Nomor TNKB " + noTNKB + " tidak ditemukan.");
        }
    }

    public static Kendaraan cariKendaraan(String noTNKB) {
        for (Kendaraan kendaraan : Main.daftarKendaraan) { // Iterasi melalui array kendaraan dari class Main
            if (kendaraan != null && kendaraan.noTNKB.equalsIgnoreCase(noTNKB)) {
                return kendaraan; // Mengembalikan kendaraan jika ditemukan berdasarkan TNBK
            }
        }
        return null; // Mengembalikan null jika kendaraan tidak ditemukan
    }

    public static long hitungNominal(Kendaraan kendaraan) {
        long tarifPajak = 0; // Variabel untuk menyimpan tarif pajak

        // Menghitung tarif pajak berdasarkan jenis kendaraan dan kapasitas mesin
        if (kendaraan.jenis.equalsIgnoreCase("motor")) {
            if (kendaraan.cc < 100) {
                tarifPajak = 100000;
            } else if (kendaraan.cc <= 250) {
                tarifPajak = 250000;
            } else {
                tarifPajak = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("mobil")) {
            if (kendaraan.cc < 1000) {
                tarifPajak = 750000;
            } else if (kendaraan.cc <= 2500) {
                tarifPajak = 1000000;
            } else {
                tarifPajak = 1500000;
            }
        }
        return tarifPajak; // Mengembalikan tarif pajak yang sudah dihitung
    }

    public static long hitungDenda(Kendaraan kendaraan, int bulanBayar) {
        int selisihBulan = bulanBayar - kendaraan.bulanHarusBayar;

        if (selisihBulan <= 0) {
            return 0; 
        } else if (selisihBulan <= 3) {
            return 50000;
        } else {
            return (selisihBulan - 3) * 50000;
        }
    }

    public static void tambahkanTransaksi(TransaksiPajak transaksi) {
        for (int i = 0; i < daftarTransaksi.length; i++) {
            if (daftarTransaksi[i] == null) {
                daftarTransaksi[i] = transaksi;
                return;
            }
        }
        System.out.println("Kapasitas transaksi sudah penuh, tidak dapat menambahkan transaksi baru.");
    }
}
