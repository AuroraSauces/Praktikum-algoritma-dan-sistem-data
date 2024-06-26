public class BukuMain26 {
public static void main(String[] args) {
  

  Buku26 bk1 = new Buku26();
  bk1.judul ="Today Ends Tomorrow comes";
  bk1.pengarang = "Denanda Pratiwi";
  bk1.halaman = 198;
  bk1.stok = 13;
  bk1.harga = 71000;

  bk1.terjual(5);
  bk1.hitungHargaTotal();
  bk1.hitungDiskon();
  bk1.hitungHargaBayar(bk1.totalharga, bk1.diskon);
  bk1.tampilInformasi();

  bk1.gantiharga(60000);
  bk1.tampilInformasi();

Buku26 bk2 = new Buku26("Self Reward" , "Maheera Ayesha", 160,29,59000);
bk2.terjual(11);
bk2.hitungHargaTotal();
bk2.hitungDiskon();
bk2.hitungHargaBayar(bk2.totalharga, bk2.diskon);
bk2.tampilInformasi();

Buku26 bkSatria = new Buku26 ("Belajar kuyy" , "Satria Wiguna" , 250 , 90 , 78000);
bkSatria.terjual(1);
bkSatria.hitungHargaTotal();
bkSatria.hitungDiskon();
bkSatria.hitungHargaBayar(bkSatria.totalharga, bkSatria.diskon);
bkSatria.tampilInformasi();
}
  
}
