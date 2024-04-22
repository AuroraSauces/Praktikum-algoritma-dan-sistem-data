import java.util.Scanner;
public class Utama26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang26 gudang = new Gudang26(kapasitas);
        
        boolean ulang = true;
        while (ulang) {
            System.out.println("=======================================");
            System.out.println("\t Menu :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilan tumpukan Barang");
            System.out.println("4. Lihat Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi :");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang : ");
                    int kode = scanner.nextInt();
                    System.out.print("Masukkan nama Barang : ");
                    String nama = scanner.next();
                    System.out.print("Masukkan nama Kategori : ");
                    String kategori = scanner.next();
                    Barang26 barangbaru = new Barang26(kode, nama, kategori);
                    gudang.tambahbarang(barangbaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3:
                    gudang.tampilkanbarang();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Pilih Barang berdasarkan : ");
                    System.out.println("1. Teratas");
                    System.out.println("2. Terbawah");
                    System.out.println("3. Nama Barang");
                    System.out.println("4. Kode Barang");
                    System.out.println("5. Keluar");
                    System.out.print("Pilih : ");
                    byte plh = scanner.nextByte();
                    if (plh != 5) {
                        switch (plh) {
                            case 1:
                                gudang.barangteratas();
                                break;
                            case 2:
                                gudang.barangTerbawah();
                                break;
                            case 3:
                                System.out.print("Masukkan Nama Barang : ");
                                String nm = scanner.next();
                                gudang.cariBarangnama(nm);
                                break;
                            case 4:
                                System.out.print("Masukkan Kode Barang : ");
                                int kd = scanner.nextInt();
                                gudang.cariBarangkode(kd);
                                break;
                        }
                    }else{
                            System.out.println("Pilihan Tidak Valid ");
                    }
                    break;
                case 5:
                    ulang = false;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
        scanner.close();
    }
}