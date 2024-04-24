import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();
        System.out.print("Masukkan jumlah bulan: ");
        int numMonths = sc.nextInt();

        Sum[] companies = new Sum[numCompanies];


        for (int i = 0; i < numCompanies; i++) {
            System.out.println("==============================================================");
            System.out.println("Masukkan data keuntungan untuk Perusahaan " + (i + 1));
            companies[i] = new Sum(numMonths);
            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                companies[i].keuntungan[j] = sc.nextDouble();
            }
        }


        System.out.println("=================================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + numMonths + " bulan adalah = " +
                    companies[i].totalBF(companies[i].keuntungan));
        }

        System.out.println("=================================================================");
        System.out.println("Algoritma Divide and Conquer");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + numMonths + " bulan adalah = " +
                    companies[i].totalDC(companies[i].keuntungan, 0, numMonths - 1));
        }
        sc.close();
    }
}