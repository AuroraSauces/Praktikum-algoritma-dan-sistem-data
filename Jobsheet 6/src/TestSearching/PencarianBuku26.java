package TestSearching;

public class PencarianBuku26 {
    BukuNo26 listBk [] = new BukuNo26 [5];
    int idx;
    
    void tambah (BukuNo26 m ){
        if (idx<listBk.length){
            listBk[idx]=m;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!");
        } 
    }

    void tampil() {
        for (BukuNo26 m : listBk){
            m.tampilDataBuku();     
        }
    
    }
    int FindSeqSearch(int cari){
        int posisi= -1;
        for (int j =0; j < listBk.length; j++){
            if (listBk[j].KodeBuku==cari){
                posisi = j ;
                break;
            }
        }
        return posisi;
    }

        public BukuNo26 FindBuku(String Judul){
        BukuNo26 buku = null;
        for (int i =0; i < listBk.length; i++){
            if (listBk[i].judulBuku.equals(Judul)){
            buku = listBk[i];
                break;
            }
        }
        return buku;
    }

    void Tampilposisi(int x , int pos){
        if (pos!=-1){
            System.out.println("Data : " + x + " Ditemukan Pada Indeks " + pos);
        } else {
            System.out.println("Data : " + x + " Tidak Ditemukan ");
        }
    }

    void TampilData (int x , int pos){
        if (pos!=-1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].TahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].Pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " Tidak Ditemukan");
        }
    }

    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2; 
            if (listBk[mid].KodeBuku == cari) {
                return mid;
            } else if (listBk[mid].KodeBuku > cari) {
                return findBinarySearch(cari, mid + 1, right); 
            } else {
                return findBinarySearch(cari, left, mid - 1); 
            }
        }
        return -1;
    }
}