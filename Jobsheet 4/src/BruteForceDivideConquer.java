import java.util.Scanner;
public class BruteForceDivideConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Masukkan jumlah elemen");
        int ijml = sc.nextInt();

        Faktorial [] fk = new Faktorial [ijml];
        for (int i = 0; i <ijml ;i++){
            fk [i] = new Faktorial ();
            System.out.println("Masukkan Nilai data ke - "+ (i+1) + ":");
            int nilai = sc.nextInt();
            fk[i].nilai = nilai;
            
        }
        System.out.println("HASIL - BRUTE FORCE");
            for(int i=0 ; i<ijml;i++){
                System.out.println
                ("Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah " + fk[i].faktorialBF(fk[i].nilai));
                }
        System.out.println("HASIL - DIVIDE AND COnQUER");
            for(int i=0 ; i<ijml;i++){
            System.out.println
            ("Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah " + fk[i].faktorialDC(fk[i].nilai));
            }
            sc.close();
    }
}
