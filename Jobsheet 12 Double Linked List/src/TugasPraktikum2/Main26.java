package TugasPraktikum2;

import java.util.Scanner;

public class Main26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList26 movieList = new DoubleLinkedList26();

        while (true) {
            System.out.println("====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Indek Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    int idAwal = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan Judul Film: ");
                    String titleAwal = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingAwal = scanner.nextDouble();
                    movieList.addAtBeginning(idAwal, titleAwal, ratingAwal);
                    break;
                case 2:
                System.out.print("Masukkan ID Film: ");
                int idAkhir = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Masukkan Judul Film: ");
                String titleAkhir = scanner.nextLine();
                System.out.print("Masukkan Rating Film: ");
                double ratingAkhir = scanner.nextDouble();
                movieList.addAtEnd(idAkhir, titleAkhir, ratingAkhir);
                break;
                case 3:
                System.out.print("Masukkan Id Film : ");
                int idTertentu = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Masukkan Judul Film: ");
                String titleTertentu = scanner.nextLine();
                System.out.print("Masukkan Rating Film: ");
                double ratingTertentu = scanner.nextDouble();
                System.out.print("Masukkan Posisi: ");
                int index = scanner.nextInt();
                movieList.addAtIndex(idTertentu, titleTertentu, ratingTertentu, index);
                break;
                case 4:
                    movieList.deleteFromBeginning();
                    break;
                case 5:
                    movieList.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Masukkan Posisi: ");
                    int delIndex = scanner.nextInt();
                    movieList.deleteAtIndex(delIndex);
                    break;
                case 7:
                    movieList.printList();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film: ");
                    int searchId = scanner.nextInt();
                    movieList.searchById(searchId);
                    break;
                case 9:
                    movieList.sortByRatingDesc();
                    break;
                case 10:
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
