package Hotel;
public class hotel26 {
    String nama,kota;
    int harga;
    Byte bintang;
    hotel26(String n , String k , int h, byte b){
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;

    }

    void tampil(){
        System.out.println("Nama Kota : " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga : " + harga);
        System.out.println("Rating : " + bintang);
    }

}
