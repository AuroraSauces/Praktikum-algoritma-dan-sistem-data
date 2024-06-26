import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Kendaraan[] daftarKendaraan = new Kendaraan[4];
    static TransaksiPajak[] daftarTransaksi = new TransaksiPajak[10];

    public static void main(String[] args) {
        // Inisialisasi kendaraan
        daftarKendaraan[0] = new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        daftarKendaraan[1] = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        daftarKendaraan[2] = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        daftarKendaraan[3] = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        DaftarKendaraan daftarKendaraanManager = new DaftarKendaraan(daftarKendaraan);
        BayarPajak bayarPajakManager = new BayarPajak(daftarTransaksi);
        DaftarTransaksi daftarTransaksiManager = new DaftarTransaksi(daftarTransaksi);

        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character setelah nextInt()

            switch (pilihan) {
                case 1:
                    daftarKendaraanManager.tampilkanDaftarKendaraan();
                    break;
                case 2:
                    bayarPajakManager.bayarPajak();
                    break;
                case 3:
                    daftarTransaksiManager.tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    // urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

}
