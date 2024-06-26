import java.util.Scanner;

public class PraktikumArray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] namaMK = {
      "Pancasila",
      "Konsep Teknologi Informasi",
      "Critical Thinking dan Problem Solving",
      "Matematika Dasar",
      "Bahasa Inggris",
      "Dasar Pemrograman",
      "Praktikum Dasar Pemrograman",
      "Keselamatan dan Kesehatan Kerja"
    };
    double[] nilaiAngka = new double[namaMK.length];
    
    System.out.println("======================");
    System.out.println("Program mengitung Ip semester");
    System.out.println("======================");

    for (int i = 0; i < namaMK.length; i++) {
      System.out.printf("Masukkan nilai Angka untuk MK %s: ", namaMK[i]);
      nilaiAngka[i] = scanner.nextDouble();
    }

    // Hitung nilai huruf dan bobot nilai
    String[] nilaiHuruf = new String[namaMK.length];
    double[] bobotNilai = new double[namaMK.length];
    for (int i = 0; i < namaMK.length; i++) {
      nilaiHuruf[i] = getNilaiHuruf(nilaiAngka[i]);
      bobotNilai[i] = getBobotNilai(nilaiHuruf[i]);
    }

    // Hitung total bobot nilai dan total SKS
    double totalBobotNilai = 0;
    double totalSks = 0;
    for (int i = 0; i < namaMK.length; i++) {
      totalBobotNilai += bobotNilai[i] * nilaiAngka[i];
      totalSks += nilaiAngka[i];
    }

    // Hitung IP semester
    double ipSemester = totalBobotNilai / totalSks;

    // Tampilkan hasil
    System.out.println();
    System.out.println("Hasil Konversi Nilai");
    System.out.println("=========================================================================");
    System.out.printf("| %-50s | %-15s | %-15s | %-10s |\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
    System.out.println("=========================================================================");
    for (int i = 0; i < namaMK.length; i++) {
      System.out.printf("| %-50s | %-15.2f | %-15s | %-10.2f |\n",
          namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
    }
    System.out.println("==========================================================================");
    System.out.printf("IP Semester: %.2f\n", ipSemester);
  }

  private static String getNilaiHuruf(double nilaiAngka) {
    if (nilaiAngka >= 80) {
      return "A";
    } else if (nilaiAngka >= 70) {
      return "B";
    } else if (nilaiAngka >= 60) {
      return "C";
    } else if (nilaiAngka >= 50) {
      return "D";
    } else {
      return "E";
    }
  }

  private static double getBobotNilai(String nilaiHuruf) {
    switch (nilaiHuruf) {
      case "A":
        return 4.0;
      case "B":
        return 3.0;
      case "C":
        return 2.0;
      case "D":
        return 1.0;
      default:
        return 0.0;
    }
  }
}
