import java.util.Scanner;

public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static double s;
    static double t;
    static double v;

    static void menu() {
        System.out.println("==========================");
        System.out.println("Ingin Menghitung apa? ");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu tempuh");
        System.out.print("Pilih (1/2/3): ");
        byte plh = sc.nextByte();
        System.out.println("==============================");

        switch (plh) {
            case 1:
                Kecepatan();
                break;
            case 2:
                Jarak();
                break;
            case 3:
                Waktu();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    static void Kecepatan() {
        System.out.print("Masukkan Jarak (km): ");
        s = sc.nextDouble();
        System.out.print("Masukkan Waktu (jam): ");
        t = sc.nextDouble();

        v = s / t;

        System.out.printf("Kecepatan = %.3f km/jam\n", v);
        System.out.println("==============================");
    }

    static void Jarak() {
        System.out.print("Masukkan Kecepatan (km/jam): ");
        v = sc.nextDouble();
        System.out.print("Masukkan Waktu (jam): ");
        t = sc.nextDouble();

        s = v * t;

        System.out.printf("Jarak = %.3f km\n", s);
        System.out.println("==============================");
    }

    static void Waktu() {
        System.out.print("Masukkan Kecepatan (km/jam): ");
        v = sc.nextDouble();
        System.out.print("Masukkan Jarak (km): ");
        s = sc.nextDouble();

        t = s / v;

        System.out.printf("Waktu Tempuh = %.3f jam\n", t);
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        menu();
        sc.close();
    }
}