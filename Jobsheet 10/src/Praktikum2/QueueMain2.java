package Praktikum2;
import java.util.Scanner;

public class QueueMain2 {

    static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian Baru ");
        System.out.println("2. Antrian Keluar ");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas queue: ");
        int Jumlah = sc.nextInt();
        Queue2 antri = new Queue2(Jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah26 nb = new Nasabah26(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah26 data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih >= 1 && pilih <= 5);
        sc.close();
    }
}
