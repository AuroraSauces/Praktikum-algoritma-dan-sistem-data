package Tugas;
import java.util.Scanner;

public class PembeliMain {

    static void Menu (){
        System.out.println("---------------------------");
        System.out.println("\tPilih menu: ");
        System.out.println("1. Antrean baru");
        System.out.println("2. Antrean keluar");
        System.out.println("3. Cek antrean terdepan");
        System.out.println("4. Cek antrean paling belakang");
        System.out.println("5. Cek semua antrean");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas antrean: ");
        int jumlah = sc.nextInt();
        Queue pembeli = new Queue(jumlah);
        int pilih;

        do {
            Menu();
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                System.out.println("---------------------------");
                    System.out.print("Nama        : ");
                    String nama = sc.next();
                    System.out.print("No HP       : ");
                    int hp = sc.nextInt();
                    Pembeli pbl = new Pembeli(nama, hp);
                    pembeli.Enqueue(pbl);
                    break;
                case 2:
                    Pembeli data = pembeli.Dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    pembeli.peek();
                    break;
                case 4:
                    pembeli.peekRear();
                    break;
                case 5:
                    pembeli.daftarPembeli();
                    break;
                case 6:
                    System.out.println("Masukkan nama pembeli: ");
                    String namaPembeli = sc.next();
                    pembeli.peekPosition(namaPembeli);
            }
        } while (pilih <7 && pilih > 0);
        sc.close();
    }
}