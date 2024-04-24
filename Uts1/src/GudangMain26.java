import java.util.Scanner;
public class GudangMain26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimum barang yang bisa disimpan: ");//User dapat menentukan berapa barang yang diperlukan
        int max_barang = scanner.nextInt();
        ManajemenStok manajemenStok = new ManajemenStok(max_barang);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("========================================"); //Menu untuk user memilih apa yang ingin dijalankan
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Barang");
            System.out.println("2. Tampilkan Semua Data Barang");
            System.out.println("3. Urutkan Data Barang Berdasarkan Stok Menaik");
            System.out.println("4. Tampilkan Makanan Tanpa Stok");
            System.out.println("5. Cari Data Barang Berdasarkan Nama");
            System.out.println("6. Tambah Stok Barang");
            System.out.println("7. Kurangi Stok Barang");
            System.out.println("8. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    String kode_barang = scanner.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kategori Barang: ");
                    String kategori = scanner.nextLine();
                    System.out.print("Masukkan Harga Satuan Barang: ");
                    double harga_satuan = scanner.nextDouble();
                    System.out.print("Masukkan Stok Barang: ");
                    int stok = scanner.nextInt();
                    manajemenStok.tambahBarang(kode_barang, nama, kategori, harga_satuan, stok);
                    break;
                case 2:
                    manajemenStok.tampilkanSemuaBarang();
                    break;
                case 3:
                    manajemenStok.urutkanStokMenaik();
                    break;
                case 4:
                    manajemenStok.tampilkanMakananTanpaStok();
                    break;
                case 5:
                    System.out.print("Masukkan Kata Kunci Nama: ");
                    String keyword = scanner.nextLine();
                    manajemenStok.cariBarang(keyword);
                    break;
                case 6:
                    System.out.print("Masukkan Kode Barang: ");
                    String tambah_kode_barang = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Stok yang Ditambahkan: ");
                    int tambah_jumlah = scanner.nextInt();
                    manajemenStok.tambahStok(tambah_kode_barang, tambah_jumlah);
                    break;
                case 7:
                    System.out.print("Masukkan Kode Barang: ");
                    String kurangi_kode_barang = scanner.nextLine();
                    System.out.print("Masukkan Jumlah Stok yang Dikurangi: ");
                    int kurangi_jumlah = scanner.nextInt();
                 manajemenStok.kurangiStok(kurangi_kode_barang, kurangi_jumlah);
                    break;
                    case 8:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
        scanner.close();
    }
}
