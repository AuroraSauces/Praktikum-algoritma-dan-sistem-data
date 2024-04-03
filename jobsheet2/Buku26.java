package jobsheet2;
public class Buku26 {
    String judul,pengarang;
    int halaman,stok,harga,terjual,totalharga,hargabayar,diskon;
    double hargadiskon;
void tampilInformasi(){
    System.out.println("Judul : " + judul);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Jumlah halaman : " + halaman);
    System.out.println("Sisa stok : " + stok);
    System.out.println("Harga : RP " + harga);
    System.out.println("Harga Total " + totalharga);
    System.out.println("Harga Diskon " + hargadiskon);
    System.out.println("Harga bayar " + hargabayar);

}
 void terjual(int jml){
    if (stok > jml ){
    stok = stok - jml; 
    terjual = jml;
    } else {
        System.out.println("Jumlah barang Tidak mencukupi");
    }

}
public void restock(int jml){
    stok += jml; 
}
void gantiharga(int hrg) {
    harga = hrg;
}

public Buku26() {

}

public Buku26(String jud, String pg , int hal , int stok , int har){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
    hargadiskon = 0;
}
public int hitungHargaTotal(){
    totalharga = harga * terjual;
    return totalharga;
}


public double hitungDiskon() {
    if (totalharga > 150000) { 
       hargadiskon = totalharga * 0.12;
    }
    else if(75000 > totalharga && totalharga < 150000){
       hargadiskon = totalharga * 0.10;
    }
    else{
       hargadiskon = 0; // Tidak ada diskon
    }
    return hargadiskon;
}


int hitungHargaBayar(int total, int diskon){
    hargabayar = (int) (totalharga-hargadiskon);
return hargabayar;
}


}


