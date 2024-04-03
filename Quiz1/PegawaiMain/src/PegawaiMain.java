import java.util.Scanner;

public class PegawaiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: ");
        int jumlahPegawai = scanner.nextInt();

        Pegawai[] pegawaiList = new Pegawai[jumlahPegawai];

        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("\nData Pegawai ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Masa Kerja (tahun): ");
            int masaKerjaThn = scanner.nextInt();
            System.out.print("Jam Lembur: ");
            double jamLembur = scanner.nextDouble();
            System.out.print("Gaji Pokok: ");
            int gajiPokok = scanner.nextInt();
            pegawaiList[i] = new Pegawai(nama, masaKerjaThn, jamLembur, gajiPokok);
        }


        double totalGajiPegawaiLimaTahunKeAtas = 0;
        int countPegawaiLimaTahunKeAtas = 0;

        double maxlemburgaji = Double.MIN_VALUE;
        Pegawai Maxlembur = null;
        double Minlembur = Double.MAX_VALUE;
        Pegawai pegawaiMinlembur = null;

        for (Pegawai pegawai : pegawaiList) {
            if (pegawai.thnkerja > 5) {
                totalGajiPegawaiLimaTahunKeAtas += pegawai.hitungGajiTotal();
                countPegawaiLimaTahunKeAtas++;
            } else {
                double gajiLembur = pegawai.hitungGajiLembur();
                if (gajiLembur > maxlemburgaji) {
                    maxlemburgaji = gajiLembur;
                    Maxlembur = pegawai;
                }
                if (gajiLembur < Minlembur) {
                    Minlembur = gajiLembur;
                    pegawaiMinlembur = pegawai;
                }
            }
        }

    
        double averageGajiPegawaiLimaTahunKeAtas = totalGajiPegawaiLimaTahunKeAtas / countPegawaiLimaTahunKeAtas;


        System.out.println();
        System.out.println("Rata-rata total gaji pegawai dengan pengalaman lebih dari 5 tahun: " + averageGajiPegawaiLimaTahunKeAtas);
        System.out.println();
        System.out.println("Pegawai dengan gaji lembur tertinggi di antara mereka dengan pengalaman kurang dari 5 tahun:");
        if (Maxlembur != null) {
            Maxlembur.printData();
        } else {
            System.out.println("Tidak ada pegawai dengan pengalaman kurang dari 5 tahun.");
        }
        System.out.println();
        System.out.println("Pegawai dengan gaji lembur terendah di antara mereka dengan pengalaman kurang dari 5 tahun:");
        if (pegawaiMinlembur != null) {
            pegawaiMinlembur.printData();
        } else {
            System.out.println("Tidak ada pegawai dengan pengalaman kurang dari 5 tahun.");
        }

        scanner.close();
    }
}
