package P7;

public class BukuNo26 {
   
        int KodeBuku;
        String judulBuku;
        int TahunTerbit;
        String Pengarang;
        int stock;

        public BukuNo26(int KodeBuku, String judulBuku, int TahunTerbit, String Pengarang, int stock){
        this.KodeBuku = KodeBuku;
        this.judulBuku = judulBuku;
        this.TahunTerbit = TahunTerbit;
        this.Pengarang = Pengarang;
        this.stock = stock;

        }
        public void tampilDataBuku(){
            System.out.println("========================");
            System.out.println("Kode buku     : " + KodeBuku);
            System.out.println("judul Buku    : " + judulBuku);
            System.out.println("Tahun Terbit  : " + TahunTerbit);
            System.out.println("Pengarang     : " + Pengarang);
            System.out.println("Stock         : " + stock);
        }
    }
    
    

