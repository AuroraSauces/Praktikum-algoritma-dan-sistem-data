import java.util.Scanner;

public class ArrayMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa[] mhs = new mahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new mahasiswa();
            System.out.println("\nMasukkan Data mahasiswa ke-" + (i+1) + ":");
            System.out.print("Nama: ");
            mhs[i].nama = sc.next();
            System.out.print("NIM: ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Jenis Kelamin: ");
            mhs[i].jeniskelamin = sc.next();
            System.out.print("IPK: ");
            mhs[i].ipk = sc.nextDouble();
        }

        mahasiswa mahasiswaIPKTertinggi = getmahasiswaIPKTertinggi(mhs);
        double rataRataIPK = hitungRataRataIPK(mhs);

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("\nmahasiswa ke-" + (i+1) + ":");
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jeniskelamin);
            System.out.printf("IPK: %.2f\n", mhs[i].ipk);
        }

        System.out.printf("\nRata-rata IPK: %.2f\n", rataRataIPK);

        System.out.println("\nmahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mahasiswaIPKTertinggi.nama);
        System.out.println("NIM: " + mahasiswaIPKTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaIPKTertinggi.jeniskelamin);
        System.out.printf("IPK: %.2f\n", mahasiswaIPKTertinggi.ipk);
    }

    public static mahasiswa getmahasiswaIPKTertinggi(mahasiswa[] mhs) {
        mahasiswa max = mhs[0];
        for (mahasiswa mahasiswa : mhs) {
            if (mahasiswa.ipk > max.ipk) {
                max = mahasiswa;
            }
        }
        return max;
    }

    public static double hitungRataRataIPK(mahasiswa[] mhs) {
        double total = 0;
        for (mahasiswa mahasiswa : mhs) {
            total += mahasiswa.ipk;
        }
        return total / mhs.length;
    }
}
