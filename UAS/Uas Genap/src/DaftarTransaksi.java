public class DaftarTransaksi {
    private TransaksiPajak[] daftarTransaksi;

    public DaftarTransaksi(TransaksiPajak[] daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }

    public void tampilkanSeluruhTransaksi() {
        System.out.println("===========================================");
        System.out.println("Daftar Seluruh Transaksi Pajak");
        System.out.println("===========================================");
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-10s\n", "Kode", "TNBK", "Nama", "Nominal", "Denda");
        System.out.println("-------------------------------------------");
        long totalPendapatan = 0;
        for (TransaksiPajak transaksi : daftarTransaksi) {
            if (transaksi != null) {
                System.out.printf("%-10d | %-10s | %-15s | Rp %,10d | Rp %,5d\n",
                        transaksi.kode, transaksi.kendaraan.noTNKB, transaksi.kendaraan.nama,
                        transaksi.nominalBayar, transaksi.denda);
                totalPendapatan += transaksi.nominalBayar + transaksi.denda;
            }
        }
        System.out.println("===========================================");
        System.out.printf("Total Pendapatan: Rp %,d\n", totalPendapatan);
        System.out.println("===========================================");
    }
}
