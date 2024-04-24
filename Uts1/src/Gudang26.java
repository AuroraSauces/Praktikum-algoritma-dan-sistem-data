class Gudang26 {
    static class Barang {
        String kode_barang;
        String nama;
        String kategori;
        double harga_satuan;
        int stok;

        public Barang(String kode_barang, String nama, String kategori, double harga_satuan, int stok) {
            this.kode_barang = kode_barang;
            this.nama = nama;
            this.kategori = kategori;
            this.harga_satuan = harga_satuan;
            this.stok = stok;
        }
    }
}

class ManajemenStok {
    Gudang26.Barang[] data_barang;
    int jumlah_barang = 0;

    public ManajemenStok(int max_barang) {
        data_barang = new Gudang26.Barang[max_barang];
    }

    //Kode dibawah agar user dapat menambahkan barang yang disimpan di array
    public void tambahBarang(String kode_barang, String nama, String kategori, double harga_satuan, int stok) {
        if (jumlah_barang < data_barang.length) {
            data_barang[jumlah_barang++] = new Gudang26.Barang(kode_barang, nama, kategori, harga_satuan, stok);
            System.out.println("Data barang berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas gudang penuh, tidak bisa menambah barang lagi.");
        }
    }

    //Memmbolehkan user untuk melihat semua barang yang telah dimasukkan user
    public void tampilkanSemuaBarang() {
        if (jumlah_barang == 0) {
            System.out.println("Belum ada data barang.");
        } else {
            System.out.println("Data Semua Barang:");
            for (int i = 0; i < jumlah_barang; i++) {
                System.out.println("Kode: " + data_barang[i].kode_barang);
                System.out.println("Nama: " + data_barang[i].nama);
                System.out.println("Kategori: " + data_barang[i].kategori);
                System.out.println("Harga Satuan: " + data_barang[i].harga_satuan);
                System.out.println("Stok: " + data_barang[i].stok);
                System.out.println();
            }
        }
    }


    //mengurutkan daftar barang dari terkecil ke terbesar dengan melihat jumlah stok
    public void urutkanStokMenaik() {
        for (int i = 0; i < jumlah_barang - 1; i++) {
            for (int j = 0; j < jumlah_barang - i - 1; j++) {
                if (data_barang[j].stok > data_barang[j + 1].stok) {
                    Gudang26.Barang temp = data_barang[j];
                    data_barang[j] = data_barang[j + 1];
                    data_barang[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Barang Diurutkan Berdasarkan Stok Menaik:");
        for (int i = 0; i < jumlah_barang; i++) {
            System.out.println("Kode: " + data_barang[i].kode_barang);
            System.out.println("Nama: " + data_barang[i].nama);
            System.out.println("Stok: " + data_barang[i].stok);
            System.out.println();
        }
    }

    //Menampilkan barang tanpa stock yang tergolong makanan bukan yang lain
    public void tampilkanMakananTanpaStok() {
        boolean found = false;
        System.out.println("Data Makanan Tanpa Stok:");
        for (int i = 0; i < jumlah_barang; i++) {
            if (data_barang[i].kategori.equalsIgnoreCase("makanan") && data_barang[i].stok == 0) {
                System.out.println("Kode: " + data_barang[i].kode_barang);
                System.out.println("Nama: " + data_barang[i].nama);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada makanan tanpa stok.");
        }
    }

    //Mencari detail barang dengan kode nama untuk mencari data tersebut
    public void cariBarang(String keyword) {
        boolean found = false;
        System.out.println("Hasil Pencarian untuk Kata Kunci '" + keyword + "':");
        for (int i = 0; i < jumlah_barang; i++) {
            if (data_barang[i].nama.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Kode: " + data_barang[i].kode_barang);
                System.out.println("Nama: " + data_barang[i].nama);
                System.out.println("Kategori: " + data_barang[i].kategori);
                System.out.println("Harga Satuan: " + data_barang[i].harga_satuan);
                System.out.println("Stok: " + data_barang[i].stok);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Barang dengan kata kunci '" + keyword + "' tidak ditemukan.");
        }
    }

    //Untuk user menambah stok barang
    public void tambahStok(String kode_barang, int jumlah) {
        for (int i = 0; i < jumlah_barang; i++) {
            if (data_barang[i].kode_barang.equals(kode_barang)) {
                data_barang[i].stok += jumlah;
                System.out.println("Stok barang '" + data_barang[i].nama + "' berhasil ditambahkan sebanyak " + jumlah + ".");
                return;
            }
        }
        System.out.println("Barang dengan kode '" + kode_barang + "' tidak ditemukan.");
    }

    //Untuk user mengurangi stok barang
    public void kurangiStok(String kode_barang, int jumlah) {
        for (int i = 0; i < jumlah_barang; i++) {
            if (data_barang[i].kode_barang.equals(kode_barang)) {
                if (data_barang[i].stok >= jumlah) {
                    data_barang[i].stok -= jumlah;
                    System.out.println("Stok barang '" + data_barang[i].nama + "' berhasil dikurangi sebanyak " + jumlah + ".");
                } else {
                    System.out.println("Stok barang '" + data_barang[i].nama + "' tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode '" + kode_barang + "' tidak ditemukan.");
    }
}