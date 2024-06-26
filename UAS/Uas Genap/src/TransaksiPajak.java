class TransaksiPajak {
    static int count = 0;
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    TransaksiPajak(long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = ++count;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }
}