public class Gudang26 {

    Barang26[] tumpukan ;
    int size;
    int top;

    public Gudang26(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang26[size];
        top = -1;

    }

    public boolean cekkosong(){
        if (top == -1){
            return true;
    }else {
        return false;
      }
    }

    public boolean cekpenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahbarang(Barang26 brg){
        if (!cekpenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.barang + " Berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }
    public Barang26 ambilbarang() {
        if (!cekkosong()){
            Barang26 delete = tumpukan [top];
            top--;
            System.out.println("Barang " + delete.barang + " Diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversidesimalkebiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukkan barang kosong");
            return null;
        }
    }

    public Barang26 lihatbarangteratas(){
        if (!cekkosong()){
            Barang26 barangteratas = tumpukan[top];
            System.out.println("Barang teratas : " +barangteratas.barang);
            return barangteratas;
        } else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanbarang(){
        if (!cekkosong()){
            System.out.println("Rincian tumpukan barang di Gudang");
                for (int i = 0 ; i <= top ; i++){
                    System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].barang, tumpukan[i].kategori);
                } 
            }else {
                System.out.println("Tumpukkan barang kosong");
            }
        }
        void barangteratas (){
           if (!cekkosong()){
            System.out.println("Barang teratas : ");
            System.out.printf("%s (kategori %s) dengan kode %d \n" , tumpukan[top].barang , tumpukan[top].kategori , tumpukan[top].kode);
        } else {
            System.out.println("Tumpukkan barang kosong");
    }
   }

   public String konversidesimalkebiner(int kode ){
    StackKonversi26 stack = new StackKonversi26();
    while (kode > 0){
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode/2;
    }
    String biner = new String();
    while (!stack.isEmpty()){
        biner += stack.pop();
    }
    return biner;
   }

   void barangTerbawah (){
    if (!cekkosong()) {
        System.out.println("Barang Terbawah adalah:");
        System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[0].barang, tumpukan[0].kategori, tumpukan[0].kode);
    }else{
        System.out.println("Tumpukan Barang Kosong");
    }
}

void cariBarangnama (String nama){
    if (!cekkosong()){
        for (int i = 0; i < size; i++) {
            if (tumpukan[i].barang.equalsIgnoreCase(nama) && tumpukan[i]!= null) {
                System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[i].barang, tumpukan[i].kategori, tumpukan[i].kode);
            }
        }
    }else{
        System.out.println("Tumpukan Barang Kosong");
    }
 
}
void cariBarangkode (int kode){
    if (!cekkosong()) {
        for (int i = 0; i < size; i++) {
            if (tumpukan[i].kode == kode && tumpukan[i]!= null) {
                System.out.printf("%s (kategori %s) dengan kode %d\n", tumpukan[i].barang, tumpukan[i].kategori, tumpukan[i].kode);
            }
        }
    }else {
        System.out.println("Tumpukan Barang Kosong");
    }

}

}
