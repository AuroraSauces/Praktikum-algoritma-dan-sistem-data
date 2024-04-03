

class Pegawai {
    String nama;
    int thnkerja;
    double jamLembur;
    int gajipokok;

    Pegawai(String nama, int masaKerjaThn, double jamLembur, int gajiPokok) {
        this.nama = nama;
        this.thnkerja = masaKerjaThn;
        this.jamLembur = jamLembur;
        this.gajipokok = gajiPokok;
    }

    double hitungGajiLembur() {
        double persentaseGajiLembur;
        if (thnkerja < 5) {
            persentaseGajiLembur = 0.05;
        } else {
            persentaseGajiLembur = 0.1;
        }
        return persentaseGajiLembur * gajipokok * jamLembur;
    }

    double hitungTunjangan() {
        double persentaseTunjangan;
        if (thnkerja< 5) {
            persentaseTunjangan = 0.25;
        } else {
            persentaseTunjangan = 0.5;
        }
        return persentaseTunjangan * gajipokok;
    }

    double hitungGajiTotal() {
        return gajipokok + hitungGajiLembur() + hitungTunjangan();
    }

    void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("Masa Kerja (tahun): " + thnkerja);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Gaji Pokok: " + gajipokok);
        System.out.println("Gaji Total: " + hitungGajiTotal());
    }
}