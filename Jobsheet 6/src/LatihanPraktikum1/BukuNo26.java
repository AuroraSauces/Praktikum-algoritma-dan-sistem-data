package LatihanPraktikum1;

public class BukuNo26 {
  String kodeBuku;
  String judulBuku;
  int tahunTerbit;
  String pengarang;
  int stock;

  public BukuNo26(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
    this.kodeBuku = kodeBuku;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.pengarang = pengarang;
    this.stock = stock;
  }

  public void tampilDataBuku() {
    System.out.println("================================");
    System.out.println("Kode buku :" + kodeBuku);
    System.out.println("Judul buku :" + judulBuku);
    System.out.println("Tahun terbit :" + tahunTerbit);
    System.out.println("Pengarang :" + pengarang);
    System.out.println("Stock :" + stock);
  }
}