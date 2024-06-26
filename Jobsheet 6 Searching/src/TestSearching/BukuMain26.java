package TestSearching;
import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        PencarianBuku26 data = new PencarianBuku26();
        int jumBuku = 5;
    
        System.out.println("------------------");
        System.out.println("Masukkan data Buku Secara Urut dari Kode Buku Terkecil : ");
        for (int i = 0 ; i <jumBuku ; i++){
            System.out.println("------------------");
            System.out.print("Kode Buku \t : ");
            int KodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int TahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String Pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int Stock = s.nextInt();
            
            BukuNo26 m = new BukuNo26(KodeBuku, judulBuku, TahunTerbit, Pengarang, Stock);     
            data.tambah(m);
        } 
        System.out.println("-------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("________________________");
        System.out.println("________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku Yang Dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

       System.out.print("Masukkan Judul Buku : ");
       String Carijudul = s1.nextLine();

       BukuNo26 dataBuku = data.FindBuku(Carijudul);
       dataBuku.tampilDataBuku();

       System.out.println("===================");
       System.out.println("Menggunakan Binary Search");
       posisi = data.findBinarySearch(cari, 0 , jumBuku -1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        s.close();
        s1.close();
    }
}