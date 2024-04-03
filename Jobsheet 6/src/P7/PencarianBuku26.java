package P7;

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

    void Tampilposisi(int x , int pos){
        if (pos!=-1){
            System.out.println("Data : " + x + " Ditemukan Pada Indeks " + pos);
        } else {
            System.out.println("Data : " + x + " Tidak Ditemukan ");
        }
    }
}
