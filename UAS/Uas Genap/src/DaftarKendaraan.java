public class DaftarKendaraan {
    static Kendaraan[] daftarKendaraan;

    public DaftarKendaraan(Kendaraan[] daftarKendaraan) {
        this.daftarKendaraan = daftarKendaraan;
    }

    public void tampilkanDaftarKendaraan() {
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Daftar Kendaraan");
        System.out.println("++++++++++++++++++++++++");
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-20s\n", "Nomor TNKB", "Nama Pemilik", "Jenis Kendaraan", "CC Kendaraan", "Tahun", "Bulan harus Bayar");
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan != null) {
                System.out.printf("%-15s %-15s %-15s %-15s %-10s %-20s\n", kendaraan.noTNKB, kendaraan.nama, kendaraan.jenis, (kendaraan.cc == 0 ? "-" : Integer.toString(kendaraan.cc)), (kendaraan.tahun == 0 ? "-" : Integer.toString(kendaraan.tahun)), Integer.toString(kendaraan.bulanHarusBayar));
            }
        }
    }
}
